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
public class Producto {
    private String id_barra ="";
    private Integer precio=null;
    private String nombre="";
    private Integer cantidad=null;
    private String categoria="";
    private Integer proveedor_id_rut=null;

    public Producto() {
    }
    

    public String getId_barra() {
        return id_barra;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getProveedor_id_rut() {
        return proveedor_id_rut;
    }

    public void setId_barra(String id_barra) {
        this.id_barra = id_barra;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setProveedor_id_rut(Integer proveedor_id_rut) {
        this.proveedor_id_rut = proveedor_id_rut;
    }

    public void setproveedor_id_rut(Integer Rutreal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
