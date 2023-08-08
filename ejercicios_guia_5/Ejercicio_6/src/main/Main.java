package main;

public class Main {

  public static void main(String[] args) {
    Cuadrado cuadrado = new Cuadrado(4);
    cuadrado.llenar();
    cuadrado.mostrar();
    if (cuadrado.esMagico()) {
      System.out.println("Es magico!!");
    } else {
      System.out.println("No es magico!!");
    }
  }

}
