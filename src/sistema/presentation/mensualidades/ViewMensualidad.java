package sistema.presentation.mensualidades;

import java.util.Observable;
import sistema.logic.Mensualidad;
import sistema.logic.Prestamo;

public class ViewMensualidad extends javax.swing.JFrame implements java.util.Observer{

    Controller controller;
    Model model;
    
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
       
    }
    
    public ViewMensualidad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JButtonPago = new javax.swing.JButton();
        MontoPagoFdl = new javax.swing.JTextField();
        DontLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        JButtonPago.setText("Pago");
        JButtonPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(MontoPagoFdl, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(JButtonPago, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(DontLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonPago, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MontoPagoFdl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DontLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        mensualidad = model.getMensualidades().get(jTable1.getSelectedRow());
        amortizacion = mensualidad.getAmortizacion();
        row = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void JButtonPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPagoActionPerformed
        if(mensualidad.getEstado() != true){
            pago = Integer.parseInt(MontoPagoFdl.getText());
            if(pago < mensualidad.getAmortizacion()){
                DontLbl.setText("El pago es menor al monto a pagar!");
            }
            else if(pago > mensualidad.getAmortizacion()){
                prestamo = model.getPrestamo();
                monto = pago - mensualidad.getAmortizacion();
                prestamo.setMonto(monto);
                prestamo.setMensualidades(prestamo.getMensualidades());
                model.setPrestamo(prestamo);
                controller.pago(row);
                DontLbl.setText("Pago realizado!");
            }
            else{
                controller.pago(row);
                DontLbl.setText("Pago realizado!");
            }
        }
        else{
            DontLbl.setText("Mensualidad pagada!");
        }
    }//GEN-LAST:event_JButtonPagoActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewMensualidad().setVisible(true);
            }
        });
    }
    
    Prestamo prestamo;
    Mensualidad mensualidad;
    double amortizacion;
    double pago;
    int row;
    double monto;
    double tasa;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DontLbl;
    private javax.swing.JButton JButtonPago;
    private javax.swing.JTextField MontoPagoFdl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
