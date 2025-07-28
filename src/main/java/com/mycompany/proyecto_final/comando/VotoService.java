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

    /**
     * Registra un voto usando la estrategia IVoto.
     * @param voto Estrategia de voto (ej. VotoListaCompleta o VotoEnBlanco)
     * @param dni DNI del votante
     * @param estructura Estructura (lista con tribu y delegaciones) que representa el voto
     * @return ResultadoVoto con el detalle del voto
     */
    public ResultadoVoto registrarVoto(IVoto voto, String dni, Estructura estructura) {
        String nombreEstructura = (estructura != null) ? estructura.getNombre() : "Voto en Blanco";
        System.out.println("Registrando voto para DNI: " + dni + ", estructura: " + nombreEstructura);

        ResultadoVoto resultado = voto.votar(estructura, dni);

        if (resultado.getDelegaciones() != null && !resultado.getDelegaciones().isEmpty()) {
            System.out.println("Delegaciones votadas:");
            for (var d : resultado.getDelegaciones()) {
                System.out.println("  - " + d.getNombre());
            }
        } else {
            System.out.println("Voto en blanco o sin delegaciones específicas.");
        }

        return resultado;
    }
}
