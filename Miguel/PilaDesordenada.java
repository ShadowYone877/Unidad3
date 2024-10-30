import java.util.Stack;  //libreria 
class PilaDesordenada{  
    public static void main(String[] args) {
        // Definimos las dos pilas
        Stack<Integer> Pila1 = new Stack<>();
        Stack<Integer> Pila2 = new Stack<>();
        int[] numeros = {3, 5, 4, 1, 2};
        for (int numero : numeros) {
            Pila1.push(numero);
        }
        System.out.println("Pila original: " + Pila1);
        while (!Pila1.isEmpty()) {
            int a = Pila1.pop();
            while (!Pila2.isEmpty() && Pila2.peek() > a) {
                Pila1.push(Pila2.pop());
            }
            Pila2.push(a);
        }
        System.out.println("Pila ordenada: " + Pila2);
    }
}