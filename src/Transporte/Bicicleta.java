package Transporte;

public class Bicicleta extends Vehiculo{

    private int registro;
    private String categoria;

    public Bicicleta() {
    }

    public Bicicleta(int nllantas, String color, String marca, int registro, String categoria) {
        super(nllantas, color, marca);
        this.registro = registro;
        this.categoria = categoria;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /*
    @Override
    public String toString() {
        return super.toString() +
                "\nBicicleta: " +
                "\nRegistro = " + registro +
                "\nCategoría = " + categoria;
    }

     */
}
