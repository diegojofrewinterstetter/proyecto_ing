package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.VotacionContext;
import com.mycompany.proyecto_final.modelo.VotacionesAbiertas;
import com.mycompany.proyecto_final.modelo.VotacionesCerradas;
import com.mycompany.proyecto_final.modelo.VotacionesEnPreparacion;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class GestorEleccion {

    private static GestorEleccion instancia; // 
    private Map<String, VotacionContext> votaciones = new HashMap<>();   

    private GestorEleccion() {
        cargarVotacionesEjemplo();
    }

    public static GestorEleccion getInstancia() {
        if (instancia == null) {
            instancia = new GestorEleccion();
        }
        return instancia;
    }

    public boolean agregarVotacion(VotacionContext votacion) { // Agregamos votacion
        votaciones.put(votacion.getId(), votacion);
        System.out.println("Votación agregada: " + votacion.getId());
        return true;
    }

    public VotacionContext obtenerVotacion(String id) { // retornamos votacion por id
        return votaciones.get(id);
    }

    public List<VotacionContext> listarVotaciones() { // listamos votaciones en preparacion o abiertas
        List<VotacionContext> activas = new ArrayList<>();
        for(VotacionContext v :  votaciones.values()){
            if (v.getEstado() instanceof VotacionesAbiertas || v.getEstado() instanceof VotacionesEnPreparacion) {
                activas.add(v);
            }
        }
        return activas;
    }
    
    public List<VotacionContext> listarVotacionesCerradas() { // listamos votaciones cerradas
        List<VotacionContext> cerradas = new ArrayList<>();
        for (VotacionContext v : votaciones.values()) {
            if (v.getEstado() instanceof VotacionesCerradas) {
                cerradas.add(v);
            }
        }
        return cerradas;
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
    public void cargarVotacionesEjemplo() {
        VotacionContext votacion1 = new VotacionContext("V001", "Elección Pasos", "2025-08-01 08:00:00", "2025-08-01 18:05:00");
        VotacionContext votacion2 = new VotacionContext("V002", "Eleccion General", "2025-08-10 08:00:00", "2025-08-10 18:05:00");
        VotacionContext votacion3 = new VotacionContext("V003", "Elección Valotage", "2025-08-20 08:00:00", "2025-08-20 18:05:00");
        VotacionContext votacionEjemplo = new VotacionContext("V100", "Elección de Prueba", java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), java.time.LocalDateTime.now().plusHours(10).format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));


        agregarVotacion(votacion1);
        agregarVotacion(votacion2);
        agregarVotacion(votacion3);
        agregarVotacion(votacionEjemplo);
    }
}
