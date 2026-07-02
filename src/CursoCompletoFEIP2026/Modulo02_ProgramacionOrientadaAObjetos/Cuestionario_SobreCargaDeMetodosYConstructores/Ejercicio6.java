package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio6 {
    public static void main(String[] args) {
        Proceso p = new Proceso();
        char a = 65; // El valor 65 en char corresponde al carácter 'A' en la tabla ASCII/Unicode.
        p.procesar(a);

    }
    public static class Proceso {

        public void procesar(char c){
            System.out.println("Char: " + c);
        }

        public void procesar(int i){ // No usa procesar (int i), porque la variable a es de tipo char.
            System.out.println("Int: " + i);
        }
    }
}
/**
 * La respuesta correcta és: Char: A
 */
