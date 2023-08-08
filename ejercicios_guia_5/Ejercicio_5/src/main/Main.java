package main;

public class Main {

  public static void main(String[] args) {
    int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
    if (esAsimetrica(matriz)) {
      System.out.println("Es asimetrica!");
    } else {
      System.out.println("No es asimetrica!");
    }
  }

  //La matriz tiene que ser cuadrada
  public static boolean esAsimetrica(int[][] matriz) {
    int[][] transpuesta = matrizTranspuesta(matriz);
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        if (matriz[i][j] + transpuesta[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
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
