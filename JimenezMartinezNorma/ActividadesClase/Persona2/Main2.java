import java.util.LinkedList; // Importar la librería para colas
import java.util.Queue;

class Main2 {// Clase Main

    public static void main(String[] args) { // Método principal

        // Crear objetos de las personas
        Persona2 p1 = new Persona2("Norma", "Jimenez", 19); // Objeto p1
        Persona2 p2 = new Persona2("Diego", "Garcia", 21); // Objeto p2
        Persona2 p3 = new Persona2("Pablo", "Villamil", 30); // Objeto p3
        Persona2 p4 = new Persona2("Miguel", "Amado", 21); // Objeto p4
        Persona2 p5 = new Persona2("Jorge", "Garcia", 20); // Objeto p5
        Persona2 p6 = new Persona2("Hwang", "Chansung", 34); // Objeto p6

        // Crear la cola
        Queue<Persona2> colaPersonas = new LinkedList<>();

        // Agregar los objetos a la cola
        colaPersonas.add(p1); // Agregar p1 a la cola
        colaPersonas.add(p2); // Agregar p2 a la cola
        colaPersonas.add(p3); // Agregar p3 a la cola
        colaPersonas.add(p4); // Agregar p4 a la cola
        colaPersonas.add(p5); // Agregar p5 a la cola
        colaPersonas.add(p6); // Agregar p6 a la cola

        // Iterar elementos de la cola e imprimirlos
        for (Persona2 p : colaPersonas) {

            // Imprimir los elementos de la pila
            System.out.println(p.nombre + " " + p.apellido + " " + p.edad);

        }

    }

}