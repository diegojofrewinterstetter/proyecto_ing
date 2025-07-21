package com.mycompany.proyecto_final.modelo;


public class VotoListaCompleta implements IVoto {
    private Estructura lista;

    public VotoListaCompleta(Estructura lista) {
        this.lista = lista;
    }

    @Override
    public ResultadoVoto votar(Estructura estructura, String dni) {
        return new ResultadoVoto(estructura.getId(), estructura, estructura.getNombre(), 1);
    }
}
