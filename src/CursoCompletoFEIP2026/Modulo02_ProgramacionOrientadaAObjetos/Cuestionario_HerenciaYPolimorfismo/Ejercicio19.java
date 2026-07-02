package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_HerenciaYPolimorfismo;

public class Ejercicio19 {

    public static void main(String[] args) {
//        Persona persona1 = new Persona("Ana", 30);
//        Persona persona2 = new Menor("Pedro", 10, "Calle 123");
//        Persona persona3 = new Adolescente("Lucia", 15, "099123456");
//        Persona persona4 = new Adulto("Carlos", 40, "Avenida 18", "098987654");
//
//        System.out.println(persona1.getNombre() + " camina: " + persona1.camina());
//        System.out.println(persona2.getNombre() + " camina: " + persona2.camina());
//        System.out.println(persona3.getNombre() + " camina: " + persona3.camina());
//        System.out.println(persona4.getNombre() + " camina: " + persona4.camina());

          Persona juan = new Menor("Juan",9, "Calle 1 2222");
          Persona ana = new Adolescente("Ana", 16, "099622622");
          Persona paula = new Adulto("Paula", 45, "Calle 2 - 1522", "099658741");
          int suma = 0;
          suma+=paula.camina();
          suma+=paula.camina();
          suma+=ana.camina();
          suma+=juan.camina();
          suma+= juan.camina();
          System.out.println("La suma es : "+suma); // La suma es : 38, (fijarse si es menor, adolescente o adulto para sumar).

    }

    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int camina() {
            return 2;
        }
    }

    static class Menor extends Persona {
        private String direccion;

        public Menor(String nombre, int edad, String direccion) {
            super(nombre, edad);
            this.direccion = direccion;
        }

        @Override
        public int camina() {
            return 5;
        }
    }

    static class Adolescente extends Persona {
        private String telefono;

        public Adolescente(String nombre, int edad, String telefono) {
            super(nombre, edad);
            this.telefono = telefono;
        }

        @Override
        public int camina() {
            return 8;
        }
    }

    static class Adulto extends Persona {
        private String direccion;
        private String telefono;

        public Adulto(String nombre, int edad, String direccion, String telefono) {
            super(nombre, edad);
            this.direccion = direccion;
            this.telefono = telefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        @Override
        public int camina() {
            return 10;
        }
    }
}

