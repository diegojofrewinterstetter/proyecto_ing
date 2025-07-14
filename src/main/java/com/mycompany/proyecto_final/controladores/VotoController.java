package com.mycompany.proyecto_final.controladores;

import com.mycompany.proyecto_final.comando.VotoService;
import com.mycompany.proyecto_final.gestores.GestorEleccion;
import com.mycompany.proyecto_final.modelo.*;
import java.util.ArrayList;
import java.util.List;

import java.util.Map;

public class VotoController {
    
    private static VotoController instance;
    private RegistradorDeVoto registrador = new RegistradorDeVoto();
    private VotoService votoService;
    

    private VotoController() {
        this.votoService = new VotoService();
    }

    public static VotoController getInstance() {
        if (instance == null) {
            instance = new VotoController();
        }
        return instance;
    }

    
    public void procesarVoto(String eleccionId, Estructura listaSeleccionada, String dni, String token) {
        GestorEleccion gestorEleccion = GestorEleccion.getInstancia();
        VotacionContext eleccion = gestorEleccion.obtenerVotacion(eleccionId);

        if (eleccion == null) {
            System.out.println("No existe la elección.");
            return;
        }

        if (!eleccion.esListaValida(listaSeleccionada)) {
            System.out.println("Lista no válida para esta elección.");
            return;
        }

        IVoto voto = new VotoListaCompleta(listaSeleccionada);
        RegistradorDeVoto registrador = new RegistradorDeVoto();
        registrador.ejecutarVoto(dni, token, voto, votoService, listaSeleccionada);
    }


    public List<Estructura> getListas(String eleccionId){ // retornamos lista para las vista
        GestorEleccion gestorEleccion = GestorEleccion.getInstancia();
        VotacionContext eleccion = gestorEleccion.obtenerVotacion(eleccionId);
        List<Estructura> lista = eleccion.getListasValidas();
        return lista;
    }
}



/*public boolean procesarVoto(Estructura listaSeleccionada, String dni, String token, Estructura estructura,String  eleccionId) {
        IVoto voto = new VotoListaCompleta(listaSeleccionada);
        return registrador.ejecutarVoto(dni, token, voto, votoService, estructura,eleccionId);
    }*/