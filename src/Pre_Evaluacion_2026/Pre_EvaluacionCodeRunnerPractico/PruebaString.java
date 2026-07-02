package Pre_Evaluacion_2026.Pre_EvaluacionCodeRunnerPractico;

public class PruebaString {

    public void prueba(String dato) {
        try {
            System.out.println(dato.charAt(3));
            System.out.println(dato.substring(0, 5));
            System.out.println("Proceso correcto");

        } catch (NullPointerException e) {
            System.out.println("Error de null");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error de string");
        }
    }
}