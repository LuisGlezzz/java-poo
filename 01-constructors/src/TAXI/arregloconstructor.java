
package TAXI;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class arregloconstructor {
    

    
    static double k;
    static int r;
    static String p;
   
    
    static void leerDatos(){
        
        
        
        p=JOptionPane.showInputDialog("INGRESE LAS PLACAS DEL TAXI");
        k=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LOS KILOMETROS DEL TAXIMETRO")); 
        r=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE RUEDAS"));
         
    }
    
    public static void main(String args[]){
        String cad="No.taxi\tPLACAS\tKILOMETROS\t\tLITROS\t\tRUEDAS\tSUELDO\n";
        int i;
        
        MedioDeTransporte [] taxi= new MedioDeTransporte[2];
        
        for(i=0;i<taxi.length;i++){
        leerDatos();
        taxi[i]= new MedioDeTransporte(p,k,r);

        taxi[i].setplacas(p);
        taxi[i].setkilometros(k);
        taxi[i].setruedas(r);
        
        
        
        cad=cad+(i+1)+"\t"+taxi[i].getplacas()+"\t"+taxi[i].getkilometros()+"\t\t"+taxi[i].calcularLitros()+"\t"+taxi[i].getruedas()+"\t"+taxi[i].sueldo()+"\n";
                
        

       
        }
        
        JOptionPane.showMessageDialog(null, new JTextArea(cad));
        
    }
    
    
}
    
    
    

