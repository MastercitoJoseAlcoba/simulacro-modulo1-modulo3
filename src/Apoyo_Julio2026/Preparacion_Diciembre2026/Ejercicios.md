# 📚 Preparación FEIP - Diciembre

Ejercicio 1: *Sumar la diagonal válida de una matriz escalonada*

- [x] Implementar un método llamado *sumarDiagonalValida* que reciba como parametro una matriz bidimensional de enteros int[][] matriz.
- [x] El método debe devolver la suma de los elementos ubicados en la diagonal principal, es decir, los elementos *matriz[fila][fila],*
siempre que esa posición exista.
- [x] Se debe tener en cuenta que la matriz debe ser escalonada. Esto significa que no todas las filas tienen necesariamente
la misma cantidad de columnas.
- [x] Si la matriz es null, el método debe devolver 0.
- [x] Si una fila es null, debe ignorarse.
- [x] Si una fila no tiene una posición válida, también debe ignorarse.
- [x] La firma del método debe ser: *public static int sumarDiagonalValida(int[][] matriz)*


Ejercicio 2: Agrupar por categoría

- [x] Implementar un método estático agruparCategoría que recíba dos arreglos:
* String[] categorias
* String[] productos

* Ambos arreglos están relacionados por posición. Es decir, el producto ubicado en productos[i] pertenece a la categoríá 
ubicada en categorías[i].
- [x] El método debe devolver un Map<String, ArrayList<String>, donde cada clave sea una categoría y cada valor sea la lista 
productos que pertenecen en esa categoría.
- [x] Los productos deben agregarse en el mismo orden en que aparecen en el arreglo.
- [x] Si alguno de los arreglos es null, el método debe devolver un mapa vacío.
- [x] Si los arreglos tienen distinto largo, solo deben procesarse las posiciones válidas hasta el largo menor.
- [x] Se deben ignorar las posiciones donde la categoría o el producto sean null o"".
* La firma del método debe ser:
* public static Map<String, ArrayList<String>> agruparCategoría(String[] categorías, String[] productos).

* Ejemplos: 
- [x] String[] categorías = {"Electrónica", "Ropa", "Electrónica", "Ropa", "Electrónica"};
- [x] String[] productos = {"Teléfono", "Camiseta", "Tablet", "Pantalón", "Audífonos"};
- [x] Map<String, ArrayList<String>> resultado = agruparCategoría(categorías, productos);
- [x] System.out.println(resultado);
- [x] // Output: {Electrónica=[Teléfono, Tablet, Audífonos], Ropa=[Camiseta, Pantalón]}
