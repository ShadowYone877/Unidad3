import java.util.Scanner;

class Ejercicio8 {
    public static void main(String[] args) {
        //se crea el objeto scanner
        Scanner sis = new Scanner(System.in);
        //se ingresa el primer valor
        System.out.println("Ingresa la base: ");
        //se guarda
        double base = sis.nextDouble();
        //se ingresa el segundo valor
        System.out.println("Ingresa la altura: ");
        //se guarda
        double altura = sis.nextDouble();
        //se crea la variable
        double area = area(base, altura);
        //se imprime la variable
        System.out.println("El area es: " + area);
        //se cierra el scanner
        sis.close();
    }//se creqa la funcion
    public static double area(double base, double altura){
        return (base * altura)/2;//se hace la operacion
    }
}
