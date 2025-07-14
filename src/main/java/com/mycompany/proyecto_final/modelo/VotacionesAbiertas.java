package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VotacionesAbiertas implements EstadoVotaciones {
    public VotacionesAbiertas instance;
    private GestorLista gestor;
     
    private VotacionesAbiertas(){
    
    }
    
    private VotacionesAbiertas getInstance(){
        if(instance == null){
            instance = new VotacionesAbiertas();
        }
        return instance;
    }
    
  
    @Override
    public List<Estructura> contarVotos(String id) {
        List<Estructura> lista = new ArrayList<>();
        System.out.println("No Se pueden contar Votos mientra la votacion se encuentra Abierta:");
        return lista;
    }
    @Override
    public void recibirVoto(IVoto voto){}
    
    @Override
    public boolean abrirVotaciones(){ // desarrollar lógica
        return true;
    }
    
    @Override
    public boolean cerrarVotaciones(){// desarrollar lógica
        return true;
    }
    
    @Override
    public boolean cargarLista(List<Estructura> lista){
        // lógica
        return true;
    }

    
}