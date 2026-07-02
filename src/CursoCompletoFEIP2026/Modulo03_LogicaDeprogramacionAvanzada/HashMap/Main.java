package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creamos el mapa
        HashMap<String, Persona> mapaPersonas = new HashMap<>();

        // Creamos instancias de personas
        Persona persona1 = new Persona("Juan", 1, "4.547.166-8"); // Creamos una persona con un CI
        Persona persona2 = new Persona("Maria", 2, "4.196.456-1");
        Persona persona3 = new Persona("Pedro", 3, "3.247.186-5");

        // Agregamos las personas con sus respectivas claves, al mapa.
        mapaPersonas.put("Juan", persona1); // Agregamos la persona1 con la clave "Juan"
        mapaPersonas.put("Maria", persona2);
        mapaPersonas.put("Pedro", persona3);

        // Obtenemos la persona de CI que deseamos
        Persona personaDelMapa = mapaPersonas.get("123456789");

        // Otra forma de obtener la persona de CI que deseamos
        System.out.println("Nombre: " + personaDelMapa.getNombre());
        System.out.println("Residencia: "+ personaDelMapa.getCiudadResidencia());
        System.out.println("CI: "+ personaDelMapa.getCi());
    }

}
