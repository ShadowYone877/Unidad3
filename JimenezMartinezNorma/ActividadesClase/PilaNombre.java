import java.util.Stack;

class PilaNombre {

    public static void main(String[] args) {

        Stack<Character> pilaN = new Stack<Character>();

        System.out.println("\n" + pilaN.isEmpty());

        pilaN.push('N');
        pilaN.push('O');
        pilaN.push('R');
        pilaN.push('M');
        pilaN.push('A');

        System.out.println("\n" + pilaN.peek());

        System.out.println("");

        pilaN.push('J');
        pilaN.push('I');
        pilaN.push('M');
        pilaN.push('E');
        pilaN.push('N');
        pilaN.push('E');
        pilaN.push('Z');

        System.out.println("\n" + pilaN.search('I'));

        System.out.println("");

        pilaN.push('M');
        pilaN.push('A');
        pilaN.push('R');
        pilaN.push('T');
        pilaN.push('I');
        pilaN.push('N');
        pilaN.push('E');
        pilaN.push('Z');

        pilaN.pop();
        pilaN.pop();

        System.out.println("\n" + pilaN);

        System.out.println("");

        for (Character pilita : pilaN) {

            System.out.println(pilita);

        }

    }

}