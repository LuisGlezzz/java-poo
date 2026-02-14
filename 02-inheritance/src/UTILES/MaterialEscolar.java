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
public class MaterialEscolar {
    
    float precio;
    String nombre,marca,codigo;
    
    MaterialEscolar(float p){
        precio=p;
        
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float p) {
        precio = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String cod) {
        codigo = cod;
    }
    
    
    
    
    
}
