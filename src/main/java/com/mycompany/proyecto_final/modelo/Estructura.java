package com.mycompany.proyecto_final.modelo;

import java.util.List;
import java.util.Map;

public interface Estructura {
    Estructura mostrar();
    void agregar(Estructura e);
    void eliminar(Estructura e);
    String getId();
    String getNombre();
    List<Estructura> obtenerHijos();
}
