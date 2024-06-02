import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad = 0;
        String nombre = "";

        System.out.println("¿Cuál es tu nombre?");
        nombre = in.nextLine();

        System.out.println("¿Cuál es tu edad?");
        edad = in.nextInt();

        System.out.println("Tu nombre es: " + nombre + " y tienes " + edad + " años.");
    }
}
