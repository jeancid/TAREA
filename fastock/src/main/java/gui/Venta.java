/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modell.Producto;
import servicioBD.serviciodb;

/**
 *
 * @author jeanc_000
 */
public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form Venta
     */
      ArrayList<Producto>productosventa=new ArrayList<Producto>();
     
    public Venta() {
        initComponents();
        MostrarDatos(productosventa);
        FechaLabel.setText(fechaActual());
    }
    
    public static String fechaActual(){
     
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    public void Nletras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                    JOptionPane.showMessageDialog(rootPane,"Ingresa solo numeros");
                }
            }
        });
    }
       void Total(ArrayList<Producto>productos){
        Iterator<Producto> ite=productos.iterator();
        Integer total=0;
        while(ite.hasNext()){
        Producto producto2=ite.next();
        Integer totalaux=0;
        totalaux=producto2.getCantidad()*producto2.getPrecio();
        total=total+totalaux;
        }
        this.TotalField.setText(total.toString());
    
    }
    void MostrarDatos(ArrayList<Producto>productos){
              
        DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Precio");
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");       
        String []datos=new String[5];
        Iterator<Producto> ite=productos.iterator();
        while(ite.hasNext()){
        Producto producto1= ite.next();
            datos[0]=producto1.getId_barra();
            datos[1]=producto1.getPrecio().toString();
            datos[2]=producto1.getNombre();
            datos[3]=producto1.getCantidad().toString();
            modelo.addRow(datos);
                            }
        ventaTable.setModel(modelo);
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
        jLabel2 = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        cobrarButton = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        agregarButton = new javax.swing.JButton();
        borrarButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ventaTable = new javax.swing.JTable();
        codigoField = new javax.swing.JTextField();
        cantidadField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TotalField = new javax.swing.JTextField();
        FechaLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("VENTA DE PRODUCTOS");

        cancelarButton.setText("CANCELAR");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        cobrarButton.setText("COBRAR");
        cobrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarButtonActionPerformed(evt);
            }
        });

        atrasButton.setText("ATRAS");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        agregarButton.setText("AGREGAR");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        borrarButton.setText("BORRAR");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });

        buscarButton.setText("BUSCAR");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("TOTAL");

        ventaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(ventaTable);

        codigoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoFieldKeyTyped(evt);
            }
        });

        cantidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadFieldActionPerformed(evt);
            }
        });
        cantidadField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("CODIGO");

        jLabel4.setText("CANTIDAD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(TotalField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelarButton)
                                .addGap(18, 18, 18)
                                .addComponent(cobrarButton)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(atrasButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(atrasButton)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarButton)
                            .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarButton)
                            .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrarButton)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(TotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cobrarButton)
                                    .addComponent(cancelarButton))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel5.setText("Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(FechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void LimpiarTabla(){
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("Codigo");
    modelo.addColumn("Precio");
    modelo.addColumn("Nombre");
    modelo.addColumn("Cantidad");
    ventaTable.setModel(modelo);
    productosventa.clear();
    Total(productosventa);
    
    }  
    void MostrarDatos(Producto productos,int cantidad){
        
        DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Precio");
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
           
            ventaTable.setModel(modelo);
            String []datos=new String[5];
                
   
            datos[0]=productos.getId_barra();
            datos[1]=productos.getPrecio().toString();
            datos[2]=productos.getNombre();
            datos[3]=productos.getCantidad().toString(cantidad);
                                          
           
            modelo.addRow(datos);     
            ventaTable.setModel(modelo);
            
            }
         

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
 
        LimpiarTabla();
    // TODO add your handling code here:
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void cantidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadFieldActionPerformed
    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        Sistema sistema = new Sistema();
        sistema.setVisible(true);
        sistema.setLocationRelativeTo(null);
        String nombre=(this.NombreLabel.getText());
        Sistema.UsuarioLabel.setText(nombre);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
       int fila=ventaTable.getSelectedRow();
       String codig;
       codig=ventaTable.getValueAt(fila,0).toString();
       Iterator<Producto>ite= productosventa.iterator();
       if(fila>=0){
       while(ite.hasNext()){
           Producto productoaux=ite.next();
           if(productoaux.getId_barra().equals(codig)){
           productosventa.remove(productoaux);
           Total(productosventa);
           break;
       }
       }
       }
       else
         JOptionPane.showMessageDialog(null,"No a seleccionado fila");

        MostrarDatos(productosventa);
        this.codigoField.setText("");
        this.cantidadField.setText("");
        Total(productosventa);
    // TODO add your handling code here:
    }//GEN-LAST:event_borrarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
