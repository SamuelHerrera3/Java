
public class Moto extends Vehiculo {

    private boolean delimitador;

    public Moto(int idVehiculo, String tipo_vehiculo, int modelo, boolean delimitador) {
        super(idVehiculo, tipo_vehiculo, modelo);
        this.delimitador = delimitador;
    }

    public Moto(boolean delimitador) {
        this.delimitador = delimitador;
    }

    public Moto() {
    }

    public boolean isDelimitador() {
        return delimitador;
    }

    public void setDelimitador(boolean delimitador) {
        this.delimitador = delimitador;
    }

}
