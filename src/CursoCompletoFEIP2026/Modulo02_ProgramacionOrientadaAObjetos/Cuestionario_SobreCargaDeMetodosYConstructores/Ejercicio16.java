package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio16 {
    public static void main(String[] args) {
        Ejercicio16 ejercicio16 = new Ejercicio16();
        ejercicio16.mostrar(10);
        ejercicio16.mostrar("Hola");
        ejercicio16.mostrar(10, "Hola");

    }
    public void mostrar(int numero) {
        System.out.println(numero);
    }

    public void mostrar(String texto) {
        System.out.println(texto);
    }

    public void mostrar(int numero, String texto) {
        System.out.println(numero + " " + texto);
    }
}

/**
 * ¿Cuál de las siguientes es una regla válida para sobrecargar el método en Java?
 *
 * d. Los métodos deben diferir en el tipo y/o número de sus parámetros.
 *
 * En Java, para que haya sobrecarga, los métodos pueden tener el mismo nombre, pero deben cambiar los parámetros.
 */