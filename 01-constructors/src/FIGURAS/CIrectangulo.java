package FIGURAS;
public class CIrectangulo {
    double base,altura;
    CIrectangulo(){
    }
    CIrectangulo(double b, double h){
        b=base;
        h=altura;
    }
    void setBase(double b){
        base=b;
    }
    void setAltura(double h){
        altura=h;
    }
    double getBase(){
        return base;
    }
    double getAltura(){
        return altura;
    }
    double calcularArea(){
        double A=base*altura;
        return A;
    }
}
