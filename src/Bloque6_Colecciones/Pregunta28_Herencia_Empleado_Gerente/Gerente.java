package Bloque6_Colecciones.Pregunta28_Herencia_Empleado_Gerente;

public class Gerente extends Empleado{
    // Esta clase se llama Gerente.
    //
    // extends Empleado significa:
    //
    // Gerente hereda de Empleado.
    //
    // Entonces Gerente recibe:
    //
    // - nombre
    // - salario
    // - aniosServicio
    //
    // También recibe los métodos:
    //
    // - getNombre()
    // - getSalario()
    // - getAniosServicio()
    // - calcularBonoAnual()
    // - calcularSalarioAnual()
    //
    // Pero Gerente va a redefinir algunos métodos.

    public Gerente(String nombre, double salario, int aniosServicio) {

        // super(...) llama al constructor de la clase padre.
        //
        // En este caso llama a:
        //
        // public Empleado(String nombre, double salario, int aniosServicio)
        //
        // Entonces carga los datos heredados:
        //
        // nombre
        // salario
        // aniosServicio
        super(nombre, salario, aniosServicio);
    }

    @Override
    public double calcularBonoAnual() {

        // @Override indica que este método sobrescribe
        // un método heredado de la clase padre.
        //
        // En Empleado existía:
        //
        // calcularBonoAnual()
        //
        // Pero devolvía 0.
        //
        // En Gerente usamos una fórmula real.
        //
        // Fórmula:
        //
        // bono = 0.1 * salario * años de servicio
        //
        // 0.1 representa el 10%.
        //
        // Ejemplo:
        //
        // salario = 50000
        // aniosServicio = 3
        //
        // bono = 0.1 * 50000 * 3
        // bono = 15000
        return 0.1 * this.salario * this.aniosServicio;
    }

    @Override
    public double calcularSalarioAnual() {

        // Este método también sobrescribe el método heredado.
        //
        // Fórmula:
        //
        // salario anual = salario + bono anual
        //
        // En vez de repetir la fórmula del bono,
        // llamamos a calcularBonoAnual().
        //
        // Eso es mejor porque evita duplicar código.
        return this.salario + calcularBonoAnual();
    }
}

/*
================================================
EJEMPLO
================================================

Gerente g = new Gerente("Ana", 50000, 3);

Datos:

nombre = "Ana"
salario = 50000
aniosServicio = 3


================================================
BONO ANUAL
================================================

Fórmula:

0.1 * salario * aniosServicio

Reemplazamos:

0.1 * 50000 * 3

Primero:

0.1 * 50000 = 5000

Luego:

5000 * 3 = 15000

Bono anual:

15000


================================================
SALARIO ANUAL
================================================

Fórmula:

salario + bono anual

Reemplazamos:

50000 + 15000 = 65000

Salario anual:

65000


================================================
IDEA CLAVE
================================================

Empleado es la clase padre.

Gerente es la clase hija.

Gerente hereda usando:

extends Empleado

Gerente llama al constructor del padre usando:

super(...)

Gerente modifica métodos heredados usando:

@Override


================================================
MEJORA RECOMENDADA
================================================

En vez de:

public String nombre;
public double salario;
public int aniosServicio;

Sería mejor:

protected String nombre;
protected double salario;
protected int aniosServicio;

¿Por qué?

Porque protected permite que Gerente acceda,
pero evita que cualquier clase externa toque los datos directamente.

public funciona,
pero es como dejar la puerta abierta con un cartel de
"confío en todos".

En programación, eso suele terminar en incendio.
*/

