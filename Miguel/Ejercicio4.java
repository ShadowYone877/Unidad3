import java.util.Scanner;

class Ejercicio4{
    public static void main(String[] args) {
        //aqui se crea el objeto scanner
        Scanner sis = new Scanner(System.in);
        //se ingresa el primer valor
        System.out.println("Ingresa el primer numero: ");
        //se guarda
        float n1 = sis.nextFloat();
        //se ingresa el segundo valor
        System.out.println("Ingresa el segundo numero: ");
        //se guarda
        float n2 = sis.nextFloat();
        //se imprime el resultado
        System.out.println("El resultado es: " + division(n1,n2));
        //se cierra el scanner
        sis.close();
    }//se crea la funcion
    public static float division(float n1, float n2){
        return n1 / n2;//se hace la operacion
    }
}