/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import modell.Producto;

/**
 *
 * @author jeanc_000
 */
public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();
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
        CodigoFiel = new javax.swing.JTextField();
        CodigoLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        CategoriaLabel = new javax.swing.JLabel();
        PrecioLabel = new javax.swing.JLabel();
        RutLabel = new javax.swing.JLabel();
        NombreFiel = new javax.swing.JTextField();
        CategoriaFiel = new javax.swing.JTextField();
        PrecioFiel = new javax.swing.JTextField();
        RutFiel = new javax.swing.JTextField();
        AtrasButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();
        LimpiarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AGREGAR PRODUCTO");

        CodigoFiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoFielActionPerformed(evt);
            }
        });

        CodigoLabel.setText("Codigo de barra");

        NombreLabel.setText("Nombre");

        CategoriaLabel.setText("Categoria");

        PrecioLabel.setText("Precio");

        RutLabel.setText("Rut proveedor");

        NombreFiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFielActionPerformed(evt);
            }
        });

        AtrasButton.setText("ATRAS");
        AtrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasButtonActionPerformed(evt);
            }
        });

        AceptarButton.setText("ACEPTAR");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        LimpiarButton.setText("LIMPIAR");
        LimpiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodigoLabel)
                                    .addComponent(NombreLabel)
                                    .addComponent(CategoriaLabel)
                                    .addComponent(PrecioLabel)
                                    .addComponent(RutLabel))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CodigoFiel)
                                    .addComponent(NombreFiel)
                                    .addComponent(CategoriaFiel)
                                    .addComponent(PrecioFiel)
                                    .addComponent(RutFiel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AtrasButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(LimpiarButton)
                        .addGap(84, 84, 84)))
                .addComponent(AceptarButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoFiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreFiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoriaLabel)
                    .addComponent(CategoriaFiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrecioLabel)
                    .addComponent(PrecioFiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RutLabel)
                    .addComponent(RutFiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtrasButton)
                    .addComponent(AceptarButton)
                    .addComponent(LimpiarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoFielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoFielActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoFielActionPerformed

    private void NombreFielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFielActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFielActionPerformed

    private void LimpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarButtonActionPerformed

        this.NombreFiel.setText("");
        this.CodigoFiel.setText("");
        this.CategoriaFiel.setText("");
        this.PrecioFiel.setText("");
        this.RutFiel.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarButtonActionPerformed

    private void AtrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasButtonActionPerformed

        Sistema sistema = new Sistema();
        sistema.setVisible(true);
        sistema.setLocationRelativeTo(null);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasButtonActionPerformed

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        if (this.CodigoFiel.getText().equals("") || this.NombreFiel.getText().equals("")|| 
                this.PrecioFiel.getText().equals("") || this.RutFiel.getText().equals("")
                || this.CategoriaFiel.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe llenar todos los campos");
        } else{
        Producto producto= new Producto();
        producto.setId_barra(this.CodigoFiel.getText());
        String Precioaux;Integer precioreal;
            Precioaux = this.CodigoFiel.getText();
        try{
        	precioreal=Integer.parseInt(Precioaux);
    	}catch(NumberFormatException ex){
        	System.out.println("No es un número");
    	}
        producto.setPrecio(precioreal);
        producto.setNombre(this.NombreFiel.getText());
        String Rutaux;Integer Rutreal;
            Rutaux=this.RutFiel.getText();
        try{
        	Rutreal=Integer.parseInt(Rutaux);
    	}catch(NumberFormatException ex){
        	System.out.println("No es un número");
    	}
     //   producto.setproveedor_id_rut(Rutreal);
        producto.setCategoria(this.CategoriaFiel.getText());
    //     statement.execute("insert into TProducto values('"+codProducto+"','"+nombre+"','"+precioCompra+"','"+precioVenta+"','"+fechaVencimiento+"','"+cantidad+"')");
          
            JOptionPane.showMessageDialog(this, "Datos ingresados correctamente");
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarButtonActionPerformed
 }
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JButton AtrasButton;
    private javax.swing.JTextField CategoriaFiel;
    private javax.swing.JLabel CategoriaLabel;
    private javax.swing.JTextField CodigoFiel;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JButton LimpiarButton;
    private javax.swing.JTextField NombreFiel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField PrecioFiel;
    private javax.swing.JLabel PrecioLabel;
    private javax.swing.JTextField RutFiel;
    private javax.swing.JLabel RutLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
