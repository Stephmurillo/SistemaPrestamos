/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentation.patron;

import java.io.IOException;
import java.util.Observable;
import javax.imageio.ImageIO;
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
        
        if (cliente.getCedula().isEmpty()) {
            this.provincia = 0;
        }
        else {
            //this.provincia = Integer.parseInt(cliente.getProvincia().getNumero());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        flag = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema");

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Provincia");

        flag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/patron/0.jpg"))); // NOI18N
        flag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        flag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                flagMouseMoved(evt);
            }
        });

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/consultarIcon.jpg"))); // NOI18N
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(flag, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flag, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        controller.clienteGet(cedula.getText());
    }//GEN-LAST:event_consultarActionPerformed

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
    int[] xCrd = {407, 522, 350, 501, 564, 674, 502, 574, 100, 328, 632, 800, 245, 378, 573, 676, 692, 800};
    int[] yCrd = {340, 416, 70, 260, 325, 438, 148, 288, 144, 160, 480, 670, 294, 420, 150, 332, 151, 489};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel flag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
