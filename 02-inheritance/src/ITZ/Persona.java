package ITZ;
import javax.swing.*;
public class Persona {
    String curp, nom;
    int edad;
    
    Persona(){
    }
    void leerDatos(){
        nom=JOptionPane.showInputDialog("Ingrese el nombre");
        curp=JOptionPane.showInputDialog("Ingrese el CURP");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
    }
    String desplegarDatos(){
        int i;
        String cad="Nombre\tEdad\tCURP\n";
        for(i=0;i<1;i++){
            cad+=nom+"\t"+edad+"\t"+curp+"\n";
        }
        return cad+"\t";
    }
}
