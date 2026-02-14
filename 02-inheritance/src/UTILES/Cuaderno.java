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
public class Cuaderno extends MaterialEscolar{
    
    int numeroHojas;
    String tipo;
    boolean conPortada;

    public Cuaderno(int hojas, float p) {
        super(p);
        numeroHojas=hojas;
    }

    public int getNumeroHojaS() {
        return numeroHojas;
    }

    public void setNumeroHojaS(int nh) {
        numeroHojas = nh;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public boolean isConPortada() {
        return conPortada;
    }

    public void setConPortada(boolean p) {
        conPortada = p;
    }
  
}

