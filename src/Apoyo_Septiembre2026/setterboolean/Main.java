package Apoyo_Septiembre2026.setterboolean;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        System.out.println("Edad válida: " + persona.setEdad(25));
        System.out.println("Edad inválida: " + persona.setEdad(-5));


        Producto producto = new Producto();
        System.out.println("Precio válido: " + producto.setPrecio(150));
        System.out.println("Precio inválido: " + producto.setPrecio(-20));


        Estudiante estudiante = new Estudiante();
        System.out.println("Nota válida: " + estudiante.setNota(8));
        System.out.println("Nota inválida: " + estudiante.setNota(15));


        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Saldo válido: " + cuenta.setSaldo(5000));
        System.out.println("Saldo inválido: " + cuenta.setSaldo(-100));


        Libro libro = new Libro();
        System.out.println("Páginas válidas: " + libro.setPaginas(250));
        System.out.println("Páginas inválidas: " + libro.setPaginas(0));


        Empleado empleado = new Empleado();
        System.out.println("Sueldo válido: " + empleado.setSueldo(45000));
        System.out.println("Sueldo inválido: " + empleado.setSueldo(-500));


        Usuario usuario = new Usuario();
        System.out.println("Password válida: " + usuario.setPassword("abc123"));
        System.out.println("Password inválida: " + usuario.setPassword("abc"));


        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Año válido: " + vehiculo.setAnio(2024));
        System.out.println("Año inválido: " + vehiculo.setAnio(1800));


        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ancho válido: " + rectangulo.setAncho(10));
        System.out.println("Ancho inválido: " + rectangulo.setAncho(-4));


        Temperatura temperatura = new Temperatura();
        System.out.println("Temperatura válida: " + temperatura.setGrados(25));
        System.out.println("Temperatura inválida: " + temperatura.setGrados(200));
    }
}


// =====================================================
// 1. PERSONA
// =====================================================

class Persona {

    private int edad;

    public boolean setEdad(int edad) {

        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
            return true;
        }

        return false;
    }

    public int getEdad() {
        return edad;
    }
}


// =====================================================
// 2. PRODUCTO
// =====================================================

class Producto {

    private double precio;

    public boolean setPrecio(double precio) {

        if (precio > 0) {
            this.precio = precio;
            return true;
        }

        return false;
    }

    public double getPrecio() {
        return precio;
    }
}


// =====================================================
// 3. ESTUDIANTE
// =====================================================

class Estudiante {

    private int nota;

    public boolean setNota(int nota) {

        if (nota >= 1 && nota <= 12) {
            this.nota = nota;
            return true;
        }

        return false;
    }

    public int getNota() {
        return nota;
    }
}


// =====================================================
// 4. CUENTA BANCARIA
// =====================================================

class CuentaBancaria {

    private double saldo;

    public boolean setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}


// =====================================================
// 5. LIBRO
// =====================================================

class Libro {

    private int paginas;

    public boolean setPaginas(int paginas) {

        if (paginas > 0) {
            this.paginas = paginas;
            return true;
        }

        return false;
    }

    public int getPaginas() {
        return paginas;
    }
}


// =====================================================
// 6. EMPLEADO
// =====================================================

class Empleado {

    private double sueldo;

    public boolean setSueldo(double sueldo) {

        if (sueldo > 0) {
            this.sueldo = sueldo;
            return true;
        }

        return false;
    }

    public double getSueldo() {
        return sueldo;
    }
}


// =====================================================
// 7. USUARIO
// =====================================================

class Usuario {

    private String password;

    public boolean setPassword(String password) {

        if (password != null && password.length() >= 6) {
            this.password = password;
            return true;
        }

        return false;
    }

    public String getPassword() {
        return password;
    }
}


// =====================================================
// 8. VEHICULO
// =====================================================

class Vehiculo {

    private int anio;

    public boolean setAnio(int anio) {

        if (anio >= 1900 && anio <= 2026) {
            this.anio = anio;
            return true;
        }

        return false;
    }

    public int getAnio() {
        return anio;
    }
}


// =====================================================
// 9. RECTANGULO
// =====================================================

class Rectangulo {

    private double ancho;

    public boolean setAncho(double ancho) {

        if (ancho > 0) {
            this.ancho = ancho;
            return true;
        }

        return false;
    }

    public double getAncho() {
        return ancho;
    }
}


// =====================================================
// 10. TEMPERATURA
// =====================================================

class Temperatura {

    private double grados;

    public boolean setGrados(double grados) {

        if (grados >= -100 && grados <= 100) {
            this.grados = grados;
            return true;
        }

        return false;
    }

    public double getGrados() {
        return grados;
    }
}