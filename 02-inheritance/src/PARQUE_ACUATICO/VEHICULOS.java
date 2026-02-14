
package PARQUE_ACUATICO;


public class VEHICULOS {
    
     int bicicleta,banana,lancha,motoacuatica,horas;
    
    VEHICULOS(){ 
        
    }
    
    /*
    mis metodos para los diferentes costos de vehiculos acuaticos
    */
    public void setbicicleta(int costB){
        
        bicicleta=costB;  
    }
    public void setlancha(int costLA){
        
        lancha=costLA;  
    }
    public void setmotoacuatica(int costMA){
        
        motoacuatica=costMA;  
    }
    public void setbanana(int costBA){
        
        banana=costBA;  
    }
    
    /*
    metodos para obtener costovehiculos
    */
    
    public int getbicicleta(){
        
        return bicicleta;
    }
    public int getlancha(){
        
        return lancha;
    }
    public int getbanana(){
        
        return banana;
    }
    public int getmotoacuatica(){
        
        return motoacuatica;
    }
    
    /*
    metodo para obtener horas
    */
    
    public void sethoras(int h){
        
        horas=h;

    }
    
    public int gethoras(){
        
        return horas;
    }
     
}
