package Cuestionario_Similares_Examenes;

public class EntrenamientoCodeRunnerConLetrasIncorporadas {

    /*
    ============================================================
    EJERCICIO 1 — AUTOS CON CLASES ABSTRACTAS
    ============================================================

    LETRA:

    Se desea modelar distintos tipos de autos utilizando
    clases abstractas, herencia y polimorfismo.

    Crear una clase abstracta llamada Auto.

    La clase Auto debe tener los atributos necesarios para
    almacenar:

    - kilómetros recorridos
    - costo por kilómetro

    Además debe declarar el método abstracto:

    public abstract double calcularConsumo();

    Crear las siguientes clases que heredan de Auto:

    - AutoNafta
    - AutoHibrido
    - AutoElectrico

    REGLAS:

    AutoNafta:
    El consumo se calcula:

    kilometros * costoPorKilometro


    AutoHibrido:
    Se calcula el consumo normal y luego se aplica
    un ahorro del 30%.


    AutoElectrico:
    Se calcula el consumo normal y luego se aplica
    un ahorro del 50%.


    También crear una clase Mostrar con un método:

    public static void mostrarDatos(java.util.List<Auto> autos)

    El método debe:

    1. Recorrer todos los autos.
    2. Mostrar el tipo de auto.
    3. Mostrar el consumo de cada uno.
    4. Sumar todos los consumos.
    5. Mostrar el total.

    No incluir main.
    */


    public static abstract class Auto {

        protected double kilometros;
        protected double costoPorKilometro;

        public Auto(double kilometros, double costoPorKilometro) {
            this.kilometros = kilometros;
            this.costoPorKilometro = costoPorKilometro;
        }

        public abstract double calcularConsumo();
    }


    public static class AutoNafta extends Auto {

        public AutoNafta(double kilometros, double costoPorKilometro) {
            super(kilometros, costoPorKilometro);
        }

        @Override
        public double calcularConsumo() {
            return kilometros * costoPorKilometro;
        }
    }


    public static class AutoHibrido extends Auto {

        public AutoHibrido(double kilometros, double costoPorKilometro) {
            super(kilometros, costoPorKilometro);
        }

        @Override
        public double calcularConsumo() {
            return kilometros * costoPorKilometro * 0.70;
        }
    }


    public static class AutoElectrico extends Auto {

        public AutoElectrico(double kilometros, double costoPorKilometro) {
            super(kilometros, costoPorKilometro);
        }

        @Override
        public double calcularConsumo() {
            return kilometros * costoPorKilometro * 0.50;
        }
    }


    public static class Mostrar {

        public static void mostrarDatos(java.util.List<Auto> autos) {

            double total = 0;

            for (Auto auto : autos) {

                double consumo = auto.calcularConsumo();

                System.out.println(
                        auto.getClass().getSimpleName()
                                + ": "
                                + consumo
                );

                total += consumo;
            }

            System.out.println("Total: " + total);
        }
    }



    /*
    ============================================================
    EJERCICIO 2 — PADOVAN
    ============================================================

    LETRA:

    Implementar el método:

    public int[] padovan(int n)

    La sucesión de Padovan comienza:

    1 1 1

    Los siguientes términos se calculan mediante:

    P(n) = P(n - 2) + P(n - 3)

    Por ejemplo, los primeros 10 términos son:

    1 1 1 2 2 3 4 5 7 9

    El método debe devolver un array con los primeros
    n términos de la sucesión.

    REQUISITOS:

    Si n <= 0:
    devolver un array vacío.

    Si n = 1:
    devolver {1}

    Si n = 2:
    devolver {1,1}

    Si n = 3:
    devolver {1,1,1}

    No incluir main.
    */


    public int[] padovan(int n) {

        if (n <= 0) {
            return new int[0];
        }

        int[] resultado = new int[n];

        resultado[0] = 1;

        if (n > 1) {
            resultado[1] = 1;
        }

        if (n > 2) {
            resultado[2] = 1;
        }

        for (int i = 3; i < n; i++) {

            resultado[i] =
                    resultado[i - 2]
                            + resultado[i - 3];
        }

        return resultado;
    }



