package main;

public class Arreglo {

  public static void sumarLista(int[] arreglo) {
    int suma = 0;
    for (int numero : arreglo) {
      suma += numero;
    }
    System.out.println("La suma es " + suma);
    System.out.println("El promedio es " + (suma / arreglo.length));
  }

  public static void buscarMayor(int[][] arregloBidimensional) {
    int mayor = Integer.MIN_VALUE;
    for (int[] arreglo : arregloBidimensional) {
      for (int numero : arreglo) {
        if (numero > mayor) {
          mayor = numero;
        }
      }
    }
    System.out.println("El mayor es " + mayor);
  }

  public static void cuentaVocales(String cadena) {
    int cantDeVocales = 0;
    char[] letras = cadena.toLowerCase().toCharArray();
    for (char letra : letras) {
      switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          cantDeVocales++;
          break;
      }
    }
    System.out.println(cadena + " contiene " + cantDeVocales + " vocales.");
  }

  public static void cuentaCaracter(String cadena, char caracter) {
    int cantDeApariciones = 0;
    char[] letras = cadena.toLowerCase().toCharArray();
    for (char letra : letras) {
      if (letra == caracter) {
        cantDeApariciones++;
      }
    }
    System.out.println(cadena + " contiene " + cantDeApariciones + "'" + caracter + "'");
  }
}
