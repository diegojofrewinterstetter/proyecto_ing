package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.Estructura;
import com.mycompany.proyecto_final.modelo.Lista;

import java.util.List;

public class GestorLista {

    public static boolean agregarLista(Lista lista, List<Estructura> listas) {
        for (Estructura e : listas) {
            if (e instanceof Lista && e.getId().equals(lista.getId())) {
                System.out.println("La lista ya existe: " + lista.getId());
                return false;
            }
        }
        listas.add(lista);
        System.out.println("Lista agregada: " + lista.getNombre());
        return true;
    }

    public static boolean guardarListas(List<Estructura> nuevas, List<Estructura> listas) {
        try {
            for (Estructura e : nuevas) {
                if (e instanceof Lista && !existeLista(e.getId(), listas)) {
                    listas.add(e);
                }
            }
            System.out.println("Listas guardadas correctamente.");
            return true;
        } catch (Exception ex) {
            System.out.println("Error al guardar listas: " + ex.getMessage());
            return false;
        }
    }

    public static Lista obtenerLista(String id, List<Estructura> listas) {
        for (Estructura e : listas) {
            if (e instanceof Lista && e.getId().equals(id)) {
                return (Lista) e;
            }
        }
        return null;
    }

    public static boolean eliminarLista(String id, List<Estructura> listas) {
        Estructura toRemove = null;
        for (Estructura e : listas) {
            if (e instanceof Lista && e.getId().equals(id)) {
                toRemove = e;
                break;
            }
        }
        if (toRemove != null) {
            listas.remove(toRemove);
            System.out.println("Lista eliminada: " + id);
            return true;
        }
        System.out.println("No se encontró la lista: " + id);
        return false;
    }

    public static boolean existeLista(String id, List<Estructura> listas) {
        for (Estructura e : listas) {
            if (e instanceof Lista && e.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
