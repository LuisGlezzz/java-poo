
package PRODUCTO;

public class producto {
    
        double cmo,cmp;
        producto()
        {           
        }
        producto(double cmp, double cmo)
        {
            this.cmp=cmp;
            this.cmo=cmo;
            
            
        }
        
        public void setcmo(double cmo){
            
            this.cmo=cmo;
            
        }
        
        
        void setcp(double cmp){
            
            this.cmp=cmp;    
        }
        
        double getcp(){
            return cmp;
        }
        
        double getcmo(){
            return cmp;
        }
        
        double calcularcp(){
            
            double cp;
            cp=cmo+cmp;
            return cp;
            
            
            
        }
        
        double calcularv(){
            
            double cv;
            
            cv=calcularcp()+(calcularcp()*0.50);
          return cv;        
        }
        
    }
    //fin de clase
    

