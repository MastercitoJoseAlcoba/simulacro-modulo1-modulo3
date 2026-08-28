package Cuestionario_Similares_Examenes;

public class EntrenamientoCodeRunner {

    // =========================================================
    // EJERCICIO 1 - AUTOS CON CLASES ABSTRACTAS
    // =========================================================

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


    // =========================================================
    // EJERCICIO 2 - PADOVAN
    // =========================================================

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


    // =========================================================
    // EJERCICIO 3 - OPERACIONES CON MATRICES
    // =========================================================

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

                    System.out.print(
                            matriz[i][j] + " "
                    );
                }

                System.out.println();
            }
        }
    }


    // =========================================================
    // EJERCICIO 4 - SUMAR FILAS
    // =========================================================

    public void mostrarSumaFilas(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }

            System.out.println(
                    "Fila "
                            + (i + 1)
                            + ": "
                            + suma
            );
        }
    }


    // =========================================================
    // EJERCICIO 5 - CRUD RESERVAS
    // =========================================================

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


    // =========================================================
    // EJERCICIO 6 - CUENTAS BANCARIAS
    // =========================================================

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

        public CajaAhorro(
                String titular,
                double saldo) {

            super(titular, saldo);
        }


        @Override
        public double calcularInteres(int meses) {

            return getSaldo()
                    * 0.02
                    * meses;
        }
    }


    public static class PlazoFijo extends CuentaBancaria {

        public PlazoFijo(
                String titular,
                double saldo) {

            super(titular, saldo);
        }


        @Override
        public double calcularInteres(int meses) {

            return getSaldo()
                    * 0.05
                    * meses;
        }
    }


    // =========================================================
    // EJERCICIO 7 - LIBRO
    // =========================================================

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


    // =========================================================
    // EJERCICIO 8 - EXCEPCIONES
    // =========================================================

    public void prueba(String dato) {

        try {

            System.out.println(dato.charAt(3));

            System.out.println(
                    dato.substring(0, 5)
            );

            System.out.println(
                    "Proceso correcto"
            );

        } catch (NullPointerException e) {

            System.out.println(
                    "Error de null"
            );

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println(
                    "Error de string"
            );
        }
    }


    // =========================================================
    // EJERCICIO 9 - PROMEDIO DE PARES
    // =========================================================

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


    // =========================================================
    // EJERCICIO 10 - VALIDAR VOCALES
    // =========================================================

    public boolean validarVocal(String palabra) {

        if (palabra == null
                || palabra.length() < 3
                || palabra.length() > 6) {

            return false;
        }

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {

            char letra =
                    palabra.charAt(i);

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