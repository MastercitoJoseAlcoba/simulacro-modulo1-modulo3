package FIP_PRE_05_JMAC_2026_Guille.Pregunta14;

import Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta10.Auto;
import Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta10.Moto;
import Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta10.Vehiculo;

public class Herencia {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo auto = new Auto();
        Vehiculo moto = new Moto();

        System.out.println((vehiculo instanceof Vehiculo) + " - ");
        System.out.println((vehiculo instanceof Auto) + " - ");
        System.out.println((vehiculo instanceof Moto) + " - ");
        System.out.println((auto instanceof Vehiculo) + " - ");
        System.out.println((auto instanceof Moto) + " - ");
        System.out.println((moto instanceof Vehiculo) + " - ");
    }

}

/**
 * Explicación:
 *
 * instanceOf verifica el tipo real del objeto y su jerarquía.
 *
 * 1. Un objeto Vehiculo es instancia de Vehiculo, pero no de Auto ni de Moto.
 * 2. Un objeto Auto también es Vehiculo, porque Auto hereda de Vehiculo.
 * 3. Un objeto Auto no es Moto: son subclases distintas.
 * 4. Un objeto Moto también es Vehiculo.
 *
 * Respuesta correcta: a. true - false - false - true - false - true -
 *
 */
