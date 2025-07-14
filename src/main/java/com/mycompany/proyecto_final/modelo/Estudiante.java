package com.mycompany.proyecto_final.modelo;

import java.util.Collections;
import java.util.List;

public class Estudiante implements Estructura{
    
    private String dni;
    private String nombre;
    
    public Estudiante(String dni, String nombre){ 
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public List<Estructura> obtenerHijos() {
        return Collections.emptyList();
    }

    @Override
    public Estructura mostrar() {
        return this;
    }

    @Override
    public String getId() {
        return getDni();
    }
    
}
