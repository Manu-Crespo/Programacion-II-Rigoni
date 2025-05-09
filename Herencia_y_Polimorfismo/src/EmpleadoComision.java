public class EmpleadoComision extends Empleado {
    private double salarioMinimo;
    private int clientesCaptados;
    private double montoPorCliente;

    public EmpleadoComision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo, int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public double getMontoPorCliente() {
        return montoPorCliente;
    }

    public void aumentarClientesCaptados(int cantidad) {
        this.clientesCaptados += cantidad;
    }

    @Override
    public double calcularSalario() {
        double salarioPorComision = clientesCaptados * montoPorCliente;
        return Math.max(salarioPorComision, salarioMinimo);
    }
}