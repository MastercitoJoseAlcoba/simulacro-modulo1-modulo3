package Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante;

public class Estudiante extends Persona{
    // Estudiante también hereda de Persona.
    //
    // Por eso también tiene:
    // nombre, cedula y direccion.
    //
    // Además, Estudiante agrega:
    private String codigo;
    private boolean tieneBeca;

    public Estudiante(String nombre, String cedula, String direccion,
                      String codigo, boolean tieneBeca) {

        // Llamamos al constructor de Persona.
        //
        // Esto inicializa los atributos heredados.
        super(nombre, cedula, direccion);

        // Inicializamos los atributos propios de Estudiante.
        this.codigo = codigo;
        this.tieneBeca = tieneBeca;
    }

    @Override
    public String toString() {

        // Primero usamos el toString() de Persona.
        // Después agregamos los datos propios de Estudiante.
        return super.toString() + " Estudiante{codigo='" + codigo
                + "', tieneBeca=" + tieneBeca + "}";
    }
}

/*
IDEA GENERAL:

Persona es la clase padre.

Profesor es una clase hija.
Estudiante es una clase hija.

La relación es:

Profesor ES UNA Persona.
Estudiante ES UNA Persona.

Por eso usamos:

extends Persona

PALABRAS CLAVE:

1) extends
Se usa para heredar de una clase.

2) super(...)
Llama al constructor de la clase padre.

3) super.toString()
Llama al método toString() de la clase padre.

4) @Override
Indica que estamos sobrescribiendo un método heredado.

POR QUÉ CONVIENE HERENCIA:

Sin herencia, tendríamos que repetir estos atributos:

nombre
cedula
direccion

en Profesor y también en Estudiante.

Con herencia, los ponemos una sola vez en Persona.

Eso evita repetir código.
Y menos repetición significa menos posibilidades de meter la pata.
Java no perdona mucho, pero al menos te deja heredar.
*/


