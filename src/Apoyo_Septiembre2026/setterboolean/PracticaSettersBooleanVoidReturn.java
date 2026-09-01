package Apoyo_Septiembre2026.setterboolean;

public class PracticaSettersBooleanVoidReturn {

    // =========================================================
    // EJERCICIO MODELO:
    // Practicar SETTERS + BOOLEAN + VOID + RETURN
    // =========================================================

    static class Estudiante {

        // ATRIBUTOS
        private String nombre;
        private double promedio;
        private int faltas;
        private int materiasAprobadas;


        // =====================================================
        // 1. SETTER SIMPLE
        // =====================================================
        // Recibe un dato.
        // Como es "void", NO devuelve nada.
        // Solamente modifica el atributo.
        // =====================================================

        public void setNombre(String nombre) {

            // Validamos antes de guardar.
            if (nombre != null && !nombre.isEmpty()) {
                this.nombre = nombre;
            }
        }


        // =====================================================
        // 2. SETTER CON VALIDACIÓN
        // =====================================================
        // El promedio solamente puede estar entre 0 y 12.
        //
        // void = modifica algo, pero NO devuelve resultado.
        // =====================================================

        public void setPromedio(double promedio) {

            if (promedio >= 0 && promedio <= 12) {
                this.promedio = promedio;
            }
        }


        // =====================================================
        // 3. OTRO SETTER CON VALIDACIÓN
        // =====================================================
        // No permitimos faltas negativas.
        // =====================================================

        public void setFaltas(int faltas) {

            if (faltas >= 0) {
                this.faltas = faltas;
            }
        }


        // =====================================================
        // 4. SETTER PARA MATERIAS APROBADAS
        // =====================================================

        public void setMateriasAprobadas(int materiasAprobadas) {

            if (materiasAprobadas >= 0) {
                this.materiasAprobadas = materiasAprobadas;
            }
        }


        // =====================================================
        // 5. MÉTODO BOOLEAN
        // =====================================================
        // boolean significa:
        //
        //      devuelve true
        //      o
        //      devuelve false
        //
        // Acá preguntamos:
        // ¿El estudiante puede aprobar?
        //
        // Condiciones:
        // promedio >= 6
        // faltas <= 10
        // =====================================================

        public boolean puedeAprobar() {

            return promedio >= 6
                    && faltas <= 10;
        }


        // =====================================================
        // 6. BOOLEAN CON IF
        // =====================================================
        // Hace exactamente la misma idea,
        // pero escrita de forma más larga.
        //
        // Esta forma sirve mucho para practicar.
        // =====================================================

        public boolean tieneBuenPromedio() {

            if (promedio >= 8) {
                return true;
            }

            return false;
        }


        // =====================================================
        // 7. BOOLEAN CON VARIAS CONDICIONES
        // =====================================================

        public boolean estudianteRegular() {

            if (promedio >= 6
                    && faltas <= 10
                    && materiasAprobadas >= 3) {

                return true;
            }

            return false;
        }


        // =====================================================
        // 8. MÉTODO VOID
        // =====================================================
        // void significa:
        //
        //      realiza una acción
        //      pero NO devuelve ningún valor.
        //
        // Acá simplemente imprimimos información.
        // =====================================================

        public void mostrarDatos() {

            System.out.println("Nombre: " + nombre);
            System.out.println("Promedio: " + promedio);
            System.out.println("Faltas: " + faltas);
            System.out.println("Materias aprobadas: " + materiasAprobadas);
        }


        // =====================================================
        // 9. MÉTODO VOID QUE MODIFICA UN ATRIBUTO
        // =====================================================
        // No recibe nada.
        // No devuelve nada.
        // Solo aumenta las faltas.
        // =====================================================

        public void agregarFalta() {

            faltas++;
        }


        // =====================================================
        // 10. VOID QUE RECIBE PARÁMETRO
        // =====================================================

        public void agregarFaltas(int cantidad) {

            if (cantidad > 0) {
                faltas += cantidad;
            }
        }


