
package TAXISTA;

import javax.swing.JOptionPane;


public class ArranqueTaxista {
public static void main (String arg[]){
int lic,edad;

lic=Integer.parseInt(JOptionPane.showInputDialog("NUMERO DE LICENCIA?"));
edad=Integer.parseInt(JOptionPane.showInputDialog("INGRESA EDAD?"));

Taxista tax1 = new Taxista(lic);
tax1.setEdad(edad);
System.out.println( tax1.getNombre());
System.out.println(tax1.getEdad());
System.out.println(tax1.getLicencia());
}}
