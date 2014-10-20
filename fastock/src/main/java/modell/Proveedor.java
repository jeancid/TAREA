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
public class Proveedor {
    private Integer id_rut=null;
    private String nombre=null;
    private Integer telefono=null;
    private String email=null;
    private String paginaweb=null;
    private String direccion=null; 

    public Proveedor() {
    }

    public Integer getId_rut() {
        return id_rut;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId_rut(Integer id_rut) {
        this.id_rut = id_rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
