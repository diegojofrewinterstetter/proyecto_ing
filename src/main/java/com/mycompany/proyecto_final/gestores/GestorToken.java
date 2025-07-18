package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.Token;
import java.util.Random;

public class GestorToken {
    private static GestorToken instancia;

    private GestorToken() {}

    public static GestorToken getInstancia() {
        if (instancia == null) {
            instancia = new GestorToken();
        }
        return instancia;
    }

    public Token generarToken(String eleccionId, String dni) {
        String tokenString = "ABC-" + generarTokenCorto(6);
        System.out.println("TOken: "+tokenString);
        return new Token(tokenString, eleccionId, dni);
    }

    private String generarTokenCorto(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder token = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = rnd.nextInt(caracteres.length());
            token.append(caracteres.charAt(index));
        }
        return token.toString();
    }
}
