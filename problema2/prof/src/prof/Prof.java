
package prof;


public class Prof {

    private String nombre;
    private String apellido;
    private double sueldo;
    private double sueldot;
    private String cedula;
    
    public Prof(String nom, String ape){
        nombre = nom;
        apellido = ape;
    }
    
    public Prof(double suel, String nom, String ape){
        nombre = nom;
        apellido = ape;
        sueldo = suel;
        sueldot = obtenerSueldot();
    }
    
    public void establecerNombre(String c){
        nombre = c;
    }
    
    public void establecerApellido(String c){
        nombre = c;
    }
    
    public void establecerSueldo(double c){
        sueldo = c;
    }
    
    public void establecerSueldot(){
        sueldot = (sueldo * 20) / 100;
        sueldot = sueldo + sueldot;
    }
    
    public void establecerCedula(String c) {
        cedula = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public double obtenerSueldot(){
        return sueldot;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
     
    @Override
    public String toString() {
        String cadena = String.format("Profesores:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "Cedula: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldo(),
                obtenerSueldot(),
                obtenerCedula());
        return cadena;
    }
    
        
}