        // =====================================================
        // 11. MÉTODO CON RETURN INT
        // =====================================================
        // Ahora NO usamos void.
        //
        // Como el método dice "int",
        // obligatoriamente debe devolver un entero.
        // =====================================================

        public int obtenerFaltas() {

            return faltas;
        }


        // =====================================================
        // 12. MÉTODO CON RETURN DOUBLE
        // =====================================================

        public double obtenerPromedio() {

            return promedio;
        }


        // =====================================================
        // 13. MÉTODO CON RETURN STRING
        // =====================================================

        public String obtenerNombre() {

            return nombre;
        }


        // =====================================================
        // 14. MÉTODO QUE CALCULA Y DEVUELVE
        // =====================================================
        // Recibe una cantidad de materias.
        //
        // Devuelve cuántas faltan para llegar a 10.
        // =====================================================

        public int materiasQueFaltan() {

            return 10 - materiasAprobadas;
        }


        // =====================================================
        // 15. RETURN DOUBLE CON CÁLCULO
        // =====================================================

        public double puntosParaLlegarASeis() {

            if (promedio >= 6) {
                return 0;
            }

            return 6 - promedio;
        }


        // =====================================================
        // 16. BOOLEAN PARA SABER SI TIENE MUCHAS FALTAS
        // =====================================================

        public boolean tieneMuchasFaltas() {

            return faltas > 10;
        }


        // =====================================================
        // 17. VOID QUE CAMBIA EL PROMEDIO
        // =====================================================

        public void subirPromedio(double puntos) {

            if (puntos > 0) {

                promedio += puntos;

                // Evitamos superar 12.
                if (promedio > 12) {
                    promedio = 12;
                }
            }
        }


        // =====================================================
        // 18. BOOLEAN QUE RECIBE UN PARÁMETRO
        // =====================================================
        // Pregunta:
        // ¿El promedio es mayor o igual al mínimo enviado?
        // =====================================================

        public boolean alcanzaPromedio(double minimo) {

            return promedio >= minimo;
        }


        // =====================================================
        // 19. RETURN STRING USANDO BOOLEAN
        // =====================================================

        public String obtenerEstado() {

            if (puedeAprobar()) {
                return "Puede aprobar";
            }

            return "No puede aprobar";
        }


        // =====================================================
        // 20. VOID USANDO UN BOOLEAN
        // =====================================================

        public void mostrarEstado() {

            if (puedeAprobar()) {
                System.out.println("El estudiante puede aprobar.");
            } else {
                System.out.println("El estudiante no puede aprobar.");
            }
        }
    }


    // =========================================================
    // MAIN
    // =========================================================

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();


        // =====================================================
        // USAMOS LOS SETTERS
        // =====================================================

        estudiante.setNombre("Jose");
        estudiante.setPromedio(7.5);
        estudiante.setFaltas(4);
        estudiante.setMateriasAprobadas(5);


        // =====================================================
        // LLAMAR MÉTODO VOID
        // =====================================================
        // No ponemos System.out.println porque mostrarDatos()
        // ya imprime por sí mismo.
        // =====================================================

        estudiante.mostrarDatos();


        System.out.println();


        // =====================================================
        // LLAMAR MÉTODO BOOLEAN
        // =====================================================
        // Como devuelve true/false podemos imprimirlo.
        // =====================================================

        System.out.println(
                "¿Puede aprobar? "
                        + estudiante.puedeAprobar()
        );


        System.out.println(
                "¿Tiene buen promedio? "
                        + estudiante.tieneBuenPromedio()
        );


        System.out.println(
                "¿Es estudiante regular? "
                        + estudiante.estudianteRegular()
        );


        // =====================================================
        // MÉTODOS CON RETURN
        // =====================================================

        System.out.println(
                "Promedio: "
                        + estudiante.obtenerPromedio()
        );


        System.out.println(
                "Faltas: "
                        + estudiante.obtenerFaltas()
        );


        System.out.println(
                "Materias que faltan: "
                        + estudiante.materiasQueFaltan()
        );


        System.out.println(
                "Estado: "
                        + estudiante.obtenerEstado()
        );


