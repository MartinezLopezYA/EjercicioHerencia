package Transporte;

public class Vehiculo {

    private int nllantas;
    private String color;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(int nllantas, String color, String marca) {
        this.nllantas = nllantas;
        this.color = color;
        this.marca = marca;
    }

    public int getNllantas() {
        return nllantas;
    }

    public void setNllantas(int nllantas) {
        this.nllantas = nllantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*
    @Override
    public String toString() {
        return "Vehiculo: " +
                "\nNumero de llantas = " + nllantas +
                "\nColor = " + color +
                "\nMarca = " + marca;
    }

     */
}
