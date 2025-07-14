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

   
    public boolean ejecutarVoto(String dni, String token, IVoto voto, VotoService service,  Estructura estructura) {
        if (yaVoto(dni)) {
            System.out.println("El DNI ya votó.");
            return false;
        }
        if (yaVoto(dni)) {
            System.out.println("El DNI ya votó.");
            return false;
        }
        EmitirVotoCommand comando = new EmitirVotoCommand(voto, token, service,estructura);
        comando.execute();

        dnisQueVotaron.add(dni);
        System.out.println("Voto registrado correctamente.");
        return true;
    }

}
