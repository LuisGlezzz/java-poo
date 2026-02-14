
package TALLERES;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class ejecutablefinal {
 
    public static void main(String args[]){
    
    int i,t,e;
    String cad="NO."+"\t"+"NOMBRE DEL TALLER\tNOMBRE DE LA ESCUELA\n";
    
   
       alumnos [] lista = new alumnos [5];
       for(i=0;i<lista.length;i++){
           
       t=Integer.parseInt(JOptionPane.showInputDialog("A QUE TALLER DESEA INSCRIBIRSE\n1.AJEDREZ\n2.DANZA\n3.FOTOGRAFIA\n4.MAGIA\n5.MUSICA"));
       e=Integer.parseInt(JOptionPane.showInputDialog("EN QUE ESCUELA DESEA INSCRIBIRSE\n1.ITZ\n2.UPEMOR\n3.UTEZ\n4.POLI\n5.UAEM"));
       
      
           lista[i] = new alumnos();
           lista[i].settaller(t);
           lista[i].setescuela(e);
           lista[i].nalumnos();
           lista[i].nescuela();
           
           
      
cad=cad+(i+1)+"\t"+lista[i].nalumnos()+"\t\t"+lista[i].nescuela()+"\n";
       }
       
    JOptionPane.showMessageDialog(null, new JTextArea(cad));
       
}}
