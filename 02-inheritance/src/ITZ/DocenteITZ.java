package ITZ;
import javax.swing.JOptionPane;
public class DocenteITZ extends Persona {
    int noTarjeta;
    double sueldo;
    String depto;
    
    DocenteITZ(){
    }
    void leerDatosD(){
        super.leerDatos();
        noTarjeta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de tajeta"));
        depto=JOptionPane.showInputDialog("Ingrese su sueldo");
        sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
    }
    String desplegarDatosD(){
        int i;
        super.desplegarDatos();
        String cad="No.Tarjeta\tDepartamento\tSueldo\n";
        for(i=0;i<2;i++){
            cad+=noTarjeta+"\t"+depto+"\t"+sueldo+"\n";
        }
        return cad;
    }
}
