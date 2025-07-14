package com.mycompany.proyecto_final.comando;

import com.mycompany.proyecto_final.modelo.Estructura;
import com.mycompany.proyecto_final.modelo.IVoto;

public class EmitirVotoCommand implements IVotoCommand {
    private IVoto voto;
    private String token;
    private VotoService service;
    private Estructura estructura; //se pasa el voto, es de tipo ResultadoVoto

    public EmitirVotoCommand(IVoto voto, String token, VotoService service,  Estructura estructura){
        this.voto = voto;
        this.token = token;
        this.service = service;
        this.estructura = estructura;
    }

    @Override
    public void execute(){
        service.registrarVoto(token, voto, estructura);
    }
}
