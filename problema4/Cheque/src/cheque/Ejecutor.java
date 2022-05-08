
package cheque;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        Cheque cheq1 = new Cheque("Miguel Alvarez", "Banco Pichincha");
        cheq1.establecerValor(2200);
        cheq1.establecerComision();
        
        Cheque cheq2 = new Cheque(5000);
        cheq2.establecerNombre("Jorge Alvarez");
        cheq2.establecerNombreb("Produbanco");
        cheq2.establecerComision();
        
        System.out.println(cheq1);
        System.out.println(cheq2);
           
    }
        
}