        // =====================================================
        // VOID QUE MODIFICA
        // =====================================================

        estudiante.agregarFalta();

        System.out.println(
                "Faltas después de agregar una: "
                        + estudiante.obtenerFaltas()
        );


        // =====================================================
        // BOOLEAN RECIBIENDO PARÁMETRO
        // =====================================================

        System.out.println(
                "¿Alcanza promedio 6? "
                        + estudiante.alcanzaPromedio(6)
        );


        // =====================================================
        // VOID QUE USA BOOLEAN
        // =====================================================

        estudiante.mostrarEstado();
    }
}


/*
=================================================================
                    RESUMEN PARA EL PARCIAL
=================================================================


1) SETTER
---------

public void setFaltas(int faltas) {

    if (faltas >= 0) {
        this.faltas = faltas;
    }
}


Pensamiento:

    recibo dato
        ↓
    valido dato
        ↓
    modifico atributo


---------------------------------------------------------------


2) BOOLEAN
----------

public boolean puedeAprobar() {

    return promedio >= 6
            && faltas <= 10;
}


Pensamiento:

    hago una pregunta
        ↓
    ¿se cumple?
        ↓
    true / false


---------------------------------------------------------------


3) VOID
-------

public void agregarFalta() {

    faltas++;
}


Pensamiento:

    hago una acción
        ↓
    modifico algo
        ↓
    NO devuelvo resultado


---------------------------------------------------------------


4) RETURN INT
-------------

public int obtenerFaltas() {

    return faltas;
}


Pensamiento:

    necesito devolver un entero
        ↓
    uso return


---------------------------------------------------------------


5) RETURN DOUBLE
----------------

public double obtenerPromedio() {

    return promedio;
}


---------------------------------------------------------------


6) RETURN STRING
----------------

public String obtenerEstado() {

    if (puedeAprobar()) {
        return "Puede aprobar";
    }

    return "No puede aprobar";
}


=================================================================
REGLA RÁPIDA
=================================================================

Si la letra dice:

"modifique"
"establezca"
"actualice"
"muestre"
"agregue"

pensá primero en:

        void


Si la letra dice:

"indique si"
"determine si"
"verifique si"
"compruebe si"

pensá primero en:

        boolean


Si la letra dice:

"devuelva la cantidad"

pensá en:

        int


Si dice:

"devuelva el promedio"
"devuelva el precio"
"devuelva el costo"

pensá en:

        double


Si dice:

"devuelva el nombre"
"devuelva el estado"

pensá en:

        String


=================================================================
ESTRUCTURAS QUE TE CONVIENE SABER DE MEMORIA
=================================================================


// SETTER

public void setDato(int dato) {

    if (dato >= 0) {
        this.dato = dato;
    }
}


// BOOLEAN

public boolean cumple() {

    return dato >= 10;
}


// BOOLEAN CON IF

public boolean cumple() {

    if (dato >= 10) {
        return true;
    }

    return false;
}


// VOID

public void aumentar() {

    dato++;
}


// RETURN INT

public int obtenerDato() {

    return dato;
}


// RETURN DOUBLE

public double calcularAlgo() {

    return valor * 2;
}


// RETURN STRING

public String obtenerEstado() {

    if (cumple()) {
        return "Correcto";
    }

    return "Incorrecto";
}


=================================================================
FORMA DE ENCONTRAR LA SOLUCIÓN EN UN EJERCICIO
=================================================================

1. MIRÁ QUÉ TIPO DE MÉTODO TE PIDEN.

public void ...
public boolean ...
public int ...
public double ...
public String ...


2. MIRÁ QUÉ DATOS RECIBE.

(int edad)

(double precio)

(String nombre)


3. MIRÁ QUÉ CONDICIÓN PIDE LA LETRA.

edad >= 18

promedio >= 6

faltas <= 10


4. DECIDÍ QUÉ HACER.

Si modifica:

    this.variable = variable;


Si pregunta:

    return condicion;


Si calcula:

    return calculo;


Si solamente hace una acción:

    void


=================================================================
*/