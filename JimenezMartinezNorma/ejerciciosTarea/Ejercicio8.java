
import java.util.Scanner;

class Ejercicio8 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.println("AREA DE UN RECTANGULO"); // Imprime "AREA RECTANGULO" :)

        int a = 23; // Declarar la variable "a" y se le asigna un valor ;)

        System.out.println("Ingresa la base:"); // Pedir al usuario la base del rectangulo :)
        int b = op.nextInt(); // Declarar variable "b" y asignar el valor obtenido :)

        System.out.println("El area es: " + base(a, b)); // Muestra el area del rectangulo utilizando el valor ingresado
                                                         // :)

    }

    public static int base(int a, int b) { // Método estático que recibe dos números enteros :)

        return a * b; // Devuelve el resultado de multiplicar los numeros :)

    }

}
