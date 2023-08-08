package main;

public class Main {

  public static void main(String[] args) {
    int[][] M = {{2, 2, 2}, {2, 1, 1}, {2, 1, 1}};
    Matriz matriz = new Matriz(M);
    matriz.mostrar();

    int[][] P = {{1, 1}, {1, 1}};
    Matriz submatriz = new Matriz(P);
    submatriz.mostrar();

    int[] coordenadas = matriz.esSubmatriz(submatriz);
    System.out.println("Fila: " + coordenadas[0]);
    System.out.println("Columna: " + coordenadas[1]);
  }
}
