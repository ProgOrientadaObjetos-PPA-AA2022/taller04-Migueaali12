
package prof;


public class Prof {

    private String nombre;
    private String apellido;
    private double sueldo;
    private double sueldot;
    private String cedula;
    
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
    
    
        
}
