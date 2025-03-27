public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(){
        this.huevosPuestos++;
    }

    public void envejecer(){
        this.edad++;
    }

    public void mostrarEstado() {
        System.out.println("ID Gallina: "+this.idGallina+" Edad: "+this.edad+" Huevos puestos: "+this.huevosPuestos);
    }
}
