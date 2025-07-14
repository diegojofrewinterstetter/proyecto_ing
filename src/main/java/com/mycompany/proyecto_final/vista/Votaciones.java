package com.mycompany.proyecto_final.vista;


public class Votaciones extends javax.swing.JFrame {

    
    public Votaciones() {
        initComponents();
        
    }
    
    public void cargarListas(){
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TBvotar = new javax.swing.JToggleButton();
        Pbarra = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TBvotar.setText("Votar");

        Pbarra.setBackground(new java.awt.Color(153, 153, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cacique", null, null, null, null},
                {"Hechicero", null, null, null, null},
                {"Jefe de Consejo", null, null, null, null},
                {"Delegado", null, null, null, null},
                {"Consejero", null, null, null, null},
                {"	Delegado	", null, null, null, null},
                {"Consejero", null, null, null, null},
                {"Delegado", null, null, null, null},
                {"Consejero", null, null, null, null},
                {"Delegado", null, null, null, null},
                {"Consejero", null, null, null, null},
                {"Delegado", null, null, null, null},
                {"Consejero", null, null, null, null},
                {"Delegado", null, null, null, null},
                {"Consejero", null, null, null, null}
            },
            new String [] {
                "Cargos", "Lista 1", "", "Lista 2", ""
            }
        ));
        jTable1.setRowHeight(28);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setMinWidth(50);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(4).setMinWidth(50);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        javax.swing.GroupLayout PbarraLayout = new javax.swing.GroupLayout(Pbarra);
        Pbarra.setLayout(PbarraLayout);
        PbarraLayout.setHorizontalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PbarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );
        PbarraLayout.setVerticalGroup(
            PbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PbarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TBvotar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(TBvotar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Votaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pbarra;
    private javax.swing.JToggleButton TBvotar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
