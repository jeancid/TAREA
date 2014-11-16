/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modell.Proveedor;
import servicioBD.serviciodb;

/**
 *
 * @author jean
 */
public class Consultaproveedor extends javax.swing.JFrame {

    /**
     * Creates new form Consultaproveedor
     */
    public Consultaproveedor() {
        initComponents();
    }
    
    void mostrardatos(){
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        serviciodb serv = new serviciodb();
        proveedores = serv.getProveedor();
                
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Rut");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Pagina web");
        modelo.addColumn("Direccion");
        ProveedorTable.setModel(modelo);
        
        String []datos=new String[6];
        Iterator<Proveedor> ite=proveedores.iterator();
        while(ite.hasNext()){
        Proveedor proveedor1= ite.next();
            datos[0]=proveedor1.getId_rut().toString();
            datos[1]=proveedor1.getNombre();
            datos[2]=proveedor1.getTelefono().toString();
            datos[3]=proveedor1.getEmail();
            datos[4]=proveedor1.getPaginaweb();
            datos[5]=proveedor1.getDireccion();
            
            modelo.addRow(datos);
        
        }
        ProveedorTable.setModel(modelo);
        
     
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConsultaproveLabel = new javax.swing.JLabel();
        buscarLabel = new javax.swing.JLabel();
        BuscarField = new javax.swing.JTextField();
        BuscarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProveedorTable = new javax.swing.JTable();
        AtrasButton = new javax.swing.JButton();
        MostrarLabel = new javax.swing.JLabel();
        AceptarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ConsultaproveLabel.setText("CONSULTA DE PROVEEDOR");

        buscarLabel.setText("Buscar Proveedor por nombre");

        BuscarButton.setText("BUSCAR");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        ProveedorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ProveedorTable);

        AtrasButton.setText("ATRAS");
        AtrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasButtonActionPerformed(evt);
            }
        });

        MostrarLabel.setText("Mostrar todos los proveedores");

        AceptarButton.setText("ACEPTAR");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AtrasButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MostrarLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AceptarButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buscarLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(BuscarButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ConsultaproveLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsultaproveLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarLabel)
                    .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarButton)
                    .addComponent(MostrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtrasButton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasButtonActionPerformed
        Sistema sistema = new Sistema();
        sistema.setVisible(true);
        sistema.setLocationRelativeTo(null);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasButtonActionPerformed

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        mostrardatos();// TODO add your handling code here:
    }//GEN-LAST:event_AceptarButtonActionPerformed

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        modell.Proveedor proveedor1 = new modell.Proveedor();
        serviciodb serv = new serviciodb();
        String nombrepro= this.BuscarField.getText();
        proveedor1 = serv.getBuscarProveedor(nombrepro);
      
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Rut");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Pagina web");
        modelo.addColumn("Direccion");
        ProveedorTable.setModel(modelo);   
        
        String []datos=new String[6];
        // al ingresar proveedor, nombre nunca puede ser null!!!
        //if(proveedor1.getNombre().equals(null)==false){ //condicionar si es null o no
            datos[0]=proveedor1.getId_rut().toString();
            datos[1]=proveedor1.getNombre();
            datos[2]=proveedor1.getTelefono().toString();
            datos[3]=proveedor1.getEmail();
            datos[4]=proveedor1.getPaginaweb();
            datos[5]=proveedor1.getDireccion();
            modelo.addRow(datos);
        
        
        
        //else JOptionPane.showMessageDialog(rootPane, "No existen datos para el proveedor");
                  
        ProveedorTable.setModel(modelo);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultaproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultaproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultaproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultaproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultaproveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JButton AtrasButton;
    private javax.swing.JButton BuscarButton;
    private javax.swing.JTextField BuscarField;
    private javax.swing.JLabel ConsultaproveLabel;
    private javax.swing.JLabel MostrarLabel;
    private javax.swing.JTable ProveedorTable;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
