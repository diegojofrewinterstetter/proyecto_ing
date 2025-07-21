package com.mycompany.proyecto_final.comando;

import com.mycompany.proyecto_final.modelo.*;

public class EmitirVotoCommand implements IVotoCommand {
    private RegistradorDeVoto registrador;
    private IVoto estrategia;
    private VotoService servicio;
    private String dni;
    private Estructura estructura;

    public EmitirVotoCommand(RegistradorDeVoto registrador, IVoto estrategia, VotoService servicio, String dni, Estructura estructura) {
        this.registrador = registrador;
        this.estrategia = estrategia;
        this.servicio = servicio;
        this.dni = dni;
        this.estructura = estructura;
    }

    @Override
    public ResultadoVoto execute() {
        registrador.setEstrategia(estrategia);
        return registrador.ejecutarVoto(dni, servicio, estructura);
    }
}
