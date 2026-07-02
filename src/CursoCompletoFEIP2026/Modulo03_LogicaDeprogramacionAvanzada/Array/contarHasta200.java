package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

public class contarHasta200 {
    public static int main(String[] args) {
        int [] numeros = new int[10];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;
        numeros[6] = 70;
        numeros[7] = 80;
        numeros[8] = 90;
        numeros[9] = 100;

        if (numeros.length == 0){ // Arreglo vacío
            return 0;
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == 200){
                return i;
            }
        }

        return 0;
    }

}
