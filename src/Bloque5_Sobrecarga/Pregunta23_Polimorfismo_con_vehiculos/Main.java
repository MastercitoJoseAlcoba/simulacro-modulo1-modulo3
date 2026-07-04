package Bloque5_Sobrecarga.Pregunta23_Polimorfismo_con_vehiculos;

class Vehiculo {

    public void encender() {

        // ================================
        // PREGUNTA 23 — POLIMORFISMO
        // ================================
        //
        // Esta es la clase padre.
        //
        // Tiene un método llamado encender().
        //
        // Este método muestra un mensaje general
        // para cualquier vehículo.

        System.out.println("El vehículo está encendido");
    }
}

class Coche extends Vehiculo {

    @Override
    public void encender() {

        // Coche hereda de Vehiculo.
        //
        // La palabra extends significa:
        //
        // "Coche es una clase hija de Vehiculo".
        //
        // Entonces Coche recibe lo que tiene Vehiculo,
        // pero también puede cambiar comportamientos.
        //
        // En este caso, Coche sobrescribe el método encender().
        //
        // @Override indica que este método reemplaza
        // la versión que venía de la clase padre.
        //
        // Cuando el objeto real sea Coche,
        // se ejecuta esta versión.

        System.out.println("El coche está encendido");
    }
}

class Motocicleta extends Vehiculo {

    @Override
    public void encender() {

        // Motocicleta también hereda de Vehiculo.
        //
        // Y también sobrescribe el método encender().
        //
        // Eso significa que Motocicleta tiene su propia forma
        // de responder cuando se llama a encender().

        System.out.println("La motocicleta está encendida");
    }
}

public class Main {

    public static void main(String[] args) {

        // Creamos un objeto de tipo Vehiculo.
        //
        // Tipo de referencia:
        // Vehiculo
        //
        // Tipo real del objeto:
        // Vehiculo
        //
        // Entonces cuando llamemos a encender(),
        // se ejecutará el método de Vehiculo.
        Vehiculo miVehiculo = new Vehiculo();

        // Creamos un objeto Coche,
        // pero lo guardamos en una variable de tipo Vehiculo.
        //
        // Tipo de referencia:
        // Vehiculo
        //
        // Tipo real del objeto:
        // Coche
        //
        // Esto es posible porque Coche hereda de Vehiculo.
        //
        // Es decir:
        //
        // un Coche también es un Vehiculo.
        Vehiculo miCoche = new Coche();

        // Creamos un objeto Motocicleta,
        // pero lo guardamos en una variable de tipo Vehiculo.
        //
        // Tipo de referencia:
        // Vehiculo
        //
        // Tipo real del objeto:
        // Motocicleta
        //
        // Esto también es polimorfismo.
        Vehiculo miMotocicleta = new Motocicleta();

        // Como el objeto real es Vehiculo,
        // se ejecuta encender() de Vehiculo.
        miVehiculo.encender();

        // Aunque la variable sea de tipo Vehiculo,
        // el objeto real es Coche.
        //
        // Entonces Java ejecuta encender() de Coche.
        //
        // Esto se llama despacho dinámico.
        miCoche.encender();

        // Aunque la variable sea de tipo Vehiculo,
        // el objeto real es Motocicleta.
        //
        // Entonces Java ejecuta encender() de Motocicleta.
        miMotocicleta.encender();
    }
}

/*
================================================
SALIDA
================================================

El vehículo está encendido
El coche está encendido
La motocicleta está encendida


================================================
IDEA CLAVE
================================================

Polimorfismo significa que una variable de tipo padre
puede apuntar a objetos de clases hijas.

Ejemplo:

Vehiculo v = new Coche();

La variable es de tipo Vehiculo.
Pero el objeto real es Coche.

Cuando llamamos a un método sobrescrito,
Java mira el objeto real.

Entonces:

Vehiculo v = new Coche();
v.encender();

Ejecuta:

encender() de Coche.

No ejecuta el de Vehiculo.

Eso se llama despacho dinámico.

En criollo:
Java mira lo que realmente hay adentro,
no solo la etiqueta de afuera.


================================================
DIFERENCIA IMPORTANTE
================================================

Tipo de referencia:

Vehiculo miCoche

Eso define qué métodos puedo llamar.

Tipo real:

new Coche()

Eso define qué versión del método se ejecuta
si el método está sobrescrito.


================================================
RESPUESTA
================================================

La salida correcta es:

El vehículo está encendido
El coche está encendido
La motocicleta está encendida


================================================
RESUMEN PARA EL PARCIAL
================================================

extends:
sirve para heredar.

@Override:
sirve para sobrescribir un método.

Polimorfismo:
una variable padre puede guardar objetos hijos.

Despacho dinámico:
Java ejecuta el método del objeto real.

Java acá se porta bien:
no juzga por la variable, juzga por los hechos.
*/