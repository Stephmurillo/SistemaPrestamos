package sistema.presentation.prestamos;

import java.util.Observable;
import sistema.logic.Prestamo;

public class ViewPrestamo extends javax.swing.JFrame implements java.util.Observer{

    ControllerPrestamo controller;
    ModelPrestamo model = new ModelPrestamo();
    
    public void setController(ControllerPrestamo controller){
        this.controller = controller;
    }

    public ControllerPrestamo getController() {
        return controller;
    }
    
    public void setModel(ModelPrestamo model){
        this.model = model;
        model.addObserver(this);
    }

    public ModelPrestamo getModel() {
        return model;
    }
    
    @Override
    public void update(Observable o, Object arg) {
         jTablePrestamosC.setModel(new PrestamosJTableModel(model.getCliente().getPrestamos()));
    }
   
    public ViewPrestamo() {
        initComponents();
        //jTextField1.setText(model.getCliente().getNombre());
        this.setTitle(model.getCliente().getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButtonMuestraMensualidades = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePrestamosC = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabelCodigo.setText("Codigo");

        jLabelMonto.setText("Monto");

        jLabelTasa.setText("Tasa");

        jLabelPlazo.setText("Plazo");

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

        jButtonMuestraMensualidades.setText("Mostrar Mensualidades");
        jButtonMuestraMensualidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMuestraMensualidadesActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(jTablePrestamosC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButtonListar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAnadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMonto)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTasa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPlazo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButtonMuestraMensualidades)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonto)
                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTasa)
                    .addComponent(jTextFieldTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPlazo)
                    .addComponent(jTextFieldPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jButtonAnadir)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonBuscar)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonListar)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonRegresar)
                                    .addComponent(jButtonMuestraMensualidades))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirActionPerformed
        model.cliente.getPrestamos().add(new Prestamo(model.getCliente(), jTextFieldCodigo.getText(),Double.parseDouble(jTextFieldMonto.getText()),Double.parseDouble(jTextFieldTasa.getText()) ,Double.parseDouble(jTextFieldPlazo.getText()))); 
        model.setPrestamos(model.cliente.getPrestamos());
        System.out.println( model.getPrestamos().toString());
    }//GEN-LAST:event_jButtonAnadirActionPerformed

    private void jButtonMuestraMensualidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMuestraMensualidadesActionPerformed
        sistema.presentation.mensualidades.Model modelMensualidades = new sistema.presentation.mensualidades.Model();
        modelMensualidades.setPrestamo(this.model.getPrestamos().get(jTablePrestamosC.getSelectedRow()));
        controller.mensualidadShow();
    }//GEN-LAST:event_jButtonMuestraMensualidadesActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        controller.hide();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        controller.prestamoSearch(model.getCliente().getCedula(),jTextFieldCodigo.getText());
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        controller.prestamoGet(jTextFieldCodigo.getText());
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonMuestraMensualidades;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelPlazo;
    private javax.swing.JLabel jLabelTasa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePrestamosC;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldMonto;
    private javax.swing.JTextField jTextFieldPlazo;
    private javax.swing.JTextField jTextFieldTasa;
    // End of variables declaration//GEN-END:variables
}
