import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- Menú de Administración de Personal ---");
            System.out.println("1. Agregar Empleado Fijo");
            System.out.println("2. Agregar Empleado a Comisión");
            System.out.println("3. Mostrar Salarios");
            System.out.println("4. Empleado con Más Clientes Captados");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Agregar Empleado Fijo ---");
                    System.out.print("DNI: ");
                    String dniFijo = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreFijo = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoFijo = scanner.nextLine();
                    System.out.print("Año de Ingreso: ");
                    int anioIngresoFijo = scanner.nextInt();
                    System.out.print("Sueldo Básico: ");
                    double sueldoBasico = scanner.nextDouble();
                    scanner.nextLine();
                    miEmpresa.agregarEmpleado(new EmpleadoFijo(dniFijo, nombreFijo, apellidoFijo, anioIngresoFijo, sueldoBasico));
                    System.out.println("Empleado Fijo agregado.");
                    break;
                case 2:
                    System.out.println("\n--- Agregar Empleado a Comisión ---");
                    System.out.print("DNI: ");
                    String dniComision = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreComision = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoComision = scanner.nextLine();
                    System.out.print("Año de Ingreso: ");
                    int anioIngresoComision = scanner.nextInt();
                    System.out.print("Salario Mínimo: ");
                    double salarioMinimo = scanner.nextDouble();
                    System.out.print("Clientes Captados: ");
                    int clientesCaptados = scanner.nextInt();
                    System.out.print("Monto por Cliente: ");
                    double montoPorCliente = scanner.nextDouble();
                    scanner.nextLine();
                    miEmpresa.agregarEmpleado(new EmpleadoComision(dniComision, nombreComision, apellidoComision, anioIngresoComision, salarioMinimo, clientesCaptados, montoPorCliente));
                    System.out.println("Empleado a Comisión agregado.");
                    break;
                case 3:
                    miEmpresa.mostrarSalarios();
                    break;
                case 4:
                    EmpleadoComision empleadoMax = miEmpresa.empleadoConMasClientes();
                    if (empleadoMax != null) {
                        System.out.println("\nEmpleado con más clientes captados: " + empleadoMax.getNombreCompleto() + " (" + empleadoMax.getClientesCaptados() + " clientes)");
                    } else {
                        System.out.println("\nNo hay empleados a comisión registrados.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();

    }
}