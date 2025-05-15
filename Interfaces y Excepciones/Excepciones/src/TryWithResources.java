import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la ruta del archivo a leer: ");
        String rutaArchivo = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            System.out.println("--- Contenido del archivo ---");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("--- Fin del archivo ---");
            
        } catch (java.io.FileNotFoundException e) {
            System.err.println("¡Error! El archivo especificado no fue encontrado: " + rutaArchivo);
            System.err.println("Mensaje de la excepción: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("¡Error de E/S! Ocurrió un error al leer el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Fin del programa.");
    }
}
