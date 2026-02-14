/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SELECCION_FUTBOL;


public class Jugadores extends SeleccionFutbol {

    String posicion;
    int numero;

    public Jugadores(String posicion, int numero, String nombre, int edad) {
        super(nombre, edad);
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumero() {
        return numero;
    }

    
    
    
    
    
    
}
