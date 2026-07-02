package CursoCompletoFEIP2026.Practice.CodeRunner_Interface.Ej2;

public class Main2 {
    public static void main(String[] args) {
        Saludable persona = new Persona();
        persona.saludar();
    }
}

interface Saludable {
    public void saludar();
}

class Persona implements Saludable {
    @Override
    public void saludar() {
        System.out.println("Hola, soy una persona saludable.");
    }
}