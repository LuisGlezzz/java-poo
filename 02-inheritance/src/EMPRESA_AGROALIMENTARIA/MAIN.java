
package EMPRESA_AGROALIMENTARIA;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class MAIN {
    
    static String fechaCaducacion,lote,ProductoPR,fechaEnvasado,paisOrigen,nombreCONG,Temperatura,nombreREFRIG,CodigoSupervision;
    

    public static void main(String[] args) {
        

        PRODUCTO_FRESCO manzanas= new PRODUCTO_FRESCO("NOMBRE DEL PRODUCTO: MANZANAS\n","FECHA DE ENVASADO:  02-09-19\n","PAIS DE ORIGEN: MEXICO\n", "FECHA DE CADUCACION: 30-08-2020\n","NUMERO DE LOTE: LBN5463\n\n");
        PRODUCTO_CONGELADO Pescado= new PRODUCTO_CONGELADO("NOMBRE DEL PRODUCTO: PESCADO\n","TEMPERATURA DE CONSERVACION: 40ºF \n", "FECHA DE CADUCACION: 14-12-2020\n","NUMERO DE LOTE: LPN006\n\n");
        PRODUCTO_REFRIGERADO Leche=new PRODUCTO_REFRIGERADO("NOMBRE DEL PRODUCTO: LECHE\n","CODIGO DE SUPERVISION: B#095\n", "FECHA DE CADUCACION: 2-03-2020\n","NUMERO DE LOTE: LPN0996\n\n");

        
        String cad=manzanas.getNombre()+manzanas.getFechaEnvasado()+manzanas.getPaisOrigen()+manzanas.getFechaCaducacion()+manzanas.getLote()
        +Pescado.getNombreCONG()+Pescado.getTemperatura()+Pescado.getFechaCaducacion()+Pescado.getLote()+Leche.getNombreREFRI()+Leche.getCodigoSupervision()+Leche.getFechaCaducacion()+Leche.getLote();
        
        JOptionPane.showMessageDialog(null, new JTextArea(cad+"TOTAL A PAGAR: $450"));
     
    }
    
}
