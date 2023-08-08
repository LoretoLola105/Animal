/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Otras
 */
public class Perro extends Animal {
   
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    @Override
  public void Alimentarse(){
      System.out.println("El Perro: "+ this.nombre + " se alimenta de: "+this.alimento);
  } 
}
