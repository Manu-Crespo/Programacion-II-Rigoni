/*Kata 2: Registro de Mascotas (Nivel Básico)
Enunciado
Imagina que estás desarrollando un sistema de gestión de mascotas para un refugio de
animales.
Debes modelar la clase Mascota con los siguientes atributos y métodos:
● Atributos:
nombre
especie
edad
● Métodos:
mostrarInfo()
cumplirAnios().
🎯 Tarea a realizar
● Crear una instancia de la clase Mascota con un nombre, especie y edad inicial.
● Mostrar la información de la mascota:nombre, especie y edad inicial.
● Llamar a cumplirAnios() para aumentar la edad en 1 año.
● Mostrar la información actualizada.
*/

public class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Firulais", 5, "Labrador");

        mascota.mostrarInfo();
        mascota.cumplirAnios();
    }
}