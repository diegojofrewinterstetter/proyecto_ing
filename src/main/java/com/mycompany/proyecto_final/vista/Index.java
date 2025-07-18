package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.modelo.VotacionContext;
import javax.swing.JFrame;


public class Index extends javax.swing.JFrame {

    public VotacionContext votacion;
    
    public Index(VotacionContext votacion) {
        this.votacion = votacion;
        initComponents();
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFdni = new javax.swing.JTextField();
        TFtoken = new javax.swing.JTextField();
        Ltoken = new javax.swing.JLabel();
        Ldni = new javax.swing.JLabel();
        TBvotar = new javax.swing.JToggleButton();
        TBlogin = new javax.swing.JToggleButton();
        Pbarra = new javax.swing.JPanel();
        Lpresentacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdniActionPerformed(evt);
            }
        });

        TFtoken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtokenActionPerformed(evt);
            }
        });

        Ltoken.setText("Ingrese el Token");

        Ldni.setText("Ingrese su DNI");

        TBvotar.setText("Votar");
        TBvotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBvotarActionPerformed(evt);
            }
        });

        TBlogin.setText("Ir a Administración");
        TBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBloginActionPerformed(evt);
            }
        });

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PbarraLayout = new javax.swing.GroupLayout(Pbarra);
        Pbarra.setLayout(PbarraLayout);
        PbarraLayout.setHorizontalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        PbarraLayout.setVerticalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        Lpresentacion.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Lpresentacion.setText("Votaciones Centro de Estudiantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TBlogin)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Lpresentacion)
                        .addGap(170, 170, 170))))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Ldni)
                        .addComponent(TFdni)
                        .addComponent(Ltoken)
                        .addComponent(TFtoken, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(TBvotar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Lpresentacion)
                .addGap(45, 45, 45)
                .addComponent(Ldni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Ltoken)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFtoken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(TBvotar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(TBlogin)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
       
    }//GEN-LAST:event_TFdniActionPerformed

    private void TFtokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtokenActionPerformed
        
    }//GEN-LAST:event_TFtokenActionPerformed

    private void TBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBloginActionPerformed
        Login login = new Login ();
        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_TBloginActionPerformed

    private void TBvotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBvotarActionPerformed
        /*Votaciones2 votaciones = new Votaciones2();
        votaciones.setVisible(true);
            
        this.dispose();*/
    }//GEN-LAST:event_TBvotarActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ldni;
    private javax.swing.JLabel Lpresentacion;
    private javax.swing.JLabel Ltoken;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JToggleButton TBlogin;
    private javax.swing.JToggleButton TBvotar;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFtoken;
    // End of variables declaration//GEN-END:variables
}
