import java.util.ArrayList;

public class Tecnico {
    private static int contador = 0;
    private int id;
    private String nombre;
    private String especialidad;

    public Tecnico(String nombre, String especialidad) {
        contador++;
        id = contador;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "\nID Tecnico: " + id +
                "\nNombre: " + nombre +
                "\nEspecialidad: " + especialidad;
    }
}
