package com.mycompany.proyecto_final.vista;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import com.mycompany.proyecto_final.controladores.Sistema;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import javax.swing.JFrame;

public class Cargar_Eleccion extends javax.swing.JFrame {
    
    private Sistema controller = new Sistema();
    public Cargar_Eleccion() {
        initComponents();
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbarra = new javax.swing.JPanel();
        TBsallir = new javax.swing.JToggleButton();
        Plistas = new javax.swing.JPanel();
        Bcargarlistas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FechaInicio = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        FechaFin = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        TBsallir.setText("Volver");
        TBsallir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBsallirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PbarraLayout = new javax.swing.GroupLayout(Pbarra);
        Pbarra.setLayout(PbarraLayout);
        PbarraLayout.setHorizontalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbarraLayout.createSequentialGroup()
                .addContainerGap(602, Short.MAX_VALUE)
                .addComponent(TBsallir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        PbarraLayout.setVerticalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbarraLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(TBsallir)
                .addContainerGap())
        );

        Plistas.setBackground(new java.awt.Color(255, 255, 255));
        Plistas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Plistas.setAlignmentX(1.0F);
        Plistas.setAlignmentY(1.0F);
        Plistas.setAutoscrolls(true);

        Bcargarlistas.setBackground(new java.awt.Color(153, 255, 153));
        Bcargarlistas.setText("Crear Elección");
        Bcargarlistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcargarlistasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Nueva Elección");

        NombreF.setText("Ingrese el nombre");
        NombreF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreFMouseClicked(evt);
            }
        });
        NombreF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        try {
            FechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FechaInicio.setText("02/08/25 08:30:00");
        FechaInicio.setToolTipText("");
        FechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaInicioActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha y Hora Inicio");

        try {
            FechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FechaFin.setText("02/08/25 18:30:00");
        FechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaFinActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha y Hora Fin");

        javax.swing.GroupLayout PlistasLayout = new javax.swing.GroupLayout(Plistas);
        Plistas.setLayout(PlistasLayout);
        PlistasLayout.setHorizontalGroup(
            PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlistasLayout.createSequentialGroup()
                .addGroup(PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlistasLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(PlistasLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(Bcargarlistas))
                    .addGroup(PlistasLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(PlistasLayout.createSequentialGroup()
                                .addGroup(PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NombreF, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(FechaInicio)
                                    .addComponent(FechaFin))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        PlistasLayout.setVerticalGroup(
            PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlistasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(NombreF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(PlistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(Bcargarlistas)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(Plistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Plistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBsallirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsallirActionPerformed
        
        this.dispose(); 
        Administracion adminView = new Administracion(controller.listarElecciones());
        adminView.setVisible(true);this.dispose();
    }//GEN-LAST:event_TBsallirActionPerformed

    private void BcargarlistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcargarlistasActionPerformed
         String nombre = NombreF.getText();
         String fechastr = FechaInicio.getText();
         String fechafinstr = FechaFin.getText();

         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
         sdf.setLenient(false); // para que no acepte fechas inválidas 

         try {
             Date fechaInicio = sdf.parse(fechastr);
             Date fechaFin = sdf.parse(fechafinstr);
             Date ahora = new Date();

             // Validaciones
             if (fechaInicio.before(ahora)) {
                 JOptionPane.showMessageDialog(this, "La fecha de inicio no puede ser del pasado.");
                 return;
             }

             if (fechaFin.before(fechaInicio)) {
                 JOptionPane.showMessageDialog(this, "La fecha de fin no puede ser anterior a la fecha de inicio.");
                 return;
             }

             // cargar eleccion con formato que incluya hora
             SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             String fechaInicioStr = formato.format(fechaInicio); 
             String fechaFinStr = formato.format(fechaFin);

             VotacionContext eleccion = new VotacionContext(nombre, fechaInicioStr, fechaFinStr);
             boolean resulta2 = controller.cargarEleccion(eleccion);
             if(resulta2){
                 
                Administracion adminView = new Administracion(controller.listarElecciones());
                adminView.setVisible(true);
                this.dispose();
                return;
             } else {
                 JOptionPane.showMessageDialog(this, "Error del Servidor - Intente más tarde");
                 return;
             }

         } catch (ParseException e) {
             JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Usá dd/MM/yy HH:mm");
         }

    }//GEN-LAST:event_BcargarlistasActionPerformed
    
    private void NombreFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFActionPerformed
      
    }//GEN-LAST:event_NombreFActionPerformed

    private void NombreFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreFMouseClicked
        NombreF.setText("");
    }//GEN-LAST:event_NombreFMouseClicked

    private void FechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaInicioActionPerformed
  
    }//GEN-LAST:event_FechaInicioActionPerformed

    private void FechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaFinActionPerformed
      
    }//GEN-LAST:event_FechaFinActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcargarlistas;
    private javax.swing.JFormattedTextField FechaFin;
    private javax.swing.JFormattedTextField FechaInicio;
    private javax.swing.JTextField NombreF;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JPanel Plistas;
    private javax.swing.JToggleButton TBsallir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
