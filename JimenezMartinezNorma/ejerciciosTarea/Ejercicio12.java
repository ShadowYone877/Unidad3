class Ejercicio12 {

    public static void main(String[] args) {

        char[] a = { 'N', 'O', 'R', 'M', 'A' }; // Declarar Array

        System.out.println(arreglo(a)); // Imprimir array

    }

    public static char arreglo(char[] a) { // Método estático que recibe un Array de enteros como parametro :)

        int i; // Declarar variable "i"

        for (i = 0; i <= a.length - 1; i++) { // Itera los elementos del Array desde la posicion 0 :)

            System.out.println(a[i]); // Imprime el valor de cada elemento del Array

        }

        return a[i]; // Devuelve la iteracion del Array

    }

}