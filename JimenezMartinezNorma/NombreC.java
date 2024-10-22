import java.util.Queue;
import java.util.LinkedList;

public class NombreC {

    public static void main(String[] args) {

        Queue<Character> nombre = new LinkedList<>();

        String name = "NORMA";

        for (int i = 0; i <= name.length(); i++) {

            char letra = name.charAt(i);

            nombre.add(letra);

            System.out.println(letra);

        }

        System.out.println(nombre);

    }

}