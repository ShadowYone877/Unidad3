import java.util.Scanner;

class Ejercicio4 {
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.println("Ingresa el dividendo:"); // Pedir al usuario un nuemro :)
        int a = op.nextInt(); // Declarar variable "a" y asignar el valor obtenido :)

        System.out.println("Ingresa el divisor:"); // Pedir al usuario un nuemro :)
        int b = op.nextInt(); // Declarar variable "b" y asignar el valor obtenido :)

        System.out.println(+a + "/" + b + "=" + dividision(a, b)); // Muestra el resultado de la division utilizando los
                                                                   // valores ingresados :)

    }

    public static double dividision(double a, double b) { // Método estático que recibe dos números :)

        return a / b; // Devuelve el resultado de dividir los numeros :)

    }

}