
package ECUACION_SEGUNDO_GRADO;
public class ecuacion {
    int a,b,c;
    
    ecuacion(int a,int b, int c){
        
        this.a=a;
        this.b=b;
        this.c=c;    
    }
    
    String calcularecuacion2(){
        
        String cad="";
        double d,x1,x2,x;
        d=(b*b)-(4*a*c);
        if(d>0)
        {
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            cad="x1= "+x1+"\n"+"x2= "+x2;         
        }
        
        if(d==0){
            
            x=-b/(2*a);
            cad="x= "+x;
        }
        
        if(d<0){
            
            cad="RAIZ IMAGINARIA";
        }
        
        return cad;
}

}
