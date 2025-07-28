package com.mycompany.proyecto_final.modelo;

import java.util.*;


public class VotoEnBlanco implements IVoto {

    @Override
    public ResultadoVoto votar(Estructura estructura, String dni) {
        Delegacion votoBlanco = new Delegacion("BLANCO", "VOTO EN BLANCO");
        List<Delegacion> delegaciones = new ArrayList<>();
        delegaciones.add(votoBlanco);
        return new ResultadoVoto("BLANCO", 1, "Voto en Blanco", delegaciones);
    }
}
