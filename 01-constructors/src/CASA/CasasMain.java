package CASA;

import javax.swing.*;

public class CasasMain extends JFrame{
    
    public CasasMain(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

   
    
    public static void main (String [] args){
        int nhab;
        nhab=Integer.parseInt(JOptionPane.showInputDialog("1. METROS= 60\n 2.METROS=80\n3.METROS=100\n"));
        
        Casas A= new Casas();
        
        A.setHabitaciones(nhab);
        
        JOptionPane.showMessageDialog(null, new JTextArea("Los metros de la casa son: "+A.obtenerMetros()+"\n"+"El precio de la casa es: "+A.obtenerCostoCasa()+"\n"+
                "El costo de las escrituras es: "+A.calcularEscrituras()));
        
        
    }
}
