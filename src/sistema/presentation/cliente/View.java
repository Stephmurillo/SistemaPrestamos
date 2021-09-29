/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentation.cliente;

import java.lang.reflect.Array;
import java.util.Observable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import sistema.logic.Cliente;

/**
 *
 * @author muril
 */
public class View extends javax.swing.JFrame implements java.util.Observer{

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
        Cliente cliente = model.getCliente();
        cedula.setText(cliente.getCedula());
        nombre.setText(cliente.getNombre());
        //TODO: hacer que los dropbo de canton y distrito muestren el valor correcto
        if (cliente.getCedula().isEmpty()) {
            this.provincia = 0;
        }
        else {
        jComboBoxProvincias.setModel(new DefaultComboBoxModel(model.getProvincias().toArray()));
        jComboBoxProvincias.setSelectedItem(cliente.getProvincia().toString());
        jComboBoxCantones.setModel(new DefaultComboBoxModel(cliente.getProvincia().getCantones().toArray()));
        jComboBoxCantones.setSelectedItem(cliente.getCanton());
        jComboBoxDistritos.setModel(new DefaultComboBoxModel(cliente.getCanton().getDistritos().toArray()));
        jComboBoxDistritos.setSelectedItem(cliente.getDistrito());
            this.provincia = Integer.parseInt(cliente.getCedula().substring(0, 1));
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[provincia]));
            this.flag.setIcon(imageIcon);
        }
    }
    
    public View() {
        initComponents();
        this.flag.setText("");
        this.MESSAGE = "No existe ninguna imagen que pueda ser mostrada...";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jComboBoxProvincias = new javax.swing.JComboBox<>();
        jLabelCanton = new javax.swing.JLabel();
        jLabelDistrito = new javax.swing.JLabel();
        jComboBoxCantones = new javax.swing.JComboBox<>();
        jComboBoxDistritos = new javax.swing.JComboBox<>();
        jButtonGuardar = new javax.swing.JButton();
        jButtonPrestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema");

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

        jComboBoxProvincias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProvinciasActionPerformed(evt);
            }
        });

        jLabelCanton.setText("Canton");

        jLabelDistrito.setText("Distrito");

        jComboBoxCantones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCantones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCantonesActionPerformed(evt);
            }
        });

        jComboBoxDistritos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonGuardar.setForeground(new java.awt.Color(0, 102, 102));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/guardarIcon.png"))); // NOI18N

        jButtonPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/prestamoIcon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabelCanton)
                                .addGap(73, 73, 73)
                                .addComponent(jLabelDistrito))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxCantones, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxDistritos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(flag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCedula)
                                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelProvincia)
                                    .addComponent(jLabelCanton)
                                    .addComponent(jLabelDistrito)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGuardar))))
                    .addComponent(jButtonConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCantones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDistritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void flagMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagMouseMoved
       x = evt.getX();
       y = evt.getY();
        
        if (x >= xCrd[0] && x <= xCrd[1] && y >= yCrd[0] && y <= yCrd[1]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[1]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if (x >= xCrd[2] && x <= xCrd[3] && y >= yCrd[2] && y <= yCrd[3]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[2]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if (x >= xCrd[4] && x <= xCrd[5] && y >= yCrd[4] && y <= yCrd[5]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[3]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if (x >= xCrd[6] && x <= xCrd[7] && y >= yCrd[6] && y <= yCrd[7]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[4]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if (x >= xCrd[8] && x <= xCrd[9] && y >= yCrd[8] && y <= yCrd[9]){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[5]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if ((x >= xCrd[10] && x <= xCrd[11] && y >= yCrd[10] && y <= yCrd[11]) || (x >= xCrd[12] && x <= xCrd[13] && y >= yCrd[12] && y <= yCrd[13])) {
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[6]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
            } else {
                this.flag.setText(MESSAGE);
            }  
        } else if ((x >= xCrd[14] && x <= xCrd[15] && y >= yCrd[14] && y <= yCrd[15]) || (x >= xCrd[16] && x <= xCrd[17] && y >= yCrd[16] && y <= yCrd[17])){
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[7]));
            if (imageIcon != null) {
                this.flag.setIcon(imageIcon);
            } else {
                this.flag.setText(MESSAGE);
            }  
        }
    }//GEN-LAST:event_flagMouseMoved

    private void flagMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagMouseExited
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/flags/"+ this.imagenes[provincia]));
        this.flag.setIcon(imageIcon);
    }//GEN-LAST:event_flagMouseExited

    private void flagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_flagMouseClicked

    private void jComboBoxProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasActionPerformed
       
    }//GEN-LAST:event_jComboBoxProvinciasActionPerformed

    private void jComboBoxCantonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCantonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCantonesActionPerformed

    public static void main(String[] args) {
        // TODO code application logic here
      View ventana = new View();
      ventana.setVisible(true);
    }
    
    private String MESSAGE;
    public int provincia;
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
    private javax.swing.JComboBox<String> jComboBoxProvincias;
    private javax.swing.JLabel jLabelCanton;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelDistrito;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelProvincia;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
