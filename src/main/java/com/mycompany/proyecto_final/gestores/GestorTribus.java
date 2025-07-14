package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.Tribu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorTribus {

    private static GestorTribus instancia; // 

    private Map<String, Tribu> tribusPorId = new HashMap<>();

    private GestorTribus() {
        
    }

    public static GestorTribus getInstancia() {
        if (instancia == null) {
            instancia = new GestorTribus();
        }
        return instancia;
    }

    public boolean agregarTribu(Tribu tribu) {
        if (tribusPorId.containsKey(tribu.getId())) {
            System.out.println("La tribu con ID " + tribu.getId() + " ya existe.");
            return false;
        }
        tribusPorId.put(tribu.getId(), tribu);
        System.out.println("Tribu agregada: " + tribu.getNombre());
        return true;
    }

    public Tribu obtenerTribu(String id) {
        return tribusPorId.get(id);
    }

    public boolean eliminarTribu(String id) {
        if (tribusPorId.remove(id) != null) {
            System.out.println("Tribu eliminada: " + id);
            return true;
        }
        System.out.println("No se encontró la tribu: " + id);
        return false;
    }

    public List<Tribu> listarTribus() {
        return new ArrayList<>(tribusPorId.values());
    }
}
