import java.util.Stack;

class Pilasmiguel{
    public static void main(String[] args) {

        Stack<Character> pila = new Stack<Character>();

        System.out.println(pila.isEmpty());

        pila.push('M');
        pila.push('i');
        pila.push('g');
        pila.push('u');
        pila.push('e');
        pila.push('l');

        System.out.println(pila.peek());

        pila.push('A');
        pila.push('n');
        pila.push('g');
        pila.push('e');
        pila.push('l');
        
        System.out.println(pila.search('A'));

        pila.push('A');
        pila.push('m');
        pila.push('a');
        pila.push('d');
        pila.push('o');
        
        System.out.println(pila);

        pila.push('G');
        pila.push('a');
        pila.push('r');
        pila.push('c');
        pila.push('i');
        pila.push('a');

        for(char pilita: pila){
            System.out.println(pilita);
        }
    }
}