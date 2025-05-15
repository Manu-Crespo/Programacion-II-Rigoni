import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto para convertir a entero: ");
        String cadena = scanner.nextLine();

        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("La cadena convertida a entero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("¡Error! La cadena ingresada no es un formato válido para un número entero.");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Fin del programa.");
    }
}
