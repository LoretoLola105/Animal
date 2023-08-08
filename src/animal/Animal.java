//1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
//Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
//un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice
//lo siguiente:
package animal;

public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;
    
    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
     public void Alimentarse(){
      System.out.println("El animal se alimenta de: ");
  }
}

    
//    public class Caballo extends Animal{
//  public Caballo(String nombre, String alimento, int edad, String raza){
//    super(nombre, alimento, edad, raza);
//  }
//}
//
//ublic class Main {
//
//    
//    public static void main(String[] args) {
//      
//        Animal Perro=new Perro("Dog","Croquetas","boxer",4);
//        Perro.alimentar();
//        Perro toby=new Perro("Toby","Croquetas de carne","salchicha",4);
//        toby.alimentar();
//        Animal Gato=new Gato ("Michi","Atun","curioso",1);
//        Gato.alimentar();
//        Animal Caballo=new Caballo("Tosco","balanceado","pinto",3);
//        Caballo.alimentar();
//    }
//  