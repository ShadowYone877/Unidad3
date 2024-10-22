import java.util.Scanner;

class Ejercicio6 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.println("AREA RECTANGULO"); // Imprime "AREA RECTANGULO" :)

        System.out.println("Ingresa la base:"); // Pedir al usuario la base del rectangulo :)
        int a = op.nextInt(); // Declarar variable "a" y asignar el valor obtenido :)

        System.out.println("Ingresa la altura:"); // Pedir al usuario la altura del rectangulo :)
        int b = op.nextInt(); // Declarar variable "b" y asignar el valor obtenido :)

        System.out.println("El area es: " + area(a, b));// Muestra el area del rectangulo utilizando los valores
                                                        // ingresados :)

    }

    public static int area(int a, int b) { // Método estático que recibe dos números enteros :)

        return a * b; // Devuelve el resultado de multiplicar los numeros :)

    }

}