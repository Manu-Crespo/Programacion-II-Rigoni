import java.util.Scanner;

public class Libros {
    private String título;
    private String autor;
    private int publicacion;


    public Libros() {
    }

    public Libros(String título, String autor, int publicacion) {
        this.título = título;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(int publicacion) {
        if ((publicacion>=1900)&&(publicacion<=2025)) {
            this.publicacion = publicacion;
        }else{
            System.out.println("Año invalido, debe ser mayor a 1900 y menor a 2025");
        }

    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
