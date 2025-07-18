package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.controladores.Sistema;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import java.util.List;

public class Login extends javax.swing.JFrame {

    private Sistema sistema = new Sistema();
    public Login() {
        initComponents();
        
        setLocationRelativeTo(null); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbarra = new javax.swing.JPanel();
        TFdni = new javax.swing.JTextField();
        TFpassword = new javax.swing.JTextField();
        Lpassword = new javax.swing.JLabel();
        Ldni = new javax.swing.JLabel();
        TBingresar = new javax.swing.JToggleButton();
        Lpresentacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PbarraLayout = new javax.swing.GroupLayout(Pbarra);
        Pbarra.setLayout(PbarraLayout);
        PbarraLayout.setHorizontalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        PbarraLayout.setVerticalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(Lpresentacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(253, 253, 253)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ldni)
                            .addComponent(TFdni)
                            .addComponent(Lpassword)
                            .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(TBingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(242, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(Lpresentacion)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(181, 181, 181)
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

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdniActionPerformed

    private void TFpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpasswordActionPerformed

    private void TBingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBingresarActionPerformed
        String dni = TFdni.getText();
        String pass = TFpassword.getText();
        
        
        
        if (sistema.login(dni, pass)) {
            List<VotacionContext> elecciones = sistema.listarElecciones();
            elecciones.forEach(e -> System.out.println(e.getId() + " - " + e.getTipo()));
            this.dispose(); 
            Administracion adminView = new Administracion(elecciones);
            adminView.setVisible(true);
            adminView.setLocationRelativeTo(null); 
            
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

    }//GEN-LAST:event_TBingresarActionPerformed

    public static void main(String args[]) {
       
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
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFpassword;
    // End of variables declaration//GEN-END:variables
}
