package Transporte;

public class Coche extends Vehiculo{

    private int km;
    private String placa;

    public Coche() {
    }

    public Coche(int nllantas, String color, String marca, int km, String placa) {
        super(nllantas, color, marca);
        this.km = km;
        this.placa = placa;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCoche: " +
                "\nKilometros = " + km + "Km" +
                "\nPlaca = " + placa;
    }
}
