/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILES;

/**
 *
 * @author scomp
 */
public class JuegoGeometrico extends MaterialEscolar{
    
    int numeroPiezas;
    String descripcion;

    public JuegoGeometrico(int val, float p) {
        super(p);
       setNumeroPiezas(val);
        super.setNombre("ABACO");
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public void setNumeroPiezas(int n) {
        numeroPiezas = n;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String d) {
        descripcion = d;
    }
    
    
    
}
