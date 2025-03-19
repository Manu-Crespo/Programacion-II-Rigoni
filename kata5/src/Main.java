/*Kata 5: Comportamiento de los Objetos (Nivel Avanzado)
Enunciado
● Imagina que trabajas en una agencia espacial y necesitas programar un simulador de
naves espaciales.
● Debes desarrollar una clase NaveEspacial con un sistema de combustible limitado, lo
que obliga a gestionar eficientemente los recursos.
Especificaciones
Atributos:
● nombre (String) → Nombre de la nave espacial.
● combustible (int) → Cantidad actual de combustible disponible.
Métodos:
● despegar(): Reduce 10 unidades de combustible al despegar. No puede despegar si hay
menos de 10 unidades.
● avanzar(int distancia): Consume 1 unidad de combustible por cada unidad de distancia.
No puede avanzar si no hay suficiente combustible.
● recargarCombustible(int cantidad): Aumenta la cantidad de combustible en la nave. No
puede superar el límite máximo de 100 unidades.
● mostrarEstado(): Muestra el nombre de la nave y la cantidad de combustible actual.
Reglas:
✔️ No puede despegar con menos de 10 unidades de combustible.
✔️ No puede avanzar si el combustible no es suficiente para la distancia requerida.
✔️ No puede sobrecargar combustible más allá del límite de 100 unidades.
🎯 Tarea a realizar
1. Intentar resolver la kata sin mirar la solución.
2. Crear una instancia de la clase NaveEspacial con un nombre y 50 unidades de
combustible.
3. Intentar avanzar 60 unidades sin recargar (debe fallar por falta de combustible).
4. Recargar 40 unidades de combustible.
5. Intentar avanzar 60 unidades nuevamente (ahora debe funcionar).
6. Mostrar el estado actual de la nave.
7. Comparar con la solución y ajustar el código si es necesario.
8. Repetir el ejercicio con diferentes valores para reforzar la comprensión.*/

public class Main {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Apollo", 50);

        nave.despegar();
        System.out.println("Preparandose para avanzar...");
        nave.avanzar(nave.ingresoDatos());
        System.out.println("Preparando recarga...");
        nave.recargarCombustible(nave.ingresoDatos());
        System.out.println("Preparandose para avanzar...");
        nave.avanzar(nave.ingresoDatos());
        nave.mostrarEstado();
    }
}