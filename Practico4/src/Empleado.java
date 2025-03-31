public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre, String puesto) {
        this((int)(1000 + Math.random() * 9000), nombre, puesto,Math.round(10000 + Math.random() * 90000));
    }

    public Empleado() {
        this((int)(1000 + Math.random() * 9000), "n/n", "n/n", 0.0);
    }

    public void actualizarSalario(double aumento){
        System.out.printf("\n\nSalario anterior de " + nombre + ": " + salario);
        setSalario(Math.round(salario + (salario*(aumento/100))));
        System.out.printf("\nSalario actualizado: " + salario);
    }

    public void actualizarSalario(){
        actualizarSalario(15);
    }

    public static void mostrarTotalEmpleados(){
        System.out.println("\n\nLa cantidad de empleados es: " + totalEmpleados);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n\nEmpleado:\n" +
                "ID= " + id +
                "\nNombre= " + nombre +
                "\nPuesto= " + puesto +
                "\nSalario= " + salario;
    }

}
