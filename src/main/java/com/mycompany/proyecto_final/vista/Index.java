package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.modelo.Estudiante;
import com.mycompany.proyecto_final.modelo.Token;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


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

        Ltoken = new javax.swing.JLabel();
        Ldni = new javax.swing.JLabel();
        TBvotar = new javax.swing.JToggleButton();
        Pbarra = new javax.swing.JPanel();
        Lpresentacion = new javax.swing.JLabel();
        dniFt = new javax.swing.JFormattedTextField();
        tokenFt = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ltoken.setText("Ingrese el Token");

        Ldni.setText("Ingrese su DNI");

        TBvotar.setText("Votar");
        TBvotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBvotarActionPerformed(evt);
            }
        });

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PbarraLayout = new javax.swing.GroupLayout(Pbarra);
        Pbarra.setLayout(PbarraLayout);
        PbarraLayout.setHorizontalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        PbarraLayout.setVerticalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        Lpresentacion.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Lpresentacion.setText("Votaciones Centro de Estudiantes");

        tokenFt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tokenFtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lpresentacion)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(TBvotar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniFt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Ltoken)
                                    .addGap(69, 69, 69))
                                .addComponent(tokenFt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(Ldni))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Lpresentacion)
                .addGap(39, 39, 39)
                .addComponent(Ldni)
                .addGap(18, 18, 18)
                .addComponent(dniFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Ltoken)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tokenFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(TBvotar)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBvotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBvotarActionPerformed
        String dni = dniFt.getText().trim();
        String tokenStr = tokenFt.getText().trim();

        // Validación básica de campos vacíos
        if (dni.isEmpty() || tokenStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar tanto el DNI como el Token.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear el token y validarlo
        Token token = new Token(tokenStr, votacion.getId(), dni);
        boolean resultado = votacion.validarToken(token);

        if (resultado) {
            // Si es válido, abrir pantalla de votación
            Estudiante e = votacion.buscarEstudiante(dni);
            Votaciones2 votaciones = new Votaciones2(votacion, e.getTribu() ,token.getDni(), token.getToken(), token.getEleccionId());
            votaciones.setVisible(true);
            this.dispose(); // Cierra la ventana actual
        } else {
            // Token inválido
            JOptionPane.showMessageDialog(this, "El token ingresado no es válido.", "Token inválido", JOptionPane.ERROR_MESSAGE);
        }
         //VotacionContext votacion, String tribuVotante, String token, String dni, String eleccionId
    }//GEN-LAST:event_TBvotarActionPerformed

    private void tokenFtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tokenFtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tokenFtActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ldni;
    private javax.swing.JLabel Lpresentacion;
    private javax.swing.JLabel Ltoken;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JToggleButton TBvotar;
    private javax.swing.JFormattedTextField dniFt;
    private javax.swing.JFormattedTextField tokenFt;
    // End of variables declaration//GEN-END:variables
}
