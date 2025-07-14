package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.VotacionContext;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class GestorEleccion {

    private static GestorEleccion instancia; // 
    private Map<String, VotacionContext> votaciones = new HashMap<>();
    


    private GestorEleccion() {
        
    }

    public static GestorEleccion getInstancia() {
        if (instancia == null) {
            instancia = new GestorEleccion();
        }
        return instancia;
    }

    public void agregarVotacion(VotacionContext votacion) {
        votaciones.put(votacion.getId(), votacion);
        System.out.println("Votación agregada: " + votacion.getId());
    }

    public VotacionContext obtenerVotacion(String id) {
        return votaciones.get(id);
    }

    public List<VotacionContext> listarVotaciones() {
        return new ArrayList<>(votaciones.values());
    }

    public boolean eliminarVotacion(String id) {
        if (votaciones.containsKey(id)) {
            votaciones.remove(id);
            System.out.println("Votación eliminada: " + id);
            return true;
        } else {
            System.out.println("Votación no encontrada: " + id);
            return false;
        }
    }

    public boolean actualizarVotacion(VotacionContext nueva) {
        String id = nueva.getId();
        if (votaciones.containsKey(id)) {
            votaciones.put(id, nueva);
            System.out.println("Votación actualizada: " + id);
            return true;
        } else {
            System.out.println("No se encontró la votación para actualizar: " + id);
            return false;
        }
    }

    public boolean existeVotacion(String id) {
        return votaciones.containsKey(id);
    }
}
