package com.mycompany.proyecto_final.modelo;

import java.util.List;
import java.util.Map;

public interface Estructura {
    Estructura mostrar();
    String getId();
    String getNombre();
    List<Estructura> obtenerHijos();
}
