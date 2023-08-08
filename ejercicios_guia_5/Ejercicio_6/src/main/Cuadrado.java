package main;

import java.util.Scanner;

public class Cuadrado {

  private int dimension;
  private int[][] matriz;

  public Cuadrado(int dimension) {
    this.dimension = dimension;
  }

  public void mostrar() {
    if (matriz == null) {
      System.out.println("Matriz vacia!!");
    } else {
      for (int[] fila : matriz) {
        System.out.print("[");
        for (int posicion = 0; posicion < fila.length - 1; posicion++) {
          System.out.print(fila[posicion] + ",");
        }
        System.out.println(fila[fila.length - 1] + "]");
      }
    }
  }

  public void llenar() {
    int min = 1;
    int max = (int) Math.pow(dimension, 2);
    matriz = new int[dimension][dimension];
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la matriz: ");
    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        System.out.println("Ingrese un numero entre 1 y " + max + " :");
        matriz[i][j] = teclado.nextInt();
        while (matriz[i][j] < min || max < matriz[i][j]) {
          System.out.println("Numero invalido! Intente de nuevo: ");
          matriz[i][j] = teclado.nextInt();
        }
      }
    }
  }

  private int sumarFila(int[] fila) {
    int suma = 0;
    for (int valor : fila) {
      suma += valor;
    }
    return suma;
  }

  private int sumarColumna(int[][] matriz, int columna) {
    int suma = 0;
    for (int[] fila : matriz) {
      suma += fila[columna];
    }
    return suma;
  }

  public boolean esMagico() {
    if (matriz == null) {
      return false;
    }
    int sumaDiagonalPrincipal = 0;
    int sumaDiagonalSecundario = 0;
    for (int i = 0; i < dimension; i++) {
      sumaDiagonalPrincipal += matriz[i][i];
      sumaDiagonalSecundario += matriz[i][dimension - 1 - i];
    }

    if (sumaDiagonalPrincipal != sumaDiagonalSecundario) {
      return false;
    }

    for (int[] fila : matriz) {
      if (sumarFila(fila) != sumaDiagonalPrincipal) {
        return false;
      }
    }

    for (int columna = 0; columna < matriz.length; columna++) {
      if (sumarColumna(matriz, columna) != sumaDiagonalPrincipal) {
        return false;
      }
    }
    return true;
  }
}
