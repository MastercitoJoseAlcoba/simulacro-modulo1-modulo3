package FIP_PRE_05_JMAC_2026_Guille;

public class MainPruebasPelicula {
    public static void main(String[] args) {
        Pelicula p = new Pelicula();
        p.mostrar();
        System.out.println(p.esLarga());

        System.out.println("-".repeat(10));

        Pelicula p1 = new Pelicula("Titanic", "Drama");
        System.out.println(p1.getTitulo());
        System.out.println(p1.getGenero());
        System.out.println(p1.getDuracion());
        System.out.println(p1.esLarga());

        System.out.println("-".repeat(10));

        Pelicula p2 = new Pelicula("Matrix", "Ciencia ficción", 136);
        p2.mostrar();
        System.out.println(p2.esLarga());

        System.out.println("-".repeat(10));

        Pelicula p3 = new Pelicula("Avatar", "Aventura", 162);

        p3.setTitulo("");
        p3.setGenero("");
        p3.setDuracion(-20);

        System.out.println(p3.getTitulo());
        System.out.println(p3.getGenero());
        System.out.println(p3.getDuracion());

        System.out.println("-".repeat(10));

        boolean correcto = true;

        try {
            java.lang.reflect.Field atributoTitulo = Pelicula.class.getDeclaredField("titulo");

            boolean tituloEsPrivado = java.lang.reflect.Modifier.isPrivate(atributoTitulo.getModifiers());
            boolean tituloTipoCorrecto = atributoTitulo.getType().equals(String.class);

            if (!tituloEsPrivado || !tituloTipoCorrecto) {
                correcto = false;
            }

        } catch (NoSuchFieldException e) {
            correcto = false;
        }

        try {
            java.lang.reflect.Field atributoGenero = Pelicula.class.getDeclaredField("genero");

            boolean generoEsPrivado = java.lang.reflect.Modifier.isPrivate(atributoGenero.getModifiers());
            boolean generoTipoCorrecto = atributoGenero.getType().equals(String.class);

            if (!generoEsPrivado || !generoTipoCorrecto) {
                correcto = false;
            }

        } catch (NoSuchFieldException e) {
            correcto = false;
        }

        try {
            java.lang.reflect.Field atributoDuracion = Pelicula.class.getDeclaredField("duracion");

            boolean duracionEsPrivado = java.lang.reflect.Modifier.isPrivate(atributoDuracion.getModifiers());
            boolean duracionTipoCorrecto = atributoDuracion.getType().equals(int.class);

            if (!duracionEsPrivado || !duracionTipoCorrecto) {
                correcto = false;
            }

        } catch (NoSuchFieldException e) {
            correcto = false;
        }

        if (correcto) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }
}
