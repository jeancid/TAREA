/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modell.Producto;
import modell.Proveedor;
import servicioBD.serviciodb;

/**
 *
 * @author jean
 */
public class Consultaproductos extends javax.swing.JFrame {

    /**
     * Creates new form Consultaproductos
     */
    public void Sletras(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isDigit(c))
                    e.consume();
            }
        });
    }
       public void Nletras(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(!Character.isDigit(c))
                    e.consume();
            }
        });
    }
    
      public Consultaproductos() {
        initComponents();
        MostrarDatos();
        DeshabilitarBotones();
        DeshabilitarCampos();
        }

    void Limpiar(){
        this.CodigoField.setText("");
        this.NombreField.setText("");
        this.PrecioField.setText("");
        this.CantidadField.setText("");
    }
    void HabilitarCampos(){
        CantidadField.setEnabled(true);
        CategoriaBox.setEnabled(true);
        CodigoField.setEnabled(true);
        NombreField.setEnabled(true);
        PrecioField.setEnabled(true);
        ComboProv.setEnabled(true);
    }
    void DeshabilitarCampos(){
        CantidadField.setEnabled(false);
        CategoriaBox.setEnabled(false);
        CodigoField.setEnabled(false);
        NombreField.setEnabled(false);
        PrecioField.setEnabled(false);
        ComboProv.setEnabled(false);
    }
    void DeshabilitarBotones(){
        EliminarBoton.setEnabled(false);
        ModificarBoton.setEnabled(false);
        GuardarBoton.setEnabled(false);
    }
    boolean CamposLlenos(){
          boolean pregunta = false;
          if(this.PrecioField.getText().equals("")==true||this.NombreField.getText().equals("")==true||this.CodigoField.getText().equals("")==true||this.CategoriaBox.getSelectedItem().equals("")==true||this.ComboProv.getSelectedItem().toString().equals("")==true||this.CantidadField.getText().toString().equals("")==true){
          }else pregunta=true;
          return pregunta;
    }
    
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
  
