package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.modelo.VotacionContext;
import com.mycompany.proyecto_final.modelo.EstadoVotaciones;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Administracion extends javax.swing.JFrame {
    
    public List<VotacionContext> elecciones;
   
    public Administracion(List<VotacionContext> elecciones) {
        initComponents();
        setLocationRelativeTo(null); 
        this.elecciones = elecciones;

        // Fondo general y del votacionBox
        getContentPane().setBackground(new Color(240, 240, 255));
        votacionBox.setBackground(new Color(250, 250, 250));

        // Flow layout horizontal
        votacionBox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 20));

        for (VotacionContext votacion : elecciones) {
            JPanel tarjeta = new JPanel();
            tarjeta.setBorder(BorderFactory.createTitledBorder(votacion.getTipo()));
            tarjeta.setPreferredSize(new java.awt.Dimension(220, 140));
            tarjeta.setLayout(new BorderLayout());
            tarjeta.setBackground(new Color(250, 250, 250));

            // Info de la votación
            JLabel fechaLabel = new JLabel("Inicia: " + votacion.getFechaInicio().toString());
            fechaLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            JLabel estadoLabel = new JLabel("Estado: " + votacion.getEstado().getNombreVisible());
            estadoLabel.setFont(new Font("Arial", Font.BOLD, 12));

            JPanel info = new JPanel(new java.awt.GridLayout(2, 1));
            info.setOpaque(false);
            info.add(fechaLabel);
            info.add(estadoLabel);

            // Botón de gestionar
            JButton gestionarBtn = new JButton("Gestionar");
            gestionarBtn.addActionListener(e -> {
                Gestionar_Votacion v = new Gestionar_Votacion(votacion);
                v.setVisible(true);
                this.dispose();
            });

            // Panel inferior con el botón
            JPanel pie = new JPanel();
            pie.setOpaque(false);
            pie.add(gestionarBtn);

            tarjeta.add(info, BorderLayout.CENTER);
            tarjeta.add(pie, BorderLayout.SOUTH);

            votacionBox.add(tarjeta);
        }

        // Scroll horizontal
        JScrollPane scrollPane = new JScrollPane(votacionBox,
            JScrollPane.VERTICAL_SCROLLBAR_NEVER,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(new Color(250, 250, 250));

        // Reemplazar layout
        getContentPane().removeAll();
        setLayout(new BorderLayout());
        add(Pbarra, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        revalidate();
        repaint();
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbarra = new javax.swing.JPanel();
        TBsalir = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        votacionBox = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        TBsalir.setText("Salir");
        TBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBsalirActionPerformed(evt);
            }
        });

        jButton1.setText("Nueva Elección");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PbarraLayout = new javax.swing.GroupLayout(Pbarra);
        Pbarra.setLayout(PbarraLayout);
        PbarraLayout.setHorizontalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbarraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                .addComponent(TBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        PbarraLayout.setVerticalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbarraLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBsalir)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout votacionBoxLayout = new javax.swing.GroupLayout(votacionBox);
        votacionBox.setLayout(votacionBoxLayout);
        votacionBoxLayout.setHorizontalGroup(
            votacionBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        votacionBoxLayout.setVerticalGroup(
            votacionBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(votacionBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(votacionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsalirActionPerformed
        /*Index index = new Index();
        index.setVisible(true);*/

        this.dispose();
    }//GEN-LAST:event_TBsalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Cargar_Eleccion cargar = new Cargar_Eleccion();
        cargar.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pbarra;
    private javax.swing.JToggleButton TBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel votacionBox;
    // End of variables declaration//GEN-END:variables
}
