package Apoyo_Septiembre2026.setterbooleanconletra;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        System.out.println(persona.setEdad(25));   // true
        System.out.println(persona.setEdad(-5));   // false


        Producto producto = new Producto();
        System.out.println(producto.setPrecio(150));
        System.out.println(producto.setPrecio(-20));


        Estudiante estudiante = new Estudiante();
        System.out.println(estudiante.setNota(8));
        System.out.println(estudiante.setNota(15));


        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println(cuenta.setSaldo(5000));
        System.out.println(cuenta.setSaldo(-100));


        Libro libro = new Libro();
        System.out.println(libro.setPaginas(250));
        System.out.println(libro.setPaginas(0));


        Empleado empleado = new Empleado();
        System.out.println(empleado.setSueldo(45000));
        System.out.println(empleado.setSueldo(-500));


        Usuario usuario = new Usuario();
        System.out.println(usuario.setPassword("abc123"));
        System.out.println(usuario.setPassword("abc"));


        Vehiculo vehiculo = new Vehiculo();
        System.out.println(vehiculo.setAnio(2024));
        System.out.println(vehiculo.setAnio(1800));


        Rectangulo rectangulo = new Rectangulo();
        System.out.println(rectangulo.setAncho(10));
        System.out.println(rectangulo.setAncho(-4));


        Temperatura temperatura = new Temperatura();
        System.out.println(temperatura.setGrados(25));
        System.out.println(temperatura.setGrados(200));
    }
}


// ============================================================
// EJERCICIO 1 - PERSONA
//
// LETRA:
// Crear un setter boolean para modificar la edad.
// La edad solamente puede modificarse si está entre
// 0 y 120 años.
//
// Si la edad es válida:
// - modificar el atributo edad
// - retornar true
//
// Si la edad no es válida:
// - no modificar el atributo
// - retornar false
// ============================================================

class Persona {

    private int edad;

    public boolean setEdad(int edad) {

        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 2 - PRODUCTO
//
// LETRA:
// Crear un setter boolean para modificar el precio.
//
// El precio debe ser mayor que 0.
//
// Si el precio es válido:
// - modificar precio
// - retornar true
//
// En caso contrario:
// - no modificar precio
// - retornar false
// ============================================================

class Producto {

    private double precio;

    public boolean setPrecio(double precio) {

        if (precio > 0) {
            this.precio = precio;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 3 - ESTUDIANTE
//
// LETRA:
// Crear un setter boolean para modificar la nota.
//
// La nota debe estar entre 1 y 12.
//
// Si la nota cumple la condición:
// - modificar nota
// - retornar true
//
// Si no cumple:
// - retornar false
// ============================================================

class Estudiante {

    private int nota;

    public boolean setNota(int nota) {

        if (nota >= 1 && nota <= 12) {
            this.nota = nota;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 4 - CUENTA BANCARIA
//
// LETRA:
// Crear un setter boolean para modificar el saldo.
//
// El saldo puede ser 0 o mayor.
// No se permiten valores negativos.
//
// Si el saldo es válido:
// - modificar saldo
// - retornar true
//
// Si es negativo:
// - retornar false
// ============================================================

class CuentaBancaria {

    private double saldo;

    public boolean setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 5 - LIBRO
//
// LETRA:
// Crear un setter boolean para modificar la cantidad
// de páginas de un libro.
//
// El libro debe tener como mínimo 1 página.
//
// Si paginas > 0:
// - modificar paginas
// - retornar true
//
// En caso contrario:
// - retornar false
// ============================================================

class Libro {

    private int paginas;

    public boolean setPaginas(int paginas) {

        if (paginas > 0) {
            this.paginas = paginas;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 6 - EMPLEADO
//
// LETRA:
// Crear un setter boolean para modificar el sueldo.
//
// El sueldo debe ser mayor que 0.
//
// Si es válido:
// - modificar sueldo
// - retornar true
//
// Si no:
// - retornar false
// ============================================================

class Empleado {

    private double sueldo;

    public boolean setSueldo(double sueldo) {

        if (sueldo > 0) {
            this.sueldo = sueldo;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 7 - USUARIO
//
// LETRA:
// Crear un setter boolean para modificar la contraseña.
//
// La contraseña:
// - no puede ser null
// - debe tener al menos 6 caracteres
//
// Si cumple ambas condiciones:
// - modificar password
// - retornar true
//
// En caso contrario:
// - retornar false
// ============================================================

class Usuario {

    private String password;

    public boolean setPassword(String password) {

        if (password != null && password.length() >= 6) {
            this.password = password;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 8 - VEHICULO
//
// LETRA:
// Crear un setter boolean para modificar el año
// del vehículo.
//
// El año debe estar entre 1900 y 2026.
//
// Si está dentro del rango:
// - modificar anio
// - retornar true
//
// Si está fuera:
// - retornar false
// ============================================================

class Vehiculo {

    private int anio;

    public boolean setAnio(int anio) {

        if (anio >= 1900 && anio <= 2026) {
            this.anio = anio;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 9 - RECTANGULO
//
// LETRA:
// Crear un setter boolean para modificar el ancho.
//
// El ancho debe ser mayor que 0.
//
// Si es válido:
// - modificar ancho
// - retornar true
//
// Si es 0 o negativo:
// - retornar false
// ============================================================

class Rectangulo {

    private double ancho;

    public boolean setAncho(double ancho) {

        if (ancho > 0) {
            this.ancho = ancho;
            return true;
        }

        return false;
    }
}


// ============================================================
// EJERCICIO 10 - TEMPERATURA
//
// LETRA:
// Crear un setter boolean para modificar los grados.
//
// La temperatura permitida debe estar entre
// -100 y 100 grados.
//
// Si está dentro del rango:
// - modificar grados
// - retornar true
//
// Si está fuera:
// - retornar false
// ============================================================

class Temperatura {

    private double grados;

    public boolean setGrados(double grados) {

        if (grados >= -100 && grados <= 100) {
            this.grados = grados;
            return true;
        }

        return false;
    }
}