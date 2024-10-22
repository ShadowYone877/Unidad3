class Ejercicio11 {

    public static void main(String[] args) {

        String[] a = { "DZGR", "2PM", "Morat", "TVXQ!", "Lasso", "Joji", "Beret", "D4vd", "NF-DC",
                "Coldplay" }; // Declarar Array con diez elemnetos

        System.out.println(arreglo(a)); // Imprimir array

    }

    public static String arreglo(String[] a) { // Método estático que recibe un Array de enteros como parametro :)

        int i; // Declarar variable "i"

        for (i = 0; i <= a.length - 1; i++) { // Itera los elementos del Array desde la posicion 0 :)

            System.out.println(a[i]); // Imprime el valor de cada elemento del Array

        }

        return a[i]; // Devuelve la iteracion del Array

    }

}