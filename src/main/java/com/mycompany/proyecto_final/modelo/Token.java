package com.mycompany.proyecto_final.modelo;
public class Token {
    private String token;
    private String eleccionId;
    private String dni;
    private boolean usado; // nuevo atributo
    
    public Token(){
    }
    public Token(String codigo, String eleccionId, String dni) {
        this.token = codigo;
        this.eleccionId = eleccionId;
        this.dni = dni;
        this.usado = false; // al crearlo, no está usado
    }

    // Getters y setters
    public String getToken() {
        return token;
    }

    public String getEleccionId() {
        return eleccionId;
    }

    public String getDni() {
        return dni;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
}
