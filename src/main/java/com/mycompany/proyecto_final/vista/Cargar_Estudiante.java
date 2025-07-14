
package com.mycompany.proyecto_final.vista;


public class Cargar_Estudiante extends javax.swing.JFrame {

    public Cargar_Estudiante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbarra = new javax.swing.JPanel();
        TBsalir = new javax.swing.JToggleButton();
        Pcargarestudiante = new javax.swing.JPanel();
        Bcargar = new javax.swing.JButton();
        Ldni = new javax.swing.JLabel();
        TFdni = new javax.swing.JTextField();
        Lnombre = new javax.swing.JLabel();
        TFnombre = new javax.swing.JTextField();
        Lapellido = new javax.swing.JLabel();
        TFapellido = new javax.swing.JTextField();
        Ltribu = new javax.swing.JLabel();
        Ldni4 = new javax.swing.JLabel();
        CBtribu = new javax.swing.JComboBox<>();
        Pestudiantes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ttablaestudiantes = new javax.swing.JTable();

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

        Bcargar.setText("Cargar listas");
        Bcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcargarActionPerformed(evt);
            }
        });

        Ldni.setText("Ingrese el DNI");

        TFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdniActionPerformed(evt);
            }
        });

        Lnombre.setText("Ingrese el nombre");

        TFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreActionPerformed(evt);
            }
        });

        Lapellido.setText("Ingrese el apellido");

        TFapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFapellidoActionPerformed(evt);
            }
        });

        Ltribu.setText("Ingrese la Tribu");

        Ldni4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ldni4.setText("Ingrese un nuevo estudiante");

        CBtribu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Huarpe", "Pehuenche" }));
        CBtribu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBtribuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PcargarestudianteLayout = new javax.swing.GroupLayout(Pcargarestudiante);
        Pcargarestudiante.setLayout(PcargarestudianteLayout);
        PcargarestudianteLayout.setHorizontalGroup(
            PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcargarestudianteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PcargarestudianteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(Bcargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CBtribu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Ldni)
                                .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lnombre)
                                .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lapellido)
                                .addComponent(TFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ltribu))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcargarestudianteLayout.createSequentialGroup()
                                .addComponent(Ldni4)
                                .addGap(21, 21, 21)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PcargarestudianteLayout.setVerticalGroup(
            PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcargarestudianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ldni4)
                .addGap(18, 18, 18)
                .addComponent(Ldni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lapellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ltribu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBtribu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bcargar)
                .addGap(15, 15, 15))
        );

        Pestudiantes.setBackground(new java.awt.Color(204, 204, 204));

        Ttablaestudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Tribu"
            }
        ));
        jScrollPane1.setViewportView(Ttablaestudiantes);

        javax.swing.GroupLayout PestudiantesLayout = new javax.swing.GroupLayout(Pestudiantes);
        Pestudiantes.setLayout(PestudiantesLayout);
        PestudiantesLayout.setHorizontalGroup(
            PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        PestudiantesLayout.setVerticalGroup(
            PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pcargarestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pcargarestudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pestudiantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdniActionPerformed

    private void TFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnombreActionPerformed

    private void TFapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFapellidoActionPerformed

    private void CBtribuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBtribuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBtribuActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargar_Estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcargar;
    private javax.swing.JComboBox<String> CBtribu;
    private javax.swing.JLabel Lapellido;
    private javax.swing.JLabel Ldni;
    private javax.swing.JLabel Ldni4;
    private javax.swing.JLabel Lnombre;
    private javax.swing.JLabel Ltribu;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JPanel Pcargarestudiante;
    private javax.swing.JPanel Pestudiantes;
    private javax.swing.JToggleButton TBsalir;
    private javax.swing.JTextField TFapellido;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JTable Ttablaestudiantes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
