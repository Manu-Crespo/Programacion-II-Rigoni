public class EmpleadoFijo extends Empleado {
    private double sueldoBasico;

    public EmpleadoFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    @Override
    public double calcularSalario() {
        int antiguedad = 2025 - getAnioIngreso();

        if (antiguedad < 2) {
            return sueldoBasico;
        } else if (antiguedad >= 2 && antiguedad <= 5) {
            return sueldoBasico * 1.05;
        } else {
            return sueldoBasico * 1.10;
        }
    }
}