package PruebaDZA.Modulo3.Alumno;

public class Alumno {
    private String nombre;
    private int edad;
    private byte nota;

    public Alumno(String nombre, int edad, byte nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
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

    public byte getNota() {
        return nota;
    }

    public void setNota(byte nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
    }
}
