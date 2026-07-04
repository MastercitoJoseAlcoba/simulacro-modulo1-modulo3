package Bloque3_Metodos_variables_operadores.Pregunta11_Clase_Perro;

public class Perro {
    // Atributos privados de la clase Perro.
    // private significa que estos datos no se pueden tocar directamente desde afuera.
    private String nombre;
    private String raza;
    private int edad;

    // Constructor de la clase.
    // Se ejecuta cuando se crea un objeto Perro.
    //
    // Ejemplo:
    // Perro p = new Perro("Toby", "Labrador", 5);
    public Perro(String nombre, String raza, int edad) {

        // this.nombre se refiere al atributo de la clase.
        // nombre se refiere al parámetro recibido.
        //
        // Entonces esta línea guarda el parámetro nombre
        // dentro del atributo nombre.
        this.nombre = nombre;

        // Guarda la raza recibida en el atributo raza.
        this.raza = raza;

        // Guarda la edad recibida en el atributo edad.
        this.edad = edad;
    }

    public String getNombre() {

        // Getter de nombre.
        // Sirve para obtener el valor del atributo nombre.
        return nombre;
    }

    public void setNombre(String nombre) {

        // Setter de nombre.
        // Sirve para modificar el atributo nombre.
        this.nombre = nombre;
    }

    public String getRaza() {

        // Getter de raza.
        return raza;
    }

    public void setRaza(String raza) {

        // Setter de raza.
        this.raza = raza;
    }

    public int getEdad() {

        // Getter de edad.
        return edad;
    }

    public void setEdad(int edad) {

        // Setter de edad.
        this.edad = edad;
    }
}

/*
PREGUNTA:
Indicar cuál afirmación es correcta.

a. La clase tiene un error en el constructor.
b. La clase tiene un error en el método setRaza().
c. La clase no tiene errores.
d. La clase tiene un error en el método setEdad().

RESPUESTA:
c. La clase no tiene errores.

EXPLICACIÓN:

El constructor está bien porque recibe:
String nombre
String raza
int edad

Y luego carga correctamente:

this.nombre = nombre;
this.raza = raza;
this.edad = edad;

Los getters están bien porque devuelven el atributo correcto:

getNombre() devuelve nombre.
getRaza() devuelve raza.
getEdad() devuelve edad.

Los setters también están bien porque modifican el atributo correcto:

setNombre modifica nombre.
setRaza modifica raza.
setEdad modifica edad.

IDEA CLAVE:
Esta clase aplica encapsulamiento básico:

- atributos private
- constructor
- getters
- setters

No tiene error de compilación ni error lógico visible.
*/


