
package PARQUE_ACUATICO;

public class LANCHA extends VEHICULOS {
    
     LANCHA(){
        
        super();
    }
    public int costoLANCHA(){
        int costo=0; 
        costo=horas*lancha;    
        return costo;
    
    }
    public double deposito(){
        double deposito=0;
        deposito=costoLANCHA()*0.10;
        return deposito;   
    }   
    
    
    
}
