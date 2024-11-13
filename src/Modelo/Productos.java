package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Productos {
    private int id;
    private String codigo;
    private String descripcion;
    private int stock;    
    private Double precio;

    public Productos() {
    }
    public Productos(int id, String codigo, String descripcion, 
            Double precio, int stock) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    public boolean registrar(){
        String sql = "insert into productos (codigo,descripcion,"
                + "precio,stock_disponible) values (?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,codigo);
            ps.setString(2,descripcion);
            ps.setDouble(3,precio);
            ps.setInt(4,stock);
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
