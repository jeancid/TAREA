/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import servicioBD.serviciodb;

/**
 *
 * @author cesar
 */
public class Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Proveedor
     */
    public Proveedor() {
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

        RutField = new javax.swing.JTextField();
        RutLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        TelefonoLabel = new javax.swing.JLabel();
        EmailLAbel = new javax.swing.JLabel();
        PaginaLabel = new javax.swing.JLabel();
        DireccionLabel = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        TelefonoField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        PaginaField = new javax.swing.JTextField();
        DireccionField = new javax.swing.JTextField();
        AtrasBoton = new javax.swing.JButton();
        Aceptarboton = new javax.swing.JButton();
        Limpiarbotn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RutLabel.setText("Rut proveedor");

        jLabel3.setText("Agregar Proveedor");

        NombreLabel.setText("Nombre");

        TelefonoLabel.setText("Telefono");

        EmailLAbel.setText("Email");

        PaginaLabel.setText("Página web");

        DireccionLabel.setText("Dirección");

        AtrasBoton.setText("Atras");
        AtrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBotonActionPerformed(evt);
            }
        });

        Aceptarboton.setText("Aceptar");
        Aceptarboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarbotonMouseClicked(evt);
            }
        });
        Aceptarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarbotonActionPerformed(evt);
            }
        });

        Limpiarbotn.setText("Limpiar");
        Limpiarbotn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarbotnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RutLabel)
                            .addComponent(NombreLabel)
                            .addComponent(TelefonoLabel)
                            .addComponent(EmailLAbel)
                            .addComponent(PaginaLabel)
                            .addComponent(DireccionLabel))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RutField)
                            .addComponent(NombreField)
                            .addComponent(TelefonoField)
                            .addComponent(EmailField)
                            .addComponent(PaginaField)
                            .addComponent(DireccionField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AtrasBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(Limpiarbotn)
                        .addGap(92, 92, 92)
                        .addComponent(Aceptarboton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RutField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(RutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoLabel)
                    .addComponent(TelefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLAbel)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaginaLabel)
                    .addComponent(PaginaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DireccionLabel)
                    .addComponent(DireccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtrasBoton)
                    .addComponent(Aceptarboton)
                    .addComponent(Limpiarbotn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarbotnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarbotnActionPerformed
        this.RutField.setText("");                // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarbotnActionPerformed

    private void AtrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBotonActionPerformed
        Sistema sistema=new Sistema();
        sistema.setVisible(true);
        sistema.setLocationRelativeTo(null);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_AtrasBotonActionPerformed

    private void AceptarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarbotonActionPerformed
        modell.Proveedor proveedor = new modell.Proveedor();
        Integer rut=Integer.parseInt(this.RutField.getText());
        proveedor.setId_rut(rut);
        serviciodb serv = new serviciodb();
        serv.setProveedor(proveedor);
                // TODO add your handling code here:
    }//GEN-LAST:event_AceptarbotonActionPerformed

    private void AceptarbotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarbotonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarbotonMouseClicked

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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptarboton;
    private javax.swing.JButton AtrasBoton;
    private javax.swing.JTextField DireccionField;
    private javax.swing.JLabel DireccionLabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLAbel;
    private javax.swing.JButton Limpiarbotn;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField PaginaField;
    private javax.swing.JLabel PaginaLabel;
    private javax.swing.JTextField RutField;
    private javax.swing.JLabel RutLabel;
    private javax.swing.JTextField TelefonoField;
    private javax.swing.JLabel TelefonoLabel;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
