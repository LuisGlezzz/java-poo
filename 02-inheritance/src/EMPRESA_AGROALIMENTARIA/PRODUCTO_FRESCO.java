
package EMPRESA_AGROALIMENTARIA;

import javax.swing.JOptionPane;


public class PRODUCTO_FRESCO extends PRODUCTO {
    
    String ProductoPR,fechaEnvasado,paisOrigen;

    public PRODUCTO_FRESCO(String ProductoPR, String fechaEnvasado, String paisOrigen, String fechaCaducacion, String lote) {
        super(fechaCaducacion, lote);
        this.ProductoPR = ProductoPR;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    public String getNombre() {
        return ProductoPR;
    }
    public void setNombre(String ProductoPR) {
        this.ProductoPR = ProductoPR;
    }
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
   
    public void desplegardatosPR(){
        JOptionPane.showMessageDialog(null,getNombre()+getFechaEnvasado()+getPaisOrigen()+getFechaCaducacion()+getLote());
    }
    
}