void MostrarDatos(ArrayList<Producto> productos){
        serviciodb serv = new serviciodb();
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductoTable = new javax.swing.JTable();
        GuardarBoton = new javax.swing.JButton();
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
        CategoriaBox = new javax.swing.JComboBox();
        PrecioField = new javax.swing.JTextField();
        NombreField = new javax.swing.JTextField();
        CodigoField = new javax.swing.JTextField();
        EliminarBoton = new javax.swing.JButton();
        NuevoBoton = new javax.swing.JButton();
        ModificarBoton = new javax.swing.JButton();
        MostrarTodoBoton = new javax.swing.JButton();
        ComboProv = new javax.swing.JComboBox();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUCTOS"));
        jPanel1.setName(""); // NOI18N

        ProductoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        GuardarBoton.setText("Guardar nuevo");
        GuardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBotonActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por nombre:");

        BuscarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFieldActionPerformed(evt);
            }
        });
        BuscarField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarFieldKeyTyped(evt);
            }
        });

        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

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
        CantidadField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadFieldKeyTyped(evt);
            }
        });

        CategoriaBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Liquidos", "Abarrotes", "Confites" }));
        CategoriaBox.setToolTipText("");
        CategoriaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaBoxActionPerformed(evt);
            }
        });

        PrecioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioFieldActionPerformed(evt);
            }
        });
        PrecioField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioFieldKeyTyped(evt);
            }
        });

        NombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFieldActionPerformed(evt);
            }
        });
        NombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreFieldKeyTyped(evt);
            }
        });

        CodigoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodigoFieldKeyTyped(evt);
            }
        });

        EliminarBoton.setText("Eliminar");
        EliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBotonActionPerformed(evt);
            }
        });

        NuevoBoton.setText("Nuevo");
        NuevoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoBotonActionPerformed(evt);
            }
        });

        ModificarBoton.setText("Modificar");
        ModificarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBotonActionPerformed(evt);
            }
        });

        MostrarTodoBoton.setText("Mostrar todos");
        MostrarTodoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTodoBotonActionPerformed(evt);
            }
        });

        ComboProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MostrarTodoBoton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ProveedorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CodigoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PrecioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CategoriaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(CantidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CategoriaBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrecioField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CantidadField)
                            .addComponent(ComboProv, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AtrasBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NuevoBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GuardarBoton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButton)
                    .addComponent(jLabel1)
                    .addComponent(MostrarTodoBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProveedorLabel)
                    .addComponent(ComboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarBoton)
                            .addComponent(EliminarBoton)
                            .addComponent(ModificarBoton)
                            .addComponent(NuevoBoton))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AtrasBoton)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarTodoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTodoBotonActionPerformed
        Limpiar();
        DeshabilitarCampos();
        DeshabilitarBotones();
        MostrarDatos();
    }//GEN-LAST:event_MostrarTodoBotonActionPerformed

    private void ModificarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBotonActionPerformed
        if(CamposLlenos()==true){
        Producto producto=new Producto();
        int fila = ProductoTable.getSelectedRow();
        String sql= ProductoTable.getValueAt(fila, 0).toString();
        //NO MODIFICAR LLAVES!
        producto.setNombre(this.NombreField.getText());
        producto.setPrecio(Integer.parseInt(this.PrecioField.getText()));
        producto.setCantidad(Integer.parseInt(this.CantidadField.getText()));
        producto.setCategoria(this.CategoriaBox.getSelectedItem().toString());

        serviciodb serv = new serviciodb();
        boolean pregunta = serv.modificarProducto(sql,producto);
        if(pregunta==true){
            JOptionPane.showMessageDialog(null,"El producto fue modificado con éxito", null, WIDTH);
        }else
        JOptionPane.showMessageDialog(null,"Ocurrió algún error", null, WIDTH);
        Limpiar();
        MostrarDatos();
        DeshabilitarBotones();
        DeshabilitarCampos();
        }else
            JOptionPane.showMessageDialog(null,"Debe llenar todos los campos", null, WIDTH);
        
    }//GEN-LAST:event_ModificarBotonActionPerformed

    private void NuevoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoBotonActionPerformed
        this.ComboProv.removeAllItems();
        serviciodb serv = new serviciodb();
        ArrayList<modell.Proveedor> proveedores=serv.getProveedor();
        Iterator<modell.Proveedor> ite=proveedores.iterator();
        while(ite.hasNext()){
            modell.Proveedor proveedor1= ite.next();
            ComboProv.addItem(proveedor1.getNombre());
        }
        MostrarDatos();
        Limpiar();
        EliminarBoton.setEnabled(false);
        ModificarBoton.setEnabled(false);
        GuardarBoton.setEnabled(true);
        HabilitarCampos();
    }//GEN-LAST:event_NuevoBotonActionPerformed

    private void EliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBotonActionPerformed
        boolean pregunta=false;
        int respuesta = JOptionPane.showConfirmDialog(null,"¿Seguro que desea eliminar este Producto?" , null,JOptionPane.CANCEL_OPTION);
        if (respuesta == JOptionPane.YES_OPTION){
            int fila = ProductoTable.getSelectedRow();
            String sql= "delete from producto where id_barra=" + ProductoTable.getValueAt(fila, 0);
            serviciodb serv = new serviciodb();
            pregunta=serv.eliminarProducto(sql);
            if(pregunta==true){
                JOptionPane.showMessageDialog(null,"El producto fue eliminado con éxito", null, WIDTH);
            }}
            if(pregunta==false) JOptionPane.showMessageDialog(null,"Ocurrió algún error", null, WIDTH);

            Limpiar();
            MostrarDatos();
            DeshabilitarBotones();
            DeshabilitarCampos();
    }//GEN-LAST:event_EliminarBotonActionPerformed

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
        this.dispose();
    }//GEN-LAST:event_AtrasBotonActionPerformed

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        Limpiar();
        DeshabilitarBotones();
        DeshabilitarCampos();
        ArrayList<Producto> productos = new ArrayList<Producto>();
        serviciodb serv = new serviciodb();
        String nombrepro= this.BuscarField.getText();
        productos = serv.getBuscarProducto(nombrepro);
        MostrarDatos(productos);
        this.BuscarField.setText("");
        
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void BuscarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarFieldActionPerformed

    private void GuardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBotonActionPerformed
        if(CamposLlenos()==true){
            Producto producto= new Producto();
            producto.setId_barra(this.CodigoField.getText());
            producto.setNombre(this.NombreField.getText());
            producto.setPrecio(Integer.parseInt(this.PrecioField.getText()));
            producto.setCantidad(Integer.parseInt(this.CantidadField.getText()));

            serviciodb serv1=new serviciodb();
            String nombre= this.ComboProv.getSelectedItem().toString();
            modell.Proveedor proveedor= serv1.getBuscarProveedor(nombre);
            producto.setProveedor_id_rut(proveedor.getId_rut());

            producto.setCategoria(this.CategoriaBox.getSelectedItem().toString());
            serviciodb serv = new serviciodb();
            boolean pregunta = serv.setProducto(producto);
            if(pregunta==true){
                JOptionPane.showMessageDialog(null,"El producto fue guardado con éxito", null, WIDTH);
                Limpiar();
            }else
            JOptionPane.showMessageDialog(null,"Ocurrió algún error", null, WIDTH);
            MostrarDatos();
            DeshabilitarBotones();
            DeshabilitarCampos();
        }else{
            JOptionPane.showMessageDialog(null,"Debe llenar todos los campos", null, WIDTH);
        }
    }//GEN-LAST:event_GuardarBotonActionPerformed

    private void ProductoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoTableMouseClicked
        HabilitarCampos();
        this.ComboProv.removeAllItems();
        CodigoField.setEnabled(false);

        Producto producto=new Producto();
        if(evt.getButton()==1){
            int fila = ProductoTable.getSelectedRow();
            String sql= "select * from producto where id_barra=" + ProductoTable.getValueAt(fila, 0);
            serviciodb serv = new serviciodb();
            producto=serv.getProduto(sql);
            modell.Proveedor Proveedor;
            Proveedor=serv.getBuscarProveedor(producto.getProveedor_id_rut());
            this.ComboProv.addItem(Proveedor.getNombre());
            this.CantidadField.setText(producto.getCantidad().toString());
            this.NombreField.setText(producto.getNombre());
            this.PrecioField.setText(producto.getPrecio().toString());
            this.CodigoField.setText(producto.getId_barra());
            EliminarBoton.setEnabled(true);
            ModificarBoton.setEnabled(true);
            GuardarBoton.setEnabled(false);

            this.CategoriaBox.setSelectedItem(producto.getCategoria());
        }
    }//GEN-LAST:event_ProductoTableMouseClicked

    private void PrecioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioFieldActionPerformed

    private void ComboProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboProvActionPerformed

    private void BuscarFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarFieldKeyTyped
    Sletras(BuscarField);        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarFieldKeyTyped

    private void CodigoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoFieldKeyTyped
   Nletras(CodigoField);        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoFieldKeyTyped

    private void NombreFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreFieldKeyTyped
    Sletras(NombreField);        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFieldKeyTyped

    private void PrecioFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioFieldKeyTyped
    Nletras(PrecioField);        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioFieldKeyTyped

    private void CantidadFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadFieldKeyTyped
    Nletras(CantidadField);        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadFieldKeyTyped
     
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
    private javax.swing.JButton AtrasBoton;
    private javax.swing.JButton BuscarButton;
    private javax.swing.JTextField BuscarField;
    private javax.swing.JTextField CantidadField;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JComboBox CategoriaBox;
    private javax.swing.JLabel CategoriaLabel;
    private javax.swing.JTextField CodigoField;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JComboBox ComboProv;
    private javax.swing.JButton EliminarBoton;
    private javax.swing.JButton GuardarBoton;
    private javax.swing.JButton ModificarBoton;
    private javax.swing.JButton MostrarTodoBoton;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JButton NuevoBoton;
    private javax.swing.JTextField PrecioField;
    private javax.swing.JLabel PrecioLabel;
    private javax.swing.JTable ProductoTable;
    private javax.swing.JLabel ProveedorLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
