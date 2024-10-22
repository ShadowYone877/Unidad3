import java.util.Scanner;

class Ejercicio1{
    public static void main(String[] args) {
        //aqui se crea el objeto scanner
        Scanner opc = new Scanner(System.in);
        //aqui se pide ingresar el primer valor
        System.out.println("Ingrese el primer Numero: ");
        //aqui lo guarda
        int n1 = opc.nextInt();
        //aqui pide ingresar el segundo numero
        System.out.println("Ingrese el segundo Numero: ");
        //aqui lo guarda
        int n2 = opc.nextInt();
        //aqui se imprime junto al resultado
        System.out.println("El resultado es: " + sumar(n1,n2));
        //se cierra el scanner
        opc.close();
    }//se crea la funcion
    public static int sumar(int n1, int n2){
        return n1 + n2;//aqui se realiza la operacion
    }
}