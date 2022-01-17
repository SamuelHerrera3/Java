
public class Concesionario {

    private int id_concesionario;
    private Carro[] carros;

    public Concesionario(int id_concesionario, Carro[] carros) {
        this.id_concesionario = id_concesionario;
        this.carros = carros;
    }

    public Carro[] cambiarEstado() {

        for (int i = 0; i < carros.length; i++) {
            int v = carros[i].getModelo();
            if (v >= 1997 && v <= 2005) {
                carros[i].setEstado("El estado del carro " + (i + 1) + " es obsoleto");
            } else if (v > 2005 && v <= 2012) {
                carros[i].setEstado("El estado del carro " + (i + 1) + " es vigente");
            } else if (v > 2012) {
                carros[i].setEstado("El estado del carro " + (i + 1) + " es nuevo");
            }
        }
        return carros;
    }

    public int getId_concesionario() {
        return id_concesionario;
    }

    public void setId_concesionario(int id_concesionario) {
        this.id_concesionario = id_concesionario;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

}
