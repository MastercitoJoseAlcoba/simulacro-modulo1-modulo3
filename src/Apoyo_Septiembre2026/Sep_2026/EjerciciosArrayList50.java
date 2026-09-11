import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 50 ejercicios resueltos de ArrayList.
 * Cada ejercicio contiene su letra y una solución independiente.
 */
public class EjerciciosArrayList50 {

    public static void main(String[] args) {
        ejercicio01(); ejercicio02(); ejercicio03(); ejercicio04(); ejercicio05();
        ejercicio06(); ejercicio07(); ejercicio08(); ejercicio09(); ejercicio10();
        ejercicio11(); ejercicio12(); ejercicio13(); ejercicio14(); ejercicio15();
        ejercicio16(); ejercicio17(); ejercicio18(); ejercicio19(); ejercicio20();
        ejercicio21(); ejercicio22(); ejercicio23(); ejercicio24(); ejercicio25();
        ejercicio26(); ejercicio27(); ejercicio28(); ejercicio29(); ejercicio30();
        ejercicio31(); ejercicio32(); ejercicio33(); ejercicio34(); ejercicio35();
        ejercicio36(); ejercicio37(); ejercicio38(); ejercicio39(); ejercicio40();
        ejercicio41(); ejercicio42(); ejercicio43(); ejercicio44(); ejercicio45();
        ejercicio46(); ejercicio47(); ejercicio48(); ejercicio49(); ejercicio50();
    }

    private static void titulo(int numero) {
        System.out.println("\n--- EJERCICIO " + numero + " ---");
    }

    // LETRA 1: Crear una lista y agregar "Pan", "Leche" y "Arroz" al final.
    public static void ejercicio01() {
        titulo(1);
        ArrayList<String> productos = new ArrayList<>();
        productos.add("Pan");
        productos.add("Leche");
        productos.add("Arroz");
        System.out.println(productos);
    }

    // LETRA 2: Agregar "Fideos" en la posición 0.
    public static void ejercicio02() {
        titulo(2);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        productos.add(0, "Fideos");
        System.out.println(productos);
    }

    // LETRA 3: Agregar "Azúcar" en la posición 1.
    public static void ejercicio03() {
        titulo(3);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        productos.add(1, "Azúcar");
        System.out.println(productos);
    }

    // LETRA 4: Agregar "Café" al final y mostrar la lista.
    public static void ejercicio04() {
        titulo(4);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche"));
        productos.add("Café");
        System.out.println(productos);
    }

    // LETRA 5: Insertar "Harina" justo antes de "Arroz".
    public static void ejercicio05() {
        titulo(5);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        int posicionArroz = productos.indexOf("Arroz");
        productos.add(posicionArroz, "Harina");
        System.out.println(productos);
    }

    // LETRA 6: Mostrar el producto ubicado en la posición 0.
    public static void ejercicio06() {
        titulo(6);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Fideos", "Pan", "Leche"));
        System.out.println(productos.get(0));
    }

    // LETRA 7: Mostrar el producto ubicado en la posición 2.
    public static void ejercicio07() {
        titulo(7);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Fideos", "Pan", "Leche"));
        System.out.println(productos.get(2));
    }

    // LETRA 8: Mostrar el último producto sin escribir directamente su índice.
    public static void ejercicio08() {
        titulo(8);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz", "Café"));
        String ultimo = productos.get(productos.size() - 1);
        System.out.println(ultimo);
    }

    // LETRA 9: Mostrar el primer y el último producto.
    public static void ejercicio09() {
        titulo(9);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Fideos", "Pan", "Leche", "Arroz"));
        System.out.println("Primero: " + productos.get(0));
        System.out.println("Último: " + productos.get(productos.size() - 1));
    }

    // LETRA 10: Mostrar cuántos productos contiene la lista.
    public static void ejercicio10() {
        titulo(10);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        System.out.println("Cantidad: " + productos.size());
    }

    // LETRA 11: Reemplazar el elemento de la posición 1 por "Yogur".
    public static void ejercicio11() {
        titulo(11);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        productos.set(1, "Yogur");
        System.out.println(productos);
    }

    // LETRA 12: Reemplazar "Arroz" por "Lentejas" buscando primero su posición.
    public static void ejercicio12() {
        titulo(12);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Arroz", "Leche"));
        int posicion = productos.indexOf("Arroz");
        if (posicion != -1) {
            productos.set(posicion, "Lentejas");
        }
        System.out.println(productos);
    }

    // LETRA 13: Cambiar el primer producto por "Galletas".
    public static void ejercicio13() {
        titulo(13);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        productos.set(0, "Galletas");
        System.out.println(productos);
    }

    // LETRA 14: Cambiar el último producto por "Sal" sin escribir su índice directamente.
    public static void ejercicio14() {
        titulo(14);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Azúcar"));
        productos.set(productos.size() - 1, "Sal");
        System.out.println(productos);
    }

