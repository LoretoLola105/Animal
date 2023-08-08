package main;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Hola, ingrese la dimension del arreglo! (dimension > 0)");
    int dimension = teclado.nextInt();
    int[] arreglo = new int[dimension];
    rellenoAleatorio(arreglo);
    System.out.println("Ingrese un numero para buscar:");
    int numeroABuscar = teclado.nextInt();
    buscarNumero(arreglo, numeroABuscar);
    mostrar(arreglo);
  }

  public static void rellenoAleatorio(int[] numeros) {
    for (int posicion = 0; posicion < numeros.length; posicion++) {
      numeros[posicion] = (int) (Math.random() * 100);
    }
  }

  public static void buscarNumero(int[] numeros, int objetivo) {
    int ubicacion = -1;
    boolean hayRepetidos = false;
    for (int posicion = 0; posicion < numeros.length; posicion++) {
      if (numeros[posicion] == objetivo) {
        if (ubicacion < 0) {
          ubicacion = posicion;
        } else {
          hayRepetidos = true;
        }
      }
    }
    if (ubicacion > 0) {
      System.out.println(objetivo + " se encuentra en la posicion " + ubicacion + " del arreglo.");
      if (hayRepetidos) {
        System.out.println("Hay repetidos!!");
      }
    } else {
      System.out.println("No se encontro " + objetivo);
    }
  }

  public static void mostrar(int[] numeros) {
    System.out.print("[");
    for (int posicion = 0; posicion < numeros.length - 1; posicion++) {
      System.out.print(numeros[posicion] + ",");
    }
    System.out.println(numeros[numeros.length - 1] + "]");
  }

}
