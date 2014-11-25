/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modell.Producto;
import servicioBD.serviciodb;

/**
 *
 * @author jean
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    void MostrarDatos(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        serviciodb serv = new serviciodb();
        productos=serv.getProduto();
        modell.Proveedor Proveedor;
        
        DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Precio");
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Categoria");
            modelo.addColumn("proveedor");
            ProductoTable.setModel(modelo);
        String []datos=new String[6];
        Iterator<Producto> ite=productos.iterator();
        while(ite.hasNext()){
        Producto producto1= ite.next();
            datos[0]=producto1.getId_barra();
            datos[1]=producto1.getPrecio().toString();
            datos[2]=producto1.getNombre();
            datos[3]=producto1.getCantidad().toString();
            datos[4]=producto1.getCategoria();
            Proveedor=serv.getBuscarProveedor(producto1.getProveedor_id_rut());
            datos[5]= Proveedor.getNombre();
            modelo.addRow(datos);
                            }
        ProductoTable.setModel(modelo);
    }
    public Buscar() {
        initComponents();
        MostrarDatos();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductoTable = new javax.swing.JTable();
        AtrasButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productoLabel.setText("producto");

        ProductoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ProductoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductoTable);

        AtrasButton.setText("Atras");
        AtrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasButtonActionPerformed(evt);
            }
        });

        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productoLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AtrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtrasButton)
                    .addComponent(AceptarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoTableMouseClicked

    private void AtrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasButtonActionPerformed
      dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasButtonActionPerformed

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed

       int fila=ProductoTable.getSelectedRow();
       String codig;
       codig=ProductoTable.getValueAt(fila,0).toString();
       Venta.codigoField.setText(codig);
       dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_AceptarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JButton AtrasButton;
    private javax.swing.JTable ProductoTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel productoLabel;
    // End of variables declaration//GEN-END:variables
}
