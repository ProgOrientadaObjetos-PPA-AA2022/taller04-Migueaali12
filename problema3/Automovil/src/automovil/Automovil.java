package automovil;

public class Automovil {

    private String cedula;
    private String marca;
    private int aniof;
    private int anioa = 2022;
    private double valorv;
    private double valorm;

    public Automovil(String cel, String mar) {
        cedula = cel;
        marca = mar;
    }

    public Automovil(int anif, double val) {
        aniof = anif;
        valorv = val;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerAniof(int c) {
        aniof = c;
    }

    public void establecerValorv(double c) {
        valorv = c;
    }

    public void establecerValorm() {
        valorm = (valorv * 0.002) / 100;
        valorm = valorm * (anioa - aniof);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAniof() {
        return aniof;
    }

    public double obtenerValorv() {
        return valorv;
    }

    public double obtenerValorm() {
        return valorm;
    }

    @Override
    public String toString() {
        String cadena = String.format("Automóvil:\n"
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matrícula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAniof(),
                obtenerValorv(),
                obtenerValorm());
        return cadena;
    }
}
