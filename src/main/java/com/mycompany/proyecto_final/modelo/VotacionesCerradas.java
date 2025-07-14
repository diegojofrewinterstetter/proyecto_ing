package com.mycompany.proyecto_final.modelo;
import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import com.mycompany.proyecto_final.modelo.Estructura;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class VotacionesCerradas implements EstadoVotaciones{

    public VotacionesCerradas instance;
    private GestorLista gestor;
    
    
    private VotacionesCerradas(){
    }
    
    private VotacionesCerradas getInstance(){
        if(instance == null){
            instance = new VotacionesCerradas();
        }
        return instance;
    }
    
    @Override
    public List<Estructura> contarVotos(String eleccionId) {
        List<Estructura> resultados = new ArrayList<>();

        
        List<ResultadoVoto> votos = GestorVoto.getInstance().obtenerVotosPorEleccion(eleccionId);// obtenemos los votos del gestor


        Map<Estructura, Integer> conteo = new HashMap<>();//agrupar los votos por candidato/lista

        for (ResultadoVoto rv : votos) {
            Estructura candidato = rv.getCandidato(); // o getLista 
            int cantidad = rv.getVotos();
            conteo.put(candidato, conteo.getOrDefault(candidato, 0) + cantidad);// sumamos los votos en el mapa
        }

        
        System.out.println("Conteo de votos para elección " + eleccionId + ":"); // mostrar resultados y crear la lista de ResultadoVoto
        for (Map.Entry<Estructura, Integer> entry : conteo.entrySet()) {
            Estructura candidato = entry.getKey();
            int cantidad = entry.getValue();

            candidato.mostrar();
            System.out.println(" - Votos: " + cantidad);

            ResultadoVoto resultado = new ResultadoVoto(eleccionId,candidato, cantidad);
            resultados.add(resultado);
        }

        return resultados;
    }
    @Override
    public void recibirVoto(IVoto voto){
    
    }
    
    @Override
    public boolean cargarLista(List<Estructura> lista){
        return false;
    }
    @Override
    public boolean abrirVotaciones(){ // desarrollar lógica
        return true;
    }
    
    @Override
    public boolean cerrarVotaciones(){// desarrollar lógica
        return true;
    }
    
    
    
    // CheckearPorListaCompleta();
    // AnunciarGanadores();
}

