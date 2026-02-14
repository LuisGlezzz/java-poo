package VENDEDOR;

import javax.swing.*;


public class Ventas 
{
        String nom;
        int e,z;
        double v;
        double s;
        void leerdatos(){
        nom=JOptionPane.showInputDialog("NOMBRE DEL VENDEDOR:");
        e=Integer.parseInt(JOptionPane.showInputDialog("EDAD DEL VENDEDOR:"));
        z=Integer.parseInt(JOptionPane.showInputDialog("¿A QUE ZONA PERTENECE:\n1.-NORTE\n2.-SUR\n3.-CENTRO"));
        v=Integer.parseInt(JOptionPane.showInputDialog("TOTAL DE VENTAS:"));
            
        }
    public static void main (String[]arg)
    {
       String cad="NOMBRE\tEDAD\tSEGURO\tZONA\tBONO POR ZONA\tTOTAL VENDIDO\tSUELDO TOTAL\n";
        Vendedor [] A1=new Vendedor[1];
       Ventas r=new Ventas();
      for(int i=0;i<A1.length;i++){
        r.leerdatos();
       A1[i]= new Vendedor();
       
     
        A1[i].setNombre(r.nom);
        A1[i].setEdad(r.e);
        A1[i].setZona(r.z);
        A1[i].setVentas(r.v);
       
        cad=cad+A1[i].getNombre()+"\t"+A1[i].getEdad()+"\t"+A1[i].obtenersg()+"\t"+A1[i].getZona()+"\t"+A1[i].obtenerZona()+"\t\t"+A1[i].getVentas()+"\t\t"+A1[i].suma()+"\n";
      }
      JOptionPane.showMessageDialog(null, new JTextArea(cad));        
        
       /* 
        JOptionPane.showMessageDialog(null, new JTextArea("EL NOMBRE DEL EMPLEADO ES:"+ A1.getNombre()+"\nTIENE UNA EDAD DE: "
                +A1.getEdad()+"AÑOS"+"\n SU SUELDO BASE ES DE: 2000\n Y SU SEGURO ES "+A1.obtenersg()+"\nTOTAL DE VENTAS ES DE: "
        +A1.getVentas()+"\nBONO POR ZONA ES DE: "+A1.obtenerZona()+"\n EL SUELDO TOTAL MAS EL BONO ES DE: "+A1.suma()));*/
    }
}
