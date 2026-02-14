
package PRODUCTO;

import javax.swing.JOptionPane;


public class Ejecutable {
    
    public static void main(String args[]){
        
        producto a= new producto();
        double cmo,cp;
        
        cmo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el costo de mano de obra"));
        cp=Integer.parseInt(JOptionPane.showInputDialog("ingrese el costo de produccion"));
        
        a.setcmo(cmo);
        a.setcp(cp);
        
        JOptionPane.showMessageDialog(null, "el costo de mano de obra es: "+a.getcmo()+"\n"+"el costo de produccion es: "+a.getcp()+
                "\n"+"el costo de venta es: "
                + ""+a.calcularv()+"\n"+" el costo de produccion es: "+"\n"
                +a.calcularcp());
        
        
        
        
 
        
       
        
        
        
        
    }
    
}
