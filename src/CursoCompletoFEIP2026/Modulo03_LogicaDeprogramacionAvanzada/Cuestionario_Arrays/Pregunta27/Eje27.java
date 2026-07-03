package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta27;

public class Eje27 {
    public static void main(String[] args) {
        String nombres[] = {"Sara", "Carlos", "Andres", "Arturo", "Guido", "Fabricio", "Estela"};

        int letras = verificar(nombres);

        System.out.println(letras);
    }

    private static int verificar(String[] nombres) {

        int contador = 0;
        String aux = "";

        for (String s : nombres) {

            aux = s.toLowerCase();

            for (int i = 0; i < aux.length(); i++) {

                if (aux.charAt(i) == 'a') {
                    contador++;
                }
            }
        }

        return contador;
    }
}
