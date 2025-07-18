package com.mycompany.proyecto_final.modelo;

import java.util.ArrayList;
import java.util.List;

public class Delegacion implements Estructura {

    private String id;
    private String nombre;
    private List<Estructura> estudiantes = new ArrayList<>();

    public Delegacion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Delegacion(String id, String nombre, Estudiante estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.estudiantes.add(estudiante);
    }

    @Override
    public void agregar(Estructura e) {
        if (e instanceof Estudiante estudiante) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("Solo se pueden agregar estudiantes a una delegación.");
        }
    }

    @Override
    public void eliminar(Estructura e) {
        if (e instanceof Estudiante estudiante) {
            estudiantes.remove(estudiante);
        }
    }

    @Override
    public List<Estructura> obtenerHijos() {
        return new ArrayList<>(estudiantes);
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
        System.out.println("Delegación: " + nombre);
        for (Estructura e : estudiantes) {
            e.mostrar();
        }
        return this;
    }
}
