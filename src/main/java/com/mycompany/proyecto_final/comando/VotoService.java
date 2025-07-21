package com.mycompany.proyecto_final.comando;

import com.mycompany.proyecto_final.modelo.IVoto;
import com.mycompany.proyecto_final.modelo.ResultadoVoto;
import com.mycompany.proyecto_final.modelo.Estructura;

public class VotoService {
    private static VotoService instancia;

    private VotoService() {}

    public static VotoService getInstance() {
        if (instancia == null) {
            instancia = new VotoService();
        }
        return instancia;
    }

    public ResultadoVoto registrarVoto(IVoto voto, String dni, Estructura estructura) {
         System.out.println("registrarVoto: DNI=" + dni + ", estructura=" + estructura.getNombre());
        ResultadoVoto resultado = voto.votar(estructura, dni);
        System.out.println("Resultado del voto: candidato=" + (resultado.getCandidato() != null ? resultado.getCandidato().getNombre() : "null"));
        return resultado;
    }
}
