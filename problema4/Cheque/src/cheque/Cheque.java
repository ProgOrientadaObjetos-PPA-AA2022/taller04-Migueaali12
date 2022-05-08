package cheque;

public class Cheque {

    private String nombre;
    private String nombreb;
    private double valor;
    private double comision;
    
    public Cheque(String nom, String ban){
        nombre = nom;
        nombreb = ban;
    }
    
    public Cheque(double val){
        valor = val;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerNombreb(String c) {
        nombreb = c;
    }

    public void establecerValor(double c) {
        valor = c;
    }

    public void establecerComision() {
        comision = (valor * 0.003) / 100;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNombreb() {
        return nombreb;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerComision() {
        return comision;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Cheque:\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor: %.2f\n"
                + "Comisión: %.2f\n",
                obtenerNombre(),
                obtenerNombreb(),
                obtenerValor(),
                obtenerComision());
        return cadena;
    }

}
