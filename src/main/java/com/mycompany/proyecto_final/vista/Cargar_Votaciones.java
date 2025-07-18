
package com.mycompany.proyecto_final.vista;


public class Cargar_Votaciones extends javax.swing.JFrame {

    public Cargar_Votaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbarra = new javax.swing.JPanel();
        TBvolver = new javax.swing.JToggleButton();
        Pestudiantes = new javax.swing.JPanel();
        SPlistas = new javax.swing.JScrollPane();
        Tlistas = new javax.swing.JTable();
        Babrir = new javax.swing.JButton();
        Bcerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        TBvolver.setText("Volver");
        TBvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PbarraLayout = new javax.swing.GroupLayout(Pbarra);
        Pbarra.setLayout(PbarraLayout);
        PbarraLayout.setHorizontalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbarraLayout.createSequentialGroup()
                .addContainerGap(599, Short.MAX_VALUE)
                .addComponent(TBvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        PbarraLayout.setVerticalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbarraLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(TBvolver)
                .addContainerGap())
        );

        Pestudiantes.setBackground(new java.awt.Color(204, 204, 204));

        Tlistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cacique", null, null},
                {"Jefe de Consejo", null, null},
                {"Hechicero", null, null},
                {"Hechicero", null, null},
                {"Jefe de Consejo", null, null},
                {"Jefe de Consejo", null, null},
                {"	Delegado	", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null},
                {"Delegado", null, null},
                {"Consejero", null, null}
            },
            new String [] {
                "Cargos", "Lista 1", "Lista 2"
            }
        ));
        SPlistas.setViewportView(Tlistas);

        Babrir.setText("Abrir votaciones");
        Babrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabrirActionPerformed(evt);
            }
        });

        Bcerrar.setText("Cerrar votaciones");
        Bcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PestudiantesLayout = new javax.swing.GroupLayout(Pestudiantes);
        Pestudiantes.setLayout(PestudiantesLayout);
        PestudiantesLayout.setHorizontalGroup(
            PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPlistas, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Bcerrar)
                    .addComponent(Babrir))
                .addGap(14, 14, 14))
        );
        PestudiantesLayout.setVerticalGroup(
            PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPlistas, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(Babrir)
                .addGap(37, 37, 37)
                .addComponent(Bcerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pestudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pestudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBvolverActionPerformed
        /*Index index = new Index();
        index.setVisible(true);*/

        this.dispose();
    }//GEN-LAST:event_TBvolverActionPerformed

    private void BabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BabrirActionPerformed

    private void BcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargar_Votaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Babrir;
    private javax.swing.JButton Bcerrar;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JPanel Pestudiantes;
    private javax.swing.JScrollPane SPlistas;
    private javax.swing.JToggleButton TBvolver;
    private javax.swing.JTable Tlistas;
    // End of variables declaration//GEN-END:variables
}
