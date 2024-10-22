class Ejercicio10 {

    public static void main(String[] args) {

        int[] z = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Declarar un Array con diez valores

        System.out.println(arreglo(z)); // Imprime el Array
    }

    public static int arreglo(int[] a) { // Método estático que recibe un Array de enteros como parametro :)

        int i; // Declarar variable "i"

        for (i = 0; i <= a.length - 1; i++) { // Itera los elementos del Array desde la posicion 0 :)

            System.out.println(a[i]); // Imprime el valor de cada elemento del Array

        }

        return a[i]; // Devuelve la iteracion del Array

    }

}