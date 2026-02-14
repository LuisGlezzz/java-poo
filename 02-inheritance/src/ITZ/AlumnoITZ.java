package ITZ;
import javax.swing.JOptionPane;
public class AlumnoITZ extends Persona {
    String carrera, noControl;
    int sem;
    
    AlumnoITZ(){
    }
    void leerDatosA(){
        super.leerDatos();
        carrera=JOptionPane.showInputDialog("Ingrese la carrera");
        noControl=JOptionPane.showInputDialog("Ingrese numero de control");
        sem=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre"));
    }
    String desplegarDatosA(){
        int i;
        super.desplegarDatos();
        String cad="No.Control\tCarrera\tSemestre\n";
        for(i=0;i<1;i++){
            cad+=noControl+"\t"+carrera+"\t"+sem+"\n";
        }
        return super.desplegarDatos()+cad;
    }
}
