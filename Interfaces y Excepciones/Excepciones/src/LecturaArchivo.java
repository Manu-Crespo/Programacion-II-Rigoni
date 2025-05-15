import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo a leer: ");
        String nombreArchivo = scanner.nextLine();

        File archivo = new File(nombreArchivo);

        try {
            Scanner lectorArchivo = new Scanner(archivo);
            System.out.println("--- Contenido del archivo ---");
            while (lectorArchivo.hasNextLine()) {
                String linea = lectorArchivo.nextLine();
                System.out.println(linea);
            }
            lectorArchivo.close();
            System.out.println("--- Fin del archivo ---");
        } catch (FileNotFoundException e) {
            System.out.println("¡Error! El archivo '" + nombreArchivo + "' no fue encontrado.");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Fin del programa");
    }
}
