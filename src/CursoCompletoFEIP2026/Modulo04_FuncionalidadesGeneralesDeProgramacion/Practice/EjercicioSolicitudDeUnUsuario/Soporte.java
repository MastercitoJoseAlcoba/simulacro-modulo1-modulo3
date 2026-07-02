package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.EjercicioSolicitudDeUnUsuario;

public class Soporte extends Solicitud{
    private String area;

    public Soporte(int id, String nombre, String descripcion, String area) {
        super(id, nombre, descripcion);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public int getPrioridad() {
        return 2;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando solicitud de soporte...");
        System.out.println("Área: " + area);
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Área: " + area);
    }
}

