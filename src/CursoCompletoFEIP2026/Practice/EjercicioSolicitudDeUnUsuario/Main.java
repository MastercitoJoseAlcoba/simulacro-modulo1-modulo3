package CursoCompletoFEIP2026.Practice.EjercicioSolicitudDeUnUsuario;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Solicitud> colasPendientes = new PriorityQueue<>();

        Stack<Solicitud> historialProcesadas = new Stack<>();

        Map<Integer, Solicitud> solicitudesPorId = new HashMap<>();

        Solicitud solicitud1 = new Soporte(1, "Ana", "No pudo ingresar al sistema", "Login");
        Solicitud solicitud2 = new Soporte(2, "Juan", "No pudo ingresar al sistema", "Login");
        Solicitud solicitud3 = new Soporte(3, "Pedro", "No pudo ingresar al sistema", "Login");

        System.out.println("BÚSQUEDA POR ID USANDO MAP");
        System.out.println("-".repeat(40));

        Solicitud solicitudEncontrada = solicitudesPorId.get(2);

        if (solicitudEncontrada != null) {
            solicitudEncontrada.mostrarDatos();
        } else {
            System.out.println("No existe una solicitud con ese ID.");
        }

        System.out.println();
        System.out.println("PROCESANDO SOLICITUDES POR PRIORIDAD");
        System.out.println("-".repeat(40));

        while (!colasPendientes.isEmpty()) {
            Solicitud solicitudActual = colasPendientes.poll();

            solicitudActual.mostrarDatos();
            solicitudActual.procesar();

            historialProcesadas.push(solicitudActual);

            System.out.println("-".repeat(40));
        }

        System.out.println();
        System.out.println("HISTORIAL DE SOLICITUDES PROCESADAS");
        System.out.println("-".repeat(40));

        while (!historialProcesadas.isEmpty()) {
            Solicitud solicitudProcesada = historialProcesadas.pop();
            solicitudProcesada.mostrarDatos();
            System.out.println("-".repeat(40));
        }
    }

    public static void agregarSolicitud(Solicitud solicitud,
                                        Queue<Solicitud> colaPendientes,
                                        Map<Integer, Solicitud> solicitudesPorId) {

        colaPendientes.add(solicitud);
        solicitudesPorId.put(solicitud.getId(), solicitud);
    }
}

