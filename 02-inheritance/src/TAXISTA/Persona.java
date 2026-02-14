
package TAXISTA;


class Persona{
int edad;
String nombre;
public Persona()
{
edad = 0;
nombre = "Luis";
}
public Persona(String nuevoNombre,int edad){
this.edad = edad;
nombre = nuevoNombre;
}
void setPersona(String nombre)
{
this.nombre=nombre;
}
void setNombre(String nombre)
{
this.nombre=nombre;
}
String getNombre()
{
return nombre;
}
void setEdad(int edad)
{
this.edad=edad;
}
String getEdad()
{
return "TENGO LA EDAD DE: "+edad;
}
}
