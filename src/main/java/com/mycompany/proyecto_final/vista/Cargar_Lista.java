
package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.modelo.Delegacion;
import com.mycompany.proyecto_final.modelo.Estudiante;
import com.mycompany.proyecto_final.modelo.Lista;
import com.mycompany.proyecto_final.modelo.Tribu;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Cargar_Lista extends javax.swing.JFrame {
    
    public VotacionContext votacion;
    public Cargar_Lista(VotacionContext votacion) {
        this.votacion = votacion;
        initComponents();
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        Pbarra = new javax.swing.JPanel();
        TBsalir = new javax.swing.JToggleButton();
        Pestudiantes = new javax.swing.JPanel();
        Bcargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        caciqueH = new javax.swing.JFormattedTextField();
        caciqueP = new javax.swing.JFormattedTextField();
        jefeconsejoH = new javax.swing.JFormattedTextField();
        jefeconsejoP = new javax.swing.JFormattedTextField();
        hechiceroH = new javax.swing.JFormattedTextField();
        hechiceroP = new javax.swing.JFormattedTextField();
        delegado1H = new javax.swing.JFormattedTextField();
        delegado1P = new javax.swing.JFormattedTextField();
        consejero1H = new javax.swing.JFormattedTextField();
        consejero1P = new javax.swing.JFormattedTextField();
        delegado2H = new javax.swing.JFormattedTextField();
        delegado2P = new javax.swing.JFormattedTextField();
        consejero2H = new javax.swing.JFormattedTextField();
        consejero2P = new javax.swing.JFormattedTextField();
        delegado3H = new javax.swing.JFormattedTextField();
        delegado3P = new javax.swing.JFormattedTextField();
        consejero3H = new javax.swing.JFormattedTextField();
        consejero3P = new javax.swing.JFormattedTextField();
        delegado4H = new javax.swing.JFormattedTextField();
        delegado4P = new javax.swing.JFormattedTextField();
        consejero4H = new javax.swing.JFormattedTextField();
        consejero4P = new javax.swing.JFormattedTextField();
        delegado5H = new javax.swing.JFormattedTextField();
        delegado5P = new javax.swing.JFormattedTextField();
        consejero5P = new javax.swing.JFormattedTextField();
        consejero5H = new javax.swing.JFormattedTextField();
        delegado6P = new javax.swing.JFormattedTextField();
        delegado6H = new javax.swing.JFormattedTextField();
        consejero6P = new javax.swing.JFormattedTextField();
        consejero6H = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        nombree = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

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
                .addContainerGap(607, Short.MAX_VALUE)
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

        Pestudiantes.setBackground(new java.awt.Color(204, 204, 204));
        Pestudiantes.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        Bcargar.setText("Cargar listas");
        Bcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Nueva Lista");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("(Debe ingresar los DNI de los estudiantes que se postulan en los puestos)");

        jLabel3.setText("Cacique");

        jLabel4.setText("Jefe de Consejo");

        jLabel5.setText("Hechicero");

        jLabel6.setText("Delegado");

        jLabel7.setText("Consejero");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Tribu Huarpe");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Tribu Pehuelche");

        jLabel10.setText("Consejero");

        jLabel11.setText("Delegado");

        jLabel12.setText("Consejero");

        jLabel13.setText("Delegado");

        jLabel14.setText("Delegado");

        jLabel15.setText("Consejero");

        jLabel16.setText("Consejero");

        jLabel17.setText("Delegado");

        jLabel18.setText("Consejero");

        jLabel19.setText("Delegado");

        caciqueH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        caciqueH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caciqueHActionPerformed(evt);
            }
        });

        jefeconsejoH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jefeconsejoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jefeconsejoHActionPerformed(evt);
            }
        });

        hechiceroH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        hechiceroH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hechiceroHActionPerformed(evt);
            }
        });

        delegado1H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        delegado1H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delegado1HActionPerformed(evt);
            }
        });

        consejero1H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        consejero1H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consejero1HActionPerformed(evt);
            }
        });

        delegado2H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        delegado2H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delegado2HActionPerformed(evt);
            }
        });

        consejero2H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        consejero2H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consejero2HActionPerformed(evt);
            }
        });

        delegado3H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        delegado3H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delegado3HActionPerformed(evt);
            }
        });

        consejero3H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        consejero3H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consejero3HActionPerformed(evt);
            }
        });

        delegado4H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        delegado4H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delegado4HActionPerformed(evt);
            }
        });

        consejero4H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        consejero4H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consejero4HActionPerformed(evt);
            }
        });

        delegado5H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        delegado5H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delegado5HActionPerformed(evt);
            }
        });

        consejero5H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        consejero5H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consejero5HActionPerformed(evt);
            }
        });

        delegado6H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        delegado6H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delegado6HActionPerformed(evt);
            }
        });

        consejero6H.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        consejero6H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consejero6HActionPerformed(evt);
            }
        });

        jLabel20.setText("Nombre :");

        javax.swing.GroupLayout PestudiantesLayout = new javax.swing.GroupLayout(Pestudiantes);
        Pestudiantes.setLayout(PestudiantesLayout);
        PestudiantesLayout.setHorizontalGroup(
            PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PestudiantesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(283, 283, 283))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PestudiantesLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel19))))
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PestudiantesLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel8)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel9))
                            .addGroup(PestudiantesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(jefeconsejoH, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jefeconsejoP, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(caciqueH, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(caciqueP, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombree))))
                            .addGroup(PestudiantesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(hechiceroH, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hechiceroP, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PestudiantesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(consejero1H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(consejero1P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(delegado1H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delegado1P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(delegado2H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delegado2P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(consejero2H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(consejero2P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(delegado3H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delegado3P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PestudiantesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(consejero3H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(consejero3P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PestudiantesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(delegado4H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delegado4P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PestudiantesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(delegado5H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delegado5P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(consejero4H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(consejero4P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(consejero5H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(consejero5P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(delegado6H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delegado6P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PestudiantesLayout.createSequentialGroup()
                                        .addComponent(consejero6H, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(consejero6P, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(PestudiantesLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(Bcargar)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PestudiantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        PestudiantesLayout.setVerticalGroup(
            PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestudiantesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(nombree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caciqueH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caciqueP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jefeconsejoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jefeconsejoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hechiceroH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hechiceroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(delegado1H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delegado1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(consejero1H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consejero1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(delegado2H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delegado2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(consejero2H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consejero2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(delegado3H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delegado3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(consejero3H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consejero3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(delegado4H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delegado4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(consejero4H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consejero4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(delegado5H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delegado5P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(consejero5H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consejero5P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(delegado6H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delegado6P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(PestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consejero6H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consejero6P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bcargar)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pestudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsalirActionPerformed
        Gestionar_Votacion index = new Gestionar_Votacion(votacion);
        index.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TBsalirActionPerformed
    private boolean validarCampos() {
        JFormattedTextField[] campos = {
            caciqueH, caciqueP,
            jefeconsejoH, jefeconsejoP,
            hechiceroH, hechiceroP,
            delegado1H, delegado1P,
            consejero1H, consejero1P,
            delegado2H, delegado2P,
            consejero2H, consejero2P,
            delegado3H, delegado3P,
            consejero3H, consejero3P,
            delegado4H, delegado4P,
            consejero4H, consejero4P,
            delegado5H, delegado5P,
            consejero5H, consejero5P,
            delegado6H, delegado6P,
            consejero6H, consejero6P
        };

        for (int i = 0; i < campos.length; i++) {
            String texto = campos[i].getText().trim();
            if (texto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.", "Error", JOptionPane.ERROR_MESSAGE);
                campos[i].requestFocus();
                return false;
            }
            try {
                long dni = Long.parseLong(texto);
                if (dni < 1000000 || dni > 99999999) {
                    JOptionPane.showMessageDialog(this, "DNI inválido: " + texto, "Error", JOptionPane.ERROR_MESSAGE);
                    campos[i].requestFocus();
                    return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido en campo: " + texto, "Error", JOptionPane.ERROR_MESSAGE);
                campos[i].requestFocus();
                return false;
            }
        }
        
        if(nombree.getText() == null){
            return false;
        }

        return true;
    }
    private void BcargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcargarActionPerformed
        boolean completo = validarCampos();
        boolean cargar = true;
        if (!completo) {
            return;
        }
        // Lista de listas (suponiendo que se usa más adelante)
        Lista lista = new Lista( nombree.getText() ,nombree.getText());

        // Mapa con nombres de los campos y sus JFormattedTextField asociados
        Map<String, JFormattedTextField> campos = new LinkedHashMap<>();
        campos.put("Cacique Huarpe", caciqueH);
        campos.put("Cacique Pehuelche", caciqueP);
        campos.put("Jefe de Consejo Huarpe", jefeconsejoH);
        campos.put("Jefe de Consejo Pehuelche", jefeconsejoP);
        campos.put("Hechicero Huarpe", hechiceroH);
        campos.put("Hechicero Pehuelche", hechiceroP);
        campos.put("Delegado Huarpe", delegado1H);
        campos.put("Delegado Pehuelche", delegado1P);
        campos.put("Consejero Huarpe", consejero1H);
        campos.put("Consejero Pehuelche", consejero1P);
        campos.put("Delegado Huarpe", delegado2H);
        campos.put("Delegado Pehuelche", delegado2P);
        campos.put("Consejero Pehuelche", consejero2H);
        campos.put("Consejero Pehuelche", consejero2P);
        campos.put("Delegado Huarpe", delegado3H);
        campos.put("Delegado Pehuelche", delegado3P);
        campos.put("Consejero Pehuelche", consejero3H);
        campos.put("Consejero Pehuelche", consejero3P);
        campos.put("Delegado Huarpe", delegado4H);
        campos.put("Delegado Pehuelche", delegado4P);
        campos.put("Consejero Pehuelche", consejero4H);
        campos.put("Consejero Pehuelche", consejero4P);
        campos.put("Delegado Huarpe", delegado5H);
        campos.put("Delegado Pehuelche", delegado5P);
        campos.put("Consejero Pehuelche", consejero5H);
        campos.put("Consejero Pehuelche", consejero5P);
        campos.put("Delegado Huarpe", delegado6H);
        campos.put("Delegado Pehuelche", delegado6P);
        campos.put("Consejero Pehuelche", consejero6H);
        campos.put("Consejero Pehuelche", consejero6P);

        // Validar los DNI ingresados
        
        Tribu tribuH = new Tribu("1","Huarpe");
        Tribu tribuP = new Tribu("2","Pehuelche");
        
        for (Map.Entry<String, JFormattedTextField> entry : campos.entrySet()) {
            String nombreCampo = entry.getKey();
            JFormattedTextField campo = entry.getValue();

            String dniTexto = campo.getText().trim();
            System.out.println("[" + nombreCampo + "] DNI ingresado: " + dniTexto);

            Estudiante valido = votacion.validarEstudiante(dniTexto);
            if (valido == null) {
                JOptionPane.showMessageDialog(
                    this,
                    "Campo: " + nombreCampo + "\nDNI: " + dniTexto + " - Error: Estudiante no encontrado",
                    "Error de validación",
                    JOptionPane.ERROR_MESSAGE
                );
                cargar = false;
                break; // Cortar si al menos uno es inválido
            }
            
            Delegacion delegacion = new Delegacion(dniTexto,nombreCampo,valido);
            
            if (nombreCampo.contains("Huarpe")) {
                tribuH.agregar(delegacion);
            } else if (nombreCampo.contains("Pehuelche")) {
                tribuP.agregar(delegacion);
            }    
        }
        lista.agregar(tribuH);
        lista.agregar(tribuP);
        boolean resultado = votacion.cargarLista(lista);
        
        if(resultado){
            this.dispose();
            Gestionar_Votacion admin = new Gestionar_Votacion(votacion);
            admin.setVisible(true);
            return;
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Error al Cargar Intente en otro momento " ,
                    "Error de validación",
                    JOptionPane.ERROR_MESSAGE
                );
            return;
        
        }
        
    }//GEN-LAST:event_BcargarActionPerformed

    private void caciqueHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caciqueHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caciqueHActionPerformed

    private void jefeconsejoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jefeconsejoHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jefeconsejoHActionPerformed

    private void hechiceroHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hechiceroHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hechiceroHActionPerformed

    private void delegado1HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delegado1HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delegado1HActionPerformed

    private void consejero1HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consejero1HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consejero1HActionPerformed

    private void delegado2HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delegado2HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delegado2HActionPerformed

    private void consejero2HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consejero2HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consejero2HActionPerformed

    private void delegado3HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delegado3HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delegado3HActionPerformed

    private void consejero3HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consejero3HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consejero3HActionPerformed

    private void delegado4HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delegado4HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delegado4HActionPerformed

    private void consejero4HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consejero4HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consejero4HActionPerformed

    private void delegado5HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delegado5HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delegado5HActionPerformed

    private void consejero5HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consejero5HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consejero5HActionPerformed

    private void delegado6HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delegado6HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delegado6HActionPerformed

    private void consejero6HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consejero6HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consejero6HActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcargar;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JPanel Pestudiantes;
    private javax.swing.JToggleButton TBsalir;
    private javax.swing.JFormattedTextField caciqueH;
    private javax.swing.JFormattedTextField caciqueP;
    private javax.swing.JFormattedTextField consejero1H;
    private javax.swing.JFormattedTextField consejero1P;
    private javax.swing.JFormattedTextField consejero2H;
    private javax.swing.JFormattedTextField consejero2P;
    private javax.swing.JFormattedTextField consejero3H;
    private javax.swing.JFormattedTextField consejero3P;
    private javax.swing.JFormattedTextField consejero4H;
    private javax.swing.JFormattedTextField consejero4P;
    private javax.swing.JFormattedTextField consejero5H;
    private javax.swing.JFormattedTextField consejero5P;
    private javax.swing.JFormattedTextField consejero6H;
    private javax.swing.JFormattedTextField consejero6P;
    private javax.swing.JFormattedTextField delegado1H;
    private javax.swing.JFormattedTextField delegado1P;
    private javax.swing.JFormattedTextField delegado2H;
    private javax.swing.JFormattedTextField delegado2P;
    private javax.swing.JFormattedTextField delegado3H;
    private javax.swing.JFormattedTextField delegado3P;
    private javax.swing.JFormattedTextField delegado4H;
    private javax.swing.JFormattedTextField delegado4P;
    private javax.swing.JFormattedTextField delegado5H;
    private javax.swing.JFormattedTextField delegado5P;
    private javax.swing.JFormattedTextField delegado6H;
    private javax.swing.JFormattedTextField delegado6P;
    private javax.swing.JFormattedTextField hechiceroH;
    private javax.swing.JFormattedTextField hechiceroP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField jefeconsejoH;
    private javax.swing.JFormattedTextField jefeconsejoP;
    private javax.swing.JTextField nombree;
    // End of variables declaration//GEN-END:variables
}
