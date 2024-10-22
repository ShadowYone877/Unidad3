import java.util.Scanner;

class Ejercicio9 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.println("AREA DE UN HEXAGONO"); // Imprime "AREA HEXAGONO" :)

        System.out.println("Ingresa el apotema:"); // Pedir al usuario el apotema del hexagono :)
        int a = op.nextInt(); // Declarar variable "a" y asignar el valor obtenido :)

        System.out.println("Ingresa el perimetro:"); // Pedir al usuario el perimetro del hexagono :)
        int p = op.nextInt(); // Declarar variable "p" y asignar el valor obtenido :)

        System.out.println("El area es: " + area(a, p)); // Muestra el area del hexagono utilizando el valor ingresado
                                                         // :)

    }

    public static int area(int a, int p) { // Método estático que recibe dos números enteros :)

        return (p * a) / 2; // Devuelve el resultado de multiplicar "a" por "p" dividido entre 2 :)

    }

}