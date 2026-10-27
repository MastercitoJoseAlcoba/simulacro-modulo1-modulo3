package PruebaDZA.Modulo1.Condicional;

public class Operador_Ternario {
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;

        // Primera forma
        c += (a > 0 && a <= 10) ? ++a:a/b; // Si la condición se cumple, incrementa a en 1 y lo suma a c, si no, divide a entre b y suma el resultado a c
        System.out.println(c);

        // Segunda forma
        boolean condicion = (a > 0 && a <= 10);
        c += condicion ? ++a:a/b;
        System.out.println(condicion);
    }
}
