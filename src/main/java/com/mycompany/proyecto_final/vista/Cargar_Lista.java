
package com.mycompany.proyecto_final.vista;


public class Cargar_Lista extends javax.swing.JFrame {

    public Cargar_Lista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbarra = new javax.swing.JPanel();
        TBsalir = new javax.swing.JToggleButton();
        Pcargarestudiante = new javax.swing.JPanel();
        Ldni4 = new javax.swing.JLabel();
        Pestudiantes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bcargar = new javax.swing.JButton();
        Pcargarestudiante1 = new javax.swing.JPanel();
        Ldni5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        TBsalir.setText("Volver");
        TBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PbarraLayout = new javax.swing.GroupLayout(Pbarra);
        Pbarra.setLayout(PbarraLayout);
        PbarraLayout.setHorizontalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbarraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        PbarraLayout.setVerticalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbarraLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(TBsalir)
                .addContainerGap())
        );

        Pcargarestudiante.setBackground(new java.awt.Color(204, 204, 204));

        Ldni4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ldni4.setText("Estudiantes");

        javax.swing.GroupLayout PcargarestudianteLayout = new javax.swing.GroupLayout(Pcargarestudiante);
        Pcargarestudiante.setLayout(PcargarestudianteLayout);
        PcargarestudianteLayout.setHorizontalGroup(
            PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcargarestudianteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Ldni4)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        PcargarestudianteLayout.setVerticalGroup(
            PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcargarestudianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ldni4)
                .addGap(304, 304, 304))
        );

        Pestudiantes.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        Bcargar.setText("Cargar listas");
        Bcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PestudiantesLayout = new javax.swing.GroupLayout(Pestudiantes);
        Pestudiantes.setLayout(PestudiantesLayout);
        PestudiantesLayout.setHorizontalGroup(
            PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(Bcargar)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        PestudiantesLayout.setVerticalGroup(
            PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bcargar)
                .addContainerGap())
        );

        Pcargarestudiante1.setBackground(new java.awt.Color(204, 204, 204));

        Ldni5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ldni5.setText("Listas");

        javax.swing.GroupLayout Pcargarestudiante1Layout = new javax.swing.GroupLayout(Pcargarestudiante1);
        Pcargarestudiante1.setLayout(Pcargarestudiante1Layout);
        Pcargarestudiante1Layout.setHorizontalGroup(
            Pcargarestudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pcargarestudiante1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Ldni5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pcargarestudiante1Layout.setVerticalGroup(
            Pcargarestudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pcargarestudiante1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ldni5)
                .addGap(304, 304, 304))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pcargarestudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pcargarestudiante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pestudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pcargarestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pcargarestudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsalirActionPerformed
        Index index = new Index();
        index.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_TBsalirActionPerformed

    private void BcargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cargar_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargar_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargar_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargar_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargar_Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcargar;
    private javax.swing.JLabel Ldni4;
    private javax.swing.JLabel Ldni5;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JPanel Pcargarestudiante;
    private javax.swing.JPanel Pcargarestudiante1;
    private javax.swing.JPanel Pestudiantes;
    private javax.swing.JToggleButton TBsalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
