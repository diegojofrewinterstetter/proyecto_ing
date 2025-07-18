package com.mycompany.proyecto_final.controladores;

import com.mycompany.proyecto_final.gestores.GestorEleccion;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import java.util.Date;
import java.util.List;

public class Sistema {

    private GestorEleccion gestorEleccion;
    
    public Sistema() {
        this.gestorEleccion = GestorEleccion.getInstancia();
    }

    public boolean login(String dni, String password) {
        if ("44309650".equals(dni) && "123456".equals(password)) {
            System.out.println("Login exitoso para usuario: " + dni);
            return true;
        }
        System.out.println("Login fallido para usuario: " + dni);
        return false;
    }

    public List<VotacionContext> listarElecciones() {
        return gestorEleccion.listarVotaciones();
    }
    
    public boolean cargarEleccion(VotacionContext votacion){
        return this.gestorEleccion.agregarVotacion(votacion);    
    }
}
