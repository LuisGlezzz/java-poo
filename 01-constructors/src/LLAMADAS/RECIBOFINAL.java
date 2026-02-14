
package LLAMADAS;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class RECIBOFINAL {
    
    public static void main(String []args){
        
        int m,t,i;
        double c;
        String cad="NO.\tMINUTOS \tTIPO DE LLAMADA\t\tCOSTO DE LLAMADA\n";
        llamada[] lista = new llamada[5];
        
        for(i=0;i<lista.length;i++){
            
            t=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tipo de llamada\n1.local\n2.nacional\n3.internacional"));
            m=Integer.parseInt(JOptionPane.showInputDialog("¿cuantos minutos duro la llamada?"));
            
            lista[i] = new llamada();
            lista[i].setmin(m);
            lista[i].settipo(t);
            c=lista[i].calcularcosto();
            
            cad=cad+(i+1)+"\t"+lista[i].getmin()+"\t"+lista[i].nombretipo()+"\t\t"+c+"\n";
     
        }
        
        JOptionPane.showMessageDialog(null, new JTextArea(cad));
    }
    
    
    
}
