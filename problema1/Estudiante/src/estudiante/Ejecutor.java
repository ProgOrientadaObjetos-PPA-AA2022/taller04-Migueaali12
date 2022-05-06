
package estudiante;


public class Ejecutor {
    
    public static void main(String[] args) {
        
        Estudiante estu = new Estudiante("Pedro");
        estu.establecerCal1(10);
        estu.establecerCal2(7.10);
        estu.establecerCal3(8);
        estu.establecerProm();
        
        Estudiante estu2 = new Estudiante("Pedro", 8.10, 7, 9.5);
        estu2.establecerProm();
        
        System.out.println(estu);
        
        System.out.println(estu2);
        
        
        
    }
    
}
