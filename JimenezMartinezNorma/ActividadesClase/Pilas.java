import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {

        Stack<Integer> pilaPar = new Stack<>();

        Stack<Integer> pilaImpar = new Stack<>();

        for (int i = 0; i <= 30; i++) {

            if (i % 2 == 0) {

                pilaPar.push(i);

            } else {

                pilaImpar.push(i);

            }

        }

        System.out.println(pilaPar);

        System.out.println(pilaImpar);

    }

}