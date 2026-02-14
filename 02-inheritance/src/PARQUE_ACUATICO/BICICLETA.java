
package PARQUE_ACUATICO;


public class BICICLETA extends VEHICULOS {
    
    BICICLETA(){
        
        super();
    }
    public int costoBICICLETA(){
        int costo=0; 
        costo=horas*bicicleta;    
        return costo;
    
    }
    public double deposito(){
        double deposito=0;
        deposito=costoBICICLETA()*0.10;
        return deposito;   
    }   
    
}
