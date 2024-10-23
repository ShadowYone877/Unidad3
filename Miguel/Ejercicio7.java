import java.util.Scanner;

class Ejercicio7 {
    public static void main(String[] args) {
        //se crea el objeto scanner
        Scanner pc = new Scanner(System.in);
        //se ingresa el primer valor
        System.out.println("Ingresa el Lado: ");
        //se guarda
        double lado = pc.nextDouble();
        //se crea la variable
        double area = area(lado);
        //se imprime la variable
        System.out.println("El area es: " + area);
        //se cierra el scanner
        pc.close();
    }//se crea la funcion
    public static double area(double lado){
        return lado * lado;//se hace la operacion
    }
}
