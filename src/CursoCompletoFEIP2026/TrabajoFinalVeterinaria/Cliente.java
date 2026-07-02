package CursoCompletoFEIP2026.TrabajoFinalVeterinaria;

import java.util.ArrayList;

public class Cliente extends Persona {

    private ArrayList<Mascota> mascotas;

    public Cliente(String nombre, String documento, String email) {
        super(nombre, documento, email);
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + getNombre() +
                " - Documento: " + getDocumento() +
                " - Email: " + getEmail());

        System.out.println("Mascotas:");

        for (Mascota mascota : mascotas) {
            System.out.println("- " + mascota.getNombre() + " (" + mascota.getTipo() + ")");
        }
    }
}