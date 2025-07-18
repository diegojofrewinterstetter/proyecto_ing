package com.mycompany.proyecto_final.modelo;

import java.util.ArrayList;
import java.util.List;

public class ResultadoVoto implements Estructura {
    protected Estructura candidato;
    private String eleccionId;
    protected int votos;
    protected List<ResultadoVoto> subResultados = new ArrayList<>();

    public ResultadoVoto(String eleccionId, Estructura candidato, int votos) {
        this.eleccionId = eleccionId;
        this.candidato = candidato;
        this.votos = votos;
    }
    public ResultadoVoto(){}

    public String getEleccionId() {
        return eleccionId;
    }

    public Estructura getCandidato() {
        return candidato;
    }

    public int getVotos() {
        return votos;
    }

    public void agregarSubResultado(ResultadoVoto resultado) {
        subResultados.add(resultado);
    }

    @Override
    public Estructura mostrar() {
        if (candidato != null) {
            System.out.println("Candidato: " + candidato.getNombre() + " - Votos: " + votos);
        }
        for (ResultadoVoto sub : subResultados) {
            sub.mostrar();
        }
        return this;
    }

    @Override
    public String getId() {
        return this.eleccionId;
    }

    @Override
    public String getNombre() {
        return candidato != null ? candidato.getNombre() : "Voto en Blanco";
    }

    @Override
    public List<Estructura> obtenerHijos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void agregar(Estructura e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(Estructura e) {
       throw new UnsupportedOperationException("Not supported yet.");
    }
}
