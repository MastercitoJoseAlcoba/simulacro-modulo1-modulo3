package Apoyo_Diciembre2026.VC1P6_POO_Herencia;

public class Animal {
    public String hacerSonido() {
        return "Sonido genérico de animal";
    }
}

class Perro extends Animal {
    @Override
    public String hacerSonido() {
        return "Guau guau";
    }
}

class Gato extends Animal {
    @Override
    public String hacerSonido() {
        return "Miau";
    }
}

