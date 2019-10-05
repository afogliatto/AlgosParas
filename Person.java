public class Person
{
  String nombre;
  int edad;

  public Person(String nombre, int edad){
    
  this.nombre = nombre;
  this.edad = edad;

  }
  void showName(){

   System.out.println(this.nombre + " " + this.edad + " años");

 }

}