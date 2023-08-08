package main;

public class Main {

  public static void main(String[] args) {
    int[] numeros = new int[100];
    rellenar(numeros);
    mostrar(numeros);
  }

  public static void rellenar(int[] numeros) {
    for (int posicion = 0; posicion < numeros.length; posicion++) {
      numeros[posicion] = posicion + 1;
    }
  }

  public static void mostrar(int[] numeros) {
    for (int numero : numeros) {
      System.out.println(numero);
    }
  }

}
