package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.modelo.Estudiante;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import com.mycompany.proyecto_final.modelo.VotacionesCerradas;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Resultados extends JFrame {

    private final VotacionContext votacion;

    public Resultados(VotacionContext votacion) {
        this.votacion = votacion;
        setTitle("Resultados de la Votación");
        setSize(550, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        setVisible(true);
    }

    private void initUI() {
        JPanel panel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setEditable(false);

        StringBuilder sb = new StringBuilder();
        sb.append("Conteo detallado de votos por postulante:\n\n");

        Map<String, Integer> conteoVotos = votacion.contarVotos();

        if (conteoVotos == null || conteoVotos.isEmpty()) {
            sb.append("No hay votos para mostrar.");
        } else {
            for (Map.Entry<String, Integer> entry : conteoVotos.entrySet()) {
                String dni = entry.getKey();
                int votos = entry.getValue();

                Estudiante estudiante = votacion.buscarEstudiante(dni);
                String nombre = (estudiante != null) ? estudiante.getNombre() : "Desconocido";

                // Formateamos para que quede alineado
                sb.append(String.format("%-25s (DNI: %-10s) - Votos: %d%n", nombre, dni, votos));
            }
        }

        textArea.setText(sb.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panel);
    }
}
