package sprint;


public class Auto{
    private int id_auto, precio, modelo;
    private String marca;

    public Auto(int id_auto, String marca, int precio, int modelo){
        this.id_auto = id_auto;
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }

    public int getId_auto() {
        return id_auto;
    }
    
    public String c(){
        return "invocado";
    }
    
    public String calcularDescuento(){
        if(modelo > 2000 && modelo < 2007){
            return("El descuento por el automóvil escogido es de 35% sobre el precio total");
        }else if(modelo > 2007 && modelo < 2014){
            return ("El descuento por el automóvil escogido es de 25% sobre el precio total");
        }else if(modelo > 2014 && modelo < 2020){
            return ("El descuento por el automóvil escogido es de 10% sobre el precio total");
        }else{
            return ("El vehículo escogido no aplica para la oferta");
        }
    }

    public void setId_auto(int id_auto) {
        this.id_auto = id_auto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
