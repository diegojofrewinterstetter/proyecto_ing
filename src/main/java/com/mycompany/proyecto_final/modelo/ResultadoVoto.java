package com.mycompany.proyecto_final.modelo;

import java.util.ArrayList;
import java.util.List;

public class ResultadoVoto {

    private String eleccionId;
    private int votos;
    private String nombreEstrategia; // Ej: "Voto Lista Completa", "Voto en Blanco", etc.
    private List<Delegacion> delegaciones = new ArrayList<>();

    public ResultadoVoto(String eleccionId, int votos, String nombreEstrategia, List<Delegacion> delegaciones) {
        this.eleccionId = eleccionId;
        this.votos = votos;
        this.nombreEstrategia = nombreEstrategia;
        this.delegaciones = delegaciones != null ? delegaciones : new ArrayList<>();
    }

    public ResultadoVoto() {
        this.delegaciones = new ArrayList<>();
    }

    public String getEleccionId() {
        return eleccionId;
    }

    public void setEleccionId(String eleccionId) {
        this.eleccionId = eleccionId;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public String getNombreEstrategia() {
        return nombreEstrategia;
    }

    public void setNombreEstrategia(String nombreEstrategia) {
        this.nombreEstrategia = nombreEstrategia;
    }

    public List<Delegacion> getDelegaciones() {
        return delegaciones;
    }

    public void setDelegaciones(List<Delegacion> delegaciones) {
        this.delegaciones = delegaciones != null ? delegaciones : new ArrayList<>();
    }

    public void agregarDelegacion(Delegacion delegacion) {
        if (delegacion != null) {
            this.delegaciones.add(delegacion);
        }
    }

    public void mostrarResumen() {
        System.out.println("ResultadoVoto:");
        System.out.println("- Elección ID: " + eleccionId);
        System.out.println("- Votos: " + votos);
        System.out.println("- Estrategia: " + nombreEstrategia);
        System.out.println("- Delegaciones:");
        for (Delegacion d : delegaciones) {
            System.out.println("  · " + d.getNombre());
        }
    }
}
