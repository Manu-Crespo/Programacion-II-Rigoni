import java.util.Scanner;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial() {
    }

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar(){
        /*Reduce 10 unidades de combustible al despegar. No puede despegar si hay
        menos de 10 unidades.*/
        System.out.println("Preparandose para el despegue...");
        if (this.combustible<=10) {
            System.out.println("\n-----------------------------------------------------\n");
            System.out.println("\nCombustible escaso, recargue para despegar");
            recargarCombustible(ingresoDatos());
            despegar();
        }else{
            this.combustible -= 10;
            System.out.println("\n-----------------------------------------------------\n");
            System.out.println("\nHaz despegado!\nQuedan "+this.combustible+" litros en el tanque");
        }
    }
    public void avanzar(int distancia) {
        /*Consume 1 unidad de combustible por cada unidad de distancia.
        No puede avanzar si no hay suficiente combustible.*/
        if (this.combustible <= distancia){
            System.out.println("\n-----------------------------------------------------\n");
            System.out.println("\nCombustible escaso para el recorrido.\nPuede recargar "+(100-this.combustible)+" litros o avanzar "+(100-distancia)+" metros");
            System.out.println("Recargando combustible:");
            recargarCombustible(ingresoDatos());
            System.out.println("Indicando distancia:");
            avanzar(ingresoDatos());
        }else {
            this.combustible -= distancia;
            System.out.println("\n-----------------------------------------------------\n");
            System.out.println("Haz avanzado a la posicion solicitada\nQuedan "+this.combustible+" litros en el tanque");

        }

    }

    public void recargarCombustible(int cantidad){
        /*Aumenta la cantidad de combustible en la nave. No
        puede superar el límite máximo de 100 unidades.*/
        int recarga = this.combustible+cantidad;
        if (recarga>100) {
            System.out.println("\n-----------------------------------------------------\n");
            System.out.println("Esta sobrepasando el limite del tanque, lo maximo que puede recargar es "+(100-this.combustible));
            recargarCombustible(ingresoDatos());
        }else {
            this.combustible += cantidad;
            System.out.println("\n-----------------------------------------------------\n");
            System.out.println("Recarga completa \nEl tanque contiene "+this.combustible+" litros");

        }

    }

    public void mostrarEstado(){
        /*Muestra el nombre de la nave y la cantidad de combustible actual.*/
        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Nave: "+this.nombre+" - Combustible: "+this.combustible+" litros");
    }

    public int ingresoDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valor:");
        int dato = entrada.nextInt();
        return dato;
    }
}
