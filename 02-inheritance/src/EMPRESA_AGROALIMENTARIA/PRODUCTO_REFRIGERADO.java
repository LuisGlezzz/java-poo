
package EMPRESA_AGROALIMENTARIA;

import javax.swing.JOptionPane;

public class PRODUCTO_REFRIGERADO extends PRODUCTO{
    
    String nombreREFRI,CodigoSupervision;

    public PRODUCTO_REFRIGERADO(String nombreREFRI, String CodigoSupervision, String fechaCaducacion, String lote) {
        super(fechaCaducacion, lote);
        this.nombreREFRI = nombreREFRI;
        this.CodigoSupervision = CodigoSupervision;
    }

    public String getNombreREFRI() {
        return nombreREFRI;
    }

    public void setNombreREFRI(String nombreREFRI) {
        this.nombreREFRI = nombreREFRI;
    }

    public String getCodigoSupervision() {
        return CodigoSupervision;
    }

    public void setCodigoSupervision(String CodigoSupervision) {
        this.CodigoSupervision = CodigoSupervision;
    }
    
    public void desplegardatosREFRIG(){
        JOptionPane.showMessageDialog(null,getNombreREFRI()+getCodigoSupervision()+getFechaCaducacion()+getLote());
    }
    
    
}
