
package EMPRESA_AGROALIMENTARIA;

import javax.swing.JOptionPane;


public class PRODUCTO_CONGELADO extends PRODUCTO{
    
    String nombreCONG,Temperatura;

    public PRODUCTO_CONGELADO(String nombreCONG, String Temperatura, String fechaCaducacion, String lote) {
        super(fechaCaducacion, lote);
        this.nombreCONG = nombreCONG;
        this.Temperatura = Temperatura;
    }

    public String getNombreCONG() {
        return nombreCONG;
    }

    public void setNombreCONG(String nombreCONG) {
        this.nombreCONG = nombreCONG;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String Temperatura) {
        this.Temperatura = Temperatura;
    }
    
    public void desplegardatosCONG(){
        JOptionPane.showMessageDialog(null,getNombreCONG()+getTemperatura()+getFechaCaducacion()+getLote());
    }
    
}
   
