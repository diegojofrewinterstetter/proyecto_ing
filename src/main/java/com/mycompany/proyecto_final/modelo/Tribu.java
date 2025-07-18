package com.mycompany.proyecto_final.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tribu implements Estructura {

    private String id;
    private String nombre;
    private List<Estructura> estructura = new ArrayList<>();

    public Tribu(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public void agregar(Estructura e) {
        estructura.add(e);
    }

    @Override
    public void eliminar(Estructura e) {
        estructura.remove(e);
    }

    @Override
    public List<Estructura> obtenerHijos() {
        return estructura;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Estructura mostrar() {
        System.out.println("🪶 Tribu: " + nombre + " (ID: " + id + ")");
        for (Estructura hijo : estructura) {
            hijo.mostrar();
        }
        return this;
    }
}
