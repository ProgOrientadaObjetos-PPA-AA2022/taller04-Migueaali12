package estudiante;

public class Estudiante {

    private String nombre;
    private double cal1;
    private double cal2;
    private double cal3;
    private double prom;

    public Estudiante(String nom) {
        nombre = nom;
    }

    public Estudiante(String nom, double c1, double c2, double c3) {
        nombre = nom;
        cal1 = c1;
        cal2 = c2;
        cal3 = c3;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerCal1(double c) {
        cal1 = c;
    }

    public void establecerCal2(double c) {
        cal2 = c;
    }

    public void establecerCal3(double c) {
        cal3 = c;
    }

    public void establecerProm() {
        prom = (cal1 + cal2 + cal3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCal1() {
        return cal1;
    }

    public double obtenerCal2() {
        return cal2;
    }

    public double obtenerCal3() {
        return cal3;
    }

    public double obtenerProm() {
        return prom;
    }

    @Override
    public String toString() {
        String cadena = String.format("Estudiante\n"
                + "Nombre: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Califiacion 2: %.2f\n"
                + "Califiacion 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombre(),
                obtenerCal1(),
                obtenerCal2(),
                obtenerCal3(),
                obtenerProm());
        return cadena;
    }

}
