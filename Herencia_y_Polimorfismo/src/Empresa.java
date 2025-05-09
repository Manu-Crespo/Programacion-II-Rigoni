import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> personal;

    public Empresa() {
        this.personal = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.personal.add(empleado);
    }

    public void mostrarSalarios() {
        System.out.println("--- Salarios del Personal ---");
        for (Empleado empleado : personal) {
            System.out.println(empleado.getNombreCompleto() + ": $" + empleado.calcularSalario());
        }
        System.out.println("----------------------------");
    }

    public EmpleadoComision empleadoConMasClientes() {
        EmpleadoComision empleadoMaxClientes = null;
        int maxClientes = -1;

        for (Empleado empleado : personal) {
            if (empleado instanceof EmpleadoComision) {
                EmpleadoComision empleadoComision = (EmpleadoComision) empleado;
                if (empleadoComision.getClientesCaptados() > maxClientes) {
                    maxClientes = empleadoComision.getClientesCaptados();
                    empleadoMaxClientes = empleadoComision;
                }
            }
        }
        return empleadoMaxClientes;
    }
}