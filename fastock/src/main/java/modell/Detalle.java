/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author jeanc_000
 */
public class Detalle {
    
   private String producto_id_barra = null;
   private Integer venta_idventa=null;
   private Integer venta_usuario_idusuario=null;
   private Integer cantidadventa=null;

    public Detalle() {
    }

    public void setProducto_id_barra(String producto_id_barra) {
        this.producto_id_barra = producto_id_barra;
    }

    public void setVenta_idventa(Integer venta_idventa) {
        this.venta_idventa = venta_idventa;
    }

    public void setVenta_usuario_idusuario(Integer venta_usuario_idusuario) {
        this.venta_usuario_idusuario = venta_usuario_idusuario;
    }

    public void setCantidadventa(Integer cantidadventa) {
        this.cantidadventa = cantidadventa;
    }

    public String getProducto_id_barra() {
        return producto_id_barra;
    }

    public Integer getVenta_idventa() {
        return venta_idventa;
    }

    public Integer getVenta_usuario_idusuario() {
        return venta_usuario_idusuario;
    }

    public Integer getCantidadventa() {
        return cantidadventa;
    }



}
