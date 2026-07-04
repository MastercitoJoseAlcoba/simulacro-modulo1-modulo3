package Bloque6_Colecciones.Pregunta28_Herencia_Empleado_Gerente;

public class Empleado {
    // ================================
    // PREGUNTA 28 — HERENCIA: EMPLEADO Y GERENTE
    // ================================
    //
    // Esta es la clase padre.
    //
    // Se llama Empleado.
    //
    // Tiene atributos comunes:
    //
    // - nombre
    // - salario
    // - aniosServicio
    //
    // Luego la clase Gerente va a heredar de Empleado.
    //
    // Heredar significa que Gerente recibe atributos y métodos
    // de Empleado.

    public String nombre;
    public double salario;
    public int aniosServicio;

    // En una versión más prolija,
    // estos atributos deberían ser private o protected.
    //
    // private:
    // solo se accede dentro de la misma clase.
    //
    // protected:
    // se accede desde la clase y sus hijas.
    //
    // Pero acá se dejan public porque la solución base
    // trabaja accediendo directamente desde Gerente.
    //
    // Funciona, pero encapsula poco.

    public Empleado() {

        // Constructor sin parámetros.
        //
        // Crea un empleado con valores por defecto.
        //
        // nombre queda vacío.
        // salario queda en 0.
        // aniosServicio queda en 0.
        this.nombre = "";
        this.salario = 0;
        this.aniosServicio = 0;
    }

    public Empleado(String nombre, double salario, int aniosServicio) {

        // Constructor con parámetros.
        //
        // Sirve para crear un empleado con datos reales.
        //
        // this.nombre se refiere al atributo de la clase.
        //
        // nombre sin this se refiere al parámetro recibido.
        this.nombre = nombre;
        this.salario = salario;
        this.aniosServicio = aniosServicio;
    }

    public String getNombre() {

        // Devuelve el nombre del empleado.
        return nombre;
    }

    public double getSalario() {

        // Devuelve el salario del empleado.
        return salario;
    }

    public int getAniosServicio() {

        // Devuelve los años de servicio del empleado.
        return aniosServicio;
    }

    public double calcularBonoAnual() {

        // En la clase base Empleado,
        // el bono anual devuelve 0.
        //
        // La clase Gerente va a sobrescribir este método
        // con su propia fórmula.
        return 0;
    }

    public double calcularSalarioAnual() {

        // En la clase base Empleado,
        // el salario anual devuelve 0 según esta solución.
        //
        // Gerente va a sobrescribir este método.
        return 0;
    }
}

