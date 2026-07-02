package CursoCompletoFEIP2026.Practice.Cuestionario_ManejoDeExcepciones;

public class Cuestionario {
    public static void main(String[] args) {
        /*
         * Pregunta 1:
         * ¿Cual es la diferencia entre throw y throws en Java?
         * b. Throw se utiliza para lanzar una excepción manualmente, throws se utiliza para declarar que un método puede
         * throw = tirar/lanzar la excepción.
         * throws = declarar/avisar que puede pasar
         *
         * Pregunta 2:
         * ¿Puede una excepción ser lanzada fuera de un try en Java?
         * c. Sí, siempre.
         * Una excepción puede lanzarse fuera de un try. El try-catch sirve para capturarla y manejarla, pero no es
         * obligatorio para que la excepción exista.
         *
         * Pregunta 3:
         * ¿Cuál es el propósito de la palabra clave throw en Java?
         * a. Lanzar una excepción manualmente.
         *
         * Pregunta 4:
         * ¿Que es un bloque try-with-resources en Java?
         * d. Un bloque try que puede gestionar automaticamente la liberacióñ de recursos al finalizar su ejecución.
         * Sirve para usar recursos que despues deben cerrarse, como archivos, lectores, conexiones, etc.
         *
         * Pregunta 5:
         * ¿Que es una excepción en Java?
         * c. Un comportamiento no desado durante la ejecucióñ del programa.
         * Una excepción es un problema que ocurre mientras el programa se esta ejecutando.
         *
         * Pregunta 6:
         * La excepción nos frena y paran el flujo normal del programa. por eso, necesitamos la manipulación del evento.
         * La principal ventaja del manejo de excepciones es mantener el flujo normal del programa.                                                                                          lanzar excepciones.
         *
         * Pregunta 7:
         * d. Infinity
         *
         * Pregunta 8:
         * a. Funciona correctamente mostrando los datos del array por la consola.
         *
         * Pregunta 9:
         * c. 52
         *
         * Pregunta 10:
         * Complete las líneas de código:
         *
         * public class Principal{
         * public static void main (String[] args) {
         * int num0 = 10, num1 = 0, resultado = 0;
         *
         * try {
         *
         * resultado = num0 / num1;
         *
         * } catch (Exception e) {
         *
         * System.out.print("No se hizo la división");
         * }
         * }
         * }
         * Y el resultado en consola es el siguiente: No se hizo la división
         *
         * Pregunta 11:
         * ¿Cual es el bloque utilizado para manejar excepciones en Java?
         * d. catch
         * El bloque catch es el que maneja/captura la excepción.
         *
         * Pregunta 12:
         * En que líneas debemos controlar las excepciones:
         * línea 12
         * línea 10
         * línea 13
         * línea 9
         * línea 11
         *
         * Pregunta 13:
         * ¿Cual es el proposito de la clase Excepcion en Java?
         * c. Servir como clase base para todas las excepciones.
         * En Java, Excepcion es una base de la cual heredan muchas excepciones, por ejemplo:
         * IOException
         * SQLException
         * NumberFormatException
         *
         * Pregunta 14:
         * Si en el código se produce un error y provoca una excepción que no es aritmetica en el Bloque 2, cómo es el
         * flujo de funcionamiento del programa.
         * a. Bloque1 -> Bloque2 -> Bloque 4 -> Bloque 5
         * Porque el error ocurre dentro del try, en el Bloque2.
         *
         * Pregunta 15:
         * ¿Cuál es la diferencia entre las excepciones verificadas y no verificadas en Java?
         * d. Las excepciones verificadas deben ser declaradas o manejadas, las no verificadas no.
         * EN Java:
         * Excepciones verificads - checked excepcions
         * Java te obliga a manejarlas con try-catch o declararlas con throws.
         *
         * Pregunta 16:
         * d. Bloque1 -> Bloque2 -> Bloque
         * Porque no se produce ninguna excepción.
         *
         * Pregunta 17:
         * ¿Que hace el bloque finally en Java?
         * d. proporciona una ejecución de código que siempre se ejecuta, independientemente de si se lanzó una excepción o no.
         * El bloque finally se usa para ejcutar código final, por ejemplo cerrar archivos conexiones o liberar recursos.
         *
         * Pregunta 18:
         * ¿Que nos muestra al ejecutar este programa?
         * a. Lanzar la excepción "ArrayIndexOutOfBoundsException".
         * El array se creó con tamaño 4.
         *
         * Pregunta 19:
         * ¿Cual es la jerarquía de clases relacionada con las excepciones en Java?
         * b. Throwable, Error, Exception.
         *
         * Pregunta 20:
         * Este programa como esta escrito genera una excepción, ¿quw deberíamos modificar para que o produzca?
         * a. En la línea 5 modificar y poner: double[] v = new double[20];
         * c. En la línea 6 modificar y poner: acceso(v, 10);
         *
         * Pregunta 21:
         * Correspondencias correctas:
         * 1. En un bloque catch..
         * se captura la excepción.
         * 2. En un bloque try...
         * se continúa la ejecución hasta terminar el bloque.
         * 3. La clase Exception sirve para...
         * controlar los errores y mejorar el flujo de los datos.
         * 4. Si se produce un error en el bloque try...
         * se corta la ejecución y se pasa al catch.
         *
         * Pregunta 22:
         * c. A = throws, B = throw
         *
         * Pregunta 23:
         * ¿Es obligatorio incluir un bloque finally después de un bloque catch en Java?
         * b. No, es opcional.
         *
         * Pregunta 24:
         * ¿Cual es el proposito de la palabra clave throws en la declaración de un método en Java?
         * a. Indicar que el método puede lanzar excepciones.
         *
         * Pregunta 25:
         * ¿Qué es una excepción personalizada (custom exception) en Java?
         * a. Una excepción creada por el programador para situaciones especificas.
         *
         * Pregunta 26:
         * b. 1 - 3 - 4 - 6
         *
         * Pregunta 27:
         * ¿Cual es el proposito principal del manejo de excepciones en Java?
         * a. Proporcionar una forma de manejar errores durante la ejecución.
         *
         * Pregunta 28:
         * b. Bloque1 -> y se termina.
         *
         * Pregunta 29:
         * ¿Que hace el método printStackTrace() en Java cuando se maneja una excepción?
         * a. Imprime la traza de pila en la consola.
         *
         * Pregunta 30:
         * Entendemos por excepción a un EVENTO que ocurre durante la EJECUCIÓN de un programa e interrumpe el FLUJO
         * normal de sus instrucciones. Cuando se crea un ERROR en un método, este crea un objeto del tipo EXCEPTION,
         * que contiene información sobre el error, por ejemplo el tipo de Exception o el estado del programa donde
         * OCURRIÓ. Este objeto es entregado al sistema de ejecucióñ conocido en inglés como run time system, a este
         * proceso se le denomina LANZAR una excepción.
         *
         * Pregunta 31:
         * ¿Que sucede si ocurre un excepción dentro de un try y no hay bloque catch correspondiente?
         * b. Se ejecuta el códiigo dentro del bloque finally, si está presente, y luego el programa se detiene.
         *
         */
    }
}
