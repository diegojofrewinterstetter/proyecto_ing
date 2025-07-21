package com.mycompany.proyecto_final.modelo;

import java.util.*;


public class VotoEnBlanco implements IVoto {

    @Override
    public ResultadoVoto votar(Estructura estructura, String dni) {
        Delegacion votoBlanco = new Delegacion("BLANCO", "VOTO EN BLANCO");
        return new ResultadoVoto("BLANCO", votoBlanco, votoBlanco.getNombre(), 1);
    }
}
