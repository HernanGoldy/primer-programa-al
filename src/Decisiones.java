public class Decisiones {

    public static void main(String[] args) {

        // attributes
        int fechaDeLanzamiento = 1999;
        boolean iuncluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Películas más populares.");
        } else {
            System.out.println("Película retro que aún vale la pena ver.");
        }
        // código anterior refactorizado
        String mensajePelicula = (fechaDeLanzamiento >= 2022)
                ? "Películas más populares."
                : "Película retro que aún vale la pena ver.";
        System.out.println(mensajePelicula);

        if (iuncluidoEnElPlan && tipoDePlan.equals("plus")) {
            System.out.println("Película de alta calidad.");
        } else {
            System.out.println("Película no disponible para su plan.");
        }
        // código anterior refactorizado
        String mensajePlan = (iuncluidoEnElPlan && tipoDePlan.equals("plus"))
                ? "Película de alta calidad."
                : "Película no disponible para su plan.";
        System.out.println(mensajePlan);
    }
}