    /*
    ============================================================
    EJERCICIO 3 — OPERACIONES CON MATRICES
    ============================================================

    LETRA:

    Crear una clase llamada:

    OperacionesConMatrices

    Debe contener los siguientes métodos:


    1)

    public int sumaElementosMatriz(int[][] matriz)

    Debe recorrer toda la matriz y devolver
    la suma de todos sus elementos.


    2)

    public int[][] sumarMatrices(
            int[][] matriz1,
            int[][] matriz2)

    Debe sumar ambas matrices posición por posición
    y devolver una nueva matriz.


    Ejemplo:

    1 2       5 6       6 8
    3 4   +   7 8   =   10 12


    3)

    public void imprimirMatriz(int[][] matriz)

    Debe imprimir todos los elementos de la matriz
    respetando sus filas y columnas.

    No incluir main.
    */


    public static class OperacionesConMatrices {

        public int sumaElementosMatriz(int[][] matriz) {

            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {

                    suma += matriz[i][j];
                }
            }

            return suma;
        }


        public int[][] sumarMatrices(
                int[][] matriz1,
                int[][] matriz2) {

            int[][] resultado =
                    new int[matriz1.length][];

            for (int i = 0; i < matriz1.length; i++) {

                resultado[i] =
                        new int[matriz1[i].length];

                for (int j = 0;
                     j < matriz1[i].length;
                     j++) {

                    resultado[i][j] =
                            matriz1[i][j]
                                    + matriz2[i][j];
                }
            }

            return resultado;
        }


