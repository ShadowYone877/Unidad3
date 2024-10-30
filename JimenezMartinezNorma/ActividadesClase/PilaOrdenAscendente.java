// Libreria para crear pilas
import java.util.Stack; 

// Clase
class PilaOrdenAscendente {

    // Metodo main
    public static void main(String[] args) {

        // Definimos las dos pilas
        Stack<Integer> Pila1 = new Stack<>();
        Stack<Integer> Pila2 = new Stack<>();

        // Declarar un arreglo con los siguiente numeros
        int[] numeros = { 3, 5, 4, 1, 2 };

        // Iterar todos los numeros del arreglo 
        for (int numero : numeros) {

            // Almacenana cada numero del arreglo en la Pila1 
            Pila1.push(numero);

        }

        // Imprimir la pila1
        System.out.println("Pila original: " + Pila1);

        // Si la condicion es correcta (Si la pila1 tiene elementos)
        while (!Pila1.isEmpty()) {

            // Declarar un entero y almacenar el ultimo numero de la pila1
            int a = Pila1.pop();

            // Si las dos condiciones se cumplen (si la pila2 tiene elementos y si el ultimo elemento de la pila2 es mayor a 3)
            while (!Pila2.isEmpty() && Pila2.peek() > a) {

                // Agregar a la pila1 el ultimo elemento de la pila2
                Pila1.push(Pila2.pop());

            }

            // Agregar a la pila2 el numero almacenado en la variable a
            Pila2.push(a);

        }

        // Imprimir la pila2 con los numeros ya ordenados
        System.out.println("Pila ordenada: " + Pila2);

    }

}