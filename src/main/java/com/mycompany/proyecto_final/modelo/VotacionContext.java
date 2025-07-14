package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.gestores.GestorEleccion;
import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import com.mycompany.proyecto_final.modelo.VotacionesEnPreparacion;
import java.util.List;

public class VotacionContext {

    private GestorVoto gestorVoto;
    private GestorEleccion gestorEleccion;

    private String id;
    private String tipo;
    private String fechaInicio;
    private String fechaFin;
    private EstadoVotaciones estadoActual;

    private List<Estructura> listasValidas;  // listas asociadas a esta votación

    private static VotacionesEnPreparacion instancia = VotacionesEnPreparacion.getInstance();

    public VotacionContext(String id, String tipo, String fechaInicio, String fechaFin) {
        this.id = id;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoActual = instancia;  // Arranca en preparación
    }

    public void setEstado(EstadoVotaciones nuevoEstado){
        this.estadoActual = nuevoEstado;
    }

    public EstadoVotaciones getEstado(){
        return estadoActual;
    }

    public void recibirVoto(IVoto voto){
        estadoActual.recibirVoto(voto);
    }

    public List<Estructura> contarVotos(String id){
        return estadoActual.contarVotos(id);
    }

    public boolean cargarLista(List<Estructura> lista){
        this.listasValidas = lista;  // Guarda las listas válidas
        return estadoActual.cargarLista(lista);
    }

    public List<Estructura> getListasValidas(){
        return listasValidas;
    }

    public void setListasValidas(List<Estructura> listasValidas){
        this.listasValidas = listasValidas;
    }

    public String getId(){
        return id;
    }

    public String getTipo(){
        return tipo;
    }

    public String getFechaInicio(){
        return fechaInicio;
    }

    public String getFechaFin(){
        return fechaFin;
    }
    public boolean esListaValida(Estructura lista){
        if (listasValidas == null) {
            return false;
        }
        for (Estructura l : listasValidas) {
            if (l.getId().equals(lista.getId())) {
                return true;
            }
        }
        return false;
    }

}
