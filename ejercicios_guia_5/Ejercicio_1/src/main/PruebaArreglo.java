package main;

public class PruebaArreglo {

  public static void main(String[] args) {
    int[] arregloDeNumeros = {1, 2, 3, 4, 5};
    int[][] arregloNumericoBidimensional = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
    Arreglo.sumarLista(arregloDeNumeros);
    Arreglo.buscarMayor(arregloNumericoBidimensional);
    Arreglo.cuentaVocales("Hola mundo!");
    Arreglo.cuentaCaracter("Hola mundo!", 'o');
  }

}
