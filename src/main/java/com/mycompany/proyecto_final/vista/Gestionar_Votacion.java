package com.mycompany.proyecto_final.vista;

import com.mycompany.proyecto_final.controladores.Sistema;
import com.mycompany.proyecto_final.modelo.EstadoVotaciones;
import com.mycompany.proyecto_final.modelo.VotacionContext;
import com.mycompany.proyecto_final.modelo.VotacionesAbiertas;
import com.mycompany.proyecto_final.modelo.VotacionesCerradas;
import com.mycompany.proyecto_final.modelo.VotacionesEnPreparacion;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Gestionar_Votacion extends javax.swing.JFrame {

    private VotacionContext votacion;
    private Sistema controller= new Sistema();
    public Gestionar_Votacion(VotacionContext votacion) {
        this.votacion = votacion;
        initComponents();
        setLocationRelativeTo(null); 
        if (votacion.getEstado() instanceof VotacionesEnPreparacion) {
            botonAbrir.setVisible(true);
        } else {
            botonAbrir.setVisible(false);
        }
        if (votacion.getEstado() instanceof VotacionesAbiertas) {
            botonCerrar.setVisible(true);
        } else {
            botonCerrar.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbarra = new javax.swing.JPanel();
        TBsalir = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Pcargarestudiante = new javax.swing.JPanel();
        Bcargar = new javax.swing.JButton();
        Ldni4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pcargarestudiante1 = new javax.swing.JPanel();
        Bcargar2 = new javax.swing.JButton();
        Ldni5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pcargarestudiante2 = new javax.swing.JPanel();
        fiscalizar = new javax.swing.JButton();
        Ldni6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pcargarestudiante4 = new javax.swing.JPanel();
        resultados = new javax.swing.JButton();
        Ldni8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonAbrir = new javax.swing.JButton();
        botonCerrar = new javax.swing.JToggleButton();

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Gestionar Eleccion");

        Pcargarestudiante.setBackground(new java.awt.Color(204, 204, 204));

        Bcargar.setText("Cargar Estudiantes");
        Bcargar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        Bcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcargarActionPerformed(evt);
            }
        });

        Ldni4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauta\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_final\\src\\main\\java\\com\\mycompany\\proyecto_final\\vista\\agregar-usuario.png")); // NOI18N

        javax.swing.GroupLayout PcargarestudianteLayout = new javax.swing.GroupLayout(Pcargarestudiante);
        Pcargarestudiante.setLayout(PcargarestudianteLayout);
        PcargarestudianteLayout.setHorizontalGroup(
            PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcargarestudianteLayout.createSequentialGroup()
                .addGroup(PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcargarestudianteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Bcargar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(PcargarestudianteLayout.createSequentialGroup()
                        .addGroup(PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PcargarestudianteLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Ldni4))
                            .addGroup(PcargarestudianteLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PcargarestudianteLayout.setVerticalGroup(
            PcargarestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcargarestudianteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ldni4)
                .addGap(1, 1, 1)
                .addComponent(Bcargar)
                .addGap(17, 17, 17))
        );

        Pcargarestudiante1.setBackground(new java.awt.Color(204, 204, 204));

        Bcargar2.setText("Cargar listas");
        Bcargar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcargar2ActionPerformed(evt);
            }
        });

        Ldni5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauta\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_final\\src\\main\\java\\com\\mycompany\\proyecto_final\\vista\\simbolo-de-lista-de-verificacion-electoral (3).png")); // NOI18N

        javax.swing.GroupLayout Pcargarestudiante1Layout = new javax.swing.GroupLayout(Pcargarestudiante1);
        Pcargarestudiante1.setLayout(Pcargarestudiante1Layout);
        Pcargarestudiante1Layout.setHorizontalGroup(
            Pcargarestudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pcargarestudiante1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Pcargarestudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bcargar2)
                    .addGroup(Pcargarestudiante1Layout.createSequentialGroup()
                        .addComponent(Ldni5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Pcargarestudiante1Layout.setVerticalGroup(
            Pcargarestudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pcargarestudiante1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(Pcargarestudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pcargarestudiante1Layout.createSequentialGroup()
                        .addComponent(Ldni5)
                        .addGap(61, 61, 61))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Bcargar2)
                .addGap(17, 17, 17))
        );

        Pcargarestudiante2.setBackground(new java.awt.Color(204, 204, 204));

        fiscalizar.setText("Fiscalizar");
        fiscalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiscalizarActionPerformed(evt);
            }
        });

        Ldni6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauta\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_final\\src\\main\\java\\com\\mycompany\\proyecto_final\\vista\\caja-de-votacion.png")); // NOI18N

        javax.swing.GroupLayout Pcargarestudiante2Layout = new javax.swing.GroupLayout(Pcargarestudiante2);
        Pcargarestudiante2.setLayout(Pcargarestudiante2Layout);
        Pcargarestudiante2Layout.setHorizontalGroup(
            Pcargarestudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pcargarestudiante2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Pcargarestudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fiscalizar)
                    .addGroup(Pcargarestudiante2Layout.createSequentialGroup()
                        .addComponent(Ldni6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Pcargarestudiante2Layout.setVerticalGroup(
            Pcargarestudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pcargarestudiante2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(Pcargarestudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pcargarestudiante2Layout.createSequentialGroup()
                        .addComponent(Ldni6)
                        .addGap(61, 61, 61))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(fiscalizar)
                .addGap(17, 17, 17))
        );

        Pcargarestudiante4.setBackground(new java.awt.Color(204, 204, 204));

        resultados.setText("Resultados");
        resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosActionPerformed(evt);
            }
        });

        Ldni8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauta\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_final\\src\\main\\java\\com\\mycompany\\proyecto_final\\vista\\resultados-de-las-elecciones.png")); // NOI18N

        javax.swing.GroupLayout Pcargarestudiante4Layout = new javax.swing.GroupLayout(Pcargarestudiante4);
        Pcargarestudiante4.setLayout(Pcargarestudiante4Layout);
        Pcargarestudiante4Layout.setHorizontalGroup(
            Pcargarestudiante4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pcargarestudiante4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Ldni8)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pcargarestudiante4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultados)
                .addGap(21, 21, 21))
        );
        Pcargarestudiante4Layout.setVerticalGroup(
            Pcargarestudiante4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pcargarestudiante4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(Pcargarestudiante4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pcargarestudiante4Layout.createSequentialGroup()
                        .addComponent(Ldni8)
                        .addGap(61, 61, 61))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(resultados)
                .addGap(17, 17, 17))
        );

        botonAbrir.setBackground(new java.awt.Color(153, 255, 153));
        botonAbrir.setText("Abrir Votacion");
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });

        botonCerrar.setBackground(new java.awt.Color(255, 0, 0));
        botonCerrar.setText("Cerrar Votacion");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pcargarestudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAbrir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pcargarestudiante4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pcargarestudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pcargarestudiante2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pcargarestudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pcargarestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pcargarestudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pcargarestudiante4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAbrir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsalirActionPerformed
        this.dispose(); 
        Administracion adminView = new Administracion(controller.listarElecciones());
        adminView.setVisible(true);
    }//GEN-LAST:event_TBsalirActionPerformed

    private void Bcargar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcargar2ActionPerformed
        Cargar_Lista cargar = new Cargar_Lista(votacion);
        cargar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bcargar2ActionPerformed

    private void fiscalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiscalizarActionPerformed
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();

        // Crear las ventanas
        Index indexWindow = new Index(votacion);
        Generar_Token generarTokenWindow = new Generar_Token(votacion);

        // Verificamos si hay más de un monitor
        if (gs.length > 1) {
            // Monitor 1
            indexWindow.setLocation(gs[0].getDefaultConfiguration().getBounds().x + 100, 100);
            indexWindow.setVisible(true);

            // Monitor 2
            generarTokenWindow.setLocation(gs[1].getDefaultConfiguration().getBounds().x + 100, 100);
            generarTokenWindow.setVisible(true);
        } else {
            // Solo hay un monitor → abrimos las ventanas una al lado de la otra
            indexWindow.setLocation(100, 100);
            indexWindow.setVisible(true);

            generarTokenWindow.setLocation(700, 100); // ajustá según el tamaño de tus ventanas
            generarTokenWindow.setVisible(true);
        }

        // Cerramos la ventana anterior si es necesario
        this.dispose();
    }//GEN-LAST:event_fiscalizarActionPerformed

    private void BcargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcargarActionPerformed
        Cargar_Estudiante cargar = new Cargar_Estudiante(votacion);
        cargar.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_BcargarActionPerformed

    private void resultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosActionPerformed
        if (votacion.getEstado() instanceof VotacionesAbiertas || votacion.getEstado() instanceof VotacionesEnPreparacion) {
            
            JOptionPane.showMessageDialog(
                null,
                "La votacion está Abierta, no hay resultados",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        Resultados r = new Resultados(votacion);
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resultadosActionPerformed

    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
        votacion.setEstado(VotacionesAbiertas.getInstance());

        if (votacion.getEstado() instanceof VotacionesAbiertas) {
            botonAbrir.setVisible(false);
            return;
        }

        JOptionPane.showMessageDialog(
            null,
            "Error - Intente abrir la votacion dentro el horario que estableció",
            "Información",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_botonAbrirActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        // cambiar de Estado
        votacion.setEstado(VotacionesCerradas.getInstance());

        if (votacion.getEstado() instanceof VotacionesCerradas) {
            botonAbrir.setVisible(false);
            JOptionPane.showMessageDialog(
                null,
                "Votacion Cerrada",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
            );
            votacion.contarVotos();
            return;
        }

        
    }//GEN-LAST:event_botonCerrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcargar;
    private javax.swing.JButton Bcargar2;
    private javax.swing.JLabel Ldni4;
    private javax.swing.JLabel Ldni5;
    private javax.swing.JLabel Ldni6;
    private javax.swing.JLabel Ldni8;
    private javax.swing.JPanel Pbarra;
    private javax.swing.JPanel Pcargarestudiante;
    private javax.swing.JPanel Pcargarestudiante1;
    private javax.swing.JPanel Pcargarestudiante2;
    private javax.swing.JPanel Pcargarestudiante4;
    private javax.swing.JToggleButton TBsalir;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JToggleButton botonCerrar;
    private javax.swing.JButton fiscalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resultados;
    // End of variables declaration//GEN-END:variables
}
