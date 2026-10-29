package PruebaDZA.Modulo4.GestionPersona;


public class Main {
    public static void main(String[] args) {
        Gestion g = new Gestion();

        Persona p = new Persona("Juan", 25);
        Persona p2 = new Persona("Maria", 30);

        // Alta de personas
        g.altaPersona(p);
        g.altaPersona(p2);

        // Alta de personas
        g.altaPersona(p);
        g.altaPersona(p2);

        // Listar personas
        System.out.println("\nListado de personas:");
        g.listarPersonas();

        // Leer persona
        System.out.println("\nBuscar persona:");
        g.leerPersona(p);
        g.leerPersona(p2);

        // Modificar persona
        System.out.println("\nModificar persona:");
        g.modificarPersona(p);
        g.modificarPersona(p2);

        // Baja de persona
        System.out.println("\nEliminar persona:");
        g.bajaPersona(p);
        g.bajaPersona(p2);

        // Listado final
        System.out.println("\nListado final:");
        g.listarPersonas();
    }
}
