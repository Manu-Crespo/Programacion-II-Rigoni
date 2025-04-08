import java.util.ArrayList;
import java.util.Scanner;

public class SistemaSoporte {
    private ArrayList<TicketSoporte> listaDeTickets;

    public SistemaSoporte() {
        this.listaDeTickets = new ArrayList<>();
    }

    public void crearTicket(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nQuiere ingresar usuario? (Si)/(No)");
        String resp = entrada.nextLine().toLowerCase();
        if (resp.equals("si")||resp.equals("s")){
            System.out.println("\nIngrese su nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("\nIngrese email personal: ");
            String email = entrada.nextLine();
            Usuario usuario = new Usuario(nombre, email);
            System.out.println("\nDescriba el problema encontrado: ");
            String descripcion = entrada.nextLine();
            TicketSoporte ticket = new TicketSoporte(descripcion, usuario);
            listaDeTickets.add(ticket);
        }else {
            System.out.println("\nDescriba el problema encontrado: ");
            String descripcion = entrada.nextLine();
            TicketSoporte ticket = new TicketSoporte(descripcion);
            listaDeTickets.add(ticket);
        }

    }

    public void listadoTickets(){
        System.out.println("\nListado de Tickets:");
        for(TicketSoporte t : listaDeTickets){
            System.out.println(t.toString());
        }
    }

    public void asignarTecnico(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nAsignando Tecnico al reclamo...");
        System.out.print("\nIngrese el ID del ticket: ");
        int id = Integer.parseInt(entrada.nextLine());
        TicketSoporte ticketEncontrado = null;
        for (TicketSoporte t : listaDeTickets){
            if (t.getId() == id) {
                ticketEncontrado = t;
                break;
            }
        }
        if (ticketEncontrado != null){
            System.out.print("Nombre del técnico: ");
            String nombre = entrada.nextLine();
            System.out.print("Especialidad del técnico: ");
            String espec = entrada.nextLine();
            Tecnico tecnico = new Tecnico(nombre, espec);
            ticketEncontrado.setTecnico(tecnico);
        }else {
            System.out.println("\nTicket no encontrado");
        }
    }

    public void cerrarTicket() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el ID del ticket que desea cerrar: ");
        int idBuscado = Integer.parseInt(entrada.nextLine());
        System.out.println("\nCerrando ticket...");
        for (TicketSoporte ticket : listaDeTickets) {
            if (ticket.getId() == idBuscado) {
                ticket.cerrarTicket();
                return;
            }
        }
        System.out.println("\nNo se encontró el ticket");
    }


}
