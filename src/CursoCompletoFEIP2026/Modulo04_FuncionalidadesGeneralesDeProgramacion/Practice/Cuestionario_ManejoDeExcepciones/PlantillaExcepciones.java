package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_ManejoDeExcepciones;

public class PlantillaExcepciones {

    public static void main(String[] args) {

        /*
        ============================================================
        CÓMO USAR ESTA PLANTILLA
        ============================================================

        Para cada ejercicio, cambiás solamente esta parte:

            // ACÁ VA EL CÓDIGO QUE PUEDE FALLAR

        Esa parte está dentro del bloque try.

        Ejemplos de código que podés poner dentro del try:

        ------------------------------------------------------------
        1) Para probar ArithmeticException
        ------------------------------------------------------------

            int num1 = 10;
            int num2 = 0;
            int resultado = num1 / num2;
            System.out.println(resultado);

        Esto falla porque no se puede dividir un int entre cero.

        ------------------------------------------------------------
        2) Para probar NullPointerException
        ------------------------------------------------------------

            String nombre = null;
            System.out.println(nombre.length());

        Esto falla porque nombre vale null.
        No se puede usar .length() sobre null.

        ------------------------------------------------------------
        3) Para probar ArrayIndexOutOfBoundsException
        ------------------------------------------------------------

            int[] numeros = new int[4];
            System.out.println(numeros[4]);

        Esto falla porque el array tiene tamaño 4.
        Sus posiciones válidas son:

            0, 1, 2, 3

        La posición 4 no existe.

        ------------------------------------------------------------
        4) Para probar NumberFormatException
        ------------------------------------------------------------

            int numero = Integer.parseInt("abc");

        Esto falla porque "abc" no se puede convertir a número.

        ------------------------------------------------------------
        REGLA DE ORO
        ------------------------------------------------------------

            try {
                // código peligroso
            } catch (TipoDeError e) {
                // solución para ese error
            } finally {
                // se ejecuta siempre
            }

        ------------------------------------------------------------
        IMPORTANTE
        ------------------------------------------------------------

        El catch (Exception e) dejalo siempre último,
        porque es el más general.

        Si lo ponés primero, captura todos los errores antes
        que los catch específicos.

        Es como Pac-Man con hambre: se come todo antes de que
        los demás catch puedan trabajar.

        ============================================================
        */

        try {
            /*
            ========================================================
            ACÁ VA EL CÓDIGO QUE PUEDE FALLAR
            ========================================================

            Cambiá solamente esta parte según el ejercicio.

            Ejemplo actual:
            Vamos a provocar una ArithmeticException dividiendo entre cero.
            */

            int num1 = 10;
            int num2 = 0;

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

            /*
            ========================================================
            OTROS EJEMPLOS PARA PROBAR
            ========================================================

            Para probar NullPointerException, podés borrar el ejemplo
            anterior y poner esto:

                String nombre = null;
                System.out.println(nombre.length());

            Para probar ArrayIndexOutOfBoundsException, podés poner esto:

                int[] numeros = new int[4];
                System.out.println(numeros[4]);

            Para probar NumberFormatException, podés poner esto:

                int numero = Integer.parseInt("abc");

            ========================================================
            */

        } catch (ArithmeticException e) {
            /*
            Se ejecuta si ocurre un error matemático.

            Ejemplo típico:

                int resultado = 10 / 0;

            Excepción:

                ArithmeticException
            */

            System.out.println("Error: no se puede dividir entre cero.");

        } catch (NullPointerException e) {
            /*
            Se ejecuta si intentamos usar un objeto que vale null.

            Ejemplo:

                String nombre = null;
                System.out.println(nombre.length());

            Excepción:

                NullPointerException
            */

            System.out.println("Error: se intentó usar un objeto null.");

        } catch (ArrayIndexOutOfBoundsException e) {
            /*
            Se ejecuta si intentamos acceder a una posición inválida
            de un array.

            Ejemplo:

                int[] numeros = new int[4];
                System.out.println(numeros[4]);

            Si el array tiene tamaño 4, sus índices válidos son:

                0, 1, 2, 3

            El índice 4 no existe.

            Excepción:

                ArrayIndexOutOfBoundsException
            */

            System.out.println("Error: índice fuera del array.");

        } catch (NumberFormatException e) {
            /*
            Se ejecuta si intentamos convertir un texto no numérico
            a número.

            Ejemplo:

                int numero = Integer.parseInt("abc");

            Excepción:

                NumberFormatException
            */

            System.out.println("Error: el texto no se puede convertir a número.");

        } catch (Exception e) {
            /*
            Este es el catch general.

            IMPORTANTE:
            Siempre va al final.

            ¿Por qué?
            Porque Exception es una clase más general y puede capturar
            muchos tipos de errores.

            Si lo ponemos primero, los catch específicos nunca se ejecutan.

            Correcto:

                catch (ArithmeticException e)
                catch (NullPointerException e)
                catch (Exception e)

            Incorrecto:

                catch (Exception e)
                catch (ArithmeticException e)

            */

            System.out.println("Error general: ocurrió una excepción.");

        } finally {
            /*
            Este bloque se ejecuta siempre.

            Se ejecuta:
            - si hubo error
            - si no hubo error
            - si entró al catch
            - si no entró al catch

            Se usa mucho para cerrar recursos como:
            - archivos
            - conexiones
            - scanners
            */

            System.out.println("Bloque finally ejecutado.");
        }

        /*
        Esta línea está después del try-catch-finally.

        Si la excepción fue capturada correctamente,
        el programa continúa y llega hasta acá.
        */

        System.out.println("Fin del programa.");
    }
}