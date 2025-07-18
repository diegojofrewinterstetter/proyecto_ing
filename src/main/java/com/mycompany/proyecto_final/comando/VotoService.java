package com.mycompany.proyecto_final.comando;

import com.mycompany.proyecto_final.modelo.IVoto;
import com.mycompany.proyecto_final.modelo.ResultadoVoto;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import com.mycompany.proyecto_final.gestores.GestorToken;
import com.mycompany.proyecto_final.modelo.Estructura;
import com.mycompany.proyecto_final.modelo.Token;

public class VotoService {

    public ResultadoVoto registrarVoto(IVoto voto,  Estructura estructura) { 
        
        
        ResultadoVoto resultado = voto.votar(estructura, estructura.getId());  
        /*gestorVoto.registrarVoto(token.getToken(),resultado);
        gestorToken.marcarComoUsado(token.getToken());*/
        
        System.out.println("Voto registrado con éxito.");
        return resultado;
    }
}
