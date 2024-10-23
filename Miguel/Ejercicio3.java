import java.util.Scanner;

class Ejercicio3 {
    public static void main(String[] args) {
        //se crea el objeto scanner
        Scanner lol = new Scanner(System.in);
        //se ingresa el primer valor
        System.out.println("Ingresa el primer numero: ");
        //se guarda
        int n1 = lol.nextInt();
        //se ingresa el segundo valor
        System.out.println("Ingresa el segundo numero: ");
        //se guarda
        int n2 = lol.nextInt();
        //se imprime el resultado
        System.out.println("El resultado es: " + multiplicacion(n1,n2));
        //se cierra el scanner
        lol.close();
    }//se crea la funcion
    public static int multiplicacion(int n1, int n2){
        return n1 * n2;//se hace la operacion
    }
}
