package FIGURAS;
import javax.swing.*;
public class Figuras {
    
    public static void main (String args[]){
        char resp = 's';
        do {
        int opc=Integer.parseInt(JOptionPane.showInputDialog("¿Que figura desea?\n1=Rectangulo\n"
                + "2=Triangulo\n3=Circulo"));
        switch (opc){
            case 1:{
                CIrectangulo r=new CIrectangulo();
                double b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo"));
                double h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo"));
                r.setAltura(h);
                r.setBase(b);
                JOptionPane.showMessageDialog(null, new JTextArea("El area del rectangulo se calcula mediante la formula\n\n"
                        + "\tA= Base x Altura\n\nEn este caso seria:\n\n\tA= "+r.getBase()+" x "+r.getAltura()+"\n\n"
                        +"Entonces el area del rectangulo es: "+r.calcularArea()));
                break;}
            case 2:
                CItriangulo t=new CItriangulo();
                double b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
                double h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
                t.setAltura(h);
                t.setBase(b);
                JOptionPane.showMessageDialog(null,new JTextArea("El area del triangulo se calcula mediante la formula\n\n"
                        + "\tA= (Base x Altura) / 2\n\nEn este caso seria:\n\n\tA= "+"( "+t.getBase()+" x "+t.getAltura()+" ) "+"/ 2"+"\n\n"
                        +"Entonces el area del rectangulo es: "+t.calcularArea()));
                break;
            case 3:
                CIcirculo c=new CIcirculo();
                double r=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
                c.setRadio(r);
                JOptionPane.showMessageDialog(null, new JTextArea("El area del circulo se calcula mediante la formula\n\n"
                        + "\tA= PI x r^2\n\nEn este caso seria:\n\n\tA= PI x "+c.getRadio()+"^2"+"\n\n"
                        +"Entonces el area del circulo es: "+c.calcularArea()));
                break;
        }
        resp = JOptionPane.showInputDialog("¿Quiere escojer otra figura? Si/No").charAt(0);
        }while(resp == 's' || resp == 'S');
    }
}