    // LETRA 15: Guardar el valor anterior al usar set() y mostrarlo.
    public static void ejercicio15() {
        titulo(15);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        String reemplazado = productos.set(1, "Yogur");
        System.out.println("Se reemplazó: " + reemplazado);
        System.out.println(productos);
    }

    // LETRA 16: Eliminar el producto de la posición 0.
    public static void ejercicio16() {
        titulo(16);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Fideos", "Pan", "Leche"));
        productos.remove(0);
        System.out.println(productos);
    }

    // LETRA 17: Eliminar el producto "Leche" por su contenido.
    public static void ejercicio17() {
        titulo(17);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        productos.remove("Leche");
        System.out.println(productos);
    }

    // LETRA 18: Eliminar el último producto.
    public static void ejercicio18() {
        titulo(18);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        productos.remove(productos.size() - 1);
        System.out.println(productos);
    }

    // LETRA 19: Intentar eliminar "Café" y mostrar si realmente fue eliminado.
    public static void ejercicio19() {
        titulo(19);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        boolean eliminado = productos.remove("Café");
        System.out.println("¿Se eliminó? " + eliminado);
        System.out.println(productos);
    }

    // LETRA 20: Hay dos "Leche". Eliminar solamente la primera aparición.
    public static void ejercicio20() {
        titulo(20);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz", "Leche"));
        productos.remove("Leche");
        System.out.println(productos);
    }

    // LETRA 21: Comprobar si la lista contiene "Azúcar".
    public static void ejercicio21() {
        titulo(21);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Azúcar", "Leche"));
        System.out.println(productos.contains("Azúcar"));
    }

    // LETRA 22: Mostrar la posición de "Leche".
    public static void ejercicio22() {
        titulo(22);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        System.out.println("Posición: " + productos.indexOf("Leche"));
    }

    // LETRA 23: Mostrar la última posición donde aparece "Leche".
    public static void ejercicio23() {
        titulo(23);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Leche", "Pan", "Leche", "Arroz"));
        System.out.println("Última posición: " + productos.lastIndexOf("Leche"));
    }

    // LETRA 24: Si existe "Pan", reemplazarlo por "Pan integral".
    public static void ejercicio24() {
        titulo(24);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        if (productos.contains("Pan")) {
            productos.set(productos.indexOf("Pan"), "Pan integral");
        }
        System.out.println(productos);
    }

    // LETRA 25: Si no existe "Café", agregarlo al final.
    public static void ejercicio25() {
        titulo(25);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche"));
        if (!productos.contains("Café")) {
            productos.add("Café");
        }
        System.out.println(productos);
    }

