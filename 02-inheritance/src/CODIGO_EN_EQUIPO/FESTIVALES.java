
package CODIGO_EN_EQUIPO;


public class FESTIVALES {
    
    int boleto,boletos;
    String nombre;

    public FESTIVALES(int boleto, int boletos,String nombre) {
        this.boleto=boleto;
        this.boletos=boletos;
        this.nombre=nombre;
    }
    String BoletoFestival(){
        String entrada="";
        
        switch (boleto) {
            case 1:
                entrada="ESTANDAR";
                break;
            case 2:
                entrada="VIP";
                break;
            case 3:
                entrada="PREMIUM";
                break;

        }
        
        return "TU ENTRADA ES:" + entrada;
    }
    int costoEntrada(){
          int CostoE=0;
          
          switch (boleto) {
              case 1:
                  
                  CostoE=600;
                  break;
              case 2:
                  CostoE=1500;
                  break;
              case 3:
                  CostoE=2500;
                 break;

          }
          
          return CostoE;
      }
  int calcularTotal(){
        int total=0;
        
        total=costoEntrada()*boletos;
        
         return total;
        
    }
       
   
     
    
}
