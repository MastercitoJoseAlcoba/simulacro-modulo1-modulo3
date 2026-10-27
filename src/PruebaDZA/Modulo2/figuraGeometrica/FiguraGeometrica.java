package PruebaDZA.Modulo2.figuraGeometrica;

public class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void color(String color) {
        this.color = color;
    }

    public double calcularArea(){
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FiguraGeometrica{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
