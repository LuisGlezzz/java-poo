
package ECUACION_SEGUNDO_GRADO;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class main_ecuacion {
    
    static int a,b,c;
    
    static void leerdatos(){
        
        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de A"));
        b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de B"));
        c=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de C"));       
    }
    public static void main(String args[]){
        
        leerdatos();
        
        ecuacion A= new ecuacion(a,b,c);
        
        JOptionPane.showMessageDialog(null, new JTextArea("EL RESULTADO DE LA ECUACION ES= "+"\n"+A.calcularecuacion2()));
  
    }
    
}
