package Modelo;
public class Detalle {
    private int id;
    private int id_venta;
    private int id_prod;
    private int cantidad;
    private double precio;
    private double total;
    public Detalle() {
    }
    public Detalle(int id, int id_venta, int id_prod, int cantidad, 
            double precio, double total) {
        this.id = id;
        this.id_venta = id_venta;
        this.id_prod = id_prod;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_venta() {
        return id_venta;
    }
    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    public int getId_prod() {
        return id_prod;
    }
    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
