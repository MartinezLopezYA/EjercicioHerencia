package Universidad;

public class Main {
    public static void main(String[] args) {

        Estudiante alumno = new Estudiante();
        alumno.setNombre("Andres");
        alumno.setDireccion("Zipaquirá");
        alumno.setCarrera("ISUM");
        alumno.setSemestre(9);
        System.out.println(alumno.toString());
        System.out.println();
        Profesor docente = new Profesor();
        docente.setNombre("William");
        docente.setDireccion("Zipaquirá");
        docente.setCategoria("Programación");
        docente.setDepartamento("Ingeniería");
        System.out.println(docente.toString());

    }
}