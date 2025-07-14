package com.mycompany.proyecto_final.vista;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbarra = new javax.swing.JPanel();
        TBsalir = new javax.swing.JToggleButton();
        TFdni = new javax.swing.JTextField();
        TFpassword = new javax.swing.JTextField();
        Lpassword = new javax.swing.JLabel();
        Ldni = new javax.swing.JLabel();
        TBingresar = new javax.swing.JToggleButton();
        Lpresentacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        TBsalir.setText("Salir");
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
                .addContainerGap(599, Short.MAX_VALUE)
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

        TFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdniActionPerformed(evt);
            }
        });

        TFpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpasswordActionPerformed(evt);
            }
        });

        Lpassword.setText("Ingrese la contraseña");

        Ldni.setText("Ingrese el DNI");

        TBingresar.setText("Ingresar");
        TBingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBingresarActionPerformed(evt);
            }
        });

        Lpresentacion.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Lpresentacion.setText("Votaciones Centro de Estudiantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lpresentacion, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Ldni)
                                    .addComponent(TFdni)
                                    .addComponent(Lpassword)
                                    .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(TBingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(162, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(Lpresentacion)
                    .addGap(45, 45, 45)
                    .addComponent(Ldni)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(Lpassword)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(TBingresar)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsalirActionPerformed
        Index index = new Index();
        index.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_TBsalirActionPerformed

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdniActionPerformed

    private void TFpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpasswordActionPerformed

    private void TBingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBingresarActionPerformed
        int rol;
        if(rol == 1){
            Administracion administracion = new Administracion();
            administracion.setVisible(true);

            this.dispose();
        }
        else{
            Generar_Token generar_token = new Generar_Token();
            generar_token.setVisible(true);
            
            this.dispose();
        }
    }//GEN-LAST:event_TBingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ldni;
    private javax.swing.JLabel Lpassword;
    private javax.swing.JLabel Lpresentacion;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JToggleButton TBingresar;
    private javax.swing.JToggleButton TBsalir;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFpassword;
    // End of variables declaration//GEN-END:variables
}
