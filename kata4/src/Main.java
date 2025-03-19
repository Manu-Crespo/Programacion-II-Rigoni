/*Kata 4: Estado e Identidad de los Objetos (Nivel
Intermedio-Avanzado)
En esta actividad, vas a programar un sistema para gestionar gallinas en una granja digital,
registrando su producción de huevos y envejecimiento.
Requisitos del modelo
Cada gallina tendrá los siguientes atributos:
● idGallina → Identificador único.
● edad → Representa la edad de la gallina en años.
● huevosPuestos → Cantidad total de huevos que ha puesto.
Además, contará con los siguientes métodos:
● ponerHuevo() → Incrementa en 1 la cantidad de huevos puestos por la gallina.
● envejecer() → Aumenta en 1 su edad.
● mostrarEstado() → Muestra en pantalla la información actual de la gallina (idGallina,
edad, huevosPuestos).
🎯 Tarea a realizar
1. Crear dos gallinas diferentes, asignando un identificador único a cada una.
2. Hacer que cada gallina ponga al menos un huevo.
3. Hacer que cada gallina envejezca un año.
4. Mostrar el estado de cada gallina después de estas acciones.
*/

public class Main {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1, 1, 5);
        Gallina gallina2 = new Gallina(2, 3, 32);

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();

        gallina1.envejecer();
        gallina2.envejecer();

        System.out.println("\n-----------------------------------------------\n");

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}