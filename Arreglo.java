// Importar librerias Metodo COLA
import java.util.LinkedList;
import java.util.Queue;
class Arreglo{ // clase
    public static void main(String[] args) { // Metodo main
    Queue<Integer> cola = new LinkedList<>();// Crear objeto 
        int[] numero = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// Declarar arreglos de tipo integer 
        for (int i = 0; i <= numero.length - 1; i++) {// ciclo for para el arreglo
            cola.add(numero[i]);//Agregar los elementos del arreglo a la cola
        }
        // Agregar dos datos a la cola
        cola.add(11);
        cola.add(12);
        // Muestra el primer elemento de la cola
        System.out.println(cola.peek());
        // Elimina el primer elemento de la cola
        cola.poll();
        // Imprime 
        System.out.println(cola);
        // Imprime true si la cola esta vacia y si no false
        System.out.println(cola.isEmpty());
    }
}