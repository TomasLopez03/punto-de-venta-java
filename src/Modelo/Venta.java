package Modelo;
public class Venta {
    private int id;
    private int idCliente;
    private double total;
    private int idConfig;

    public Venta() {
    }
    public Venta(int id, int idCliente, double total, int idConfig) {
        this.id = id;
        this.idCliente = idCliente;
        this.total = total;
        this.idConfig = idConfig;
    }
    
    public int getIdConfig() {
        return idConfig;
    }

    public void setIdConfig(int idConfig) {
        this.idConfig = idConfig;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
