package com.mycompany.proyecto_final.modelo;

import java.util.ArrayList;
import java.util.List;

public class Delegacion implements Estructura {

    private String id;
    private String nombre;
    private List<Estudiante> estudiantes = new ArrayList<>(); // estudiante Asignado

    public Delegacion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre; // nombre del cargo
    }
    
    public Delegacion(String id, String nombre, Estudiante estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.estudiantes.add(estudiante);
    }
    
    private String buscarNombreListaDesdeCandidato(Estructura candidato) {
        // Lógica para encontrar la lista a la que pertenece el candidato
        // Podés guardar una referencia a la lista en el candidato, o recorrer las listas válidas
        if (candidato instanceof Delegacion delegacion) {
            return delegacion.getNombre(); // suponer que la delegación sabe su lista
        }
        return "Lista Desconocida";
    }

    private String buscarNombreTribuDesdeCandidato(Estructura candidato) {
        if (candidato instanceof Delegacion delegacion) {
            return delegacion.getNombre(); // suponiendo que lo tenga
        }
        return "Tribu Desconocida";
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
