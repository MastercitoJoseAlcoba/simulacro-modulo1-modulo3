package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores.Ejercicio18;

class Animal {
    public void sonido(int veces) {
        System.out.println("Animal hace sonido " + veces + " veces");
    }
}

class Perro extends Animal {
    public void sonido(String tipo) {
        System.out.println("Perro hace sonido: " + tipo);
    }
}

public class Main {
    public static void main(String[] args) {
        Perro p = new Perro();

        p.sonido(3);        // método heredado de Animal
        p.sonido("ladrido"); // método propio de Perro
    }
}

/**
 * Considerando la sobrecarga de métodos y la herencia, ¿que sucede si un método en la clase base es sobrecargado
 * en la clase derivada?
 *
 * d. La clase derivada contiene dos versiones del método: una heredada de la clase base y la otra definida en
 * la clase derivada.
 *
 */