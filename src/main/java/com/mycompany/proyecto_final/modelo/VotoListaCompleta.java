package com.mycompany.proyecto_final.modelo;

import java.util.ArrayList;
import java.util.List;

public class VotoListaCompleta implements IVoto {

    @Override
    public ResultadoVoto votar(Estructura estructura, String dni) {
        List<Delegacion> delegaciones = new ArrayList<>();

        if (estructura instanceof Lista lista) {
            for (Estructura tribu : lista.obtenerHijos()) {
                for (Estructura e : tribu.obtenerHijos()) {
                    if (e instanceof Delegacion d) {
                        delegaciones.add(d);
                    }
                }
            }
        }

        return new ResultadoVoto(estructura.getId(), 1, "Voto Lista Completa", delegaciones);
    }
}
