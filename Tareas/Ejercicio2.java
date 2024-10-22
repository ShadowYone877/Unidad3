import java.util.Scanner;

class Ejercicio2 {
public static void main(String[] args) {
    //se crea el objeto scanner
    Scanner xd = new Scanner(System.in);
    //se ingresa el primer valor
    System.out.println("Ingresa el primer numero: ");
    //guarda el primer valor
    int n1 = xd.nextInt();
    //se pide ingresar el segunda valor
    System.out.println("Ingresa el segundo numero: ");
    //guarda el segundo valor
    int n2 = xd.nextInt();
    //imprime el resultado
    System.out.println("El resultado es: " + resta(n1,n2));
    //cierra el scanner
    xd.close();
    
    }//aqui se crea la funcion
    public static int resta(int n1, int n2){
        return n1 - n2;//aqui se realiza la operacion
    }
    
}