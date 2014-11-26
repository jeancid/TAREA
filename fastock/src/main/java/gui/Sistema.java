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
        UsuarioLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CerrarMenu = new javax.swing.JMenuItem();
        SalirMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ConsultaprodMenu = new javax.swing.JMenuItem();
        ConsultaProveMenu = new javax.swing.JMenuItem();
        VentaMenu = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 5, true));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setText("Fastock!!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 255)));

        jMenu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 3, true));
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

        jMenu3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 3, true));
        jMenu3.setText("Mantención");

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

        jMenuBar1.add(jMenu3);

        VentaMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 3, true));
        VentaMenu.setText("Realizar Venta");
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

        jMenu4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 3, true));
        jMenu4.setText("Consultar Ventas");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(FechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(UsuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(13, 13, 13))))
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

    private void ConsultaprodMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaprodMenuActionPerformed
         Consultaproductos consultaproductos=new Consultaproductos();
         String Usuario=this.UsuarioLabel.getText();
         Consultaproductos.UsuarioLabel.setText(Usuario);
         consultaproductos.setVisible(true);
         consultaproductos.setLocationRelativeTo(null);
         this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ConsultaprodMenuActionPerformed

    private void ConsultaProveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaProveMenuActionPerformed
         Consultaproveedor consultaproveedor=new Consultaproveedor();
         String Usuario=this.UsuarioLabel.getText();
         Consultaproveedor.UsuarioLabel.setText(Usuario);
         consultaproveedor.setVisible(true);
         consultaproveedor.setLocationRelativeTo(null); 
         this.dispose(); 
// TODO add your handling code here:
    }//GEN-LAST:event_ConsultaProveMenuActionPerformed

    private void VentaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaMenuActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_VentaMenuActionPerformed

    private void VentaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentaMenuMouseClicked
   
        Venta venta=new Venta();
        String Usuario=this.UsuarioLabel.getText();
        Venta.NombreLabel.setText(Usuario);
          venta.setVisible(true);
          venta.setLocationRelativeTo(null);
          this.dispose();
      
    }//GEN-LAST:event_VentaMenuMouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
       VentasTotales ventas= new VentasTotales();
      ventas.setVisible(true);
      ventas.setLocationRelativeTo(null);
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MouseClicked

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
    private javax.swing.JMenuItem CerrarMenu;
    private javax.swing.JMenuItem ConsultaProveMenu;
    private javax.swing.JMenuItem ConsultaprodMenu;
    private javax.swing.JLabel FechaLabel;
    private javax.swing.JMenuItem SalirMenu;
    public static javax.swing.JLabel UsuarioLabel;
    private javax.swing.JMenu VentaMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
