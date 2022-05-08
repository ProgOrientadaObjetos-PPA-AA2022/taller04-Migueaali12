
package prof;


public class Ejecutor {
    
    public static void main(String[] args) {
        
        Prof prof1 = new Prof("Jorge","Alvarez");
        prof1.establecerSueldo(300);
        prof1.establecerSueldot();
        prof1.establecerCedula("1105432895");
        
        Prof prof2 = new Prof(850, "Miguel", "Alvarez");
        prof2.establecerSueldot();
        prof2.establecerCedula("11053102973");
        
        System.out.println(prof1);
        
        System.out.println(prof2);      
        
    }
    
}
