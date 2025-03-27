/*Kata 3: Primeros Pasos en Encapsulamiento (Nivel
Intermedio)
Enunciado
Desarrolla una clase Libro para gestionar libros en una biblioteca.
Para evitar cambios incorrectos, implementa encapsulamiento.
● Atributos privados:
título
autor
añoPublicacion.
● Métodos públicos:
getTitulo()
getAutor()
getAñoPublicacion().
Método setAñoPublicacion(int nuevoAño), con validación: No se puede modificar si el
año es menor a 1900 o mayor al año actual.
🎯 Tarea a realizar
1. Crear un objeto de la clase Libro.
2. Intentar modificar el año de publicación con un valor inválido y otro válido.
3. Mostrar la información del libro:: título, autor, añoPublicacion.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Libros libro = new Libros("Harry Potter", "J. K. Rowling", 1997);

        System.out.println("Ingrese año de publicacion:");
        int nuevo = entrada.nextInt();
        libro.setPublicacion(nuevo);

        System.out.println("Titulo del libro: "+libro.getTítulo()+"\nAutor: "+libro.getAutor()+"\nAño de publicación: "+libro.getPublicacion());


    }
}