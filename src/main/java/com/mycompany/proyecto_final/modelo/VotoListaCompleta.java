package com.mycompany.proyecto_final.modelo;

public class VotoListaCompleta implements IVoto {
    private Estructura listaSeleccionada;

    public VotoListaCompleta(Estructura listaSeleccionada) {
        this.listaSeleccionada = listaSeleccionada;
    }

    public Estructura getLista() {
        return listaSeleccionada;
    }

    @Override
    public ResultadoVoto votar(Estructura listaVoto, String eleccionId) {
        return new ResultadoVoto(eleccionId,listaSeleccionada, 1);
    }
}
