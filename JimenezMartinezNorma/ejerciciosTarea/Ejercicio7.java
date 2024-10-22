import java.util.Scanner;

class Ejercicio7 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.println("AREA DE UN CUADRADO"); // Imprime "AREA CUADRADO" :)

        System.out.println("Ingresa el lado :"); // Pedir al usuario el lado del cuadrado :)
        int l = op.nextInt(); // Declarar variable "a" y asignar el valor obtenido :)

        System.out.println("El area es: " + lado(l)); // Muestra el area del cudrado utilizando los valores ingresados
                                                      // :)

    }

    public static int lado(int a) { // Método estático que recibe un numero entero:)

        return a * a; // Devuelve el resultado de multiplicar los numeros :)

    }

}