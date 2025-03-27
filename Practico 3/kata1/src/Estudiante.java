import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private Double calificacion;

    Scanner entrada = new Scanner(System.in);

    public Estudiante() {
    }

    public Estudiante(String nombre, Double calificacion, String curso, String apellido) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.curso = curso;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del alumno: " + apellido + " " + nombre + "\nCurso: " + curso + "\nNota: " + calificacion);
    }

    public void subirCalificacion(double puntos){
        if((this.calificacion+puntos)<=10){
            this.calificacion+=puntos;
            System.out.println("La nota subió a "+this.calificacion);
        }else {
            this.calificacion=10.0;
            System.out.println("La nota subió a "+this.calificacion);
        }
    }

    public void bajarCalificacion(double puntos){
        if((this.calificacion-puntos)>0){
            this.calificacion-=puntos;
            System.out.println("La nota bajó a "+this.calificacion);
        }else {
            this.calificacion=0.0;
            System.out.println("La nota bajó a "+this.calificacion);
        }
    }
    /*public void subirCalificacion(double puntos){
        double total = calificacion+puntos;
        if ((total>=0)&&(total<=10)) {
            System.out.println("La nota subida actualizada es: " + (calificacion + puntos));
        }else {
            do {
                System.out.println("Valor incorrecto, pruebe nuevamente:");
                puntos = entrada.nextDouble();
                total = calificacion+puntos;

            }while((total<0)||(total>10));
            subirCalificacion(puntos); dejar el 10 directamente
        }
    }
    public void bajarCalificacion(double puntos){
        double total = calificacion-puntos;
        if ((total>=0)&&(total<=10)) {
            System.out.println("La nota bajada actualizada es: " + (calificacion - puntos));
        }else {
            do {
                System.out.println("Valor incorrecto, pruebe nuevamente:");
                puntos = entrada.nextDouble();
                total = calificacion-puntos;

            }while((total<0)||(total>10));
            bajarCalificacion(puntos);dejar el 0
        }
    }*/
}
