public class Carro {
    
    private int id_carro;
    private int modelo;
    private String estado;
    
    public Carro(int id_carro, int modelo){
        this.id_carro = id_carro;
        this.modelo = modelo;
    }

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "id_carro = " + id_carro + ", modelo = " + modelo + ", estado = " + estado;
    }
    
}
