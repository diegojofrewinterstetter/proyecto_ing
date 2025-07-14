package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VotacionesEnPreparacion implements EstadoVotaciones {
    public static VotacionesEnPreparacion instance;
    private GestorLista gestor; // Se genera un alto coplamiento pero es controlado. Se utiliza para dar soporte de BD en este caso.
    private GestorVoto servicio;
     
    private VotacionesEnPreparacion(){
    
    }
    
    public static VotacionesEnPreparacion getInstance(){
        if(instance == null){
            instance = new VotacionesEnPreparacion();
        }
        return instance;
    }
    
  
    @Override
    public List<Estructura> contarVotos(String id) {
        List<Estructura> lista = new ArrayList<>();
        return lista;
    }
    @Override
    public void recibirVoto(IVoto voto){
    
    }
    
    @Override
    public boolean cargarLista(List<Estructura> lista){
        return true;
    }
    
    @Override
    public boolean abrirVotaciones(){ // desarrollar lógica
        return true;
    }
    
    @Override
    public boolean cerrarVotaciones(){// desarrollar lógica
        return true;
    }
}