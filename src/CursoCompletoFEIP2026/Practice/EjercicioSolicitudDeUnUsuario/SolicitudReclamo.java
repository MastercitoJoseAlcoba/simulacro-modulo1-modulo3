package CursoCompletoFEIP2026.Practice.EjercicioSolicitudDeUnUsuario;

public class SolicitudReclamo extends Solicitud {
    private String motivo;

    public SolicitudReclamo(int id, String nombre, String descripcion, String motivo) {
        super(id, nombre, descripcion);
        this.motivo = motivo;
    }
    public String getMotivo() {
        return motivo;
    }

    @Override
    public int getPrioridad() {
        return 1;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando reclamo...");
        System.out.println("Motivo: " + motivo);

    }
}
