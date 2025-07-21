package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.comando.EmitirVotoCommand;
import com.mycompany.proyecto_final.comando.VotoService;
import java.util.HashSet;
import java.util.Set;


public class RegistradorDeVoto {
    private IVoto estrategia;
    private static RegistradorDeVoto instance;
    
    private RegistradorDeVoto(){
        
    }
    public static RegistradorDeVoto getInstance(){
        if(instance == null){
            instance = new RegistradorDeVoto();
        }
        return instance;
    }

    public void setEstrategia(IVoto estrategia) {
        this.estrategia = estrategia;
    }

    public ResultadoVoto ejecutarVoto(String dni, VotoService votoService, Estructura estructura) {
        if (estrategia == null) throw new IllegalStateException("Estrategia de voto no seteada.");
        return votoService.registrarVoto(estrategia, dni, estructura);
    }
}

