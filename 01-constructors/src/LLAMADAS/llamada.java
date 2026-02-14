
package LLAMADAS;


public class llamada {
    
    int tipo,min;
    llamada()
    {
        
    }
    llamada(int m, int t)
    {
        min=m;
        tipo=t;        
    }
    void settipo(int t){
        tipo=t;
        
    }
    
    void setmin(int m){
        
        min=m;
    }
    
    int gettipo(){
        
        return tipo;
    }
    int getmin(){
        
        return min;
    }
    
    double calcularcosto(){
        double costo=0;
        
        switch(tipo){
            
            case 1:costo=3;
                break;
            case 2:costo=min*1.5;
            break;
            case 3:costo=min*17;
            break;
            
            
        }
        
        return costo;
        
        
    }
    
    String nombretipo(){
        
        
        String nomt="";
        
        switch(tipo){
            
            case 1:
                nomt="local";
                break;
                case 2:
                nomt="nacional";
                break;
                case 3:
                nomt="internacional";
                break;
                
        
    }
        return nomt;
        
    }
        
            
    
    
    
}
