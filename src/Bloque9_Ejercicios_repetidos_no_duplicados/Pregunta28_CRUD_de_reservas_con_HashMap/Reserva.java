package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta28_CRUD_de_reservas_con_HashMap;

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

    public double calcularTotal() {

        // Total = noches * precio por noche.
        return noches * precioPorNoche;
    }

    @Override
    public String toString() {

        // Formato de salida de la reserva.
        return "Reserva{codigo=" + codigo +
                ", titular='" + titular + '\'' +
                ", noches=" + noches +
                ", precioPorNoche=" + precioPorNoche +
                ", total=" + calcularTotal() +
                '}';
    }
}

interface ICrudReservas {

    void agregar(Reserva reserva);

    void modificar(Reserva reserva);

    void eliminar(int codigo);

    void listar();
}

class CrudReservasImpl implements ICrudReservas {

    // HashMap:
    //
    // Clave: código de reserva.
    // Valor: objeto Reserva.
    private java.util.HashMap<Integer, Reserva> reservas = new java.util.HashMap<>();

    @Override
    public void agregar(Reserva reserva) {

        // Agrega la reserva.
        // Si la clave ya existe, reemplaza.
        reservas.put(reserva.getCodigo(), reserva);
    }

    @Override
    public void modificar(Reserva reserva) {

        // Verificamos si existe la reserva.
        if (reservas.containsKey(reserva.getCodigo())) {

            // Si existe, la reemplazamos.
            reservas.put(reserva.getCodigo(), reserva);

        } else {

            // Si no existe, mostramos mensaje.
            System.out.println("No se pudo modificar a la reserva");
        }
    }

    @Override
    public void eliminar(int codigo) {

        // Verificamos si existe la clave.
        if (reservas.containsKey(codigo)) {

            // Si existe, eliminamos.
            reservas.remove(codigo);

        } else {

            // Si no existe, mostramos mensaje.
            System.out.println("No se pudo eliminar a la reserva");
        }
    }

    @Override
    public void listar() {

        // Recorremos las claves.
        for (Integer clave : reservas.keySet()) {

            // Mostramos clave y reserva asociada.
            System.out.println("Clave: " + clave + " valor: " + reservas.get(clave));
        }
    }
}

/*
IDEA CLAVE:

HashMap trabaja así:

clave -> valor

En este caso:

codigo -> Reserva

CRUD:

C -> Create -> agregar
R -> Read -> listar
U -> Update -> modificar
D -> Delete -> eliminar
*/