    // LETRA 26: Recorrer la lista con for y mostrar índice y producto.
    public static void ejercicio26() {
        titulo(26);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(i + " -> " + productos.get(i));
        }
    }

    // LETRA 27: Recorrer la lista con for-each.
    public static void ejercicio27() {
        titulo(27);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        for (String producto : productos) {
            System.out.println(producto);
        }
    }

    // LETRA 28: Mostrar los productos en orden inverso sin modificar la lista.
    public static void ejercicio28() {
        titulo(28);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        for (int i = productos.size() - 1; i >= 0; i--) {
            System.out.println(productos.get(i));
        }
    }

    // LETRA 29: Contar cuántas veces aparece "Leche".
    public static void ejercicio29() {
        titulo(29);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Leche", "Pan", "Leche", "Arroz"));
        int contador = 0;
        for (String producto : productos) {
            if (producto.equals("Leche")) {
                contador++;
            }
        }
        System.out.println("Leche aparece " + contador + " veces");
    }

    // LETRA 30: Mostrar solamente los productos cuyo nombre tiene más de 4 letras.
    public static void ejercicio30() {
        titulo(30);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz", "Sal"));
        for (String producto : productos) {
            if (producto.length() > 4) {
                System.out.println(producto);
            }
        }
    }

    // LETRA 31: Crear una lista de enteros y agregar 10, 20 y 30.
    public static void ejercicio31() {
        titulo(31);
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println(numeros);
    }

    // LETRA 32: Agregar el número 5 en la posición 0.
    public static void ejercicio32() {
        titulo(32);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30));
        numeros.add(0, 5);
        System.out.println(numeros);
    }

    // LETRA 33: Eliminar el número que está en la posición 1.
    public static void ejercicio33() {
        titulo(33);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30));
        numeros.remove(1); // Elimina por índice: elimina 20.
        System.out.println(numeros);
    }

    // LETRA 34: Eliminar el valor 10, no el elemento de la posición 10.
    public static void ejercicio34() {
        titulo(34);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 10, 15));
        numeros.remove(Integer.valueOf(10)); // Integer.valueOf fuerza eliminación por valor.
        System.out.println(numeros);
    }

    // LETRA 35: Sumar todos los números de la lista.
    public static void ejercicio35() {
        titulo(35);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 10, 15));
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("Suma: " + suma);
    }

    // LETRA 36: Mostrar únicamente los números pares.
    public static void ejercicio36() {
        titulo(36);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(3, 8, 11, 14, 20));
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

    // LETRA 37: Reemplazar cada número negativo por 0.
    public static void ejercicio37() {
        titulo(37);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(-5, 8, -2, 10));
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < 0) {
                numeros.set(i, 0);
            }
        }
        System.out.println(numeros);
    }

    // LETRA 38: Duplicar cada número de la lista usando set().
    public static void ejercicio38() {
        titulo(38);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, 4, 6));
        for (int i = 0; i < numeros.size(); i++) {
            numeros.set(i, numeros.get(i) * 2);
        }
        System.out.println(numeros);
    }

    // LETRA 39: Encontrar el número mayor.
    public static void ejercicio39() {
        titulo(39);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(12, 5, 27, 9));
        int mayor = numeros.get(0);
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("Mayor: " + mayor);
    }

    // LETRA 40: Calcular el promedio de los números.
    public static void ejercicio40() {
        titulo(40);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double promedio = (double) suma / numeros.size();
        System.out.println("Promedio: " + promedio);
    }

    // LETRA 41: Ordenar alfabéticamente una lista de productos.
    public static void ejercicio41() {
        titulo(41);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Leche", "Arroz", "Pan", "Azúcar"));
        Collections.sort(productos);
        System.out.println(productos);
    }

    // LETRA 42: Invertir físicamente el orden de la lista.
    public static void ejercicio42() {
        titulo(42);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        Collections.reverse(productos);
        System.out.println(productos);
    }

    // LETRA 43: Copiar solamente los productos que comienzan con la letra A.
    public static void ejercicio43() {
        titulo(43);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Arroz", "Pan", "Azúcar", "Leche"));
        ArrayList<String> comienzanConA = new ArrayList<>();
        for (String producto : productos) {
            if (producto.startsWith("A")) {
                comienzanConA.add(producto);
            }
        }
        System.out.println(comienzanConA);
    }

    // LETRA 44: Crear una nueva lista sin productos repetidos.
    public static void ejercicio44() {
        titulo(44);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Pan", "Arroz", "Leche"));
        ArrayList<String> sinRepetidos = new ArrayList<>();
        for (String producto : productos) {
            if (!sinRepetidos.contains(producto)) {
                sinRepetidos.add(producto);
            }
        }
        System.out.println(sinRepetidos);
    }

    // LETRA 45: Vaciar completamente una lista y comprobar si quedó vacía.
    public static void ejercicio45() {
        titulo(45);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche"));
        productos.clear();
        System.out.println("¿Está vacía? " + productos.isEmpty());
    }

    // LETRA 46: Eliminar todos los números menores que 10 sin provocar errores de índices.
    public static void ejercicio46() {
        titulo(46);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(4, 15, 7, 20, 3));
        for (int i = numeros.size() - 1; i >= 0; i--) {
            if (numeros.get(i) < 10) {
                numeros.remove(i);
            }
        }
        System.out.println(numeros);
    }

    // LETRA 47: Mover el último producto al comienzo de la lista.
    public static void ejercicio47() {
        titulo(47);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz", "Café"));
        String ultimo = productos.remove(productos.size() - 1);
        productos.add(0, ultimo);
        System.out.println(productos);
    }

    // LETRA 48: Intercambiar el primer producto con el último.
    public static void ejercicio48() {
        titulo(48);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz", "Café"));
        String primero = productos.get(0);
        String ultimo = productos.get(productos.size() - 1);
        productos.set(0, ultimo);
        productos.set(productos.size() - 1, primero);
        System.out.println(productos);
    }

    // LETRA 49: Agregar "Fideos" en 0, reemplazar "Leche" por "Yogur" y eliminar "Arroz".
    public static void ejercicio49() {
        titulo(49);
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Pan", "Leche", "Arroz"));
        productos.add(0, "Fideos");
        productos.set(productos.indexOf("Leche"), "Yogur");
        productos.remove("Arroz");
        System.out.println(productos); // [Fideos, Pan, Yogur]
    }

    // LETRA 50: Simular una lista de compras evitando duplicados y mostrarla numerada.
    public static void ejercicio50() {
        titulo(50);
        String[] pedidos = {"Pan", "Leche", "Fideos", "Pan", "Arroz", "Leche"};
        ArrayList<String> compras = new ArrayList<>();

        for (String pedido : pedidos) {
            if (!compras.contains(pedido)) {
                compras.add(pedido);
            }
        }

        for (int i = 0; i < compras.size(); i++) {
            System.out.println((i + 1) + ". " + compras.get(i));
        }
    }
}
