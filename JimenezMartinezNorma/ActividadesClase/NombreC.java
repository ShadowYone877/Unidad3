
// Importar librerias para crear un objeto "cola"
import java.util.Queue;
import java.util.LinkedList;

public class NombreC { // Clase

    public static void main(String[] args) { // Metodo main

        // Crear objeto "cola"
        Queue<Character> nombre = new LinkedList<>();

        // Declarar variable y asignarle un nombre
        String name = "NORMA";

        // Iterar la longitud de la palabra
        for (int i = 0; i <= name.length(); i++) {

            // Despues de separarla convertirla a char
            char letra = name.charAt(i);

            // Agregar cada letra a la cola
            nombre.add(letra);

            // Imprimir cada elemento
            System.out.println(letra);

        }

        // Imprimir la cola
        System.out.println(nombre);

    }

}