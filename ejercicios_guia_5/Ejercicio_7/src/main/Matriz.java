package main;

public class Matriz {

  private final int dimension;
  private final int[][] matriz;

  public Matriz(int[][] matriz) {
    this.dimension = matriz.length;
    this.matriz = matriz;
  }

  public void mostrar() {
    for (int[] fila : matriz) {
      System.out.print("[");
      for (int posicion = 0; posicion < fila.length - 1; posicion++) {
        System.out.print(fila[posicion] + ",");
      }
      System.out.println(fila[fila.length - 1] + "]");
    }
    System.out.println("");
  }

  //Si encuentra la submatriz retorna las coordenadas (numeros positivos) donde empieza
  //Si no la encuentra retorna [-1,-1] como coordenadas
  public int[] esSubmatriz(Matriz submatriz) {
    int[] coordenadas = {-1, -1};
    boolean encontrado = false;
    if (submatriz.dimension > dimension) {
      return coordenadas;
    }

    for (int fila = 0; (fila <= dimension - submatriz.dimension) && !encontrado; fila++) {
      for (int columna = 0; (columna <= dimension - submatriz.dimension) && !encontrado; columna++) {
        boolean sonIguales = true;
        for (int i = 0; (i < submatriz.dimension) && sonIguales; i++) {
          for (int j = 0; (j < submatriz.dimension) && sonIguales; j++) {
            if (matriz[fila + i][columna + j] != submatriz.matriz[i][j]) {
              sonIguales = false;
            }
          }
        }
        if (sonIguales) {
          coordenadas[0] = fila;
          coordenadas[1] = columna;
          encontrado = true;
        }
      }
    }
    return coordenadas;
  }
}
