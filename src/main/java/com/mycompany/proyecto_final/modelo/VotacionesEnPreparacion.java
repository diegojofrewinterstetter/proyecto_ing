package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    public List<Estructura> contarVotos(String id, List<ResultadoVoto> votos) {
        List<Estructura> lista = new ArrayList<>();
        return lista;
    }
    @Override
    public void recibirVoto(IVoto voto){
    
    }
    
    @Override
    public boolean cargarLista(Estructura lista){
        return false;
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
    public ResultadoVoto procesarVoto(String eleccionId, Estructura listaSeleccionada, String dni){
        return new ResultadoVoto();
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
    public Estudiante validarEstudianteAvanzado(Estudiante estudiante, List<Estructura> estudiantes) {
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
    public void listarEstudiantes(List<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes cargados.");
            return;
        }
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre() + " (" + e.getDni() + ")");
        }
    }

}