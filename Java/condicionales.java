import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el primer número
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        // Pedir el segundo número
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Pedir la operación
        System.out.println("Seleccione la operación:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.print("Ingrese el número de la operación: ");
        int operación = scanner.nextInt();

        int resultado = 0;

        // Realizar la operación seleccionada
        if (operación == 1) {
            resultado = num1 + num2;
            System.out.println("Resultado de la suma: " + resultado);
        } else if (operación == 2) {
            resultado = num1 - num2;
            System.out.println("Resultado de la resta: " + resultado);
        } else if (operación == 3) {
            resultado = num1 * num2;
            System.out.println("Resultado de la multiplicación: " + resultado);
        } else {
            System.out.println("Operación no existente");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
