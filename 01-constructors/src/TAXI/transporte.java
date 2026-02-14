
package TAXI;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class transporte {
    
    static double k;
    static int r;
    static String p;
   
    
    static void leerDatos(){
        
        
        
        p=JOptionPane.showInputDialog("INGRESE LAS PLACAS DEL TAXI");
        k=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LOS KILOMETROS DEL TAXIMETRO")); 
        r=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE RUEDAS"));
         
    }
    
    public static void main(String args[]){

        leerDatos();
        MedioDeTransporte taxi= new MedioDeTransporte(p,k,r);
        
        
        
        
        JOptionPane.showMessageDialog(null, new JTextArea("EL NUMERO DE PLACAS ES: "+p+"\n"+"KILOMETROS RECORRIDOS POR EL TAXIMETRO: "+k+"\n"+"EL NUMERO DE RUEDAS ES: "
                +r+"\n"+"LITROS CONSUMIDOS: "+taxi.calcularLitros()+"\n"+"EL SUELDO ES: "+taxi.sueldo()));
       
        
        
    }
    
    
}
