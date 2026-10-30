package PruebaDZA.Modulo4.ClassAbstractAnimal;

public class Perro extends Animal{
    @Override
    public void hacerSonido(){ // Método heredado de la clase abstract, sobreescrito
        System.out.println("Guau");
    }

    @Override
    public void comer(){
        System.out.println("Este perro come ración Dogo.");
    }

    @Override
    public void respirar(){
        System.out.println("Este perro respira");
    }
}
