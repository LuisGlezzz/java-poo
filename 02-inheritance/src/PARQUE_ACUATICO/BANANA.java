
package PARQUE_ACUATICO;


public class BANANA extends VEHICULOS {
    
    
    
    BANANA(){
        
        super();
    }
    public int costobanana(){
        int costo=0; 
        costo=horas*banana;    
        return costo;
    
    }
    public double deposito(){
        double deposito=0;
        deposito=costobanana()*0.10;
        return deposito;   
    }   
}
