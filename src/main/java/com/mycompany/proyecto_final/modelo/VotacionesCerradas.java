package com.mycompany.proyecto_final.modelo;
import com.mycompany.proyecto_final.comando.VotoService;
import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import com.mycompany.proyecto_final.modelo.Estructura;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class VotacionesCerradas implements EstadoVotaciones{

    public static VotacionesCerradas instance;
    private GestorLista gestor;
    
    
    private VotacionesCerradas(){
    }
    
    public static VotacionesCerradas getInstance(){
        if(instance == null){
            instance = new VotacionesCerradas();
        }
        return instance;
    }
     @Override
    public String getNombreVisible() {
        return "Finalizada";
        
    }
    
    @Override
    public Map<String, Integer> contarVotos(VotacionContext contexto) {
        return contexto.getConteoVotos();
    }


    @Override
    public void recibirVoto(IVoto voto){
    
    }
    
    @Override
    public boolean cargarLista(Estructura lista){
        return false;
    }
    
    @Override
    public String  procesarVoto(VotacionContext contexto, Estructura listaSeleccionada, String dni, Token token, RegistradorDeVoto registrador, VotoService votoService){
        return "Votacion Cerrada";
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
    public EstadoVotaciones CambiarEstado(EstadoVotaciones estado, Date inicio, Date fin, Date ahora) {
        System.out.println("Error: Una votacion finalizada no puede cambiar de estado");
        return this; 
        
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

