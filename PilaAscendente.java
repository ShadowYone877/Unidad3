// Libreria con el metodo Pila
import java.util.Stack; 
class PilaAscendente{// Clase
    public static void main(String[] args) {
        // Metodo main
        Stack<Integer> pila1 = new Stack<>();
        // Declaramos dos pilas
        Stack<Integer> pila2 = new Stack<>();
        int[] numeros = { 3, 5, 4, 1, 2 };
        // Declarar un arreglo tipo integer con numeros en desorden
        for (int numero : numeros) {
            // Iterar todos los numeros del arreglo 
            pila1.push(numero);
            // Almacenana cada numero del arreglo en la pila1 
        }
        System.out.println("Pila original: " + pila1);
        // Imprimir la pila1
        while (!pila1.isEmpty()) {
            // Si la condicion es correcta (Si la pila1 tiene elementos)
            int a = pila1.pop();
            // Declarar un entero y almacenar el ultimo numero de la pila1
            while (!pila2.isEmpty() && pila2.peek() > a) { 
                // Si las dos condiciones se cumplen (si la pila2 tiene elementos y si el ultimo elemento de la pila2 es mayor a 3)
                pila1.push(pila2.pop());
                // Agregar a la pila1 el ultimo elemento de la pila2
            }
            pila2.push(a);
            // Agregar a la pila2 el numero almacenado en la variable (a)
        }
        System.out.println("Pila ordenada: " + pila2);
        // Imprimir la pila2 con los numeros ya ordenados
    }
}