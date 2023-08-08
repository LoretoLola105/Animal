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
public class Gato extends Animal {
    
    public Gato(String nombre, String alimento, int edad, String raza) {
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
      System.out.println("El gato: "+this.nombre+" se alimenta de: "+ this.alimento);
  } 
//   public void calcularEdad(){
//       System.out.println("la edad gatuna para "+this.anosDeVida+" es"+ (anosDeVida*8));
//   }
//   public void hacerRuido(){
//   super.hacerRuido();
//       System.out.println("Miauuuuuu");
//   }
}
