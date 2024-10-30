
// Importar librerias para hacer una "cola"
import java.util.Queue;
import java.util.LinkedList;

class ArregloC { // clase
    public static void main(String[] args) { // Metodo main

        // Crear objeto "cola"
        Queue<Integer> colita = new LinkedList<>();

        // Declarar arreglo de tipo int con 10 valores
        int[] numero = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Interar el arreglo
        for (int i = 0; i <= numero.length - 1; i++) {

            // Agregar los elementos del arreglo a la "cola"
            colita.add(numero[i]);

        }

        // Agregar dos datos a la cola
        colita.add(11);
        colita.add(12);

        // Muestra el primer elemento de la "cola"
        System.out.println(colita.peek());

        // Elimina el primer elemento de la "cola"
        colita.poll();

        // Imprime la "cola"
        System.out.println(colita);

        // Imprime "true" si la cola esta vacia y si no "false"
        System.out.println(colita.isEmpty());

    }

}