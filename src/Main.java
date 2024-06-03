public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Película: Matrix");

        // attributes
        int fechaDeLanzamiento = 1999;
        boolean iuncluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja.
                La mejor película del fin del milenio.
                Fué lanzada en el año:\t""" + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) media / 2;
        System.out.println("Cantidad de estrellas: " + clasificacion);
    }
}