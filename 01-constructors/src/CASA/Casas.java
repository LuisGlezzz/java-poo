package CASA;

import javax.swing.JFrame;

public class Casas extends JFrame{
    int nhab;
    Casas(){
        
    }
    void setHabitaciones (int nhab){
        this.nhab=nhab;
    }
    int getHabitaciones(){
        return nhab;
    }
    int obtenerMetros(){
        int m2=0;
        switch(nhab){
            case 1: m2=60;
            break;
            case 2: m2=80;
            break;
            case 3: m2=100;
            break;
        }
        return m2;
    }
    int obtenerCostoCasa(){
        int cont=0;
        switch(nhab){
            case 1: cont=450000;
            break;
            case 2: cont=600000;
            break;
            case 3: cont=700000;
            break;
        }
        return cont;
    }
    double calcularEscrituras(){
        return obtenerCostoCasa()*0.03;
    }
    int obtenerCostoAcabado(char resp){
        int acabados=0;
        if (resp=='S'|| resp=='s')
        acabados=100000;
        else 
        acabados=0;
        return acabados;
    }
    
     public void ventana(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
  
            
}