        public void imprimirMatriz(int[][] matriz) {

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {

                    System.out.print(matriz[i][j] + " ");
                }

                System.out.println();
            }
        }
    }



    /*
    ============================================================
    EJERCICIO 4 — SUMA DE FILAS
    ============================================================

    LETRA:

    Implementar el método:

    public void mostrarSumaFilas(int[][] matriz)

    El método debe recorrer una matriz fila por fila.

    Para cada fila debe calcular la suma
    de todos sus elementos.

    Debe imprimir el resultado con el formato:

    Fila 1: resultado
    Fila 2: resultado
    Fila 3: resultado

    EJEMPLO:

    Matriz:

    1 2 3
    4 5
    8

    Salida:

    Fila 1: 6
    Fila 2: 9
    Fila 3: 8

    REQUISITOS:

    - La matriz puede ser escalonada.
    - Las filas comienzan a numerarse desde 1.
    - Si una fila está vacía, su suma debe ser 0.
    - No pedir datos por teclado.
    - No incluir main.
    */


    public void mostrarSumaFilas(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }

            System.out.println(
                    "Fila " + (i + 1) + ": " + suma
            );
        }
    }



    /*
    ============================================================
    EJERCICIO 5 — CRUD DE RESERVAS
    ============================================================

    LETRA:

    Crear una clase Reserva.

    ATRIBUTOS:

    codigo int
    titular String
    noches int
    precioPorNoche double


    Crear una interfaz llamada:

    ICrudReservas


    Debe contener los métodos:

    agregar(Reserva r)

    modificar(Reserva r)

    eliminar(int codigo)

    listar()


    Crear una clase:

    CrudReservasImpl

    que implemente ICrudReservas.


    Debe utilizar:

    java.util.HashMap<Integer, Reserva>


    El código de la reserva será utilizado
    como clave del HashMap.


    El método listar debe imprimir:

    Clave: X valor: Y


    No utilizar import.
    Utilizar java.util.HashMap con su nombre completo.
    No incluir main.
    */


    public static class Reserva {

        private int codigo;
        private String titular;
        private int noches;
        private double precioPorNoche;

        public Reserva(
                int codigo,
                String titular,
                int noches,
                double precioPorNoche) {

            this.codigo = codigo;
            this.titular = titular;
            this.noches = noches;
            this.precioPorNoche = precioPorNoche;
        }


        public int getCodigo() {
            return codigo;
        }

        public String getTitular() {
            return titular;
        }

        public int getNoches() {
            return noches;
        }

        public double getPrecioPorNoche() {
            return precioPorNoche;
        }


        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public void setNoches(int noches) {
            this.noches = noches;
        }

        public void setPrecioPorNoche(double precioPorNoche) {
            this.precioPorNoche = precioPorNoche;
        }


        @Override
        public String toString() {

            return "Reserva{codigo="
                    + codigo
                    + ", titular='"
                    + titular
                    + "', noches="
                    + noches
                    + ", precioPorNoche="
                    + precioPorNoche
                    + "}";
        }
    }


    public interface ICrudReservas {

        void agregar(Reserva r);

        void modificar(Reserva r);

        void eliminar(int codigo);

        void listar();
    }


    public static class CrudReservasImpl
            implements ICrudReservas {

        private final java.util.HashMap<Integer, Reserva> reservas =
                new java.util.HashMap<>();


        @Override
        public void agregar(Reserva r) {

            reservas.put(
                    r.getCodigo(),
                    r
            );
        }


        @Override
        public void modificar(Reserva r) {

            if (reservas.containsKey(r.getCodigo())) {

                reservas.put(
                        r.getCodigo(),
                        r
                );
            }
        }


        @Override
        public void eliminar(int codigo) {

            reservas.remove(codigo);
        }


        @Override
        public void listar() {

            for (Integer clave : reservas.keySet()) {

                System.out.println(
                        "Clave: "
                                + clave
                                + " valor: "
                                + reservas.get(clave)
                );
            }
        }
    }



    /*
    ============================================================
    EJERCICIO 6 — CUENTAS BANCARIAS
    ============================================================

    LETRA:

    Crear una clase abstracta:

    CuentaBancaria

    ATRIBUTOS:

    titular String
    saldo double


    Debe tener:

    - constructor
    - getters
    - setters


    Métodos:

    calcularInteres(int meses)

    calcularSaldoFinal(int meses)


    Crear dos clases hijas:

    CajaAhorro
    PlazoFijo


    CajaAhorro:

    interés simple del 2% mensual.


    PlazoFijo:

    interés simple del 5% mensual.


    FÓRMULA:

    interes = saldo * tasa * meses

    saldoFinal = saldo + interes

    No incluir main.
    */


    public static abstract class CuentaBancaria {

        private String titular;
        private double saldo;

        public CuentaBancaria(
                String titular,
                double saldo) {

            this.titular = titular;
            this.saldo = saldo;
        }


        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }


        public void setTitular(String titular) {
            this.titular = titular;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }


        public abstract double calcularInteres(int meses);


        public double calcularSaldoFinal(int meses) {

            return saldo + calcularInteres(meses);
        }
    }


    public static class CajaAhorro extends CuentaBancaria {

        public CajaAhorro(String titular, double saldo) {
            super(titular, saldo);
        }

        @Override
        public double calcularInteres(int meses) {

            return getSaldo() * 0.02 * meses;
        }
    }


    public static class PlazoFijo extends CuentaBancaria {

        public PlazoFijo(String titular, double saldo) {
            super(titular, saldo);
        }

        @Override
        public double calcularInteres(int meses) {

            return getSaldo() * 0.05 * meses;
        }
    }



    /*
    ============================================================
    EJERCICIO 7 — CLASE LIBRO
    ============================================================

    LETRA:

    Crear una clase llamada:

    Libro


    ATRIBUTOS:

    titulo String
    autor String
    cantidadPaginas int


    CONSTRUCTOR 1:

    Libro(
        String titulo,
        String autor,
        int cantidadPaginas
    )


    CONSTRUCTOR 2:

    Libro(
        String titulo,
        String autor
    )

    En este constructor:

    cantidadPaginas = 0


    CONSTRUCTOR 3:

    Libro()

    En este constructor:

    titulo = ""
    autor = ""
    cantidadPaginas = 0


    MÉTODOS:

    - getters
    - setters

    - mostrarInformacion()

    Debe devolver un String con la información
    del libro.


    - esLargo()

    Debe devolver true si el libro tiene
    230 páginas o más.

    De lo contrario debe devolver false.

    No incluir main.
    */


    public static class Libro {

        private String titulo;
        private String autor;
        private int cantidadPaginas;


        public Libro(
                String titulo,
                String autor,
                int cantidadPaginas) {

            this.titulo = titulo;
            this.autor = autor;
            this.cantidadPaginas = cantidadPaginas;
        }


        public Libro(
                String titulo,
                String autor) {

            this(titulo, autor, 0);
        }


        public Libro() {

            this("", "", 0);
        }


        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getCantidadPaginas() {
            return cantidadPaginas;
        }


        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setCantidadPaginas(int cantidadPaginas) {
            this.cantidadPaginas = cantidadPaginas;
        }


        public String mostrarInformacion() {

            return "Titulo: "
                    + titulo
                    + ", Autor: "
                    + autor
                    + ", Paginas: "
                    + cantidadPaginas;
        }


        public boolean esLargo() {

            return cantidadPaginas >= 230;
        }
    }



    /*
    ============================================================
    EJERCICIO 8 — EXCEPCIONES CON STRING
    ============================================================

    LETRA:

    Implementar:

    public void prueba(String dato)

    Dentro del método deben ejecutarse:

    dato.charAt(3)

    dato.substring(0, 5)


    Deben controlarse las siguientes excepciones:


    NullPointerException

    Mensaje:

    Error de null


    StringIndexOutOfBoundsException

    Mensaje:

    Error de string


    Si ninguna operación produce una excepción,
    debe imprimirse:

    Proceso correcto

    No incluir main.
    */


    public void prueba(String dato) {

        try {

            System.out.println(dato.charAt(3));

            System.out.println(
                    dato.substring(0, 5)
            );

            System.out.println("Proceso correcto");

        } catch (NullPointerException e) {

            System.out.println("Error de null");

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Error de string");
        }
    }



    /*
    ============================================================
    EJERCICIO 9 — PROMEDIO DE PARES
    ============================================================

    LETRA:

    Implementar:

    public static double calcularPromedioPares(int[] array)

    El método debe:

    1. Recorrer todo el array.
    2. Identificar los números pares.
    3. Sumar únicamente los números pares.
    4. Contar cuántos números pares existen.
    5. Calcular el promedio de los pares.
    6. Devolver el promedio como double.

    EJEMPLO:

    array:

    {2, 5, 8, 3}

    Pares:

    2 y 8

    suma = 10

    cantidad = 2

    promedio = 5.0


    Si el array no contiene números pares:

    devolver 0.

    No incluir main.
    */


    public static double calcularPromedioPares(int[] array) {

        int suma = 0;
        int cantidad = 0;

        for (int valor : array) {

            if (valor % 2 == 0) {

                suma += valor;
                cantidad++;
            }
        }

        if (cantidad == 0) {
            return 0;
        }

        return (double) suma / cantidad;
    }



    /*
    ============================================================
    EJERCICIO 10 — VALIDAR VOCALES
    ============================================================

    LETRA:

    Implementar:

    public boolean validarVocal(String palabra)

    El método debe validar:

    1. Que la palabra no sea null.

    2. Que su longitud esté comprendida
       entre 3 y 6 caracteres.

    3. Que todos los caracteres sean vocales.

    4. Debe aceptar vocales mayúsculas
       y minúsculas.


    VOCALes VÁLIDAS:

    a
    e
    i
    o
    u

    A
    E
    I
    O
    U


    EJEMPLOS:

    "aei"
    true

    "AEIO"
    true

    "auto"
    false

    "aa"
    false

    No incluir main.
    */


    public boolean validarVocal(String palabra) {

        if (palabra == null
                || palabra.length() < 3
                || palabra.length() > 6) {

            return false;
        }

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra != 'a'
                    && letra != 'e'
                    && letra != 'i'
                    && letra != 'o'
                    && letra != 'u') {

                return false;
            }
        }

        return true;
    }
}