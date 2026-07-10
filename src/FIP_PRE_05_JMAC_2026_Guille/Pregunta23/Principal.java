package FIP_PRE_05_JMAC_2026_Guille.Pregunta23;
// Polimorfismo y sobrescritua
class Persona {
    public int caminar() {
        return 2;
    }
}

class Estudiante extends Persona {
    @Override
    public int caminar() {
        return 4;
    }
}

class Deportista extends Persona {
    @Override
    public int caminar() {
        return 8;
    }
}

class PersonaMayor extends Persona {
    @Override
    public int caminar() {
        return 1;
    }
}

public class Principal {
    public static void main(String[] args) {

        Persona[] personas = new Persona[4];

        personas[0] = new Persona();
        personas[1] = new Estudiante();
        personas[2] = new Deportista();
        personas[3] = new PersonaMayor();

        int suma = 0;

        for (int i = 0; i < personas.length; i++) {
            suma += personas[i].caminar();
        }

        System.out.println(suma);
    }
}

// Respuesta correcta: a. 15