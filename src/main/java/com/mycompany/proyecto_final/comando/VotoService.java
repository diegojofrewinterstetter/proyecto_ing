package com.mycompany.proyecto_final.comando;

import com.mycompany.proyecto_final.modelo.IVoto;
import com.mycompany.proyecto_final.modelo.ResultadoVoto;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import com.mycompany.proyecto_final.gestores.GestorToken;
import com.mycompany.proyecto_final.modelo.Estructura;

public class VotoService {
    private GestorVoto gestorVoto = GestorVoto.getInstance();
    private GestorToken gestorToken = GestorToken.getInstancia();

    public boolean registrarVoto(String token, IVoto voto,  Estructura estructura) { 
        if (!validarVoto(token)) {
            System.out.println("Token inválido o ya usado.");
            return false;
        }
        
        ResultadoVoto resultado = voto.votar(estructura, estructura.getId());  
        gestorVoto.registrarVoto(token, resultado);
        gestorToken.marcarComoUsado(token);

        System.out.println("Voto registrado con éxito.");
        return true;
    }

    public boolean validarVoto(String token) {
        return !gestorVoto.tokenYaUsado(token) && gestorToken.validarToken(token);
    }
}
