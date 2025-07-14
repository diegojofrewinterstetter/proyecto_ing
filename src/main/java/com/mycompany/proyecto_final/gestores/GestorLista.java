package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.Estructura;
import com.mycompany.proyecto_final.modelo.Lista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorLista {

    private static GestorLista instance;
    private Map<String, Lista> listasGuardadas = new HashMap<>();

    private GestorLista() {
    }

    public static GestorLista getInstance() {
        if (instance == null) {
            instance = new GestorLista();
        }
        return instance;
    }

    
    public boolean agregarLista(Lista lista) { // Agrega una lista 
        if (listasGuardadas.containsKey(lista.getId())) {
            System.out.println("La lista ya existe: " + lista.getId());
            return false;
        }
        listasGuardadas.put(lista.getId(), lista);
        System.out.println("Lista agregada: " + lista.getNombre());
        return true;
    }

    
    public boolean guardarLista(List<Estructura> lista) { // Agrega una colección de listas
        try {
            for (Estructura e : lista) {
                if (e instanceof Lista) {
                    listasGuardadas.put(e.getId(), (Lista) e);
                }
            }
            System.out.println("Listas guardadas en memoria correctamente.");
            return true;
        } catch (Exception ex) {
            System.out.println("Error al guardar lista: " + ex.getMessage());
            return false;
        }
    }

    
    public List<Estructura> cargarLista() { // Devuelve todas las listas almacenadas
        return new ArrayList<>(listasGuardadas.values());
    }

    
    public Lista obtenerLista(String id) { // Obtener una lista específica por ID
        return listasGuardadas.get(id);
    }

    
    public boolean eliminarLista(String id) {
        if (listasGuardadas.remove(id) != null) {
            System.out.println("Lista eliminada: " + id);
            return true;
        }
        System.out.println("No se encontró la lista: " + id);
        return false;
    }

    
    public boolean existeLista(String id) {
        return listasGuardadas.containsKey(id);
    }
}
