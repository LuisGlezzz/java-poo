
package TAXI;


public class MedioDeTransporte {
    
    double kilometros;
    int ruedas;
    String placas;
    
    MedioDeTransporte(String p,double k,int r){
        
        placas=p;
        kilometros=k;
        ruedas=r;
    }
    
    double calcularLitros(){
        double L=0;
        
        L=kilometros/15;
        
        return L;
    }
    
    double sueldo(){
        double sueldo;
        
        sueldo=kilometros*5-calcularLitros()*19.50;
        
        return sueldo;
        
        
    }
    
    void setkilometros(double k){
        
        kilometros=k;
        
    }
    
    void setplacas(String p){
        
        placas=p;
        
    }
    void setruedas(int r){
        
        ruedas=r;
        
    }
    
    double getkilometros(){
        
        return kilometros;
    }
    int getruedas(){
        
        return ruedas;
    }
    
    String getplacas(){
        
        return placas;
    }
    
    
}
