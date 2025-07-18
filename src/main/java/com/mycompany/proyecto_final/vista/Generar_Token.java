
package com.mycompany.proyecto_final.vista;


import com.mycompany.proyecto_final.modelo.Token;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Generar_Token extends javax.swing.JFrame {
    
    private VotacionContext eleccion;
    public Generar_Token(VotacionContext eleccion){
        initComponents();
        this.eleccion = eleccion;
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFdni = new javax.swing.JTextField();
        LIngresarDNI = new javax.swing.JLabel();
        Lgenerartoken = new javax.swing.JLabel();
        TBgenerar = new javax.swing.JToggleButton();
        Lpresentacion = new javax.swing.JLabel();
        Pbarra = new javax.swing.JPanel();
        TBsalir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdniActionPerformed(evt);
            }
        });

        LIngresarDNI.setText("Ingrese DNI");

        Lgenerartoken.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Lgenerartoken.setText("Generar Token");

        TBgenerar.setText("Generar");
        TBgenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBgenerarActionPerformed(evt);
            }
        });

        Lpresentacion.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Lpresentacion.setText("Votaciones Centro de Estudiantes");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LIngresarDNI)
                            .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TBgenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 168, Short.MAX_VALUE)
                .addComponent(Lpresentacion)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(Lgenerartoken)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Lpresentacion)
                .addGap(18, 18, 18)
                .addComponent(Lgenerartoken)
                .addGap(51, 51, 51)
                .addComponent(LIngresarDNI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TBgenerar)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
        
    }//GEN-LAST:event_TFdniActionPerformed

    private void TBgenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBgenerarActionPerformed
        // generar token
        String dni = TFdni.getText();
        
        if(dni != null && !dni.isEmpty()){
            
            String eleccionID = eleccion.getId();
            Token token = eleccion.generarToken(dni);
            
            if(token.getToken() == null){
                JOptionPane.showMessageDialog(
                null,
                "La votacion no está Abierta",  // suponiendo que tiene un método getValor()
                "Token no generado",
                JOptionPane.INFORMATION_MESSAGE
                );
                return;
            }
            JOptionPane.showMessageDialog(
                null,
                "Token generado:\n" + token.getToken(),  // suponiendo que tiene un método getValor()
                "Token",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        JOptionPane.showMessageDialog(
            null,
            "Error: Tiene que ingresar Dni",  // suponiendo que tiene un método getValor()
            "",
            JOptionPane.INFORMATION_MESSAGE
        ); 
       
    }//GEN-LAST:event_TBgenerarActionPerformed

    private void TBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsalirActionPerformed
        /*Index index = new Index();
        index.setVisible(true);*/

        this.dispose();
    }//GEN-LAST:event_TBsalirActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LIngresarDNI;
    private javax.swing.JLabel Lgenerartoken;
    private javax.swing.JLabel Lpresentacion;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JToggleButton TBgenerar;
    private javax.swing.JToggleButton TBsalir;
    private javax.swing.JTextField TFdni;
    // End of variables declaration//GEN-END:variables
}
