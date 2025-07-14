package com.mycompany.proyecto_final.modelo;

import com.mycompany.proyecto_final.gestores.GestorLista;
import com.mycompany.proyecto_final.gestores.GestorVoto;
import java.util.Date;
import java.util.List;
import java.util.Map;

interface EstadoVotaciones {
    void recibirVoto(IVoto voto);
    List<Estructura> contarVotos(String id);
    boolean cargarLista(List<Estructura> lista);
    boolean abrirVotaciones();
    boolean cerrarVotaciones();
}
