import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        int num = sNumero(); // Declarar una variable y asignarle el valor de la funcion "sNumero" :)

        System.out.println(num + " es un numero mayor a 20 :)"); // Imprimir que el numero ingresado es correcto :)

    }

    public static int sNumero() { // Método estático que recibe un numero entero :)

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        int numero; // Declarar variable "numero"

        do {

            System.out.print("Ingresa un número mayor a 20: "); // Pedir al usuario un numero > 20
            numero = op.nextInt(); // Asignar el valor obtenido :)

            if (numero <= 20) { // Validar si el numero es menor a 20

                System.out.println("Error. Inténtalo nuevamente"); // Imprime error

            }

        } while (numero <= 20); // Vuelvea pedir el numero hasta que el numero sea > a 20

        return numero; // Devuelv el numero

    }

}