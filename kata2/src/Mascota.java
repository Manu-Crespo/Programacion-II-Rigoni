public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nEspecie: "+this.especie);
    }
    public void cumplirAnios(){
        this.edad++;
        mostrarInfo();
    }
}
