package CursoCompletoFEIP2026.Practice.EjercicioSolicitudDeUnUsuario;

public class SolicitudConsulta extends Solicitud {

    public SolicitudConsulta(int id, String nombre, String descripcion) {
        super(id, nombre, descripcion);
    }

    @Override
    public int getPrioridad() {
        return 3;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando consulta...");
    }
}