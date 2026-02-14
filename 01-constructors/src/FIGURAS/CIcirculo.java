package FIGURAS;
public class CIcirculo {
    double radio;
    CIcirculo(){
    }
    CIcirculo(double r){
        r=radio;
    }
    void setRadio(double r){
        radio=r;
    }
    double getRadio(){
        return radio;
    }
    double calcularArea(){
        double A=Math.PI*(radio*radio);
        return A;
    }
}
