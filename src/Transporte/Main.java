package Transporte;

public class Main {

    public static void main(String[] args) {

        Coche car = new Coche();
        car.setKm(0);
        car.setPlaca("KTM-000");
        car.setColor("Azul");
        car.setMarca("Doddge");
        car.setNllantas(4);
        System.out.println(car.toString());
        System.out.println();

        Bicicleta cicla = new Bicicleta();
        cicla.setColor("Amarillo");
        cicla.setMarca("GW");
        cicla.setNllantas(2);
        cicla.setCategoria("Todo Terreno");
        cicla.setRegistro(453950);
        System.out.println(cicla.toString());

    }

}
