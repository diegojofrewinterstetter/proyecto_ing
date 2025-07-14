package com.mycompany.proyecto_final.modelo;

import java.util.*;

public class VotoPorDelegacion implements IVoto {

    public VotoPorDelegacion() {
        
    }

    @Override
    public ResultadoVoto votar(Estructura delegacionesAgrupadas, String eleccionId) {
        ResultadoVoto resultadoGeneral = new ResultadoVoto(eleccionId,null, 0);

        for (Estructura hijo : delegacionesAgrupadas.obtenerHijos()) {
            resultadoGeneral.agregarSubResultado(new ResultadoVoto(eleccionId,hijo, 1));
        }

        return resultadoGeneral;
    }
    
}
