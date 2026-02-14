
package SELECCION_FUTBOL;


public class paramedico extends SeleccionFutbol{
    
    String titulo;

    public paramedico(String titulo, String nombre, int edad) {
        super(nombre, edad);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
}
