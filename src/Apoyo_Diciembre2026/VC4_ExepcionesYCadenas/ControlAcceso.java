package Apoyo_Diciembre2026.VC4_ExepcionesYCadenas;

public class ControlAcceso {

    public String verificarEdad(String edadTexto) {

        String resultado = "";

        try {
            int edad = Integer.parseInt(edadTexto);

            if (edad < 18) {
                resultado = "Acceso denegado";
            } else {
                resultado = "Acceso permitido";
            }

        } catch (NumberFormatException e) {
            resultado = "Edad invalida";

        } finally {
            resultado += " - Control finalizado";
        }

        return resultado;
    }
}