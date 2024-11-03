// Importartamos la libreria para el metodo pila
import java.util.Stack;
class Pila{ // Clase
    public static void main(String[] args) {
         // Metodo main
        Stack<String> pila = new Stack<>();
        // Crear objeto pila
        String[] nombre = { "DLD", "Angello", "Luis", "Miguel", "MAnuel" };
        // Declarar arreglo de tipo String y declaramos 5 valores
        for (int i = 0; i <= nombre.length - 1; i++) {
            //Ciclo for para interar la pila 
            pila.push(nombre[i]);
            // Agregar los elementos del arreglo a la pila
        }
        pila.push("Alvaro");
        pila.push("Jose");
        // Agregar dos elementos a la pila
        System.out.println(pila.peek());
        // Imprime el ultimo elemento de la pila
        pila.pop();
        // Elimina el ultimo elemento de la pila
        System.out.println(pila);
        // Imprime la pila
        System.out.println(pila.isEmpty()); 
        // Imprime "true" si la cola esta vacia y si no "false"
    }
}