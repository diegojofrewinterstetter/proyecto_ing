package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.comando.VotoService;
import com.mycompany.proyecto_final.gestores.GestorEleccion;
import com.mycompany.proyecto_final.gestores.GestorToken;
import com.mycompany.proyecto_final.gestores.GestorVoto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;


public final class VotacionContext {

    private GestorVoto gestorVoto;
    private GestorEleccion gestorEleccion;
    private GestorToken gestorToken;
    private VotoService votoService = VotoService.getInstance();
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
    private Set<String> Votaron = new HashSet<>();
    
    private RegistradorDeVoto registrador = RegistradorDeVoto.getInstance();
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
        this.tribus = new ArrayList<>();
        this.tribus.add(new Tribu("Huarpe", "Huarpe"));
        this.tribus.add(new Tribu("Pehuelche", "Pehuelche"));
        
        this.estadoActual = instancia;
        cargarEstudiantesDePrueba();
        cargarListasDePrueba();
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
        cargarEstudiantesDePrueba();
    }
    private void cargarEstudiantesDePrueba() {
        String[][] datosEstudiantes = {
            {"Lautaro Gómez", "Huarpe"}, {"Juana Torres", "Huarpe"}, {"Matías Rojas", "Huarpe"},
            {"Camila Díaz", "Huarpe"}, {"Santiago Ruiz", "Huarpe"}, {"Valentina Herrera", "Huarpe"},
            {"Bruno Castro", "Huarpe"}, {"Martina Morales", "Huarpe"}, {"Agustín Fernández", "Huarpe"},
            {"Lucía Romero", "Huarpe"}, {"Benjamín Ortega", "Huarpe"}, {"Florencia Vega", "Huarpe"},
            {"Tomás Aguirre", "Huarpe"}, {"Mía Sosa", "Huarpe"}, {"Julián Navarro", "Huarpe"},
            {"Catalina Ponce", "Huarpe"}, {"Dylan Mendoza", "Huarpe"}, {"Abril Duarte", "Huarpe"},
            {"Facundo Silva", "Huarpe"}, {"Malena Ibarra", "Huarpe"},

            {"Franco Gutiérrez", "Pehuelche"}, {"Sofía Molina", "Pehuelche"}, {"Nicolás Ramos", "Pehuelche"},
            {"Paula Cáceres", "Pehuelche"}, {"Lucas Ibáñez", "Pehuelche"}, {"Rocío Cabrera", "Pehuelche"},
            {"Thiago Correa", "Pehuelche"}, {"Renata Castro", "Pehuelche"}, {"Gonzalo Leiva", "Pehuelche"},
            {"Ariana Suárez", "Pehuelche"}, {"Emiliano Bravo", "Pehuelche"}, {"Milagros Farías", "Pehuelche"},
            {"Iván Godoy", "Pehuelche"}, {"Ámbar Toledo", "Pehuelche"}, {"Alejo Acosta", "Pehuelche"},
            {"Celeste Fuentes", "Pehuelche"}, {"Tobías Quiroga", "Pehuelche"}, {"Julieta Arias", "Pehuelche"},
            {"Kevin Bustos", "Pehuelche"}, {"Brisa Méndez", "Pehuelche"}
        };

        int dniHuarpe = 40000000;
        int dniPehuelche = 41000000;

        for (String[] datos : datosEstudiantes) {
            String nombre = datos[0];
            String tribu = datos[1];
            String dni;

            if (tribu.equals("Huarpe")) {
                dni = String.valueOf(dniHuarpe++);
            } else {
                dni = String.valueOf(dniPehuelche++);
            }

            Estudiante estudiante = new Estudiante(dni, nombre, tribu);
            this.agregarEstudiante(estudiante);
        }
    }
    
     private void cargarListasDePrueba() {
        Lista lista = new Lista("Lista 1", "Lista 1");
        Tribu tribuH = new Tribu("1", "Huarpe");
        Tribu tribuP = new Tribu("2", "Pehuelche");

        // Definir estructura: nombre del cargo, tribu, índice del estudiante
        String[][] cargos = {
            // Caciques
            {"Cacique Huarpe", "Huarpe", "0"},
            {"Cacique Pehuelche", "Pehuelche", "0"},

            // Jefe de Consejo
            {"Jefe de Consejo Huarpe", "Huarpe", "1"},
            {"Jefe de Consejo Pehuelche", "Pehuelche", "1"},

            // Hechicero
            {"Hechicero Huarpe", "Huarpe", "2"},
            {"Hechicero Pehuelche", "Pehuelche", "2"},

            // Delegados Huarpe
            {"Delegado Huarpe1", "Huarpe", "3"}, {"Delegado Huarpe2", "Huarpe", "4"},
            {"Delegado Huarpe3", "Huarpe", "5"}, {"Delegado Huarpe4", "Huarpe", "6"},
            {"Delegado Huarpe5", "Huarpe", "7"}, {"Delegado Huarpe6", "Huarpe", "8"},

            // Consejeros Huarpe
            {"Consejero Huarpe1", "Huarpe", "9"}, {"Consejero Huarpe2", "Huarpe", "10"},
            {"Consejero Huarpe3", "Huarpe", "11"}, {"Consejero Huarpe4", "Huarpe", "12"},
            {"Consejero Huarpe5", "Huarpe", "13"}, {"Consejero Huarpe6", "Huarpe", "14"},

            // Delegados Pehuelche
            {"Delegado Pehuelche1", "Pehuelche", "3"}, {"Delegado Pehuelche2", "Pehuelche", "4"},
            {"Delegado Pehuelche3", "Pehuelche", "5"}, {"Delegado Pehuelche4", "Pehuelche", "6"},
            {"Delegado Pehuelche5", "Pehuelche", "7"}, {"Delegado Pehuelche6", "Pehuelche", "8"},

            // Consejeros Pehuelche
            {"Consejero Pehuelche1", "Pehuelche", "9"}, {"Consejero Pehuelche2", "Pehuelche", "10"},
            {"Consejero Pehuelche3", "Pehuelche", "11"}, {"Consejero Pehuelche4", "Pehuelche", "12"},
            {"Consejero Pehuelche5", "Pehuelche", "13"}, {"Consejero Pehuelche6", "Pehuelche", "14"},
        };

        for (String[] c : cargos) {
            String nombreCargo = c[0];
            String tribuNombre = c[1];
            int index = Integer.parseInt(c[2]);

            Estudiante estudiante = null;

            // Buscar estudiante en la tribu correspondiente
            for (Estructura estructura : tribus) {
                if (estructura instanceof Tribu tribu && tribu.getNombre().equals(tribuNombre)) {
                    List<Estructura> hijos = tribu.obtenerHijos();
                    if (index < hijos.size()) {
                        Estructura posibleEstudiante = hijos.get(index);
                        if (posibleEstudiante instanceof Estudiante est) {
                            estudiante = est;
                            break;
                        }
                    }
                }
            }

            if (estudiante == null) {
                System.out.println("No se encontró estudiante válido para " + nombreCargo);
                return; // Salir si algún estudiante falla
            }

            Delegacion delegacion = new Delegacion(estudiante.getDni(), nombreCargo, estudiante);
            if (tribuNombre.equals("Huarpe")) {
                tribuH.agregar(delegacion);
            } else {
                tribuP.agregar(delegacion);
            }
        }

        lista.agregar(tribuH);
        lista.agregar(tribuP);

        // Agregar a listas válidas si es válida
        boolean cargado = cargarLista(lista);
        if (cargado) {
            System.out.println("Lista de prueba cargada correctamente.");
        } else {
            System.out.println("No se pudo cargar la lista de prueba.");
        }
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
    return estadoActual.procesarVoto(this, listaSeleccionada, dni, token);
}





    public Token generarToken(String dni) {
        Estudiante e = buscarEstudiante(dni);
        
        if(e != null){
            Token resultado = estadoActual.generarToken(this.id, dni);
            if (resultado != null) {
                tokens.add(resultado);
            }
            return resultado;
        }
        return new Token();
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

    public List<Estructura> listarEstudiantes() {
        return estadoActual.listarEstudiantes(tribus);
    }
    
    public List<ResultadoVoto> agruparResultados(List<ResultadoVoto> votos) {
        Map<String, ResultadoVoto> acumulador = new HashMap<>();

        for (ResultadoVoto voto : votos) {
            String nombre = voto.getNombre();
            acumulador.putIfAbsent(nombre, new ResultadoVoto(voto.getEleccionId(), voto.getCandidato(), 0));
            acumulador.get(nombre).votos += voto.getVotos(); 
        }

        return new ArrayList<>(acumulador.values());
    }
    public String obtenerResumenVotos() {
        if (votos == null || votos.isEmpty()) {
            return "No hay votos registrados.";
        }

        List<ResultadoVoto> resultadosAgrupados = agruparResultados(votos);

        StringBuilder sb = new StringBuilder();
        sb.append("Resultados de la elección ").append(id).append(":\n");
        for (ResultadoVoto resultado : resultadosAgrupados) {
            sb.append("- ").append(resultado.getNombre())
              .append(": ").append(resultado.getVotos())
              .append(" votos\n");
        }
        return sb.toString();
    }
     public Set<String> getVotaron() {
        return Votaron;
    }
}
