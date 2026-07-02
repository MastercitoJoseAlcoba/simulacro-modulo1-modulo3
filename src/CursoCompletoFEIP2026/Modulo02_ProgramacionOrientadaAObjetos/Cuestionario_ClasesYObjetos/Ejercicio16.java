package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_ClasesYObjetos;

public class Ejercicio16 {
    public static void main(String[] args) {

    }
    public class Producto {
        private String nombre;
        private double precio;
        private int iva;

        public Producto(String nombre, double precio, int iva) {
            this.nombre = nombre;
            this.precio = 0;
            this.iva = 0;
        }

        public Producto (){
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getIva() {
            return iva;
        }

        public void setIva(int iva) {
            this.iva = iva;
        }
    }
}

/**
 * ¿Cuando creo una nueva instancia usando el primer constructor Producto, como hago para modificar el atributo precio?
 *
 * a. Utilizo el método setPrecio(); ✅
 * b. Utilizo el constructor vacío para modificar la instancia
 * c. Utilizo el método getPrecio();
 * d. Usando el nombre de la instancia precio=100; por ejemplo
 *
 */
