/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.util.Date;

/**
 *
 * @author jeanc_000
 */
public class venta {
    private Integer idventa=null;
    private Integer monto=null;
    private Date fecha=null;
    private Integer usuario_idusuario=null;

    public venta() {
    }
   
    
    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setUsuario_idusuario(Integer usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public Integer getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public Integer getUsuario_idusuario() {
        return usuario_idusuario;
    }
    
    
}
