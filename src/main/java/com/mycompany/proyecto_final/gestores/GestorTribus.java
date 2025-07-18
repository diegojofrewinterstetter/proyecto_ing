package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.Estudiante;
import com.mycompany.proyecto_final.modelo.Tribu;
import com.mycompany.proyecto_final.modelo.Delegacion;
import com.mycompany.proyecto_final.modelo.Estructura;

import java.util.*;

public class GestorTribus {

    private static GestorTribus instancia;

    private Map<String, Tribu> tribusPorId = new HashMap<>();
    private int indexBalanceo = 0;

    private GestorTribus() {}

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


    public boolean agregarEstudianteBalanceado(Estudiante estudiante) {
        List<Tribu> tribus = listarTribus();
        if (tribus.isEmpty()) {
            System.out.println("No hay tribus registradas.");
            return false;
        }

        Tribu tribuSeleccionada = tribus.get(indexBalanceo % tribus.size());
        indexBalanceo++;

        tribuSeleccionada.agregar(estudiante);  // agregamos con tu método
        System.out.println("Estudiante agregado a la tribu: " + tribuSeleccionada.getNombre());
        return true;
    }


    private boolean tribuTieneEstudiante(Tribu tribu, Estudiante estudiante) {
        for (Estructura e : tribu.obtenerHijos()) {
            if (e instanceof Estudiante est) {
                if (est.getId().equals(estudiante.getId())) {
                    return true;
                }
            } else if (e instanceof Delegacion delegacion) {
                for (Estudiante est : delegacion.obtenerHijos().stream().map(h -> (Estudiante) h).toList()) {
                    if (est.getId().equals(estudiante.getId())) {
                        return true;
                    }
                }
            } else if (e instanceof Tribu subTribu) {
                if (tribuTieneEstudiante(subTribu, estudiante)) {
                    return true;
                }
            }
        }
        return false;
    }

   
    public boolean agregarDelegacion(String idTribu, Delegacion delegacion) {
        Tribu tribu = obtenerTribu(idTribu);
        if (tribu == null) {
            System.out.println("Tribu no encontrada.");
            return false;
        }

        Estudiante candidato = null;

        for (Estructura e : delegacion.obtenerHijos()) {
            if (e instanceof Estudiante est) {
                candidato = est;
                break;
            }
        }

        if (candidato == null) {
            System.out.println("No se encontró candidato en la delegación.");
            return false;
        }

        if (!tribuTieneEstudiante(tribu, candidato)) {
            System.out.println("El candidato no pertenece a la tribu " + tribu.getNombre());
            return false;
        }

        tribu.agregar(delegacion); 
        System.out.println("Delegación agregada a la tribu " + tribu.getNombre());
        return true;
    }
}
