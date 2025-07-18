package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.comando.VotoService;
import com.mycompany.proyecto_final.gestores.GestorEleccion;
import com.mycompany.proyecto_final.gestores.GestorToken;
import com.mycompany.proyecto_final.gestores.GestorVoto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class VotacionContext {

    private GestorVoto gestorVoto;
    private GestorEleccion gestorEleccion;
    private GestorToken gestorToken;
    private RegistradorDeVoto registrador = new RegistradorDeVoto();
    private VotoService votoService = new VotoService();
    private static int contador = 5;
    private String id;
    private String tipo;
    private Date fechaInicio;
    private Date fechaFin;
    private EstadoVotaciones estadoActual;
    private List<Estudiante> estudiantes;
    private List<Token> tokens;
    private List<ResultadoVoto> votos;
    private List<Estructura> listasValidas;
    private List<Estructura> tribus;

    private static VotacionesEnPreparacion instancia = VotacionesEnPreparacion.getInstance();

    public VotacionContext() {
    }

    public VotacionContext(String id, String tipo, String fechaInicioStr, String fechaFinStr) {
        this.id = id;
        this.tipo = tipo;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.fechaInicio = formato.parse(fechaInicioStr);
            this.fechaFin = formato.parse(fechaFinStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.estudiantes = new ArrayList<>();
        this.tokens = new ArrayList<>();
        this.votos = new ArrayList<>();
        this.listasValidas = new ArrayList<>();

        this.estadoActual = instancia;
    }
    
    public VotacionContext(String tipo, String fechaInicioStr, String fechaFinStr) {
        this.id = String.format("V%03d", contador++); // Genera: V001, V002, etc.
        this.tipo = tipo;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            this.fechaInicio = formato.parse(fechaInicioStr);
            this.fechaFin = formato.parse(fechaFinStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.estudiantes = new ArrayList<>();
        this.tokens = new ArrayList<>();
        this.votos = new ArrayList<>();
        this.listasValidas = new ArrayList<>();
        this.tribus = new ArrayList<>();
        this.tribus.add(new Tribu("Huarpe", "Huarpe"));
        this.tribus.add(new Tribu("Pehuelche", "Pehuelche"));
        this.estadoActual = instancia;
    }

    public EstadoVotaciones setEstado(EstadoVotaciones nuevoEstado) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date fechaActualFormateada = null;

        try {
            String ahoraStr = formato.format(new Date()); 
            fechaActualFormateada = formato.parse(ahoraStr); // Parsearla para obtener un Date formateado
        } catch (ParseException e) {
            e.printStackTrace();
            return this.estadoActual;
        }
        System.out.println("Lleguié");
        this.estadoActual = this.estadoActual.CambiarEstado(nuevoEstado, this.fechaInicio, this.fechaFin, fechaActualFormateada);
         System.out.println(this.estadoActual.getNombreVisible());
        return this.estadoActual;
    }

    public EstadoVotaciones getEstado() {
        return estadoActual;
    }
    
    public Estudiante validarEstudiante(String dni){
        Estudiante e = buscarEstudiante(dni);
        return this.estadoActual.validarEstudianteAvanzado(e, tribus);
    }
    
    public Estudiante validarEstudianteAvanzado(Estudiante estudiante){
        return this.estadoActual.validarEstudianteAvanzado(estudiante, tribus);
    }
    public List<Estructura> contarVotos(String id) {
        return estadoActual.contarVotos(id, votos);
    }

    public boolean cargarLista(Estructura lista) {
        boolean resultado = estadoActual.cargarLista(lista);
        if(resultado){
            listasValidas.add(lista);
            return true;
        }
        else{
            System.out.println("No se puede Cargar Lista");
            return false;
        }
    }

    public List<Estructura> getListasValidas() {
        return listasValidas;
    }

    public void setListasValidas(List<Estructura> listasValidas) {
        this.listasValidas = listasValidas;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public boolean esListaValida(Estructura lista) {
        if (listasValidas == null) return false;
        for (Estructura l : listasValidas) {
            if (l.getId().equals(lista.getId())) {
                return true;
            }
        }
        return false;
    }

    public String procesarVoto(Estructura listaSeleccionada, String dni, Token token) {
        if (validarToken(token)) {
            ResultadoVoto resultado = estadoActual.procesarVoto(this.id, listaSeleccionada, dni);
            if (resultado != null) {
                return "Voto Realizado con Éxito";
            } else {
                return "Estado Votación: " + estadoActual.getClass().getSimpleName() + " - Voto Rechazado";
            }
        }
        return "Token inválido";
    }

    public Token generarToken(String dni) {
        Token resultado = estadoActual.generarToken(this.id, dni);
        if (resultado != null) {
            tokens.add(resultado);
        }
        return resultado;
    }

    public boolean validarToken(Token token) {
        return estadoActual.validarToken(token, this.tokens);
    }
    public boolean agregarEstudiante(Estudiante estudiante) {
        return estadoActual.agregarEstudiante(estudiante, tribus);
    }

    public boolean eliminarEstudiante(String dni) {
        return estadoActual.eliminarEstudiante(dni, estudiantes);
    }

    public Estudiante buscarEstudiante(String dni) {
        return estadoActual.buscarEstudiante(dni, tribus);
    }

    public void listarEstudiantes() {
        estadoActual.listarEstudiantes(estudiantes);
    }
    
}
