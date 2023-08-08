
package animal;

public class MainAnimal {
    public static void main(String[] args) {
        
        Animal Perro = new Perro("Oliver","alimento para perros. ",12, "border collie");
        Perro.Alimentarse();
        Perro perro2 = new Perro("Alma","arroz con pollo. ", 5, "callejera");
        perro2.Alimentarse();
        Animal Gato = new Gato ("Ali","alimento para gatos. ", 13, "callejero");
        Gato.Alimentarse();
        Animal Caballo = new Caballo("Leon", "heno, azucar, zahahorias, manzanas. ", 8, "mestizo");
        Caballo.Alimentarse();
        
    }
    
}
