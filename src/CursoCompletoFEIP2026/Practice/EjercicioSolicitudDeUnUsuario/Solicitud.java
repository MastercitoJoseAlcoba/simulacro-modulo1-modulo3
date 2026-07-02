package CursoCompletoFEIP2026.Practice.EjercicioSolicitudDeUnUsuario;

public abstract class Solicitud implements Comparable<Solicitud>{
    // Atributos
    private int id;
    private String nombre;
    private String descripcion;

    // Constructor
    public Solicitud(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract int getPrioridad();

    public abstract void procesar();

    public void mostrarDatos(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Prioridad: " + getPrioridad());
    }

    @Override
    public int compareTo(Solicitud otra) {
        return Integer.compare(this.getPrioridad(), otra.getPrioridad());
    }
}
