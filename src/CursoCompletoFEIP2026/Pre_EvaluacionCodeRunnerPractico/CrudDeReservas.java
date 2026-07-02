package CursoCompletoFEIP2026.Pre_EvaluacionCodeRunnerPractico;

class Reserva {
    private int codigo;
    private String titular;
    private int noches;
    private double precioPorNoche;

    public Reserva(int codigo, String titular, int noches, double precioPorNoche) {
        this.codigo = codigo;
        this.titular = titular;
        this.noches = noches;
        this.precioPorNoche = precioPorNoche;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", titular='" + titular + '\'' +
                ", noches=" + noches +
                ", precioPorNoche=" + precioPorNoche +
                '}';
    }
}

interface ICrudReservas {
    void agregar(Reserva r);

    void modificar(Reserva r);

    void eliminar(int codigo);

    void listar();
}

class CrudReservasImpl implements ICrudReservas {

    private java.util.HashMap<Integer, Reserva> reservas;

    public CrudReservasImpl() {
        reservas = new java.util.HashMap<Integer, Reserva>();
    }

    @Override
    public void agregar(Reserva r) {
        reservas.put(r.getCodigo(), r);
    }

    @Override
    public void modificar(Reserva r) {
        reservas.put(r.getCodigo(), r);
    }

    @Override
    public void eliminar(int codigo) {
        reservas.remove(codigo);
    }

    @Override
    public void listar() {
        for (Integer clave : reservas.keySet()) {
            System.out.println("Clave: " + clave + " valor: " + reservas.get(clave));
        }
    }
}