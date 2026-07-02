package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_ManejoDeExcepciones;

public class ResumenExcepcionesJava {

    public static void main(String[] args) {

        System.out.println("""
        ============================================================
        RESUMEN COMPLETO - EXCEPCIONES EN JAVA
        ============================================================

        PREGUNTA 1:
        ¿Cuál es la diferencia entre throw y throws en Java?

        Respuesta correcta:
        b) throw se utiliza para lanzar una excepción manualmente,
           throws se utiliza para declarar que un método puede lanzar excepciones.

        Ejemplo:

            public static void dividir(int a, int b) throws ArithmeticException {
                if (b == 0) {
                    throw new ArithmeticException("No se puede dividir entre cero");
                }
                System.out.println(a / b);
            }

        Explicación:
        - throw: lanza la excepción.
        - throws: avisa que el método puede lanzar una excepción.

        ------------------------------------------------------------

        PREGUNTA 2:
        ¿Puede una excepción ser lanzada fuera de un bloque try?

        Respuesta correcta:
        c) Sí, siempre.

        Ejemplo:

            public static void main(String[] args) {
                throw new RuntimeException("Error manual");
            }

        Explicación:
        Una excepción puede lanzarse sin try.
        El try-catch sirve para capturarla, no para permitir que exista.

        ------------------------------------------------------------

        PREGUNTA 3:
        ¿Cuál es el propósito de la palabra clave throw?

        Respuesta correcta:
        a) Lanzar una excepción manualmente.

        Ejemplo:

            throw new IllegalArgumentException("Edad inválida");

        Explicación:
        throw se usa cuando queremos provocar una excepción en una parte específica del código.

        ------------------------------------------------------------

        PREGUNTA 4:
        ¿Qué es try-with-resources?

        Respuesta correcta:
        d) Un bloque try que puede gestionar automáticamente la liberación de recursos.

        Ejemplo:

            try (Scanner entrada = new Scanner(System.in)) {
                String texto = entrada.nextLine();
            }

        Explicación:
        Al terminar el bloque try, Java cierra automáticamente el recurso.

        ------------------------------------------------------------

        PREGUNTA 5:
        ¿Qué es una excepción en Java?

        Respuesta correcta:
        c) Un comportamiento no deseado durante la ejecución del programa.

        Ejemplo:

            int resultado = 10 / 0;

        Explicación:
        El código puede estar bien escrito, pero fallar cuando se ejecuta.

        ------------------------------------------------------------

        PREGUNTA 6:
        Completar frase sobre excepciones.

        Respuesta:
        La excepción nos frena y para el flujo normal del programa.
        Por eso, necesitamos la manipulación del evento.
        La principal ventaja del manejo de excepciones es mantener el flujo normal del programa.

        Palabras:
        1) frena
        2) programa
        3) manipulación
        4) ventaja
        5) flujo

        Explicación:
        Una excepción interrumpe el flujo normal.
        El manejo de excepciones permite controlar esa interrupción.

        ------------------------------------------------------------

        PREGUNTA 7:
        División double entre cero.

        Código:

            double a = 15, b = 72, c = 68, d = 4;
            double resultado = a / (b - c - d);
            System.out.println(resultado);

        Cálculo:
            b - c - d
            72 - 68 - 4 = 0

            resultado = 15 / 0

        Respuesta:
        Infinity

        Explicación:
        Si dividimos un double entre cero, Java muestra Infinity.
        Si fuera int / 0, lanzaría ArithmeticException.

        ------------------------------------------------------------

        PREGUNTA 8:
        Array de char imprimiendo el array completo.

        Código:

            char vectorChar[] = new char[4];
            vectorChar[0] = 'A';
            vectorChar[1] = 'B';
            vectorChar[2] = 'C';
            vectorChar[3] = 65;
            System.out.println(vectorChar);

        Respuesta:
        Funciona correctamente mostrando los datos del array.

        Salida:
        ABCA

        Explicación:
        El número 65 representa el carácter 'A'.
        Además, println con un char[] imprime su contenido como texto.

        ------------------------------------------------------------

        PREGUNTA 9:
        Código con try, catch y finally.

        Código resumido:

            int valor = 0;

            try {
                valor++;
                valor += Integer.parseInt("el 0");
                valor++;
                System.out.println("Valor al final" + valor);
            } catch (NumberFormatException e) {
                valor += Integer.parseInt("25");
                System.out.println("Valor al final del catch: " + valor);
            } finally {
                valor++;
                valor *= 2;
                System.out.println("Valor al final del finally" + valor);
            }

            valor--;
            valor--;
            System.out.println("Valor antes de return: " + valor);
            return valor;

        Salida:
        Valor al final del catch: 26
        Valor al final del finally54
        Valor antes de return: 52
        52

        Explicación:
        - valor empieza en 0.
        - valor++ deja valor en 1.
        - parseInt("el 0") falla.
        - entra al catch.
        - suma 25, queda 26.
        - finally suma 1, queda 27.
        - multiplica por 2, queda 54.
        - luego resta dos veces, queda 52.
        - retorna 52.

        ------------------------------------------------------------

        PREGUNTA 10:
        Completar código con try-catch.

        Código correcto:

            public class Principal {
                public static void main(String[] args) {

                    int num0 = 10, num1 = 0, resultado = 0;

                    try {
                        resultado = num0 / num1;
                    } catch (Exception e) {
                        System.out.print("No se hizo la división");
                    }
                }
            }

        Salida:
        No se hizo la división

        Explicación:
        10 / 0 con int lanza ArithmeticException.
        El catch captura el error y muestra el mensaje.

        ------------------------------------------------------------

        PREGUNTA 11:
        ¿Cuál es el bloque utilizado para manejar excepciones?

        Respuesta correcta:
        d) catch

        Ejemplo:

            try {
                int resultado = 10 / 0;
            } catch (Exception e) {
                System.out.println("Ocurrió un error");
            }

        Explicación:
        - try: contiene código que puede fallar.
        - catch: captura y maneja el error.
        - finally: se ejecuta al final.

        ------------------------------------------------------------

        PREGUNTA 12:
        Líneas donde debemos controlar excepciones.

        Código:

            int vec[] = new int[30];
            Scanner entrada = new Scanner(System.in);

            int edad = entrada.nextInt();
            int indice = entrada.nextInt();
            String nombre = entrada.next();

            vec[indice] = edad;

            System.out.println(vec[indice]);
            System.out.println(edad);
            System.out.println(nombre);

        Líneas a controlar:
        - línea donde se lee edad.
        - línea donde se lee indice.
        - línea donde se lee nombre.
        - línea donde se usa vec[indice].
        - línea donde se imprime vec[indice].

        Explicación:
        Puede fallar si:
        - el usuario ingresa mal los datos.
        - el índice está fuera del rango 0 a 29.

        ------------------------------------------------------------

        PREGUNTA 13:
        ¿Cuál es el propósito de la clase Exception?

        Respuesta correcta:
        c) Servir como clase base para todas las excepciones.

        Ejemplo:

            try {
                int numero = Integer.parseInt("abc");
            } catch (Exception e) {
                System.out.println("Ocurrió una excepción");
            }

        Explicación:
        Exception es una clase general.
        Muchas excepciones heredan de Exception.

        ------------------------------------------------------------

        PREGUNTA 14:
        Flujo con varios catch y excepción NO aritmética.

        Esquema:

            Bloque1

            try {
                Bloque2
            } catch (ArithmeticException ae) {
                Bloque3
            } catch (Exception error) {
                Bloque4
            }

            Bloque5

        Si ocurre una excepción no aritmética en Bloque2:

        Respuesta:
        Bloque1 -> Bloque2 -> Bloque4 -> Bloque5

        Explicación:
        No entra al catch de ArithmeticException.
        Entra al catch general Exception.

        ------------------------------------------------------------

        PREGUNTA 15:
        Diferencia entre excepciones verificadas y no verificadas.

        Respuesta correcta:
        d) Las excepciones verificadas deben ser declaradas o manejadas,
           las no verificadas no.

        Ejemplo checked exception:

            public void leerArchivo() throws IOException {
                // código que puede fallar al leer archivo
            }

        Ejemplo unchecked exception:

            int resultado = 10 / 0;

        Explicación:
        - Checked: Java obliga a usar try-catch o throws.
        - Unchecked: Java no obliga.

        ------------------------------------------------------------

        PREGUNTA 16:
        Flujo cuando no se produce ninguna excepción.

        Esquema:

            Bloque1

            try {
                Bloque2
            } catch (ArithmeticException ae) {
                Bloque3
            } catch (Exception error) {
                Bloque4
            }

            Bloque5

        Respuesta:
        Bloque1 -> Bloque2 -> Bloque5

        Explicación:
        Si no hay excepción, no entra a ningún catch.

        ------------------------------------------------------------

        PREGUNTA 17:
        ¿Qué hace finally?

        Respuesta correcta:
        d) Proporciona una ejecución de código que siempre se ejecuta,
           independientemente de si se lanzó una excepción o no.

        Ejemplo:

            try {
                int resultado = 10 / 0;
            } catch (Exception e) {
                System.out.println("Ocurrió un error");
            } finally {
                System.out.println("Esto se ejecuta siempre");
            }

        Salida:
        Ocurrió un error
        Esto se ejecuta siempre

        Explicación:
        finally se ejecuta al final, haya error o no.

        ------------------------------------------------------------

        PREGUNTA 18:
        Array de char accediendo al índice 4.

        Código:

            char vectorChar[] = new char[4];
            vectorChar[0] = 'A';
            vectorChar[1] = 'B';
            vectorChar[2] = 'C';
            vectorChar[3] = 65;
            System.out.println(vectorChar[4]);

        Respuesta:
        Lanza ArrayIndexOutOfBoundsException.

        Explicación:
        El array tiene tamaño 4.
        Sus índices válidos son 0, 1, 2 y 3.
        El índice 4 no existe.

        ------------------------------------------------------------

        PREGUNTA 19:
        Jerarquía de clases relacionada con excepciones.

        Respuesta correcta:
        b) Throwable, Error, Exception

        Jerarquía:

            Throwable
            ├── Error
            └── Exception

        Explicación:
        Throwable es la clase superior.
        De ella salen Error y Exception.

        ------------------------------------------------------------

        PREGUNTA 20:
        Programa con índice inválido.

        Código:

            public static void main(String[] args) {
                double[] v = new double[15];
                System.out.println(acceso(v, 15));
            }

            public static double acceso(double[] v, int indice) {
                try {
                    if ((0 <= indice) && (indice < v.length)) {
                        return v[indice];
                    } else {
                        throw new RuntimeException("El índice " + indice + " no existe");
                    }
                } catch (RuntimeException e) {
                    System.out.println(e.toString());
                    return 0;
                }
            }

        Problema:
        El array tiene tamaño 15.
        Sus índices válidos son 0 a 14.
        Se está pidiendo el índice 15, que no existe.

        Soluciones correctas:
        a) Cambiar a double[] v = new double[20];
        c) Cambiar acceso(v, 15) por acceso(v, 10);

        Explicación:
        Ambas soluciones hacen que el índice pedido exista.

        ------------------------------------------------------------

        PREGUNTA 21:
        Correspondencias correctas.

        En un bloque catch...
        Respuesta:
        se captura la excepción.

        En un bloque try...
        Respuesta:
        se continúa la ejecución hasta terminar el bloque.

        La clase Exception sirve para...
        Respuesta:
        controlar los errores y mejorar el flujo de los datos.

        Si se produce un error en el bloque try...
        Respuesta:
        se corta la ejecución y se pasa al catch.

        Explicación:
        try intenta ejecutar código.
        catch maneja el error.
        Si try falla, salta al catch correspondiente.

        ------------------------------------------------------------

        PREGUNTA 22:
        Completar con throw y throws.

        Código:

            public static int dividir(int a, int b) throws MiExcepcion {
                int result = 0;

                if (b == 0) {
                    throw new MiExcepcion("No se puede dividir por 0");
                } else {
                    result = a / b;
                }

                return result;
            }

        Respuesta:
        A = throws
        B = throw

        Explicación:
        throws va en la firma del método.
        throw va dentro del método para lanzar la excepción.

        ------------------------------------------------------------

        PREGUNTA 23:
        ¿Es obligatorio incluir finally después de catch?

        Respuesta correcta:
        b) No, es opcional.

        Ejemplo válido sin finally:

            try {
                int resultado = 10 / 0;
            } catch (Exception e) {
                System.out.println("Error");
            }

        Explicación:
        finally se usa cuando queremos ejecutar código al final,
        pero no es obligatorio.

        ------------------------------------------------------------

        PREGUNTA 24:
        ¿Cuál es el propósito de throws?

        Respuesta correcta:
        a) Indicar que el método puede lanzar excepciones.

        Ejemplo:

            public void leerArchivo() throws IOException {
                // código que puede lanzar IOException
            }

        Explicación:
        throws declara que un método puede lanzar una excepción.

        ------------------------------------------------------------

        PREGUNTA 25:
        ¿Qué es una excepción personalizada?

        Respuesta correcta:
        a) Una excepción creada por el programador para situaciones específicas.

        Ejemplo:

            class MiExcepcion extends Exception {
                public MiExcepcion(String mensaje) {
                    super(mensaje);
                }
            }

        Uso:

            throw new MiExcepcion("No se puede dividir por cero");

        Explicación:
        Sirve para crear errores propios del programa.

        ------------------------------------------------------------

        PREGUNTA 26:
        Múltiples catch.

        Código:

            try {
                String nombre = null;
                int vector[] = new int[10];

                System.out.println(nombre.length());
                System.out.println(vector[15]);
                System.out.println("Estamos en la línea 11");

            } catch (NullPointerException e) {
                System.out.println("Capturamos error NullPointerException");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Capturamos el error del índice del Array");

            } catch (Exception e) {
                System.out.println("Exception Padre");

            } finally {
                System.out.println("Mensaje final");
            }

        Salida:
        Capturamos error NullPointerException
        Mensaje final

        Explicación:
        Primero falla nombre.length(), porque nombre es null.
        Entonces entra al catch de NullPointerException.
        No sigue ejecutando el resto del try.
        Luego ejecuta finally.

        Afirmaciones no ciertas según la lógica:
        1, 2, 3, 4 y 6.

        Pero si el cuestionario no tiene esa opción,
        la más cercana era:
        b) 1 - 3 - 4 - 6

        ------------------------------------------------------------

        PREGUNTA 27:
        ¿Cuál es el propósito principal del manejo de excepciones?

        Respuesta correcta:
        a) Proporcionar una forma de manejar errores durante la ejecución.

        Ejemplo:

            try {
                int resultado = 10 / 0;
            } catch (Exception e) {
                System.out.println("Ocurrió un error");
            }

        Explicación:
        Permite controlar errores sin que el programa se rompa de forma desordenada.

        ------------------------------------------------------------

        PREGUNTA 28:
        Excepción en Bloque1 antes del try.

        Esquema:

            Bloque1

            try {
                Bloque2
            } catch (ArithmeticException ae) {
                Bloque3
            } catch (Exception error) {
                Bloque4
            }

            Bloque5

        Si ocurre una excepción en Bloque1:

        Respuesta:
        Bloque1 -> se termina

        Explicación:
        El error ocurre antes del try.
        Por eso los catch no pueden capturarlo.

        ------------------------------------------------------------

        PREGUNTA 29:
        ¿Qué hace printStackTrace()?

        Respuesta correcta:
        a) Imprime la traza de pila en la consola.

        Ejemplo:

            try {
                int resultado = 10 / 0;
            } catch (Exception e) {
                e.printStackTrace();
            }

        Salida aproximada:
            java.lang.ArithmeticException: / by zero
                at Main.main(Main.java:3)

        Explicación:
        Muestra qué error ocurrió y en qué línea.

        ------------------------------------------------------------

        PREGUNTA 30:
        Completar texto sobre excepción.

        Texto correcto:

        Entendemos por excepción a un evento que ocurre durante la ejecución
        de un programa e interrumpe el flujo normal de sus instrucciones.
        Cuando se crea un error en un método, es un objeto del tipo Exception,
        que contiene información sobre el error, por ejemplo el tipo de Exception
        o el estado del programa donde ocurrió.
        Este objeto es enviado al sistema de ejecución conocido en inglés como
        run time system, a este proceso se le llama lanzar una excepción.

        Palabras:
        1) evento
        2) ejecución
        3) flujo
        4) error
        5) Exception
        6) ocurrió
        7) lanzar

        ------------------------------------------------------------

        PREGUNTA 31:
        ¿Qué pasa si ocurre una excepción dentro de try y no hay catch correspondiente?

        Respuesta correcta:
        b) Se ejecuta el código dentro del bloque finally, si está presente,
           y luego el programa se detiene.

        Ejemplo:

            try {
                int resultado = 10 / 0;
            } finally {
                System.out.println("Esto se ejecuta igual");
            }

        Salida aproximada:
            Esto se ejecuta igual
            Exception in thread "main" java.lang.ArithmeticException: / by zero

        Explicación:
        Si no hay catch válido, finally igual se ejecuta.
        Después la excepción sigue sin manejarse y el programa termina.

        ============================================================
        REGLAS RÁPIDAS PARA EL EXAMEN
        ============================================================

        throw   = lanza una excepción manualmente.
        throws  = declara que un método puede lanzar una excepción.
        try     = bloque donde puede ocurrir un error.
        catch   = bloque que captura y maneja el error.
        finally = bloque que se ejecuta siempre al final.

        int / 0      = ArithmeticException.
        double / 0   = Infinity.
        array[4] en un array de tamaño 4 = ArrayIndexOutOfBoundsException.
        null.length() = NullPointerException.

        Checked exception:
        Java obliga a manejarla o declararla.

        Unchecked exception:
        Java no obliga a manejarla ni declararla.

        Throwable
        ├── Error
        └── Exception

        ============================================================
        FIN DEL RESUMEN
        ============================================================
        """);
    }
}