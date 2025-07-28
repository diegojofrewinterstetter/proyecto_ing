package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.comando.VotoService;
import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VotacionesEnPreparacion implements EstadoVotaciones {
    public static VotacionesEnPreparacion instance;
    private GestorLista gestor; 
    private GestorVoto servicio;
     
    private VotacionesEnPreparacion(){
    
    }
    
    public static VotacionesEnPreparacion getInstance(){
        if(instance == null){
            instance = new VotacionesEnPreparacion();
        }
        return instance;
    }
    
     @Override
    public String getNombreVisible() {
        return "Activo";
    }
  
    @Override
    public Map<String, Integer> contarVotos(VotacionContext contexto) {
        System.out.println("⚠ No se pueden contar votos mientras la votación está en preparación.");
        return new HashMap<>();
    }

    
    @Override
    public void recibirVoto(IVoto voto){
    
    }
    
    @Override
    public boolean cargarLista(Estructura lista) {
        Set<String> dnis = new HashSet<>();

        // Recorremos las tribus que componen la lista
        for (Estructura tribu : lista.obtenerHijos()) {
            // Recorremos las delegaciones de la tribu
            for (Estructura delegacion : tribu.obtenerHijos()) {
                // Recorremos los estudiantes de la delegacion
                for (Estructura estudiante : delegacion.obtenerHijos()) {
                    String dni = estudiante.getId(); // o estudiante.getDni() si puedes castear

                    // Verificamos si el DNI ya está en el conjunto
                    if (dnis.contains(dni)) {
                        System.out.println("Error: DNI repetido encontrado: " + dni);
                        return false; // DNI duplicado, no se puede cargar la lista
                    }
                    dnis.add(dni);
                }
            }
        }
        return true;
    }
   
    @Override
    public EstadoVotaciones CambiarEstado(EstadoVotaciones estado, Date inicio, Date fin, Date ahora) {
        System.out.println(estado.getClass() + " // ahora: " + ahora + " // inicio: " + inicio + " // fin: " + fin);

        if (ahora.before(inicio)) {
            System.out.println("Todavía no comienza la votación.");
            return this; // Sigue programada
        } else if (ahora.after(fin)) {
            System.out.println("El plazo venció: Cambiando a Votación Cerrada.");
            return VotacionesCerradas.getInstance();
        } else {
            System.out.println("La votación está Abierta.");
            return VotacionesAbiertas.getInstance();
        }
    }
    
    @Override 
    public String procesarVoto(VotacionContext contexto, Estructura listaSeleccionada, String dni, Token token, RegistradorDeVoto registrador, VotoService votoService){
        return "Votacion En preparacion";
    }
    @Override
    public boolean validarToken(Token token, List<Token> tokens) {
        return false;
    }
    @Override
    public Token generarToken(String eleccionId, String dni) {
         return new Token();
    }
    @Override
    public  Estudiante validarEstudiante(String dni, List<Estudiante> estudiantes){
        return new Estudiante();
    }
    
    
    @Override
    public Estudiante validarEstudianteAvanzado(Estudiante estudiante, List<Estructura> estudiantes) { // buscamos que un estudiante pertenezca a la tribu que dice pertenecer
        if (estudiante == null) {
            System.out.println("Error: el parámetro 'estudiante' es null");
            return null;
        }

        for (Estructura estructura : estudiantes) {
            // Nos aseguramos de que sea una tribu
            if (estructura instanceof Tribu tribu) {
                for (Estructura hijo : tribu.obtenerHijos()) {
                    if (hijo instanceof Estudiante est) {
                        if (est.getDni().equals(estudiante.getDni())) {
                            return est; // Estudiante encontrado
                        }
                    }
                }
            }
        }
        return null; // No se encontró
    }
    @Override
    public Estudiante buscarEstudiante(String dni, List<Estructura> tribus) {
        for (Estructura estructura : tribus) {
            if (estructura instanceof Tribu tribu) {
                for (Estructura hijo : tribu.obtenerHijos()) {
                    if (hijo instanceof Estudiante estudiante) {
                        if (estudiante.getDni().equals(dni)) {
                            return estudiante;
                        }
                    }
                }
            }
        }
        return null; // No se encontró el estudiante
    }
    @Override
    public boolean agregarEstudiante(Estudiante estudiante, List<Estructura> tribus) {
        // 1. Verificar si ya existe el estudiante en alguna tribu
        for (Estructura estructura : tribus) {
            if (estructura instanceof Tribu tribu) {
                for (Estructura hijo : tribu.obtenerHijos()) {
                    if (hijo instanceof Estudiante e && e.getDni().equals(estudiante.getDni())) {
                        System.out.println("El estudiante ya está registrado.");
                        return false;
                    }
                }
            }
        }

        // 2. Buscar la tribu correspondiente para agregar el estudiante
        for (Estructura estructura : tribus) {
            if (estructura instanceof Tribu tribu && 
                tribu.getNombre().equalsIgnoreCase(estudiante.getTribu())) {

                tribu.agregar(estudiante); // se espera que Tribu implemente este método correctamente
                System.out.println("Estudiante agregado a la tribu " + tribu.getNombre() + ": " + estudiante.getNombre());
                return true;
            }
        }

        System.out.println("Tribu no encontrada: " + estudiante.getTribu());
        return false;
    }

    @Override
    public boolean eliminarEstudiante(String dni, List<Estudiante> estudiantes) {
        return estudiantes.removeIf(e -> e.getDni().equals(dni));
    }


    @Override
    public List<Estructura> listarEstudiantes(List<Estructura> tribus) {
        List<Estructura> estudiantesListados = new ArrayList<>();

        for (Estructura estructura : tribus) {
            if (estructura instanceof Tribu tribu) {
                System.out.println("Tribu: " + tribu.getNombre());

                List<Estructura> hijos = tribu.obtenerHijos();
                if (hijos.isEmpty()) {
                    System.out.println("  - Sin estudiantes");
                } else {
                    for (Estructura hijo : hijos) {
                        if (hijo instanceof Estudiante estudiante) {
                            System.out.println("  - " + estudiante.getNombre() + " (" + estudiante.getDni() + ")");
                            estudiantesListados.add(estudiante);
                        }
                    }
                }
            }
        }

        return estudiantesListados;
    }


}