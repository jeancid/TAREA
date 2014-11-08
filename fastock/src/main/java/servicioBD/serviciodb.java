/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import modell.Usuario;
import modell.Proveedor;
import modell.Producto;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author frubilar
 */
public class serviciodb {
    private boolean conectado = false;
    private Connection conexion = null;
    private static Logger logger = LoggerFactory.getLogger(serviciodb.class);

    @PostConstruct
    public void iniciar() {
        boolean ok = conectar();
        if (!ok) {
            logger.info("ERROR: no fue posible conectarme a la base de datos");
        }

    }

    boolean conectar() {
        this.conectado = false;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/fastdb?zeroDateTimeBehavior=convertToNull";
            Properties props = new Properties();
            props.setProperty("user", "faster");
            props.setProperty("password", "faster+123");
//            props.setProperty("ssl", "true");
            this.conexion = DriverManager.getConnection(url, props);

            if (conexion != null) {
                this.conectado = true;
            } else {
                this.conectado = false;
            }

            if (!conectado) {
                throw new RuntimeException("No se puede conectar al motor de base de datos.");
            }

        } catch (Exception e) {
            this.conectado = false;
            logger.error(e.toString());
            logger.debug("Error al conectar con Base de datos", e.toString());
        }
        return conectado;
    }

    boolean desconectar() {
        try {
            if (conexion != null) {
                conexion.close();
                conexion = null;
                conectado = false;
            } else {
                conectado = false;
            }
        } catch (Exception e) {
            conexion = null;
            conectado = false;
            logger.error(e.toString());
            logger.debug("Error al conectar con Base de datos", e.toString());
        }
        return conectado;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    @PreDestroy
    public void finalizar() {
        boolean desconectar = desconectar();
        if (desconectar) {
            logger.info("ERROR: conexión aún activa");
        }
    }
    
    
    
    public Usuario getUsuario() {
        Usuario usuario = null;
        try {
            
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
                }

                PreparedStatement st = null;
                String query = "SELECT * FROM usuario ";
                st = conexion.prepareStatement(query);
                if (st != null) {

                    ResultSet rs = st.executeQuery();
                    if (rs != null) {
                        if (rs.next()) {
                            usuario = new Usuario();
                            usuario.setUsuario(rs.getString("usuario"));
                            usuario.setPass(rs.getString("pass"));
                        } else {
                            logger.info("No existe usuario: ");
                        }
                        rs.close();
                    }
                    st.close();
                }
       
        } catch (Exception e) {
            usuario = null;
            logger.error(e.toString());
            logger.debug("Error al obtener usuario", e);
        }
        return usuario;
    }
    
    public boolean setProveedor(Proveedor proveedor) {
      boolean pregunta =false;
//System.out.println(proveedor.getId_rut());
        try {
            
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
                }

                PreparedStatement st = null;
                String query = "Insert into proveedor(id_rut,nombre,telefono,email,paginaweb,direccion)values(?,?,?,?,?,?) ";
                st = conexion.prepareStatement(query);
                st.setInt(1,proveedor.getId_rut());
                st.setString(2, proveedor.getNombre());
                st.setInt(3,proveedor.getTelefono());
                st.setString(4,proveedor.getEmail());
                st.setString(5, proveedor.getPaginaweb());
                st.setString(6, proveedor.getDireccion());
                st.executeUpdate();
                pregunta=true;
                
       
        } catch (Exception e) {
            proveedor = null;
            logger.error(e.toString());
            logger.debug("Error al obtener usuario", e);
            pregunta = false;
                
        }
        return pregunta;
    }
    
     public boolean setProducto(Producto producto) {
      boolean pregunta =false;

        try {
            
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
                }

                PreparedStatement st = null;
                String query = "Insert into producto(id_barra,precio,nombre,cantidad,categoria,proveedor_id_rut)values(?,?,?,?,?,?) ";
                st = conexion.prepareStatement(query);
                st.setString(1,producto.getId_barra());
                st.setInt(2, producto.getPrecio());
                st.setString(3,producto.getNombre());
                st.setInt(4,producto.getCantidad());
                st.setString(5, producto.getCategoria());
                st.setInt(6, producto.getProveedor_id_rut());
                st.executeUpdate();
                pregunta=true;
                
       
        } catch (Exception e) {
            producto = null;
            logger.error(e.toString());
            logger.debug("Error al obtener usuario", e);
            pregunta = false;
        }
        return pregunta;
    }
   
    
     public ArrayList<Producto> getProduto(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {
            
            
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
                }

                PreparedStatement st = null;
                String query = "SELECT * FROM producto ";
                st = conexion.prepareStatement(query);
                if (st != null) {

                    ResultSet rs = st.executeQuery();
                    
                    if (rs != null) {
                        while (rs.next()) {
                            Producto producto = new Producto();
                            producto.setId_barra(rs.getString(1));
                            producto.setPrecio(rs.getInt(2));
                            producto.setNombre(rs.getString(3));
                            producto.setCantidad(rs.getInt(4));
                            producto.setCategoria(rs.getString(5));
                            producto.setProveedor_id_rut(rs.getInt(6));
                            productos.add(producto);
                        } 
                        rs.close();
                    }
                    st.close();
                }
       
        } catch (Exception e) {
            productos = null;
            logger.error(e.toString());
            logger.debug("Error al obtener producto", e);
        }
        return productos;
    }
     
     public ArrayList<Proveedor> getBuscarProveedor(String nombre){
     ArrayList<Proveedor> proveedorNombre=new ArrayList<Proveedor>();
     try {
         if (!StringUtils.isEmpty(nombre)) {
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
                }
         
         PreparedStatement st = null;
                String query = "SELECT*FROM proveedor WHERE nombre=?";
                st = conexion.prepareStatement(query);
              
                if(st !=null){
                    st.setString(1, nombre);
                    ResultSet rs = st.executeQuery();
                         
                    if (rs != null) {
                        while (rs.next()) {
                            Proveedor proveedor = new Proveedor();
                            proveedor.setId_rut(rs.getInt(1));
                            proveedor.setNombre(rs.getString(2));
                            proveedor.setTelefono(rs.getInt(3));
                            proveedor.setEmail(rs.getString(4));
                            proveedor.setPaginaweb(rs.getString(5));
                            proveedor.setDireccion(rs.getString(6));
                            proveedorNombre.add(proveedor);
                        }
                        
                    }
                    st.close();
                }}
         else {
                logger.info("ERROR: nombre nulo");
            }
                    
                         
     }
     
     catch (Exception e) {
            proveedorNombre = null;
            logger.error(e.toString());
            logger.debug("Error al obtener producto", e);
        }
      return proveedorNombre;   
     }
     
     public ArrayList<Proveedor> getProveedor(){
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        try {
            
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
                }

                PreparedStatement st = null;
                String query = "SELECT * FROM proveedor ";
                st = conexion.prepareStatement(query);
                if (st != null) {

                    ResultSet rs = st.executeQuery();
                    
                    if (rs != null) {
                        while (rs.next()) {
                            Proveedor proveedor = new Proveedor();
                            proveedor.setId_rut(rs.getInt(1));
                            proveedor.setNombre(rs.getString(2));
                            proveedor.setTelefono(rs.getInt(3));
                            proveedor.setEmail(rs.getString(4));
                            proveedor.setPaginaweb(rs.getString(5));
                            proveedor.setDireccion(rs.getString(6));
                            proveedores.add(proveedor);
                        } 
                        rs.close();
                    }
                    st.close();
                }
       
        } catch (Exception e) {
            proveedores = null;
            logger.error(e.toString());
            logger.debug("Error al obtener producto", e);
        }
        return proveedores;
    }
              
    public ArrayList<Producto> getBuscarProducto(String nombre){
     ArrayList<Producto> productos=new ArrayList<Producto>();
     try {
         if (!StringUtils.isEmpty(nombre)) {
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
     }
         
         PreparedStatement st = null;
                String query = "SELECT*FROM producto WHERE nombre=?";
                st = conexion.prepareStatement(query);
              
                if(st !=null){
                    st.setString(1, nombre);
                    ResultSet rs = st.executeQuery();
                         
                    if (rs != null) {
                        while (rs.next()) {
                            Producto producto = new Producto();
                            producto.setId_barra(rs.getString(1));
                            producto.setPrecio(rs.getInt(2));
                            producto.setNombre(rs.getString(3));
                            producto.setCantidad(rs.getInt(4));
                            producto.setCategoria(rs.getString(5));
                            producto.setProveedor_id_rut(rs.getInt(6));
                            
                            productos.add(producto);
                        }
                        
                    }
                    st.close();
                }}
         else {
                logger.info("ERROR: nombre nulo");
            }
                    
                         
     }
     
     catch (Exception e) {
            productos = null;
            logger.error(e.toString());
            logger.debug("Error al obtener producto", e);
        }
      return productos;   
     }
    
    public Producto getProduto(String sql){
        Producto producto = new Producto();
        try {
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
                }

                PreparedStatement st = null;
                String query = sql;
                st = conexion.prepareStatement(query);
                if (st != null) {

                    ResultSet rs = st.executeQuery();
                    
                    if (rs != null) {
                        rs.next();
                            
                            producto.setId_barra(rs.getString(1));
                            producto.setPrecio(rs.getInt(2));
                            producto.setNombre(rs.getString(3));
                            producto.setCantidad(rs.getInt(4));
                            producto.setCategoria(rs.getString(5));
                            producto.setProveedor_id_rut(rs.getInt(6));
                          
                        
                        rs.close();
                    }
                    st.close();
                }
       
        } catch (Exception e) {
            producto = null;
            logger.error(e.toString());
            logger.debug("Error al obtener producto", e);
        }
        return producto;
    }
    
    public boolean eliminarProducto(String sql){
     boolean pregunta=false;
     
        try {
                // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();
                }
                PreparedStatement st = conexion.prepareStatement(sql);
                st.executeUpdate();
                pregunta=true;
                
        } catch (Exception e) {
            logger.error(e.toString());
            logger.debug("Error al eliminar producto", e);
        }
        return pregunta;
        
                                            }
    
    public boolean modificarProducto(String sql,Producto producto) {
      boolean pregunta =false;

        try {
            // Conectamos si no está conectado
                if (!isConectado()) {
                    conectar();     }
                PreparedStatement st = null;
                String query = "update producto set precio=?,nombre=?,cantidad=?,categoria=? where id_barra=?";
                st = conexion.prepareStatement(query);
                
                st.setInt(1, producto.getPrecio());
                st.setString(2,producto.getNombre());
                st.setInt(3,producto.getCantidad());
                st.setString(4, producto.getCategoria());
                st.setString(5, sql);
                st.executeUpdate();
                pregunta=true;
       
        } catch (Exception e) {
            logger.error(e.toString());
            logger.debug("Error al modificar producto", e);
            pregunta = false;
        }
        return pregunta;
    }
         
}


