package PruebaDZA.Modulo4.ClassAbstractAnimal;

public abstract class Animal {
    public abstract void hacerSonido();

    public abstract void comer();

    public void respirar(){ // Método propio de la clase abstract
        System.out.println("Este animal respira");
    }
}
