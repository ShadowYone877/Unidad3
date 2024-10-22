import java.util.Scanner;

class Ejercicio1 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.println("Ingresa un numero:"); // Pedir al usuario un nuemro :)
        int a = op.nextInt(); // Declarar variable "a" y asignar el valor obtenido :)

        System.out.println("Ingresa un numero:"); // Pedir al usuario un nuemro :)
        int b = op.nextInt(); // Declarar variable "b" y asignar el valor obtenido :)

        System.out.println(+a + "+" + b + "=" + suma(a, b)); // Muestra el resultado de la suma utilizando los
                                                             // valores ingresados:)

    }

    public static int suma(int a, int b) { // Método estático que recibe dos números enteros :)

        return a + b; // Devuelve el resultado de sumar los dos numeros :)

    }

}