import java.util.Scanner;

class Ejercicio5 {
    public static void main(String[] args) {
        //se crea el objeto scanner
        Scanner sis = new Scanner(System.in);
        //se ingresa el primer valor
        System.out.println("Ingresa el primer numero: ");
        //lo guarda
        int n1 = sis.nextInt();
        //se imprime el resultado
        System.out.println("El resultado es: " + modulo(n1));
        //se cierra el scanner
        sis.close();

    }//se crea la funcion
    public static int modulo(int n1){
        return n1 % 1;//se hace la operacion
    }
}
