package Bloque5_Sobrecarga.Pregunta21_Suma_de_numeros_pares;

class Mensaje {

    public void enviarMensaje(String destinatario) {

        // ================================
        // PREGUNTA 21 — SOBRECARGA DE MÉTODOS
        // ================================
        //
        // Este método se llama enviarMensaje.
        //
        // Recibe UN solo parámetro:
        //
        // String destinatario
        //
        // Este método se usa cuando queremos enviar un mensaje
        // solamente indicando a quién va dirigido.
        //
        // Ejemplo de llamada:
        //
        // enviarMensaje("Ana");
        //
        // Como la llamada tiene un solo String,
        // Java elige este método.

        System.out.println("Enviando mensaje a: " + destinatario);
    }

    public void enviarMensaje(String destinatario, String mensaje) {

        // Este método también se llama enviarMensaje.
        //
        // Pero recibe DOS parámetros:
        //
        // String destinatario
        // String mensaje
        //
        // Esto se llama SOBRECARGA DE MÉTODOS.
        //
        // Sobrecarga significa:
        //
        // Tener varios métodos con el mismo nombre,
        // pero con diferente lista de parámetros.
        //
        // Java decide cuál método usar mirando:
        //
        // - cantidad de parámetros
        // - tipo de parámetros
        // - orden de parámetros
        //
        // Ejemplo de llamada:
        //
        // enviarMensaje("Juan", "Hola, ¿cómo estás?");
        //
        // Como la llamada tiene dos String,
        // Java elige este segundo método.

        System.out.println(
                "Enviando mensaje a: " + destinatario +
                " con el contenido: " + mensaje
        );
    }
}

public class Main {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Mensaje.
        //
        // msg es la variable que nos permite usar
        // los métodos de la clase Mensaje.
        Mensaje msg = new Mensaje();

        // Esta llamada tiene UN solo parámetro.
        //
        // Entonces Java busca un método llamado enviarMensaje
        // que reciba un String.
        //
        // Encuentra este:
        //
        // public void enviarMensaje(String destinatario)
        //
        // Por eso imprime:
        //
        // Enviando mensaje a: Ana
        msg.enviarMensaje("Ana");

        // Esta llamada tiene DOS parámetros.
        //
        // Entonces Java busca un método llamado enviarMensaje
        // que reciba:
        //
        // String, String
        //
        // Encuentra este:
        //
        // public void enviarMensaje(String destinatario, String mensaje)
        //
        // Por eso imprime:
        //
        // Enviando mensaje a: Juan con el contenido: Hola, ¿cómo estás?
        msg.enviarMensaje("Juan", "Hola, ¿cómo estás?");
    }
}

/*
================================================
SALIDA
================================================

Enviando mensaje a: Ana
Enviando mensaje a: Juan con el contenido: Hola, ¿cómo estás?


================================================
RESPUESTA
================================================

La salida correcta es:

Enviando mensaje a: Ana
Enviando mensaje a: Juan con el contenido: Hola, ¿cómo estás?


================================================
IDEA CLAVE
================================================

Sobrecarga significa tener varios métodos
con el mismo nombre, pero con distinta firma.

La firma del método depende de:

- nombre del método
- cantidad de parámetros
- tipo de parámetros
- orden de parámetros

NO depende del tipo de retorno.

Ejemplo válido de sobrecarga:

public void sumar(int a, int b)
public void sumar(double a, double b)

¿Por qué es válido?

Porque los tipos de parámetros son distintos.

Ejemplo NO válido:

public int sumar(int a, int b)
public double sumar(int a, int b)

¿Por qué NO es válido?

Porque los parámetros son iguales.
Solo cambia el tipo de retorno.

Y eso no alcanza para sobrecargar.

Java acá está diciendo:
"Mismo nombre, pero decime qué parámetros traés
y yo sé a qué método entrar".

Ordenado. Raro en Java, pero se agradece.
*/