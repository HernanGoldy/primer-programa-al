import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita:");
        String nombrePelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("¿Qué nota le das a esta película?");
        double notaDeLaPelicula = teclado.nextDouble();

        System.out.println(nombrePelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(notaDeLaPelicula);
    }
}
