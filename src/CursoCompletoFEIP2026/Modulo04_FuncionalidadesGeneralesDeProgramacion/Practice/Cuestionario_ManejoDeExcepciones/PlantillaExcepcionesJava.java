package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_ManejoDeExcepciones;

public class PlantillaExcepcionesJava {

    public static void main(String[] args) {

        System.out.println("""
        ============================================================
        PLANTILLA BASE PARA ESTUDIAR EXCEPCIONES EN JAVA
        ============================================================

        1) ¿QUÉ ES UNA EXCEPCIÓN?

        Una excepción es un problema que ocurre durante la ejecución
        del programa e interrumpe el flujo normal de instrucciones.

        Ejemplo:

            int resultado = 10 / 0;

        Explicación:
        Como se divide un número entero entre cero, Java lanza:

            ArithmeticException

        Regla:
            Excepción = error en tiempo de ejecución

        ============================================================

        2) ESTRUCTURA BÁSICA TRY - CATCH - FINALLY

        Plantilla:

            try {
                // Código que puede fallar
            } catch (Exception e) {
                // Código que maneja el error
            } finally {
                // Código que se ejecuta siempre
            }

        Significado:

            try
            -> Aquí va el código que puede generar una excepción.

            catch
            -> Aquí se captura y se maneja la excepción.

            finally
            -> Se ejecuta siempre, haya error o no.

        ============================================================

        3) EJEMPLO SIMPLE DE TRY - CATCH

        Código:

            try {
                int resultado = 10 / 0;
                System.out.println(resultado);
            } catch (Exception e) {
                System.out.println("Ocurrió un error");
            }

        Salida:

            Ocurrió un error

        Explicación:
        La división 10 / 0 genera una excepción.
        Entonces Java salta al bloque catch.

        Flujo:

            try -> ocurre error -> catch

        ============================================================

        4) TRY - CATCH - FINALLY

        Código:

            try {
                int resultado = 10 / 0;
                System.out.println(resultado);
            } catch (Exception e) {
                System.out.println("Error capturado");
            } finally {
                System.out.println("Esto se ejecuta siempre");
            }

        Salida:

            Error capturado
            Esto se ejecuta siempre

        Regla:

            finally = siempre se ejecuta

        ============================================================

        5) DIFERENCIA ENTRE throw Y throws

        throw:
        Sirve para lanzar una excepción manualmente.

            throw new RuntimeException("Error manual");

        throws:
        Sirve para declarar que un método puede lanzar una excepción.

            public static void metodo() throws Exception {
                throw new Exception("Error");
            }

        Regla para examen:

            throw  = lanza
            throws = declara

        ============================================================

        6) PLANTILLA CON throw Y throws

        Código:

            public static int dividir(int a, int b) throws Exception {
                if (b == 0) {
                    throw new Exception("No se puede dividir por cero");
                }

                return a / b;
            }

        Explicación:

            throws Exception
            -> Avisa que el método puede lanzar una excepción.

            throw new Exception(...)
            -> Lanza realmente la excepción.

        ============================================================

        7) EXCEPCIONES VERIFICADAS Y NO VERIFICADAS

        Checked exceptions:
        Java obliga a manejarlas con try-catch o declararlas con throws.

        Ejemplo:

            public void leerArchivo() throws IOException {
                // Código que puede fallar al leer un archivo
            }

        Unchecked exceptions:
        Java no obliga a manejarlas.

        Ejemplos:

            int resultado = 10 / 0;

            String nombre = null;
            System.out.println(nombre.length());

        Regla:

            Checked   = obligatorio manejar o declarar
            Unchecked = no obligatorio

        ============================================================

        8) EXCEPCIONES COMUNES

        ArithmeticException:
        Ocurre cuando hay un error matemático.

            int resultado = 10 / 0;

        ------------------------------------------------------------

        NullPointerException:
        Ocurre cuando usamos un objeto que vale null.

            String nombre = null;
            System.out.println(nombre.length());

        ------------------------------------------------------------

        ArrayIndexOutOfBoundsException:
        Ocurre cuando accedemos a una posición inexistente de un array.

            int[] numeros = new int[4];
            System.out.println(numeros[4]);

        Explicación:
        Si el array tiene tamaño 4, sus índices válidos son:

            0, 1, 2, 3

        El índice 4 no existe.

        ------------------------------------------------------------

        NumberFormatException:
        Ocurre cuando intentamos convertir texto no numérico a número.

            int numero = Integer.parseInt("abc");

        ============================================================

        9) REGLA DE ARRAYS

        Si tengo:

            int[] vector = new int[5];

        Los índices válidos son:

            0, 1, 2, 3, 4

        Regla:

            Tamaño 5 -> último índice 4
            Tamaño n -> último índice n - 1

        Ejemplo incorrecto:

            int[] vector = new int[5];
            System.out.println(vector[5]);

        Resultado:

            ArrayIndexOutOfBoundsException

        ============================================================

        10) int / 0 VS double / 0

        Con int:

            int resultado = 10 / 0;

        Resultado:

            ArithmeticException

        ------------------------------------------------------------

        Con double:

            double resultado = 10.0 / 0;
            System.out.println(resultado);

        Resultado:

            Infinity

        Regla:

            int / 0    = excepción
            double / 0 = Infinity

        ============================================================

        11) MÚLTIPLES CATCH

        Código:

            try {
                String nombre = null;
                System.out.println(nombre.length());

            } catch (NullPointerException e) {
                System.out.println("Error: objeto null");

            } catch (ArithmeticException e) {
                System.out.println("Error matemático");

            } catch (Exception e) {
                System.out.println("Error general");
            }

        Explicación:
        Java revisa los catch de arriba hacia abajo.
        Entra en el primer catch que coincida con la excepción.

        Regla:

            Primero excepciones específicas.
            Después Exception general.

        Correcto:

            catch (NullPointerException e)
            catch (ArithmeticException e)
            catch (Exception e)

        Incorrecto:

            catch (Exception e)
            catch (NullPointerException e)

        Porque Exception atraparía todo antes.

        ============================================================

        12) FLUJO CUANDO NO HAY ERROR

        Código:

            try {
                System.out.println("Bloque try");
            } catch (Exception e) {
                System.out.println("Bloque catch");
            }

            System.out.println("Después del try-catch");

        Salida:

            Bloque try
            Después del try-catch

        Explicación:
        Si no hay excepción, no entra al catch.

        Flujo:

            try -> después del try-catch

        ============================================================

        13) FLUJO CUANDO HAY ERROR

        Código:

            try {
                System.out.println("Antes del error");
                int resultado = 10 / 0;
                System.out.println("Después del error");
            } catch (Exception e) {
                System.out.println("Error capturado");
            }

            System.out.println("Fin");

        Salida:

            Antes del error
            Error capturado
            Fin

        Explicación:
        Cuando ocurre el error, se corta el try.
        No se ejecuta lo que está después del error dentro del try.

        Flujo:

            try -> error -> catch -> sigue el programa

        ============================================================

        14) FINALLY SIN CATCH

        Código:

            try {
                int resultado = 10 / 0;
            } finally {
                System.out.println("Esto se ejecuta igual");
            }

        Salida aproximada:

            Esto se ejecuta igual
            Exception in thread "main" java.lang.ArithmeticException: / by zero

        Explicación:
        Si no hay catch, la excepción no se maneja.
        Pero finally igual se ejecuta.

        Regla:

            Sin catch válido:
            try -> finally -> programa termina con error

        ============================================================

        15) printStackTrace()

        Código:

            try {
                int resultado = 10 / 0;
            } catch (Exception e) {
                e.printStackTrace();
            }

        Salida aproximada:

            java.lang.ArithmeticException: / by zero
                at Main.main(Main.java:3)

        Explicación:
        printStackTrace() muestra:
        - tipo de excepción
        - mensaje del error
        - línea donde ocurrió

        Regla:

            printStackTrace = muestra la traza del error

        ============================================================

        16) EXCEPCIÓN PERSONALIZADA

        Plantilla:

            class MiExcepcion extends Exception {
                public MiExcepcion(String mensaje) {
                    super(mensaje);
                }
            }

        Uso:

            public static int dividir(int a, int b) throws MiExcepcion {
                if (b == 0) {
                    throw new MiExcepcion("No se puede dividir por cero");
                }

                return a / b;
            }

        Explicación:
        Una excepción personalizada es una excepción creada por el programador
        para representar un problema específico.

        Regla:

            Custom exception = excepción creada por el programador

        ============================================================

        17) JERARQUÍA DE EXCEPCIONES

        Estructura:

            Throwable
            ├── Error
            └── Exception

        Explicación:

            Throwable
            -> Clase superior de todo lo que se puede lanzar.

            Error
            -> Problemas graves del sistema o JVM.

            Exception
            -> Problemas que el programa puede manejar.

        Regla:

            Throwable arriba.
            Error y Exception abajo.

        ============================================================

        18) PLANTILLA PARA ANALIZAR EJERCICIOS

        Cuando veas un código con excepciones, seguí estos pasos:

        Paso 1:
        Identificar si hay try-catch-finally.

        Paso 2:
        Buscar la primera línea que puede fallar.

        Paso 3:
        Ver qué excepción genera.

        Paso 4:
        Buscar qué catch la captura.

        Paso 5:
        Recordar que si ocurre error, el resto del try no se ejecuta.

        Paso 6:
        Revisar si hay finally.

        Paso 7:
        Determinar la salida en consola.

        ============================================================

        19) PLANTILLA DE RESPUESTA RÁPIDA PARA EXAMEN

        try:
            Código que puede fallar.

        catch:
            Captura y maneja el error.

        finally:
            Se ejecuta siempre.

        throw:
            Lanza una excepción manualmente.

        throws:
            Declara que un método puede lanzar excepciones.

        Exception:
            Clase base para excepciones.

        printStackTrace:
            Imprime la traza del error.

        Custom exception:
            Excepción creada por el programador.

        Checked exception:
            Java obliga a manejar o declarar.

        Unchecked exception:
            Java no obliga a manejar.

        ============================================================

        20) MINI REGLAS PARA MEMORIZAR

        1. int / 0 da ArithmeticException.

        2. double / 0 da Infinity.

        3. null.length() da NullPointerException.

        4. array[tamaño] da ArrayIndexOutOfBoundsException.

        5. Integer.parseInt("abc") da NumberFormatException.

        6. finally se ejecuta siempre.

        7. catch maneja el error.

        8. throw lanza.

        9. throws declara.

        10. Exception es general.

        ============================================================

        FIN DE LA PLANTILLA
        ============================================================
        """);
    }
}