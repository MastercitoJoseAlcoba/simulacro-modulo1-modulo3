package PruebaDZA.Modulo4.ClassAbstractAnimal;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro(); // Instancia de la clase Perro
        perro.comer(); // Llama al método comer() de la clase Perro
        perro.hacerSonido(); // Llama al método hacerSonido() de la clase Perro
        perro.respirar(); // Llama al método respirar() de la clase abstracta Animal
    }
}
