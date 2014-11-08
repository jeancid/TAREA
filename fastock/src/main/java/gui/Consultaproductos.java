/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modell.Producto;
import servicioBD.serviciodb;

/**
 *
 * @author jean
 */
public class Consultaproductos extends javax.swing.JFrame {

    /**
     * Creates new form Consultaproductos
     */
    
      public Consultaproductos() {
        initComponents();
        mostrardatos();
        
    }
      
     void Limpiar(){
        this.CodigoField.setText("");
        this.NombreField.setText("");
        this.PrecioField.setText("");
        this.ProveedorField.setText("");
        this.CantidadField.setText("");
    }
     
    void mostrardatos(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        serviciodb serv = new serviciodb();
        productos=serv.getProduto();
        
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Precio");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
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
            datos[5]=producto1.getProveedor_id_rut().toString();
            modelo.addRow(datos);
        
        }
        ProductoTable.setModel(modelo);
        
     
     
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductoTable = new javax.swing.JTable();
        Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BuscarField = new javax.swing.JTextField();
        BuscarButton = new javax.swing.JButton();
        AtrasBoton = new javax.swing.JButton();
        CodigoLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        PrecioLabel = new javax.swing.JLabel();
        CategoriaLabel = new javax.swing.JLabel();
        ProveedorLabel = new javax.swing.JLabel();
        CantidadLabel = new javax.swing.JLabel();
        CantidadField = new javax.swing.JTextField();
        ProveedorField = new javax.swing.JTextField();
        CategoriaBox = new javax.swing.JComboBox();
        PrecioField = new javax.swing.JTextField();
        NombreField = new javax.swing.JTextField();
        CodigoField = new javax.swing.JTextField();
        ActualizarBoton = new javax.swing.JButton();
        EliminarBoton = new javax.swing.JButton();
        NuevoBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUCTOS"));
        jPanel1.setName(""); // NOI18N

        ProductoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ProductoTable);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar producto");

        BuscarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFieldActionPerformed(evt);
            }
        });

        BuscarButton.setText("BUSCAR");

        AtrasBoton.setText("Volver al menú principal");
        AtrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBotonActionPerformed(evt);
            }
        });

        CodigoLabel.setText("Código de barra");

        NombreLabel.setText("Nombre");

        PrecioLabel.setText("Precio");

        CategoriaLabel.setText("Categoría");

        ProveedorLabel.setText("Proveedor");

        CantidadLabel.setText("Cantidad");

        CantidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadFieldActionPerformed(evt);
            }
        });

        CategoriaBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Liquidos", "Confites", "Abarrotes", "Fiambres" }));
        CategoriaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaBoxActionPerformed(evt);
            }
        });

        NombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFieldActionPerformed(evt);
            }
        });

        ActualizarBoton.setText("Actualizar");
        ActualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonActionPerformed(evt);
            }
        });

        EliminarBoton.setText("Eliminar");

        NuevoBoton.setText("Nuevo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(NuevoBoton)
                                .addGap(18, 18, 18)
                                .addComponent(EliminarBoton)
                                .addGap(18, 18, 18)
                                .addComponent(ActualizarBoton)
                                .addGap(18, 18, 18)
                                .addComponent(Guardar))
                            .addComponent(AtrasBoton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BuscarField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BuscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProveedorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CodigoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrecioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CantidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoriaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProveedorField)
                            .addComponent(CodigoField)
                            .addComponent(NombreField)
                            .addComponent(PrecioField)
                            .addComponent(CategoriaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CantidadField))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ProveedorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(PrecioLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CategoriaLabel)
                        .addGap(14, 14, 14)
                        .addComponent(CantidadLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ProveedorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(CategoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EliminarBoton)
                        .addComponent(NuevoBoton)
                        .addComponent(ActualizarBoton)))
                .addGap(18, 18, 18)
                .addComponent(AtrasBoton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonActionPerformed
        mostrardatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarBotonActionPerformed

    private void NombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFieldActionPerformed

    private void CategoriaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaBoxActionPerformed

    private void CantidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadFieldActionPerformed

    private void AtrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBotonActionPerformed
        Sistema sistema = new Sistema();
        sistema.setVisible(true);
        sistema.setLocationRelativeTo(null);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasBotonActionPerformed

    private void BuscarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarFieldActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Producto producto= new Producto();
        String codigo= this.CodigoField.getText();
        Integer precio= Integer.parseInt(this.PrecioField.getText());
        String nombre =this.NombreField.getText();
        Integer cantidad= Integer.parseInt(this.CantidadField.getText());
        Integer proveedorid= Integer.parseInt(this.ProveedorField.getText());
        String categoria = this.CategoriaBox.getSelectedItem().toString();
        producto.setId_barra(codigo);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
        producto.setProveedor_id_rut(proveedorid);
        producto.setCategoria(categoria);
        serviciodb serv = new serviciodb();
        boolean pregunta = serv.setProducto(producto);
        if(pregunta==true){
            JOptionPane.showMessageDialog(rootPane, "Fue guardado con exito");
            Limpiar();
        }else
        JOptionPane.showMessageDialog(rootPane,"Ocurrio algun error");
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultaproductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBoton;
    private javax.swing.JButton AtrasBoton;
    private javax.swing.JButton BuscarButton;
    private javax.swing.JTextField BuscarField;
    private javax.swing.JTextField CantidadField;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JComboBox CategoriaBox;
    private javax.swing.JLabel CategoriaLabel;
    private javax.swing.JTextField CodigoField;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JButton EliminarBoton;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JButton NuevoBoton;
    private javax.swing.JTextField PrecioField;
    private javax.swing.JLabel PrecioLabel;
    private javax.swing.JTable ProductoTable;
    private javax.swing.JTextField ProveedorField;
    private javax.swing.JLabel ProveedorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