if(codigoField.getText().trim().length()==0 || cantidadField.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "Complete todos los campos");
 }
 else
 {
       
         Producto producto = new Producto();      
        serviciodb serv = new serviciodb();
        String codigo= this.codigoField.getText();
        Iterator<Producto>ite= productosventa.iterator();
        Integer cantidad=Integer.parseInt(this.cantidadField.getText());
        if(productosventa.isEmpty()){
        producto=serv.getBuscarProductocod(codigo);
        producto.setCantidad(cantidad);
        productosventa.add(producto);
        }
        else{
            int cont=0;        
            while(ite.hasNext())
            { 
            Producto productoaux=ite.next();
            String CodigoAux=productoaux.getId_barra();
            if(CodigoAux.equals(codigo))
            {
                         Integer cant=0,aux1=0;
                         cont=1;
                         cant=productoaux.getCantidad();
                         aux1=cantidad+cant;
                         productoaux.setCantidad(aux1);
             }
             }
            if(cont==1)
              cont=0;        
            else
            {
                producto=serv.getBuscarProductocod(codigo);
                producto.setCantidad(cantidad);
                productosventa.add(producto);
            }
        }
        MostrarDatos(productosventa);
        this.codigoField.setText("");   
        this.cantidadField.setText("");
        Total(productosventa);// TODO add your handling code here:
    }//GEN-LAST:event_agregarButtonActionPerformed
    }  
    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
         Buscar buscar= new Buscar();
         buscar.setVisible(true);
         buscar.setLocationRelativeTo(null);
// TODO add your handling code here:
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void cobrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrarButtonActionPerformed
    Pago pago=new Pago();
    pago.setVisible(true);
    pago.setLocationRelativeTo(null);
    serviciodb serv = new serviciodb(); 
    
    Iterator<Producto>ite= productosventa.iterator();
    while(ite.hasNext())
    {
    Producto producaux=ite.next();
    String sql=producaux.getId_barra();
    boolean pregunta = serv.modificarCantstock(sql,producaux);
    }
    
    String To = this.TotalField.getText();
    Pago.TotalField2.setText(To);
    Pago.UsuarioLabel.setText(this.NombreLabel.getText());
    Integer tota=Integer.parseInt(this.TotalField.getText());
    boolean pregunta = serv.setVenta(tota,this.NombreLabel.getText(),this.FechaLabel.getText());
    LimpiarTabla();
     
      
    }//GEN-LAST:event_cobrarButtonActionPerformed

    private void codigoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoFieldKeyTyped
      char car = evt.getKeyChar();
            if((car<'0' || car>'9')) evt.consume(); 
    // TODO add your handling code here:
    }//GEN-LAST:event_codigoFieldKeyTyped

    private void cantidadFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadFieldKeyTyped
    char car = evt.getKeyChar();
            if((car<'0' || car>'9')) evt.consume(); 
    }//GEN-LAST:event_cantidadFieldKeyTyped
    
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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaLabel;
    public static javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField TotalField;
    public static javax.swing.JLabel UsuarioLabel;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton borrarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JButton cobrarButton;
    public static javax.swing.JTextField codigoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable ventaTable;
    // End of variables declaration//GEN-END:variables
}
