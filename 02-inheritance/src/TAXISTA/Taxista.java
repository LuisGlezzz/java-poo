
package TAXISTA;
public class Taxista extends
Persona {
private int nLicencia;
public Taxista(int licencia)
{
super();

nLicencia = licencia;

}
public Taxista(String nombre,int licencia,int edad)
{
super(nombre,edad);
nLicencia = licencia;
}
Taxista()
{
super();
}
public void setNLicencia(int num)
{
nLicencia = num;
}
public String getLicencia()
{
return "Mi numero de licencia es: "+ nLicencia;
}
public String getNombre()
{
//Aquí se manda a traer getNombre de la
// clase Padre(Persona) y para ello se
//utiliza la palabra super
return "Soy un taxista y me llamo: " +
super.getNombre();
}
}
