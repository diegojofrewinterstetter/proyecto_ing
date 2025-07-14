package com.mycompany.proyecto_final.gestores;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class GestorToken {
    private static GestorToken instancia;  // 🔥 singleton

    private Set<String> tokensCreados = new HashSet<>();
    private Set<String> tokensUsados = new HashSet<>();

    private GestorToken() {
        
    }

    public static GestorToken getInstancia() {
        if (instancia == null) {
            instancia = new GestorToken();
        }
        return instancia;
    }

    public String generarToken() {
        String token = UUID.randomUUID().toString();
        tokensCreados.add(token);
        return token;
    }

    public boolean validarToken(String token) {
        return tokensCreados.contains(token) && !tokensUsados.contains(token);
    }

    public void marcarComoUsado(String token) {
        if (tokensCreados.contains(token)) {
            tokensUsados.add(token);
        } else {
            System.out.println("Token inválido: no fue generado por el sistema.");
        }
    }

    public boolean fueGenerado(String token) {
        return tokensCreados.contains(token);
    }

    public boolean yaFueUsado(String token) {
        return tokensUsados.contains(token);
    }
}
