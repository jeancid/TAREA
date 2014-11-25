/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jean
 */
public class Sistema extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public Sistema() {
        initComponents();
        this.FechaLabel.setText(fechaActual());
    }
       public static String fechaActual(){
     
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FechaLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CerrarMenu = new javax.swing.JMenuItem();
        SalirMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        AgregarProveeMenu = new javax.swing.JMenuItem();
        ActualizarStockMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ConsultaprodMenu = new javax.swing.JMenuItem();
        ConsultaProveMenu = new javax.swing.JMenuItem();
        ConsultaVentaMenu = new javax.swing.JMenuItem();
        VentaMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Sistema");

        CerrarMenu.setText("Cerrar sesion");
        CerrarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarMenuActionPerformed(evt);
            }
        });
        jMenu1.add(CerrarMenu);

        SalirMenu.setText("Salir");
        SalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenuActionPerformed(evt);
            }
        });
        jMenu1.add(SalirMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantencion");

        jMenuItem1.setText("Agregar producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        AgregarProveeMenu.setText("Agregar proveedor");
        AgregarProveeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProveeMenuActionPerformed(evt);
            }
        });
        jMenu2.add(AgregarProveeMenu);

        ActualizarStockMenu.setText("Actualizar stock");
        ActualizarStockMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarStockMenuActionPerformed(evt);
            }
        });
        jMenu2.add(ActualizarStockMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        ConsultaprodMenu.setText("Productos");
        ConsultaprodMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaprodMenuActionPerformed(evt);
            }
        });
        jMenu3.add(ConsultaprodMenu);

        ConsultaProveMenu.setText("Proveedores");
        ConsultaProveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaProveMenuActionPerformed(evt);
            }
        });
        jMenu3.add(ConsultaProveMenu);

        ConsultaVentaMenu.setText("Venta");
        jMenu3.add(ConsultaVentaMenu);

        jMenuBar1.add(jMenu3);

        VentaMenu.setText("Venta");
        VentaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentaMenuMouseClicked(evt);
            }
        });
        VentaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(VentaMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(FechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(FechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarMenuActionPerformed
        Loginn loginn=new Loginn();
        loginn.setVisible(true);
        loginn.setLocationRelativeTo(null);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMenuActionPerformed

    private void SalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuActionPerformed
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_SalirMenuActionPerformed

    private void AgregarProveeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProveeMenuActionPerformed
        Proveedor proveedor=new Proveedor();
        proveedor.setVisible(true);
        proveedor.setLocationRelativeTo(null);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_AgregarProveeMenuActionPerformed

    private void ActualizarStockMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarStockMenuActionPerformed
         Actualizar_stock actualizar_stock=new Actualizar_stock();
         actualizar_stock.setVisible(true);
         actualizar_stock.setLocationRelativeTo(null);
         this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ActualizarStockMenuActionPerformed

    private void ConsultaprodMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaprodMenuActionPerformed
         Consultaproductos consultaproductos=new Consultaproductos();
         consultaproductos.setVisible(true);
         consultaproductos.setLocationRelativeTo(null);
         this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ConsultaprodMenuActionPerformed

    private void ConsultaProveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaProveMenuActionPerformed
         Consultaproveedor consultaproveedor=new Consultaproveedor();
         consultaproveedor.setVisible(true);
         consultaproveedor.setLocationRelativeTo(null); 
         this.dispose(); 
// TODO add your handling code here:
    }//GEN-LAST:event_ConsultaProveMenuActionPerformed

    private void VentaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaMenuActionPerformed
         Venta venta=new Venta();
         venta.setVisible(true);
         venta.setLocationRelativeTo(null);
         this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_VentaMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          Productos producto=new Productos();
          producto.setVisible(true);
          producto.setLocationRelativeTo(null);
          this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void VentaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentaMenuMouseClicked
          Venta venta=new Venta();
          venta.setVisible(true);
          venta.setLocationRelativeTo(null);
          this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_VentaMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ActualizarStockMenu;
    private javax.swing.JMenuItem AgregarProveeMenu;
    private javax.swing.JMenuItem CerrarMenu;
    private javax.swing.JMenuItem ConsultaProveMenu;
    private javax.swing.JMenuItem ConsultaVentaMenu;
    private javax.swing.JMenuItem ConsultaprodMenu;
    private javax.swing.JLabel FechaLabel;
    private javax.swing.JMenuItem SalirMenu;
    private javax.swing.JMenu VentaMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
