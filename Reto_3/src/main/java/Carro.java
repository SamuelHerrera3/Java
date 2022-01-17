
public class Carro extends Vehiculo {

    private int anchura;
    private int altura;

    public Carro(int idVehiculo, String tipo_vehiculo, int modelo, int anchura, int altura) {
        super(idVehiculo, tipo_vehiculo, modelo);
        this.anchura = anchura;
        this.altura = altura;
    }

    public Carro(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    public Carro() {

    }

    int getAltura() {
        return altura;
    }

    void setAltura(int altura) {
        this.altura = altura;
    }

    int getAnchura() {
        return anchura;
    }

    void setAnchura(int anchura) {
        this.altura = anchura;
    }
}
