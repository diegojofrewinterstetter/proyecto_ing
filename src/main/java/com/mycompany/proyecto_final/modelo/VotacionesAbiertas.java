package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.comando.EmitirVotoCommand;
import com.mycompany.proyecto_final.comando.VotoService;
import com.mycompany.proyecto_final.gestores.GestorEleccion;
import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorToken;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotacionesAbiertas implements EstadoVotaciones {    
    public static VotacionesAbiertas instance;
    private GestorLista gestor;
    //private RegistradorDeVoto registrador = RegistradorDeVoto.getInstance();
    //private VotoService votoService;
     
    private VotacionesAbiertas(){
       // this.votoService = VotoService.getInstance();
    }
    
    public static VotacionesAbiertas getInstance(){
        if(instance == null){
            instance = new VotacionesAbiertas();
        }
        return instance;
    }
    
    
    @Override
    public Map<String, Integer> contarVotos(VotacionContext contexto) {
        System.out.println("⚠ No se pueden contar votos mientras la votación está abierta.");
        return new HashMap<>(); // Devolvemos un mapa vacío
    }
    
    
    @Override
    public void recibirVoto(IVoto voto){}
    
    
    
    
    @Override
    public boolean cargarLista(Estructura lista){
        // lógica
        return false;
    }
    
     @Override
    public String getNombreVisible() {
        return "Activo";
    }
    
    @Override
      public String procesarVoto(VotacionContext contexto, Estructura listaSeleccionada, String dni, Token token, RegistradorDeVoto registrador, VotoService votoService) {
          System.out.println("procesarVoto llamado con eleccionId=" + contexto.getId() + ", dni=" + dni + ", listaSeleccionada=" + (listaSeleccionada != null ? listaSeleccionada.getNombre() : "null"));

          Estudiante estudiante = contexto.buscarEstudiante(dni);
          if (estudiante == null) {
              return "Estudiante no encontrado";
          }
          if (contexto.getVotaron().contains(dni)) {
              return "Error: el estudiante ya ha votado";
          }
          if (!contexto.validarToken(token)) {
              return "Token inválido";
          }
          if (token.isUsado()) {
              return "Token ya fue utilizado";
          }

          IVoto voto;
          if (listaSeleccionada == null) {
              System.out.println("Voto en blanco seleccionado");
              voto = new VotoEnBlanco();
          } else {
              System.out.println("Voto lista completa o seleccionada");
              voto = new VotoListaCompleta();
          }

          EmitirVotoCommand comando = new EmitirVotoCommand(registrador, voto, votoService, dni, listaSeleccionada);
          System.out.println("Ejecutando comando EmitirVotoCommand...");
          ResultadoVoto resultado = comando.execute();  // Esto ya llama a registrarVoto internamente

          if (resultado != null) {
            token.setUsado(true);

            if ("Voto en Blanco".equalsIgnoreCase(resultado.getNombreEstrategia())) {
                return "Voto en blanco registrado correctamente.";
            }

            System.out.println("Voto realizado - Nombre: " + resultado.getNombreEstrategia());
            System.out.println("Votos antes: " + contexto.votos.size());
            contexto.votos.add(resultado);
            System.out.println("Votos después: " + contexto.votos.size());

            contexto.registrarVotoResultado(resultado);  // REGISTRA votos detallados por DNI
            contexto.Votaron.add(dni);

            return "Voto registrado con éxito.";
        } else {
              return "Error al registrar el voto.";
          }
      }




    @Override
    public boolean validarToken(Token token, List<Token> tokens) {
        
        for (Token t : tokens) {
            if (t.getToken().equals(token.getToken()) &&
                t.getDni().equals(token.getDni()) &&
                t.getEleccionId().equals(token.getEleccionId()) &&
                !t.isUsado()) {
                System.out.println("Token: "+token.getToken()+" DNI: "+token.getDni() + " ID: "+ token.getEleccionId());
                //t.setUsado(true); // marcar como usado
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
        /*if (ahora.after(fin)) {
            System.out.println("La votación ha finalizado. Cambiando a estado: VotacionesCerradas.");
            return  VotacionesCerradas.getInstance();
        } else {
            return this; 
        }*/
        
        return  VotacionesCerradas.getInstance();
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
        if (estudiante == null) {
            System.err.println("Error: se intentó validar un estudiante null.");
            return null;
        }

        for (Estructura estructura : estudiantes) {
            if (estructura instanceof Tribu tribu) {
                for (Estructura hijo : tribu.obtenerHijos()) {
                    if (hijo instanceof Estudiante est) {
                        if (est.getDni().equals(estudiante.getDni())) {
                            return est;
                        }
                    }
                }
            }
        }
        return null;
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