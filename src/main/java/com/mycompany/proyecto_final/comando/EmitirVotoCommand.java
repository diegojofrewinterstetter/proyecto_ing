package com.mycompany.proyecto_final.comando;

import com.mycompany.proyecto_final.modelo.Estructura;
import com.mycompany.proyecto_final.modelo.IVoto;
import com.mycompany.proyecto_final.modelo.ResultadoVoto;
import com.mycompany.proyecto_final.modelo.Token;

public class EmitirVotoCommand implements IVotoCommand {
    private IVoto voto;
    private VotoService service;
    private Estructura estructura; //se pasa el voto, es de tipo ResultadoVoto

    public EmitirVotoCommand(IVoto voto, VotoService service,  Estructura estructura){
        this.voto = voto;
        this.service = service;
        this.estructura = estructura;
    }

    @Override
    public ResultadoVoto execute(){
        
        return service.registrarVoto(voto, estructura);
        
    }
}
