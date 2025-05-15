import java.util.Scanner;

public class DivisionCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero (numerador): ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero (denominador): ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador; // División de enteros
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("¡Error! Ocurrió un problema con la división (división por cero).");
            System.out.println("Mensaje de la excepción: " + e.getMessage()); // Muestra el mensaje original
        } catch (java.util.InputMismatchException e) {
            System.out.println("¡Error! Ingrese números enteros válidos.");
            System.out.println("Mensaje de la excepción: " + e.getMessage()); // Muestra el mensaje original
        } finally {
            scanner.close();
        }

        System.out.println("Fin del programa.");

    }
}