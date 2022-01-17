
public class Vehiculo {

    private int idVehiculo;
    private int precio;
    private int marca;
    private int modelo;
    private String tipo_vehiculo;

    public Vehiculo(int idVehiculo, String tipo_vehiculo, int modelo) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public Vehiculo() {
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

}
