public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Carlos Martinez", "CEO", 100000);
        Empleado empleado2 = new Empleado("Lucas Biglia", "Maestranza");
        Empleado empleado3 = new Empleado();

        empleado1.actualizarSalario(10);
        empleado1.actualizarSalario();
        empleado2.actualizarSalario(50);
        empleado2.actualizarSalario();

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        Empleado.mostrarTotalEmpleados();
    }
}