package Bloque8_Interfaces_y_herencia.Pregunta36_Constructores_sobrecargados;
/*
PREGUNTA 36 — CONSTRUCTORES SOBRECARGADOS

Tema:
- Clases
- Atributos privados
- Constructores
- Sobrecarga de constructores
- Método toString()

Idea principal:
Una clase puede tener varios constructores con el mismo nombre,
pero con distinta cantidad o tipo de parámetros.
*/

public class Persona {
    // Atributos privados de la clase.
    //
    // private significa que estos datos solo se pueden usar directamente
    // dentro de la clase Persona.
    private String nombre;
    private int edad;

    // Constructor sin parámetros.
    //
    // Se ejecuta cuando hacemos:
    //
    // Persona p1 = new Persona();
    //
    // Como no recibimos datos, cargamos valores por defecto.
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor que recibe solo el nombre.
    //
    // Se ejecuta cuando hacemos:
    //
    // Persona p2 = new Persona("Ana");
    //
    // En este caso sí conocemos el nombre,
    // pero no recibimos edad.
    //
    // Por eso edad queda en 0.
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    // Constructor que recibe nombre y edad.
    //
    // Se ejecuta cuando hacemos:
    //
    // Persona p3 = new Persona("Juan", 25);
    //
    // Acá recibimos todos los datos.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {

        // toString() devuelve una representación del objeto como texto.
        //
        // Cuando hacemos:
        //
        // System.out.println(p1);
        //
        // Java llama automáticamente a:
        //
        // p1.toString()
        //
        // Por eso este método define cómo se muestra el objeto.
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

/*
EJEMPLO:

Persona p1 = new Persona();
Persona p2 = new Persona("Ana");
Persona p3 = new Persona("Juan", 25);

System.out.println(p1);
System.out.println(p2);
System.out.println(p3);

SALIDA:

Nombre: Desconocido, Edad: 0
Nombre: Ana, Edad: 0
Nombre: Juan, Edad: 25

RESPUESTA / IDEA CLAVE:

Hay tres constructores con el mismo nombre:

Persona()
Persona(String nombre)
Persona(String nombre, int edad)

Eso se llama SOBRECARGA DE CONSTRUCTORES.

Java decide cuál usar mirando:

1) cantidad de parámetros
2) tipo de parámetros
3) orden de parámetros

No mira el nombre de las variables.
Mira la firma del constructor.

RESUMEN:

new Persona()
usa el constructor vacío.

new Persona("Ana")
usa el constructor con String.

new Persona("Juan", 25)
usa el constructor con String e int.

Este ejercicio es muy parecido al de Libro:
misma idea, distinta entidad.
*/


