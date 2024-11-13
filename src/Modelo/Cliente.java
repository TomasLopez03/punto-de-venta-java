package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Cliente {
    private int id;
    private String dni;
    private String apellido;
    private String nombre;
    private String telefono;
    private String direccion;
    private String razon;

    public Cliente() {
    }

    public Cliente(int id, String dni, String apellido, String nombre, 
            String telefono, String direccion, String razon) {
        this.id = id;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.razon = razon;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getRazon() {
        return razon;
    }
    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    public boolean registrar(){
        String sql = "insert into clientes (dni,apellido,nombre,telefono,"
                + "direccion,razon_social) values (?,?,?,?,?,?)";
        
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, apellido);
            ps.setString(3, nombre);
            ps.setString(4, telefono);
            ps.setString(5, direccion);
            ps.setString(6, razon);
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
