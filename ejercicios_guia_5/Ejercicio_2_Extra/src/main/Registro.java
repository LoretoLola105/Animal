package main;

public class Registro {

  private String[] localidades;
  private Dato[][] datos;

  public Registro(String[] localidades) {
    this.localidades = localidades;
    this.datos = new Dato[12][localidades.length];
  }

  private int posicionDeLocalidad(String localidad) {
    for (int posicion = 0; posicion < localidades.length; posicion++) {
      if (localidades[posicion].equalsIgnoreCase(localidad)) {
        return posicion;
      }
    }
    return -1;
  }

  public void agregarDato(Dato dato, int mes, String localidad) {
    datos[mes][posicionDeLocalidad(localidad)] = dato;
  }

  public Dato promedioMasAlto() {
    Dato resultado = null;
    for (Dato[] fila : datos) {
      for (Dato dato : fila) {
        if (dato != null && (resultado == null || resultado.getMilimetros() < dato.getMilimetros())) {
          resultado = dato;
        }
      }
    }
    return resultado;
  }

  public Dato promedioMasAlto(String localidad) {
    Dato resultado = null;
    int posicion = posicionDeLocalidad(localidad);
    for (Dato[] fila : datos) {
      if (fila[posicion] != null && (resultado == null || resultado.getMilimetros() < fila[posicion].getMilimetros())) {
        resultado = fila[posicion];
      }
    }
    return resultado;
  }

}
