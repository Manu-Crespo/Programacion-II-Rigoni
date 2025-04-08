import java.util.Scanner;

public class Usuario {
    private static int contador = 0;
    private int id;
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        contador++;
        id = contador;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nID Usuario: " + id +
                "\nNombre: " + nombre +
                "\nEmail: " + email;
    }
}
