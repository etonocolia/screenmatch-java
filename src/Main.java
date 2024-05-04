import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mi primer programa Java!");
        //  Declaración de variables
        System.out.println("Película: Matrix");
        String nombre = "Matrix";
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        String sinopsis = """
                La mejor película del milenio
                No te la puedes perder
                """;
        System.out.println(sinopsis);

        double mediaEvaluacionUsuario = 0;

        if (fechaDeLanzamiento <= 2023){
            System.out.println("Película retro que vale la pena ver");
        }
        else {
            System.out.println("Película popular en el momento");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la película es:" + mediaEvaluacionUsuario/3);
    }
}