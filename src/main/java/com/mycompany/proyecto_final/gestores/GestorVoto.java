package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.ResultadoVoto;

import java.util.*;

public class GestorVoto {

    private static GestorVoto instance;  // Singleton

    private Map<String, ResultadoVoto> votosPorToken = new HashMap<>();

    private GestorVoto() {}

    public static GestorVoto getInstance() {
        if (instance == null) {
            instance = new GestorVoto();
        }
        return instance;
    }

    public boolean tokenYaUsado(String token) {
        return votosPorToken.containsKey(token);
    }

    public void registrarVoto(String token, ResultadoVoto resultado) {
        votosPorToken.put(token, resultado);
    }

    public ResultadoVoto obtenerVoto(String token) {
        return votosPorToken.get(token);
    }

    public Collection<ResultadoVoto> obtenerTodos() {
        return votosPorToken.values();
    }

    public int cantidadVotos() {
        return votosPorToken.size();
    }
    public List<ResultadoVoto> obtenerVotosPorEleccion(String eleccionId) {
        List<ResultadoVoto> lista = new ArrayList<>();
        for (ResultadoVoto rv : votosPorToken.values()) {
            if (rv.getEleccionId().equals(eleccionId)) {
                lista.add(rv);
            }
        }
        return lista;
    }

}
