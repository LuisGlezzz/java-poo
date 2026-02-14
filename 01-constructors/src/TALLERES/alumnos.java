
package TALLERES;
public class alumnos {
    int taller,escuela;
    alumnos(){  
    }
    void settaller(int t){
        
        taller=t; 
    }
    void setescuela(int e){
        
        escuela=e;   
    }  
    int gettaller(){
        
        return taller;
   
    }
    int getescuela(){
        
        return escuela;
        
    }
    String nalumnos(){
        
        String n="";
        
        switch(taller){
            
            case 1:  
                n="AJEDREZ";
                break;
                case 2:  
                n="DANZA";
                break;
                case 3:  
                n="FOTOGRAFIA";
                break;
                case 4:  
                n="MAGIA";
                break;
                case 5:  
                n="MUSICA";
                break;
        }
        
        return n;
            
        
        
    }
    String nescuela(){
        
        String ne="";
        
        switch(escuela){
            
            case 1:  
                ne="ITZ";
                break;
                case 2:  
                ne="UPEMOR";
                break;
                case 3:
                ne="UTEZ";
                break;
                case 4:  
                ne="POLI";
                break;
                case 5:  
                ne="UAEM";
                break;
        }
        
        return ne;
            
        
        
    }

}
