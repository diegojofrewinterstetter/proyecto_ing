package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.comando.VotoService;
import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface EstadoVotaciones {
    void recibirVoto(IVoto voto);
    Map<String, Integer> contarVotos(VotacionContext contexto);
    boolean cargarLista(Estructura lista);
    EstadoVotaciones CambiarEstado(EstadoVotaciones estado, Date inicio, Date fin, Date ahora);
    String procesarVoto(VotacionContext contexto, Estructura listaSeleccionada, String dni, Token token, RegistradorDeVoto registrador, VotoService votoService);
    Token generarToken(String eleccionId, String dni) ;
    boolean validarToken(Token token, List<Token> tokens);
    String getNombreVisible();
    Estudiante validarEstudiante(String dni, List<Estudiante> estudiantes);
    Estudiante validarEstudianteAvanzado(Estudiante estudiante, List<Estructura> estudiantes);
    boolean agregarEstudiante(Estudiante estudiante, List<Estructura> estudiantes);
    boolean eliminarEstudiante(String dni, List<Estudiante> estudiantes);
    Estudiante buscarEstudiante(String dni, List<Estructura> tribus);
    List<Estructura> listarEstudiantes(List<Estructura> tribus);
}
