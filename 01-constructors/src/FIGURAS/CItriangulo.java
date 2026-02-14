package FIGURAS;
public class CItriangulo {
    double base,altura;
    CItriangulo(){
    }
    CItriangulo(double b, double h){
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
        double A=(base*altura)/2;
        return A;
    }
}
