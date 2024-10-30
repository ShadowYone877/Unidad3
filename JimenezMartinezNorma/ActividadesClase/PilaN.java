
// Importar libreria para pilas
import java.util.Stack;

class PilaN { // Clase

    public static void main(String[] args) { // Metodo main

        // Crear objeto pila
        Stack<String> pila = new Stack<>();

        // Declarar arreglo de tipo String con 5 valores
        String[] nombre = { "2PM", "DZGR", "D4vd", "TVXQ!", "Joji" };

        // Iterar arreglo
        for (int i = 0; i <= nombre.length - 1; i++) {

            // Agregar los elementos del arreglo a la pila
            pila.push(nombre[i]);

        }

        // Agregar dos elementos a la pila
        pila.push("Añaña");
        pila.push("2AM");

        // Imprime el ultimo elemento de la pila
        System.out.println(pila.peek());

        // Elimina el ultimo elemento de la pila
        pila.pop();

        // Imprime la pila
        System.out.println(pila);

        // Imprime "true" si la cola esta vacia y si no "false"
        System.out.println(pila.isEmpty());

    }

}