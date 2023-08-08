package main;

public class Pila {

  private int tope;
  private String[] elementos;

  public Pila(int tamanio) {
    this.elementos = new String[tamanio];
    this.tope = -1;
  }

  public void agregar(String elem) {
    if (!pilaLlena()) {
      tope++;
      elementos[tope] = elem;
    }
  }

  public String verTope() {
    return elementos[tope];
  }

  public String quitar() {
    tope--;
    return elementos[tope + 1];
  }

  public boolean pilaLlena() {
    return tope == elementos.length - 1;
  }

  public boolean pilaVacia() {
    return tope == -1;
  }

  public void mostrarPila() {
    System.out.print("[");
    for (int posicion = 0; posicion < tope; posicion++) {
      System.out.print(elementos[posicion] + ",");
    }
    System.out.print(verTope() + "]");
    System.out.println("");
  }

}
