/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILES;

import javax.swing.JOptionPane;

/**
 *
 * @author scomp
 */
public class PruebaHerencia {
    
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        MaterialEscolar material[]= new MaterialEscolar[5];
        Cuaderno c= new Cuaderno(100,150.50f);
        Pegamento p= new Pegamento("blanco", 20.60f);
        Cuaderno cc = new Cuaderno(50,25.60f);
        JuegoGeometrico j= new JuegoGeometrico(12, 100.60f);
        
        JOptionPane.showMessageDialog(null,"HOJAS DEL CUADERNO: "+c.getNumeroHojaS()+"\nPRECIO DEL CUADERNO: "+c.getPrecio()+"\nTIPO DE PEGAMENTO: "+p.getColor()+
                "\nPRECIO DEL PEGAMENTO: "+p.getPrecio()+"\nNUMERO DE PIEZAS JUEGO GEOMETRICO: "+j.getNumeroPiezas()+"\nPRECIO DEL JUEGO GEOMETRICO: "+j.getPrecio());

    }
    
    
}
