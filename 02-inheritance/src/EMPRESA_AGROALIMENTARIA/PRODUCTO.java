
package EMPRESA_AGROALIMENTARIA;

public class PRODUCTO {
    
    String fechaCaducacion,lote;

    public PRODUCTO(String fechaCaducacion, String lote) {
        this.fechaCaducacion = fechaCaducacion;
        this.lote = lote;
    }

    public String getFechaCaducacion() {
        return fechaCaducacion;
    }

    public void setFechaCaducacion(String fechaCaducacion) {
        this.fechaCaducacion = fechaCaducacion;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    
    
    
}
