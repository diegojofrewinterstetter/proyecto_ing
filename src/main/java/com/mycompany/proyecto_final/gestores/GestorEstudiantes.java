package com.mycompany.proyecto_final.gestores;

import com.mycompany.proyecto_final.modelo.Estudiante;
import java.util.*;

public class GestorEstudiantes {

    private static GestorEstudiantes instance;
    private Map<String, Estudiante> estudiantesPorDni = new HashMap<>();

    // Constructor privado
    private GestorEstudiantes() {}

    // Método público de acceso (Singleton)
    public static GestorEstudiantes getInstance() {
        if (instance == null) {
            instance = new GestorEstudiantes();
        }
        return instance;
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        String dni = estudiante.getDni();
        if (estudiantesPorDni.containsKey(dni)) {
            System.out.println("El estudiante con DNI " + dni + " ya existe.");
            return false;
        }
        estudiantesPorDni.put(dni, estudiante);
        System.out.println("Estudiante agregado: " + estudiante.getNombre());
        return true;
    }

    public Estudiante obtenerPorDni(String dni) {
        return estudiantesPorDni.get(dni);
    }

    public boolean existe(String dni) {
        return estudiantesPorDni.containsKey(dni);
    }

    public boolean eliminarEstudiante(String dni) {
        if (estudiantesPorDni.remove(dni) != null) {
            System.out.println("Estudiante eliminado: " + dni);
            return true;
        }
        System.out.println("No se encontró el estudiante: " + dni);
        return false;
    }

    public List<Estudiante> listarEstudiantes() {
        return new ArrayList<>(estudiantesPorDni.values());
    }
}
