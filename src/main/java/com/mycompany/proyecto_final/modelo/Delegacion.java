package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.modelo.Estructura;
import java.util.ArrayList;
import java.util.List;

public class Delegacion implements Estructura{
    
    private List<Estructura> estructura = new ArrayList<>();
    
    @Override
    public Estructura mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
