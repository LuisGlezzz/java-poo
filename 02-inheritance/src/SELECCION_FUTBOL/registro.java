
package SELECCION_FUTBOL;

import javax.swing.JOptionPane;


public class registro {
    
    static String nombre,titulo,posicion;
    static int edad,numero,menu,identificacion;
    
    static void leerdatosPersonales(){
        
        nombre=JOptionPane.showInputDialog("ingrese el nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));    
    }
    static void leerdatosJugador(){
        
        posicion=JOptionPane.showInputDialog("INGRESE LA POCISION DEL JUGADOR");
        numero=Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE LA CAMISETA"));
   
    }
    static void leerdatosEntrenador(){
        
        identificacion=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE IDENTIFICACION"));
    }
    static void leerdatosParamedico(){
        
        titulo=JOptionPane.showInputDialog("¿EL PARAMEDICO TIENE TITULO?");
    }
    public static void main(String[] args) {
        
        menu=Integer.parseInt(JOptionPane.showInputDialog("QUE DESEA REGISTRAR\n 1.Jugador\n 2.Entrenador\n 3.paramedico"));
        
        switch (menu) {
            
            case 1:
                
                leerdatosPersonales();
                leerdatosJugador();
                Jugadores J= new Jugadores(posicion, numero,nombre, edad );
                JOptionPane.showMessageDialog(null,"LOS DATOS REGISTRADOS DEL JUGADOR SON\n"+"NOMBRE: "+ J.getNombre()+"\nEDAD: "+J.getEdad()+"\nPOSICION: " + J.getPosicion() + "\nNO. CAMISETA: "+ J.getNumero());
           break;
                
                case 2:
                    
                    
                    leerdatosPersonales();
                    leerdatosEntrenador();
                    Entrenador E= new Entrenador(identificacion, nombre, edad);
                    JOptionPane.showMessageDialog(null, "LOS DATOS REGISTRADOS DEL JUGADOR SON\n"+"NOMBRE: "+E.getNombre()+"\nEDAD: "+E.getEdad()+"\nIDENTIFICACION: "+E.getIdentificacion());
                break;
                
                 case 3:
                    
                    leerdatosPersonales();
                    leerdatosParamedico();
                    paramedico P= new paramedico(titulo, nombre, edad);
                    JOptionPane.showMessageDialog(null, "LOS DATOS REGISTRADOS DEL JUGADOR SON\n"+"NOMBRE: "+P.getNombre()+"\nEDAD: "+P.getEdad()+"\nTitulo: "+P.getTitulo());
                break; 
        }
    }
 
}
