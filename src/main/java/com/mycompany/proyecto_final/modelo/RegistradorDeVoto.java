package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.comando.EmitirVotoCommand;
import com.mycompany.proyecto_final.comando.VotoService;
import java.util.HashSet;
import java.util.Set;

public class RegistradorDeVoto {
    private Set<String> dnisQueVotaron = new HashSet<>();
    
    public RegistradorDeVoto(){
    }
 
    public boolean yaVoto(String dni) {
        return dnisQueVotaron.contains(dni);
    }

   
    public ResultadoVoto ejecutarVoto(String dni, IVoto voto, VotoService service,  Estructura estructura) {
        if (yaVoto(dni)) {
            System.out.println("El DNI ya votó.");
            return  new ResultadoVoto();
        }
        if (yaVoto(dni)) {
            System.out.println("El DNI ya votó.");
            return  new ResultadoVoto();
        }
        EmitirVotoCommand comando = new EmitirVotoCommand(voto, service,estructura);
        ResultadoVoto resultado = comando.execute();

        System.out.println("Voto registrado correctamente.");
        return resultado;
    }

}
