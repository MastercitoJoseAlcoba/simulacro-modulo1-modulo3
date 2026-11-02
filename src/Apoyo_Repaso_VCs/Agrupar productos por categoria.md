### Ejercicio: Agrupar productos por categoría

Implementar un método estático llamado agruparPorCategoria que reciba dos arreglos:
String [] categorias
String [] productos
Ambos arreglos están relacionados por posición. Es decir, el producto ubicado en productos [i] pertenece a la categoria ubicada en categorias[i].
El método debe devolver un Map<String>, ArrayList<String>, donde cada clase sea una categoríá y cada valor sea la lista de productos
que pertenecen a esa categoría.
Los productos deben agregarse en el mismo orden en que aparecen en el arreglo.
Si alguno de los arreglos es null, el método debe devolver un mapa vacío.
Si los arreglos tienen distinto largo, solo deben procesarse las posiciones válidas hasta el largo menor.
Se deben ignorar las posiciones donde la categoría o el producto sean null o"".

La firma del método debe ser:
### public static Map<String, ArrayList<String>> agruparPorCategoria(String[] categorias, String[] productos)

Ejemplo:

String[] categorias = {"Electrónica", "Ropa", "Electrónica", "Ropa", "Electrónica"};
String[] productos = {"Teléfono", "Camiseta", "Tablet", "Pantalón", "Audífonos"};

Map<String, ArrayList<String>> resultado = agruparPorCategoria(categorias, productos);
System.out.println(resultado);

// Output: {Electrónica=[Teléfono, Tablet, Audífonos], Ropa=[Camiseta, Pantalón]}