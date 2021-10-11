package sistema.presentation.pagos;

import java.util.Observable;
import sistema.logic.Pagos;
import sistema.logic.Prestamo;
import sistema.presentation.prestamos.PrestamosJTableModel;

public class ViewPagos extends javax.swing.JFrame implements java.util.Observer{

    ControllerPagos controller;
    ModelPagos model;
    
    public void setController(ControllerPagos controller){
        this.controller = controller;
    }

    public ControllerPagos getController() {
        return controller;
    }
    
    public void setModel(ModelPagos model){
        this.model = model;
        model.addObserver(this);
    }

    public ModelPagos getModel() {
        return model;
    }
    
    @Override
    public void update(Observable o, Object arg) {
       jTablePagos.setModel(new PagosTableModel(model.getPrestamo().getPagos()));
       jTextFieldSaldo.setText(Double.toString(model.getPrestamo().getMonto()));
       jTextFieldCuota.setText(Double.toString(model.getPrestamo().getCuota()));
       
    }
    
    public ViewPagos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePagos = new javax.swing.JTable();
        JButtonPago = new javax.swing.JButton();
        jFieldMontoPago = new javax.swing.JTextField();
        DontLbl = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCuota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PAGOS");
        setResizable(false);

        jTablePagos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePagos);

        JButtonPago.setText("Realizar Pago");
        JButtonPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPagoActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Saldo actual:");

        jTextFieldSaldo.setEditable(false);

        jLabel2.setText("Monto de cuota:");

        jTextFieldCuota.setEditable(false);
        jTextFieldCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCuotaActionPerformed(evt);
            }
        });

        jLabel3.setText("Monto que desea abonar :");

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
                .addGap(34, 34, 34)
                .addComponent(jButtonPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(JButtonPago, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFieldMontoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DontLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFieldMontoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JButtonPago, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DontLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePagosMouseClicked
        pago = model.getPagos().get(jTablePagos.getSelectedRow());
        amortizacion = pago.getAmortizacion();
        row = jTablePagos.getSelectedRow();
    }//GEN-LAST:event_jTablePagosMouseClicked

    private void JButtonPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPagoActionPerformed
        montoPago = Integer.parseInt(jFieldMontoPago.getText());
        if(montoPago < pago.getAmortizacion()){
            DontLbl.setText("El pago es menor al monto a pagar!");
        }
        else if(montoPago > pago.getAmortizacion()){
            prestamo = model.getPrestamo();
            monto = montoPago - pago.getAmortizacion();
            controller.pagoAdd(model.getPrestamo().getCodigo(), new Pagos(monto, model.getPrestamo().getTasa()));
            prestamo.setMonto(monto);
            prestamo.setPagos(prestamo.getPagos());
            model.setPrestamo(prestamo);
            controller.pago(row);
            DontLbl.setText("Pago realizado!");
        }
        else{
            controller.pago(row);
            DontLbl.setText("Pago realizado!");
        }
        
    }//GEN-LAST:event_JButtonPagoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        controller.hide();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCuotaActionPerformed

    private void jButtonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFActionPerformed
        try{
            controller.createPdfPagos(model.getPagos());
        }catch(Exception ex){}
    }//GEN-LAST:event_jButtonPDFActionPerformed
   
    Prestamo prestamo;
    Pagos pago;
    double amortizacion;
    double montoPago;
    int row;
    double monto;
    double tasa;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DontLbl;
    private javax.swing.JButton JButtonPago;
    private javax.swing.JButton jButtonPDF;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JTextField jFieldMontoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePagos;
    private javax.swing.JTextField jTextFieldCuota;
    private javax.swing.JTextField jTextFieldSaldo;
    // End of variables declaration//GEN-END:variables
}
