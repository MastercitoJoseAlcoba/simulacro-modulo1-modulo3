### CR02_AY_FEIP

### Ejercicio: Sumar la diagonal válida de una matriz escalonada.
Implementar un método llamado sumarDiagonalValida que reciba como parámetro una matriz bidimensional de enteros int[][] matriz.
El método debe devolver la suma de los elementos ubicados en la diagonal principal, es decir, los elementos matriz[i][i], siempre
que esa posición exista.
Se debe tener en cuenta que la matriz puede ser escalonada. Esto significa que no todas las filas tienen necesariamente la misma
cantidad de columnas.
Si la matriz es null, el método debe devolver 0.
Si una fila no tiene una posición diagonal válida, también debe ignorarse.

La firma del método debe ser: 
### public static int sumarDiagonalValida(int[][] matriz)