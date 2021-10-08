package sistema.presentation.cliente;

import java.util.List;
import java.util.Observable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import sistema.logic.Canton;
import sistema.logic.Cliente;
import sistema.logic.Distrito;
import sistema.logic.Provincia;

public class ViewCliente extends javax.swing.JFrame implements java.util.Observer{

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
        cliente = model.getCliente();
        provincias = model.getProvincias();
        cedula.setText(cliente.getCedula());
        nombre.setText(cliente.getNombre());
        if (cliente.getCedula().isEmpty()) {
            this.provincia = 0;
        }
        else {
        jTextFieldProvincia.setText(cliente.getProvincia().getNombre());
        jComboBoxCantones.setModel(new DefaultComboBoxModel(cliente.getProvincia().getCantones().toArray()));
        jComboBoxCantones.setSelectedItem(cliente.getCanton());
        jComboBoxDistritos.setModel(new DefaultComboBoxModel(cliente.getCanton().getDistritos().toArray()));
        jComboBoxDistritos.setSelectedItem(cliente.getDistrito());
        this.provincia = Integer.parseInt(cliente.getProvincia().getNumero());
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[provincia]));
        this.flag.setIcon(imageIcon);
        }
    }
    
    public ViewCliente() {
        initComponents();
        this.flag.setText("");
        this.MESSAGE = "No existe ninguna imagen que pueda ser mostrada...";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCedula = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelProvincia = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        flag = new javax.swing.JLabel();
        jButtonConsultar = new javax.swing.JButton();
        jLabelCanton = new javax.swing.JLabel();
        jLabelDistrito = new javax.swing.JLabel();
        jComboBoxCantones = new javax.swing.JComboBox<>();
        jComboBoxDistritos = new javax.swing.JComboBox<>();
        jButtonGuardar = new javax.swing.JButton();
        jButtonPrestamo = new javax.swing.JButton();
        jTextFieldProvincia = new javax.swing.JTextField();
        jLabelDont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLIENTE");
        setResizable(false);

        jLabelCedula.setText("Cedula");

        jLabelNombre.setText("Nombre");

        jLabelProvincia.setText("Provincia");

        flag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/0.jpg"))); // NOI18N
        flag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        flag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                flagMouseMoved(evt);
            }
        });
        flag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flagMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                flagMouseExited(evt);
            }
        });

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/consultarIcon.png"))); // NOI18N
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jLabelCanton.setText("Canton");

        jLabelDistrito.setText("Distrito");

        jComboBoxCantones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBoxCantones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCantonesActionPerformed(evt);
            }
        });

        jComboBoxDistritos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        jButtonGuardar.setForeground(new java.awt.Color(0, 102, 102));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/guardarIcon.png"))); // NOI18N
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/prestamoIcon.png"))); // NOI18N
        jButtonPrestamo.setEnabled(false);
        jButtonPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCanton)
                            .addComponent(jComboBoxCantones, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxDistritos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDistrito))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(flag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jButtonPrestamo)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCedula)
                            .addComponent(jLabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(cedula))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelDont, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGuardar)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonGuardar)
                                        .addGap(7, 7, 7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelDont, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProvincia)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCanton)
                                .addComponent(jLabelDistrito))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCedula)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxDistritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxCantones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(flag)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonPrestamo)
                        .addGap(81, 81, 81))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        controller.clienteGet(cedula.getText());
        if("".equals(cedula.getText())){
            jButtonPrestamo.setEnabled(false);
            this.provincia = 0;
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[provincia]));
            this.flag.setIcon(imageIcon);
            jTextFieldProvincia.setText("");
            jComboBoxDistritos.setSelectedIndex(-1);
            jComboBoxCantones.setSelectedIndex(-1);
        } else {
            jButtonPrestamo.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void flagMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagMouseMoved
       x = evt.getX();
       y = evt.getY();
        
        if (x >= xCrd[0] && x <= xCrd[1] && y >= yCrd[0] && y <= yCrd[1]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[1]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
                this.provincia = 1;
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if (x >= xCrd[2] && x <= xCrd[3] && y >= yCrd[2] && y <= yCrd[3]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[2]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
                this.provincia = 2;
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if (x >= xCrd[4] && x <= xCrd[5] && y >= yCrd[4] && y <= yCrd[5]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[3]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
                this.provincia = 3;
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if (x >= xCrd[6] && x <= xCrd[7] && y >= yCrd[6] && y <= yCrd[7]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[4]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
                this.provincia = 4;
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if (x >= xCrd[8] && x <= xCrd[9] && y >= yCrd[8] && y <= yCrd[9]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[5]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
                this.provincia = 5;
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if ((x >= xCrd[10] && x <= xCrd[11] && y >= yCrd[10] && y <= yCrd[11]) || (x >= xCrd[12] && x <= xCrd[13] && y >= yCrd[12] && y <= yCrd[13])) {
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[6]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
                this.provincia = 6;
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if ((x >= xCrd[14] && x <= xCrd[15] && y >= yCrd[14] && y <= yCrd[15]) || (x >= xCrd[16] && x <= xCrd[17] && y >= yCrd[16] && y <= yCrd[17])){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[7]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
                this.provincia = 7;
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else {
            provinciaSelected = 0;
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[this.provinciaSelected]));
            this.flag.setIcon(imageIcon);
        }
    }//GEN-LAST:event_flagMouseMoved

    private void flagMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagMouseExited
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[this.provinciaSelected]));
        this.flag.setIcon(imageIcon);
    }//GEN-LAST:event_flagMouseExited

    private void flagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagMouseClicked
        if(evt.getClickCount() == 1){
            provinciaSelected = provincia;
            provin = model.getProvincias().get(this.provinciaSelected - 1);
            jTextFieldProvincia.setText(provin.getNombre());
            cliente.setProvincia(provin);
            this.provincia = Integer.parseInt(provin.getNumero());
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[this.provinciaSelected]));
            this.flag.setIcon(imageIcon);
            jComboBoxCantones.setModel(new DefaultComboBoxModel(cliente.getProvincia().getCantones().toArray()));
            jComboBoxCantones.setSelectedItem(jComboBoxCantones.getSelectedItem());
            cliente.setCanton((Canton)jComboBoxCantones.getSelectedItem());
        }
    }//GEN-LAST:event_flagMouseClicked

    private void jComboBoxCantonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCantonesActionPerformed
        Canton c = (Canton) jComboBoxCantones.getModel().getSelectedItem();
        jComboBoxDistritos.setModel(new DefaultComboBoxModel(c.getDistritos().toArray()));
    }//GEN-LAST:event_jComboBoxCantonesActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (!"".equals(cedula.getText()) && !"".equals(nombre.getText()) && provin != null && jComboBoxCantones.getSelectedItem() != null && jComboBoxDistritos.getSelectedItem() != null) {
            controller.clienteAdd(new Cliente(cedula.getText(), nombre.getText(), provin, (Canton) jComboBoxCantones.getSelectedItem(), (Distrito) jComboBoxDistritos.getSelectedItem()));
            cedula.setText("");
            nombre.setText("");
            jLabelDont.setText("");
            jButtonPrestamo.setEnabled(false);
            this.provincia = 0;
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/" + this.imagenes[provincia]));
            this.flag.setIcon(imageIcon);
            jTextFieldProvincia.setText("");
            jComboBoxDistritos.setSelectedIndex(-1);
            jComboBoxCantones.setSelectedIndex(-1);
        } else if("".equals(cedula.getText()) || "".equals(nombre.getText()) || provin == null || jComboBoxCantones.getSelectedItem() == null || jComboBoxDistritos.getSelectedItem() == null) {
            jLabelDont.setText("Complete todos los campos!");
        }
