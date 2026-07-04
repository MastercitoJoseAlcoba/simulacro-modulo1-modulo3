package Bloque2_String_y_fechas.Pregunta10_Clase_Libro;

public class Libro {
    // Atributos privados de la clase.
    //
    // private significa que solo se pueden acceder
    // directamente dentro de esta clase.
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor sin parámetros.
    //
    // Se ejecuta cuando hacemos:
    //
    // Libro libro = new Libro();
    //
    // Como no recibimos datos, cargamos valores por defecto.
    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor con título y autor.
    //
    // Se ejecuta cuando hacemos:
    //
    // Libro libro = new Libro("El Principito", "Saint-Exupéry");
    //
    // Como no recibimos número de páginas,
    // numeroPaginas queda en 0.
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = 0;
    }

    // Constructor con título, autor y número de páginas.
    //
    // Se ejecuta cuando hacemos:
    //
    // Libro libro = new Libro("El Principito", "Saint-Exupéry", 96);
    //
    // Acá sí recibimos todos los datos.
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {

        // Devuelve el valor del atributo titulo.
        //
        // Como titulo es private,
        // desde afuera se accede usando este getter.
        return titulo;
    }

    public String getAutor() {

        // Devuelve el autor del libro.
        return autor;
    }

    public int getNumeroPaginas() {

        // Devuelve el número de páginas.
        return numeroPaginas;
    }
}

/*
IDEA GENERAL:

Este ejercicio trabaja con:

1) Clase
Libro es una clase.

2) Atributos
titulo
autor
numeroPaginas

3) Encapsulamiento
Los atributos son private.

4) Constructores sobrecargados
Hay tres constructores con el mismo nombre,
pero distinta cantidad de parámetros.

Esto se llama SOBRECARGA DE CONSTRUCTORES.

CONSTRUCTORES:

Libro()
No recibe nada.
Carga valores por defecto.

Libro(String titulo, String autor)
Recibe título y autor.
Páginas queda en 0.

Libro(String titulo, String autor, int numeroPaginas)
Recibe todos los datos.

GETTERS:

getTitulo()
getAutor()
getNumeroPaginas()

Sirven para leer los atributos privados desde afuera.

NO HAY SETTERS:
El ejercicio solo pide getters.
Eso significa que, después de crear el libro,
no se pide modificar sus valores.

EJEMPLO MENTAL:

Libro l1 = new Libro();

l1.getTitulo() devuelve:
"Título desconocido"

Libro l2 = new Libro("Java Básico", "UTEC");

l2.getTitulo() devuelve:
"Java Básico"

l2.getAutor() devuelve:
"UTEC"

l2.getNumeroPaginas() devuelve:
0

Libro l3 = new Libro("Java Básico", "UTEC", 120);

l3.getNumeroPaginas() devuelve:
120

IDEA CLAVE:
Los constructores permiten crear objetos de distintas formas.
Mismo nombre, distintos parámetros.
Sobrecarga: el multiverso controlado de Java.
*/

