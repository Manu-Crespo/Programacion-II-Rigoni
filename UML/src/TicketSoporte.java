import java.util.Scanner;

public class TicketSoporte {
    private static int contador = 0;
    private int id;
    private String descripcion;
    private String estado;
    private String fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

    public TicketSoporte(String descripcion, Usuario usuario) {
        contador++;
        id = contador;
        this.descripcion = descripcion;
        estado = "Abierto";
        fechaCreacion = "04/04/2025";
        this.usuario = usuario;
    }

    public TicketSoporte(String descripcion) {
        this(descripcion, new Usuario("n/n", "n/n"));
    }

    public int getId() {
        return id;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void cerrarTicket(){
        estado = "Cerrado";
    }

    @Override
    public String toString() {
        return "\nTicket numero: "+ id +
                "\nDescripcion: " + descripcion +
                "\nEstado: " + estado +
                "\nFecha de creacion: " + fechaCreacion +
                "\nUsuario " + usuario +
                "\nTecnico " + (tecnico == null ? "No asignado" : tecnico );
    }
}
