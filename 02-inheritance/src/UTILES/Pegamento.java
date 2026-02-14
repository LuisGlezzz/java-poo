/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILES;

/**
 *
 * @author scomp
 */
public class Pegamento extends MaterialEscolar
    {
    
    String presentacion,color;
    
    Pegamento(String c,float p){
        
        super(p);
        color=c;
        
        
        
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String p) {
        presentacion = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }
    
    
            
    
    
}
