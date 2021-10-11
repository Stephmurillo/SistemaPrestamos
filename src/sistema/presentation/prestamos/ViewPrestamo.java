package sistema.presentation.prestamos;

import java.util.List;
import java.util.Observable;
import javax.swing.event.ListSelectionEvent;
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
        jButtonPDF = new javax.swing.JButton();

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

        jButtonPDF.setText("Generar PDF");
        jButtonPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTasa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAnadir)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscar)
                            .addComponent(jLabelPlazo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMostrarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DontLbl)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(DontLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DontLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DontLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DontLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DontLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrarPago)
                    .addComponent(jButtonPDF)
                    .addComponent(jButtonRegresar))
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
                DontLbl3.setText("Prestamo añadido!");
                controller.prestamoAdd(this.model.getCliente().getCedula(), new Prestamo(jTextFieldCodigo.getText(), Double.parseDouble(jTextFieldMonto.getText()), Double.parseDouble(jTextFieldTasa.getText()), Double.parseDouble(jTextFieldPlazo.getText())));
            }
            model.setPrestamos(model.getPrestamos());
            controller.prestamoGet("","");
            DontLbl2.setText("");
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_jButtonAnadirActionPerformed

    private void jButtonMostrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarPagoActionPerformed
       if(jTablePrestamosC.getSelectedRow() != -1){
            sistema.presentation.pagos.ModelPagos modelPagos = new sistema.presentation.pagos.ModelPagos();
            modelPagos.setPrestamo(this.model.getPrestamos().get(jTablePrestamosC.getSelectedRow()));
            controller.mensualidadShow();
       } 
    }//GEN-LAST:event_jButtonMostrarPagoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        controller.hide();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        DontLbl2.setText("");
        DontLbl3.setText("");
        controller.prestamoSearch(model.getCliente().getCedula());
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        DontLbl3.setText("");
        controller.prestamoGet(model.getCliente().getCedula(), jTextFieldCodigo.getText());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFActionPerformed
        try{
            controller.createPdfPrestamos(model.getPrestamos());
        }catch(Exception ex){}
    }//GEN-LAST:event_jButtonPDFActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DontLbl;
    private javax.swing.JLabel DontLbl2;
    private javax.swing.JLabel DontLbl3;
    private javax.swing.JButton jButtonAnadir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonMostrarPago;
    private javax.swing.JButton jButtonPDF;
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
