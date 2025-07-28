package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.modelo.*;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

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
    private Token tokenObjeto;
    private JButton btnVotar;

    public Votaciones2(VotacionContext votacion, String tribuVotante, String dnistr, String tokenstr, String eleccionIdstr) {
        this.votacion = votacion;
        this.listas = votacion.getListasValidas();
        this.tribuVotante = tribuVotante;
        this.token = tokenstr;
        this.dni = dnistr;
        this.eleccionId = eleccionIdstr;
        this.tokenObjeto = new Token(tokenstr, votacion.getId(), dnistr);
        this.cargos = new ArrayList<>();

        if (listas == null || listas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay listas disponibles para votar.", "Sin listas", JOptionPane.WARNING_MESSAGE);
            dispose();
            return;
        }

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
                if (tribu instanceof Tribu && tribu.getNombre().equals(tribuVotante)) {
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
                    if (tribu instanceof Tribu && tribu.getNombre().equals(tribuVotante)) {
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
                    if (column > 0) {
                        String nombreColumna = listas.get(column - 1).getNombre();
                        if (seleccionada != null && seleccionada.getNombre().equals(nombreColumna)) {
                            c.setBackground(new Color(135, 206, 250));
                            c.setFont(c.getFont().deriveFont(Font.BOLD));
                        } else {
                            c.setBackground(Color.WHITE);
                            c.setFont(c.getFont().deriveFont(Font.PLAIN));
                        }
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

        btnVotar = new JButton("VOTAR");
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
        btnVotar.setEnabled(false);

        if (votacion.getVotaron().contains(dni)) {
            JOptionPane.showMessageDialog(this, "Este usuario ya votó.");
            return;
        }

        if (votos == null || votos.isEmpty()) {
            String mensaje = votacion.procesarVoto(null, dni, tokenObjeto);
            JOptionPane.showMessageDialog(this, mensaje);
            votacion.getVotaron().add(dni);
            dispose();
            return;
        }

        // Tomar cualquier valor del mapa (todas las elecciones son de la misma lista)
        Estructura listaSeleccionada = votos.values().iterator().next();
        Estructura listaReducida = construirEstructuraReducida(listaSeleccionada);

        String mensaje = votacion.procesarVoto(listaReducida, dni, tokenObjeto);
        JOptionPane.showMessageDialog(this, mensaje);
        votacion.getVotaron().add(dni);

        Index index = new Index(votacion);
        index.setVisible(true);
        dispose();
    }

    private Estructura construirEstructuraReducida(Estructura listaOriginal) {
        if (!(listaOriginal instanceof Lista original)) return listaOriginal;

        Lista nuevaLista = new Lista(original.getId(), original.getNombre());

        for (Estructura t : original.obtenerHijos()) {
            if (t instanceof Tribu tribu && tribu.getNombre().equals(tribuVotante)) {
                Tribu nuevaTribu = new Tribu(tribu.getId(), tribu.getNombre());
                for (Estructura d : tribu.obtenerHijos()) {
                    if (d instanceof Delegacion delegacion) {
                        nuevaTribu.agregar(delegacion);
                    }
                }
                nuevaLista.agregar(nuevaTribu);
                break;
            }
        }

        return nuevaLista;
    }
}
