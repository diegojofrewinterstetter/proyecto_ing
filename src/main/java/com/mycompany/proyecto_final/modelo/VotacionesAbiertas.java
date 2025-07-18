package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.comando.VotoService;
import com.mycompany.proyecto_final.gestores.GestorEleccion;
import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorToken;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class VotacionesAbiertas implements EstadoVotaciones {    
    public static VotacionesAbiertas instance;
    private GestorLista gestor;
    private RegistradorDeVoto registrador = new RegistradorDeVoto();
    private VotoService votoService;
     
    private VotacionesAbiertas(){
    
    }
    
    public static VotacionesAbiertas getInstance(){
        if(instance == null){
            instance = new VotacionesAbiertas();
        }
        return instance;
    }
    
  
    @Override
    public List<Estructura> contarVotos(String id, List<ResultadoVoto> votos) {
        List<Estructura> lista = new ArrayList<>();
        System.out.println("No Se pueden contar Votos mientra la votacion se encuentra Abierta:");
        return lista;
    }
    @Override
    public void recibirVoto(IVoto voto){}
    
    
    
    
    @Override
    public boolean cargarLista(Estructura lista){
        // lógica
        return true;
    }
    
     @Override
    public String getNombreVisible() {
        return "Activo";
    }
    
    @Override 
    public ResultadoVoto procesarVoto(String eleccionId, Estructura listaSeleccionada, String dni) {
        GestorEleccion gestorEleccion = GestorEleccion.getInstancia();
        VotacionContext eleccion = gestorEleccion.obtenerVotacion(eleccionId);

        if (eleccion == null) {
            System.out.println("No existe la elección.");
            return  new ResultadoVoto();
        }

        if (!eleccion.esListaValida(listaSeleccionada)) {
            System.out.println("Lista no válida para esta elección.");
            return  new ResultadoVoto();
        }

        IVoto voto = new VotoListaCompleta(listaSeleccionada);
        RegistradorDeVoto registrador = new RegistradorDeVoto();
        return registrador.ejecutarVoto(dni, voto, votoService, listaSeleccionada);
    }
    @Override
    public boolean validarToken(Token token, List<Token> tokens) {
        for (Token t : tokens) {
            if (t.getToken().equals(token.getToken()) &&
                t.getDni().equals(token.getDni()) &&
                t.getEleccionId().equals(token.getEleccionId()) &&
                !t.isUsado()) {

                t.setUsado(true); // marcar como usado
                return true;
            }
        }
        return false;
    }

    @Override
    public Token generarToken(String eleccionId, String dni) {
        return GestorToken.getInstancia().generarToken(eleccionId, dni);
    }

    @Override
    public EstadoVotaciones CambiarEstado(EstadoVotaciones estado, Date inicio, Date fin, Date ahora) {
        if (ahora.after(fin)) {
            System.out.println("La votación ha finalizado. Cambiando a estado: VotacionesCerradas.");
            return  VotacionesCerradas.getInstance();
        } else {
            return this; 
        }
    }
    @Override
    public Estudiante validarEstudiante(String dni, List<Estudiante> estudiantes) {
        for (Estudiante est : estudiantes) {
            if (est.getDni().equals(dni)) {
                return est;
            }
        }
        throw new IllegalArgumentException("Estudiante con DNI " + dni + " no encontrado.");
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
    public boolean agregarEstudiante(Estudiante estudiante, List<Estructura> estudiantes) {
        return false;
    }

    @Override
    public boolean eliminarEstudiante(String dni, List<Estudiante> estudiantes) {
        return false;
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