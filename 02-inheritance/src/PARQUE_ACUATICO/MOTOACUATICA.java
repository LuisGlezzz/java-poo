
package PARQUE_ACUATICO;


public class MOTOACUATICA extends VEHICULOS{
    
    MOTOACUATICA(){
        
        super();
    }
    public int costoMOTOACUATICA(){
        int costo=0; 
        costo=horas*motoacuatica;    
        return costo;
    
    }
    public double deposito(){
        double deposito=0;
        deposito=costoMOTOACUATICA()*0.10;
        return deposito;   
    }   
}
    

