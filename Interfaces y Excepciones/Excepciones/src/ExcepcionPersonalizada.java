import java.util.Scanner;

public class ExcepcionPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("¡Error! La edad ingresada no es válida (debe estar entre 0 y 120).");
            }

            System.out.println("Edad ingresada: " + edad + " años.");

        } catch (EdadInvalidaException e) {
            System.out.println("¡Error! Se ha detectado una edad inválida:");
            System.out.println("Mensaje: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("¡Error! Ingrese un número entero válido para la edad.");
        } finally {
            scanner.close();
        }

        System.out.println("Fin del programa.");
    }
}
