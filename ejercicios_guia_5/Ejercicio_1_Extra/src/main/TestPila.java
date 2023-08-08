package main;

public class TestPila {

  public static void main(String[] args) {
    Pila pila = new Pila(10);
    pila.agregar("a");
    pila.agregar("e");
    pila.agregar("i");
    pila.agregar("o");
    pila.agregar("u");
    pila.mostrarPila();
  }

}
