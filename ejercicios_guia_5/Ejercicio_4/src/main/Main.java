package main;

public class Main {

  public static void main(String[] args) {
    int[][] matriz = new int[2][2];
    rellenoMatriz(matriz);
    System.out.println("La matriz generada: ");
    mostrar(matriz);
    System.out.println("La matriz transpuesta: ");
    mostrar(matrizTranspuesta(matriz));
  }

  public static void rellenoMatriz(int[][] matriz) {
    for (int[] fila : matriz) {
      for (int posicion = 0; posicion < fila.length; posicion++) {
        fila[posicion] = (int) (Math.random() * 100);
      }
    }
  }

  public static int[][] matrizTranspuesta(int[][] matriz) {
    int alto = matriz.length;
    int largo = matriz[0].length;
    int[][] transpuesta = new int[largo][alto];
    for (int i = 0; i < alto; i++) {
      for (int j = 0; j < largo; j++) {
        transpuesta[j][i] = matriz[i][j];
      }
    }
    return transpuesta;
  }

  public static void mostrar(int[][] matriz) {
    System.out.println("");
    for (int[] fila : matriz) {
      System.out.print("[");
      for (int posicion = 0; posicion < fila.length - 1; posicion++) {
        System.out.print(fila[posicion] + ",");
      }
      System.out.println(fila[fila.length - 1] + "]");
    }
  }
}
