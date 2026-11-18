package Apoyo_Diciembre2026.VC1P3_Poo;

public class Estudiante {
    // Atributos
    private String nombre;
    private String carrera;

    // Sobrecarga de constructores aplicada a la clase Estudiante

    // Constructor 1 (Vacío sin parámetros)
    public Estudiante() {
        this.nombre = "Sin Nombre";
        this.carrera = "General";
    }

    // Constructor 2 (Con el parámetro nombre)
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.carrera = "General";
    }

    // Constructor 3 (Con los dos parámetros nombre y carrera)
    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    // Método
    public String obtenerFicha(){
        return "Estudiante: " + nombre + " | Carrera: " + carrera;
    }
}
