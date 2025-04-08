public class Main {
    public static void main(String[] args) {

        //Usuario usuario = new Usuario("Lionel Scaloni", "mejortecnicoarg@gmail.com");
        SistemaSoporte s1 = new SistemaSoporte();

        s1.crearTicket();
        s1.listadoTickets();
        s1.asignarTecnico();
        s1.cerrarTicket();
        s1.listadoTickets();


    }
}