package VENDEDOR;

public class Vendedor 
{
    String nombre;
    int zona,edad;
    double ventas;
    Vendedor()
    {
        
    }
    void setNombre(String nom)
    {
        nombre=nom;
    }
    void setZona(int z)
    {
        zona=z;
    }
    void setEdad(int e)
    {
        edad=e;
    }
    void setVentas(double v)
    {
        ventas=v;
    }
    String getNombre()
    {
        return nombre;
    }
    int getZona()
    {
        return zona;
    }
    int getEdad()
    {
        return edad;
    }
    double getVentas()
    {
        return ventas;
    }
    double obtenersg()
    {

        double sgm;
        if(edad>60)
        {
            sgm=2000*0.05;
        } 
        else{
           sgm=0;        
        }
        return sgm;
    }
    double obtenerZona()
    {
       
        double com=0;
        switch(zona)
        {
            case 1:com=ventas*0.10;
            break;
            case 2:com=ventas*0.15;
            break;
            case 3:com=ventas*0.20;
            break;
        }
        return com;
    }
    
    double suma(){
        
        double suma=0;
        
        suma=2000-obtenersg()+obtenerZona();
        
        return suma;
        
        
        
    }
    
    
    
    
}




