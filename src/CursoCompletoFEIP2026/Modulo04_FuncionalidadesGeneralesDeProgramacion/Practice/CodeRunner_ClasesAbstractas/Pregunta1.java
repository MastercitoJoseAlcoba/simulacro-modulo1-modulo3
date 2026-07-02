package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.CodeRunner_ClasesAbstractas;

public class Pregunta1 {
    public static void main(String[] args) {

    }
    abstract class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public abstract void presentarse();

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }

    class Empleado extends Persona {
        private String empresa;

        public Empleado(String nombre, int edad, String empresa) {
            super(nombre, edad);
            this.empresa = empresa;
        }

        @Override
        public void presentarse() {
            System.out.println("Hola, soy " + getNombre() +
                    ", tengo " + getEdad() +
                    " años y trabajo en " + empresa + ".");
            System.out.println("-------------");
        }
    }

    class Gerente extends Persona {
        private String departamento;

        public Gerente(String nombre, int edad, String departamento) {
            super(nombre, edad);
            this.departamento = departamento;
        }

        @Override
        public void presentarse() {
            System.out.println("Hola, soy " + getNombre() +
                    ", tengo " + getEdad() +
                    " años y soy gerente del departamento de " + departamento + ".");
            System.out.println("-------------");
        }
    }
}
