import java.util.Scanner;

class Ejercicio6 {
    public static void main(String[] args) {
        //se crea el scanner
        Scanner pc = new Scanner(System.in);
        //se ingresa el primer valor
        System.out.println("Ingresa la base: ");
        //se guarda
        double base = pc.nextDouble();
        //se ingresa el segundo valor
        System.out.println("Ingresa la altura: ");
        //se guarda
        double altura = pc.nextDouble();
        //se crea la variable
        double area = area(base, altura);
        //se imprime la variable
        System.out.println("El area es: " + area);
        //se cierra el scanner
        pc.close();
    }//se crea la funcion
    public static double area(double base, double altura){
        return base * altura;//se hace la operacion
    }
}
