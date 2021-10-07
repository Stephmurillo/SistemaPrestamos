package sistema.presentation.prestamos;

import java.util.ArrayList;
import java.util.Observable;
import sistema.logic.Prestamo;

public class ViewPrestamo extends javax.swing.JFrame implements java.util.Observer{

    Controller controller;
    Model model = new Model();
    
    public void setController(Controller controller){
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }
    
    public void setModel(Model model){
        this.model = model;
        model.addObserver(this);
    }

    public Model getModel() {
        return model;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        jTablePrestamosC.setModel(new PrestamosJTableModel((ArrayList<Prestamo>) model.getPrestamos()));   
    }
   
    public ViewPrestamo() {
        initComponents();
        this.setTitle(model.getCliente().getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrestamosC = new javax.swing.JTable();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelMonto = new javax.swing.JLabel();
        jTextFieldMonto = new javax.swing.JTextField();
        jLabelTasa = new javax.swing.JLabel();
        jTextFieldTasa = new javax.swing.JTextField();
        jLabelPlazo = new javax.swing.JLabel();
        jTextFieldPlazo = new javax.swing.JTextField();
        jButtonAnadir = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonRealizarPago = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jTablePrestamosC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePrestamosC);

        jLabelCodigo.setText("Codigo");

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jLabelMonto.setText("Monto");

        jLabelTasa.setText("Tasa");

        jLabelPlazo.setText("Plazo");

        jTextFieldPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlazoActionPerformed(evt);
            }
        });

        jButtonAnadir.setText("Agregar");
        jButtonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonRealizarPago.setText("Mostrar Mensualidades");
        jButtonRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarPagoActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelMonto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTextFieldMonto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTasa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPlazo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAnadir)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonListar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonRealizarPago)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnadir)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonListar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonto)
                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTasa)
                    .addComponent(jTextFieldTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPlazo)
                    .addComponent(jTextFieldPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRealizarPago)
                    .addComponent(jButtonRegresar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlazoActionPerformed

    private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirActionPerformed
        controller.prestamoAdd(new Prestamo(jTextFieldCodigo.getText(),Double.parseDouble(jTextFieldMonto.getText()),Double.parseDouble(jTextFieldPlazo.getText()),Double.parseDouble(jTextFieldTasa.getText()))); 
    }//GEN-LAST:event_jButtonAnadirActionPerformed

    private void jButtonRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarPagoActionPerformed
        sistema.presentation.mensualidades.Model modelMensualidades = new sistema.presentation.mensualidades.Model();
        modelMensualidades.setPrestamo(this.model.getPrestamos().get(jTablePrestamosC.getSelectedRow()));
        controller.mensualidadShow();
    }//GEN-LAST:event_jButtonRealizarPagoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        controller.hide();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        controller.prestamoSearch(jTextFieldCodigo.getText());
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        controller.prestamoGet(jTextFieldCodigo.getText());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewPrestamo().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonRealizarPago;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelPlazo;
    private javax.swing.JLabel jLabelTasa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrestamosC;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldMonto;
    private javax.swing.JTextField jTextFieldPlazo;
    private javax.swing.JTextField jTextFieldTasa;
    // End of variables declaration//GEN-END:variables
}
