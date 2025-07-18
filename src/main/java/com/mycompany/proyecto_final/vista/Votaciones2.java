package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.modelo.Delegacion;
import com.mycompany.proyecto_final.modelo.Estructura;
import com.mycompany.proyecto_final.modelo.Estudiante;
import com.mycompany.proyecto_final.modelo.Lista;
import com.mycompany.proyecto_final.modelo.Tribu;
import com.mycompany.proyecto_final.modelo.VotacionContext;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.util.UUID;

public class Votaciones2 extends JFrame {

    private JTable tabla;
    private Map<String, Estructura> votos = new HashMap<>();
    private List<Estructura> listas;
    private String tribuVotante;
    private List<String> cargos;
    private VotacionContext votacion;
    private String eleccionId;
    private String token;
    private String dni;

    public Votaciones2(List<Estructura> listas, String tribuVotante/*, VotacionContext votacion, String eleccionId, String token, String dni*/) {
        this.listas = listas;
        this.tribuVotante = tribuVotante;
        this.cargos = new ArrayList<>();
        /*this.votacion = votacion;
        this.eleccionId = eleccionId;
        this.token = token;
        this.dni = dni;*/

        setTitle("Sistema de Votación para la tribu: " + tribuVotante);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("Cargo");
        for (Estructura lista : listas) {
            modelo.addColumn("Lista " + lista.getNombre());
        }

        Object[] filaCompleta = new Object[1 + listas.size()];
        filaCompleta[0] = "Votar lista completa";
        modelo.addRow(filaCompleta);

        Set<String> cargosUnicos = new LinkedHashSet<>();
        for (Estructura lista : listas) {
            for (Estructura tribu : lista.obtenerHijos()) {
                if (tribu instanceof Delegacion && tribu.getNombre().equals(tribuVotante)) {
                    for (Estructura deleg : tribu.obtenerHijos()) {
                        cargosUnicos.add(deleg.getNombre());
                    }
                }
            }
        }
        cargos.addAll(cargosUnicos);

        for (String cargo : cargos) {
            Object[] fila = new Object[1 + listas.size()];
            fila[0] = cargo;
            for (int i = 0; i < listas.size(); i++) {
                StringBuilder candidatos = new StringBuilder();
                for (Estructura tribu : listas.get(i).obtenerHijos()) {
                    if (tribu instanceof Delegacion && tribu.getNombre().equals(tribuVotante)) {
                        for (Estructura deleg : tribu.obtenerHijos()) {
                            if (deleg.getNombre().equals(cargo)) {
                                for (Estructura est : deleg.obtenerHijos()) {
                                    candidatos.append(est.getNombre()).append(", ");
                                }
                            }
                        }
                    }
                }
                if (candidatos.length() > 2)
                    candidatos.setLength(candidatos.length() - 2);
                fila[i + 1] = candidatos.toString();
            }
            modelo.addRow(fila);
        }

        tabla = new JTable(modelo);
        tabla.setRowHeight(30);

        tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus,
                                                           int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (row == 0) {
                    c.setBackground(new Color(255, 250, 205));
                    c.setFont(c.getFont().deriveFont(Font.BOLD));
                } else {
                    String cargo = (String) table.getValueAt(row, 0);
                    Estructura seleccionada = votos.get(cargo);
                    String nombreColumna = table.getColumnName(column).replace("Lista ", "");
                    if (column > 0 && seleccionada != null && seleccionada.getNombre().equals(nombreColumna)) {
                        c.setBackground(new Color(135, 206, 250));
                        c.setFont(c.getFont().deriveFont(Font.BOLD));
                    } else {
                        c.setBackground(Color.WHITE);
                        c.setFont(c.getFont().deriveFont(Font.PLAIN));
                    }
                }
                return c;
            }
        });

        JScrollPane scrollTabla = new JScrollPane(tabla);

        tabla.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = tabla.getSelectedRow();
                int columna = tabla.getSelectedColumn();

                if (columna > 0 && fila >= 0) {
                    Estructura listaSeleccionada = listas.get(columna - 1);
                    if (fila == 0) {
                        for (String cargo : cargos) {
                            votos.put(cargo, listaSeleccionada);
                        }
                        tabla.repaint();
                        JOptionPane.showMessageDialog(null, "Elegiste toda la lista " + listaSeleccionada.getNombre());
                    } else {
                        String cargo = (String) tabla.getValueAt(fila, 0);
                        votos.put(cargo, listaSeleccionada);
                        tabla.repaint();
                        JOptionPane.showMessageDialog(null, "Elegiste a " + cargo + " de la lista " + listaSeleccionada.getNombre());
                    }
                }
            }
        });

        JButton btnVotar = new JButton("VOTAR");
        btnVotar.setBackground(new Color(34, 139, 34));
        btnVotar.setForeground(Color.WHITE);
        btnVotar.setFont(new Font("Arial", Font.BOLD, 14));
        btnVotar.addActionListener(e -> realizarVotacion());

        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.add(btnVotar);

        setLayout(new BorderLayout());
        add(scrollTabla, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        setSize(800, (cargos.size() + 2) * 35 + 100);
        setLocationRelativeTo(null);
    }

    private void realizarVotacion() {
        Lista votoFinal = new Lista("VotoUsuario", "Resumen");
        for (String cargo : cargos) {
            Estructura listaElegida = votos.get(cargo);
            if (listaElegida != null) {
                Delegacion votoDelegacion = new Delegacion(UUID.randomUUID().toString(), cargo);
                votoDelegacion.agregar(new Estudiante(listaElegida.getNombre(), "")); // Acá podés cambiar si querés algo más preciso
                votoFinal.agregar(votoDelegacion);
            }
        }

        // Procesar el voto con tu lógica
        String resultado = votacion.procesarVoto(votoFinal, dni, new com.mycompany.proyecto_final.modelo.Token(token, dni, eleccionId));

        if (resultado.startsWith("Voto Realizado")) {
            JOptionPane.showMessageDialog(this, "¡Voto registrado con éxito!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar el voto: " + resultado, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
         List<Estructura> listas = new ArrayList<>();

        // Lista 1
        Lista lista1 = new Lista("L1", "Azul");

        // Tribu Huarpe en lista1
        Tribu tribuHuarpe1 = new Tribu("001", "Huarpe");

        // Delegación Cacique con un único estudiante
        Delegacion caciqueHuarpe1 = new Delegacion("003", "Cacique");
        caciqueHuarpe1.agregar(new Estudiante("111", "Juan"));

        // Delegación Hechicero con un único estudiante
        Delegacion hechiceroHuarpe1 = new Delegacion("004", "Hechicero");
        hechiceroHuarpe1.agregar(new Estudiante("112", "Ana"));

        // Agregamos delegaciones a la tribu
        tribuHuarpe1.agregar(caciqueHuarpe1);
        tribuHuarpe1.agregar(hechiceroHuarpe1);

        // Agregamos tribu a la lista
        lista1.agregar(tribuHuarpe1);

        // Lista 2
        Lista lista2 = new Lista("L2", "Roja");

        // Tribu Huarpe en lista2
        Tribu tribuHuarpe2 = new Tribu("002", "Huarpe");

        // Delegación Cacique con un único estudiante
        Delegacion caciqueHuarpe2 = new Delegacion("005", "Cacique");
        caciqueHuarpe2.agregar(new Estudiante("113", "Luis"));

        // Delegación Hechicero con un único estudiante
        Delegacion hechiceroHuarpe2 = new Delegacion("006", "Hechicero");
        hechiceroHuarpe2.agregar(new Estudiante("114", "Sofía"));

        // Agregamos delegaciones a la tribu
        tribuHuarpe2.agregar(caciqueHuarpe2);
        tribuHuarpe2.agregar(hechiceroHuarpe2);

        // Agregamos tribu a la lista
        lista2.agregar(tribuHuarpe2);

        // Finalmente, agregamos las listas al contenedor
        listas.add(lista1);
        listas.add(lista2);

        String tribuDelVotante = "Huarpe";
        SwingUtilities.invokeLater(() -> new Votaciones2(listas, tribuDelVotante).setVisible(true));
    }
}

    

