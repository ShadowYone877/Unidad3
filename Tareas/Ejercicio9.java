import java.util.Scanner;

class Ejercicio9{
    public static void main(String[] args) {
        //se crea el objeto scanner
        Scanner we = new Scanner(System.in);
        //se ingresa el primer valor
        System.out.println("Ingresa el perimetro: ");
        //se guarda
        double perimetro = we.nextDouble();
        //se ingresa el segundo valor
        System.out.println("Ingresa el apotema: ");
        //se guarda
        double apotema = we.nextDouble();
        //se crea la variable
        double area = area(perimetro, apotema);
        //se imprime la variable
        System.out.println("El area es: " + area);
        //se cierra el scanner
        we.close();
    }//se crea la funcion
    public static double area(double perimetro, double apotema){
        return (perimetro * apotema)/2;//se hace la operacion

    }
}