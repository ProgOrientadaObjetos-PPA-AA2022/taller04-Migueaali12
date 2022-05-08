
package automovil;


public class Ejecutor {
    
    public static void main(String[] args) {
        
        Automovil auto1 = new Automovil("1105652604","Toyota");
        auto1.establecerAniof(2016);
        auto1.establecerValorv(17000);
        auto1.establecerValorm();
        
        Automovil auto2 = new Automovil(2019,25000);
        auto2.establecerCedula("1105478459");
        auto2.establecerMarca("Mercedes Benz");
        auto2.establecerValorm();
        
        System.out.println(auto1);
        
         System.out.println(auto2);
        
        
        
    }
    
}
