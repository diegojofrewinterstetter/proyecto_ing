
package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.modelo.Estructura;
import java.util.ArrayList;
import java.util.List;

public class Lista implements Estructura{
    
    private String id;
    private String nombre;
    private List<Estructura> estructura = new ArrayList<>();
    
    public Lista(String id, String nombre){
        this.nombre = nombre;
        this.id = id;
    }
    
    @Override
    public Estructura mostrar() {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String getId(){
        return id;
    }
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public void agregar(Estructura e) {
        estructura.add(e);
    }

    @Override
    public void eliminar(Estructura e) {
        estructura.remove(e);
    }
    @Override
    public List<Estructura> obtenerHijos() {
        return estructura;
    }
    
}
