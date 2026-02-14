package ITZ;
import javax.swing.*;
public class Agenda{
    public static void main(String args[]){
        int i;
        String cad="";
        AlumnoITZ[] listaAlum=new AlumnoITZ[1];
        for(i=0;i<listaAlum.length;i++){
            listaAlum[i]=new AlumnoITZ();
            listaAlum[i].leerDatosA();
            cad+=listaAlum[i].desplegarDatosA();
        }
        JOptionPane.showMessageDialog(null, new JTextArea(cad));
    }
}
