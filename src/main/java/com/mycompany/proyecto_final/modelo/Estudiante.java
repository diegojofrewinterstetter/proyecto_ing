package com.mycompany.proyecto_final.modelo;

public class Estudiante {
    
    private String cargo;
    private String dni;
    private String nombre;
    private String tribu;
    private static Estudiante instancia;
    
    private Estudiante(String cargo, String dni, String nombre, String tribu){
        this.cargo = cargo;
        this.dni = dni;
        this.nombre = nombre;
        this.tribu = tribu;
    }
    
    public static Estudiante getIntance(String cargo, String dni, String nombre, String tribu){
        if(instancia == null){
            instancia = new Estudiante(cargo, dni, nombre, tribu);
            return instancia;             
        }
        return instancia;
    }
}
