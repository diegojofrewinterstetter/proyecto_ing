package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.modelo.ResultadoVoto;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import com.mycompany.proyecto_final.modelo.VotacionesCerradas;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class Resultados extends JFrame {

    private final VotacionContext votacion;

    public Resultados(VotacionContext votacion) {
        this.votacion = votacion;
        setTitle("Resultados de la Votación");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Verificamos el estado
        if (!(votacion.getEstado() instanceof VotacionesCerradas)) {
            JOptionPane.showMessageDialog(
                this,
                "Las votaciones no se encuentran cerradas.",
                "Advertencia",
                JOptionPane.WARNING_MESSAGE
            );
            dispose();
            return;
        }

        initUI();

        // Mostrar la ventana
        setVisible(true);
    }

    private void initUI() {
        // Contamos y agrupamos los votos
        List<ResultadoVoto> votosIndividuales = votacion.contarVotos(votacion.getId())
                .stream()
                .filter(e -> e instanceof ResultadoVoto)
                .map(e -> (ResultadoVoto) e)
                .collect(Collectors.toList());

        List<ResultadoVoto> resultadosAgrupados = votacion.agruparResultados(votosIndividuales);

        // Si no hay resultados, mostramos mensaje y volvemos al menú
        if (resultadosAgrupados.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "No hay votos para mostrar.",
                "Sin resultados",
                JOptionPane.INFORMATION_MESSAGE
            );
            this.dispose();
            Gestionar_Votacion gv = new Gestionar_Votacion(votacion);
            gv.setVisible(true);
            return;
        }

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        for (ResultadoVoto resultado : resultadosAgrupados) {
            String nombre = resultado.getNombre();
            int cantidad = resultado.getVotos();
            JLabel label = new JLabel(nombre + " - Votos: " + cantidad);
            label.setFont(new Font("Arial", Font.PLAIN, 16));
            label.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            panel.add(label);
        }

        JScrollPane scrollPane = new JScrollPane(panel);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}