//        if (controller.clienteGet(cedula.getText()) != null) {
//                Cliente clien = controller.clienteGet(cedula.getText());
//                clien.setNombre(nombre.getText());
//                clien.setProvincia(provin);
//                clien.setCanton((Canton) jComboBoxCantones.getSelectedItem());
//                clien.setDistrito((Distrito) jComboBoxDistritos.getSelectedItem());
//                controller.clienteEdit(clien);
//            }
//            else {
//                 
//            }
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProvinciaActionPerformed
        
    }//GEN-LAST:event_jTextFieldProvinciaActionPerformed

    private void jButtonPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamoActionPerformed
       controller.prestamosShow();
    }//GEN-LAST:event_jButtonPrestamoActionPerformed

    public static void main(String[] args) {
        ViewCliente ventana = new ViewCliente();
        ventana.setVisible(true);
    }
    
    private final String MESSAGE;
    public int provincia;
    public int provinciaSelected;
    
    Cliente cliente;
    Provincia provin;
    Canton canton;
    Distrito distrito;
    
    List<Provincia> provincias;
    List<Canton> cantones;
    List<Distrito> distritos;
    
    int x;
    int y;
    String[] imagenes = {"0.jpg", "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg"};
    int[] xCrd = {101, 129, 89, 124, 134, 171, 125, 142, 29, 74, 158, 201, 63, 91, 143, 170, 175, 206};
    int[] yCrd = {84, 106, 20, 85, 84, 105, 37, 70, 18, 85, 124, 180, 71, 108, 35, 79, 86, 123};
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel flag;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonPrestamo;
    private javax.swing.JComboBox<String> jComboBoxCantones;
    private javax.swing.JComboBox<String> jComboBoxDistritos;
    private javax.swing.JLabel jLabelCanton;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelDistrito;
    private javax.swing.JLabel jLabelDont;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelProvincia;
    private javax.swing.JTextField jTextFieldProvincia;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}