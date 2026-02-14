
package SELECCION_FUTBOL;


public class Entrenador extends SeleccionFutbol{
     
    int identificacion;

    public Entrenador(int identificacion, String nombre, int edad) {
        super(nombre, edad);
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }
 
}
