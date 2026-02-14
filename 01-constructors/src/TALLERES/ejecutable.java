
package TALLERES;
import javax.swing.*;


public class ejecutable {
    
    public static void main(String [] args){
        
        int t,e;
        char resp='s';
      
        do{
       alumnos a= new alumnos();
       
       t=Integer.parseInt(JOptionPane.showInputDialog("A QUE TALLER DESEA INSCRIBIRSE\n1.AJEDREZ\n2.DANZA\n3.FOTOGRAFIA\n4.MAGIA\n5.MUSICA"));
       e=Integer.parseInt(JOptionPane.showInputDialog("EN QUE ESCUELA DESEA INSCRIBIRSE\n1.ITZ\n2.UPEMOR\n3.UTEZ\n4.POLI\n5.UAEM"));
       
      a.settaller(t);
      a.setescuela(e);
      
      JOptionPane.showMessageDialog(null, new JTextArea(" VAS EN EL TALLER: "+a.nalumnos()+"\n"+"EN LA ESCUELA: "+a.nescuela()+"\n"));
      
      resp=JOptionPane.showInputDialog("¿DESEAS CAMBIAR DE TALLER?").charAt(0);
        }while(resp=='s'||resp=='S');
        
    }

    }
    

