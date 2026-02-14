
package LLAMADAS;

import javax.swing.JOptionPane;

public class recibo {
    
    public static void main(String [] args){
        int m,t;
        char resp='s';
        do{
        llamada a= new llamada();
        t=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tipo de llamada\n1.local\n2.nacional\n3.internacional"));
        m=Integer.parseInt(JOptionPane.showInputDialog("¿cuantos minutos duro la llamada"));
        
        a.setmin(m);
        a.settipo(t);
        
        JOptionPane.showMessageDialog(null,"los minutos de la llamada fueron"+"\n"+a.getmin()
        +"\n"+"total a pagar es"+a.calcularcosto());
resp=JOptionPane.showInputDialog("¿desea realizar otra llamada?").charAt(0);
        }while(resp=='s'||resp=='S');
        }
}
