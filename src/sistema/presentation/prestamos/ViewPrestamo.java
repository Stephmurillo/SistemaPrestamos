package sistema.presentation.prestamos;

import java.util.Observable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    
    /**
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        jTextFieldCodigo.setText("");
        jTextFieldMonto.setText("");
        jTextFieldPlazo.setText("");
        jTextFieldTasa.setText("");
        jTablePrestamosC.setModel(new PrestamosJTableModel(model.getCliente().getPrestamos()));
        this.setTitle(model.getCliente().getNombre());
    }
   
    public ViewPrestamo() {
        
        initComponents();
        this.jTablePrestamosC.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            jButtonMostrarPago.setEnabled(true);
            // System.out.println(jTablePrestamosC.getValueAt(jTablePrestamosC.getSelectedRow(), 0).toString());
        });
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
        jButtonMostrarPago = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        DontLbl = new javax.swing.JLabel();
        DontLbl2 = new javax.swing.JLabel();
        DontLbl3 = new javax.swing.JLabel();

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

        jButtonMostrarPago.setText("Mostrar Pagos");
        jButtonMostrarPago.setEnabled(false);
        jButtonMostrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarPagoActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
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
                                        .addComponent(jTextFieldPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonAnadir)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButtonBuscar)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButtonListar)
                                        .addGap(40, 40, 40))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(DontLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jButtonMostrarPago))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(DontLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DontLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonListar)
                    .addComponent(jButtonAnadir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonto)
                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTasa)
                    .addComponent(jTextFieldTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPlazo)
                    .addComponent(jTextFieldPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DontLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DontLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DontLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar)
                    .addComponent(jButtonMostrarPago))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirActionPerformed
        try {
            if ("".equals(jTextFieldMonto.getText()) || "".equals(jTextFieldPlazo.getText()) || "".equals(jTextFieldTasa.getText())) {
                DontLbl2.setText("Complete todos los campos!");
                DontLbl3.setText("Digite solo numeros!");
            } else {
                controller.prestamoAdd(model.getCliente().getCedula(), new Prestamo(jTextFieldCodigo.getText(), Double.parseDouble(jTextFieldMonto.getText()), Double.parseDouble(jTextFieldTasa.getText()), Double.parseDouble(jTextFieldPlazo.getText())));
                DontLbl2.setText("");
                DontLbl3.setText("");
            }
            model.setPrestamos(model.getPrestamos());
        }
        catch(Exception ex){
            
        }
        
    }//GEN-LAST:event_jButtonAnadirActionPerformed

    private void jButtonMostrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarPagoActionPerformed
       if(jTablePrestamosC.getSelectedRow() != -1){
            sistema.presentation.pagos.ModelPagos modelMensualidades = new sistema.presentation.pagos.ModelPagos();
            modelMensualidades.setPrestamo(this.model.getPrestamos().get(jTablePrestamosC.getSelectedRow()));
            controller.mensualidadShow();
       } 
    }//GEN-LAST:event_jButtonMostrarPagoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        controller.hide();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        controller.prestamoSearch(model.getCliente().getCedula());
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        controller.prestamoGet(jTextFieldCodigo.getText());
    }//GEN-LAST:event_jButtonBuscarActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DontLbl;
    private javax.swing.JLabel DontLbl2;
    private javax.swing.JLabel DontLbl3;
    private javax.swing.JButton jButtonAnadir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonMostrarPago;
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
