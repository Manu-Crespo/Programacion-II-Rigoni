/*Kata 1: Registro de Estudiantes (Nivel Básico)
Enunciado
Imagina que estás desarrollando un sistema de gestión de estudiantes para una plataforma
de cursos.
Debes modelar la clase Estudiante con los siguientes atributos y métodos:
Atributos:
nombre (String)
apellido (String)
curso (String)
calificacion (double)
Métodos:
mostrarInfo(): Muestra la información del estudiante
(apellido+nombre+curso+calificación)
subirCalificacion(double puntos): Aumenta la calificación del estudiante en la cantidad
de puntos especificada (máximo 10).
bajarCalificacion(double puntos): Disminuye la calificación del estudiante (mínimo 0).
🎯 Tarea a realizar
● Crear una instancia de la clase Estudiante con un apellido, nombre, curso y calificación
● Mostrar la información del estudiante: apellido, nombre, curso y calificación
● Aumentar y disminuir la calificación con subirCalificacion() y bajarCalificacion().
*/

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Manu",8.00, "Programacion","Crespo");

        estudiante.mostrarInfo();
        estudiante.bajarCalificacion(5.5);
        estudiante.subirCalificacion(7);

    }
}