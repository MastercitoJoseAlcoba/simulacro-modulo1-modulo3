package FIP_PRE_05_JMAC_2026_Guille.Pregunta18;

public class MainAuto {
    public static void main(String[] args) {
        // Arreglo de objetos y sobrescritura de posiciones
        Auto autos [] = new Auto[3];
        autos[0] = new Auto("Fiat", "Rojo");
        autos[1] = new Auto("VW", "Verde");
        autos[2] = new Auto("Gold", "Azul");
        autos[0] = new Auto("Ford","Negro");
        autos[2] = new Auto("Suzuki","Gris");

        for (Auto a : autos) {
            System.out.println(a.getMarca() + " ");
        }

    }
}

// Respuesta correcta: Ford
//                     VW
//                     Suzuki
