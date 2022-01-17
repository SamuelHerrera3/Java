
import java.sql.Date;
import java.lang.Math;

public class FacturaConcesionario {

    private int id_factura;
    private Vehiculo[] vehiculos;
    private Date fecha_compra;
    private int cancelado;
    int acum = 0;
    int retorno, x, b100, b50, b20, b10, m500, m200;
    String mensaje = "";

    public FacturaConcesionario(int id_factura, Vehiculo[] vehiculos, Date fecha_compra, int cancelado) {
        this.id_factura = id_factura;
        this.vehiculos = vehiculos;
        this.fecha_compra = fecha_compra;
        this.cancelado = cancelado;
    }

    public int concesionarioTotal() {

        for (int i = 0; i < vehiculos.length; i++) {
            String x = vehiculos[i].getTipo_vehiculo();
            int y = vehiculos[i].getModelo();
            if (x.equals("Carro")) {
                vehiculos[i].setPrecio(20000000);
                for (int j = 0; j < vehiculos.length; j++) {
                    while (y > 2000) {
                        vehiculos[i].setPrecio(vehiculos[i].getPrecio() + 500000);
                        y -= 1;
                    }

                }
            } else if (x.equals("Moto")) {
                vehiculos[i].setPrecio(5000000);
                for (int j = 0; j < vehiculos.length; j++) {
                    while (y > 2000) {
                        vehiculos[i].setPrecio(vehiculos[i].getPrecio() + 500000);
                        y -= 1;
                    }

                }
            }
            acum += vehiculos[i].getPrecio();
            retorno = acum;
        }

        return retorno;
    }

    public String concesionarioDevuelta(int total) {
        this.acum = total;
        x = cancelado - total;

        for (int i = 0; i < vehiculos.length; i++) {
            String tipo = vehiculos[i].getTipo_vehiculo();
            if (tipo.equals("Moto")) {

                b50 = x / 50000;
                int y = 50000 * b50;
                Math.floor(y);
                x = x - y;
                b10 = x / 10000;
                int z = 10000 * b10;
                Math.floor(z);
                x = x - z;
                ///if (x != 0) {
                m500 = x / 500;
                int w = 500 * m500;
                Math.floor(w);
                x = x - w;
                mensaje = "El asistente del concesionario debe devolverle al comprador con " + b50 + " billetes de 50.000, " + b10 + " billetes de 10.000 y " + m500 + " monedas de 500";

            }else if(tipo.equals("Carro")){
                b100 = x / 100000;
                int y = 100000 * b100;
                Math.floor(y);
                x = x - y;
                b20 = x / 20000;
                int z = 20000 * b20;
                Math.floor(z);
                x = x - z;
                ///if (x != 0) {
                m200 = x / 200;
                int w = 200 * m200;
                Math.floor(w);
                x = x - w;
                mensaje = "El asistente del concesionario debe devolverle al comprador con " + b100 + " billetes de 100.000, " + b20 + " billete de 20.000 y " + m200 + " monedas de 200";
                
            }

        }

        return mensaje;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

}
