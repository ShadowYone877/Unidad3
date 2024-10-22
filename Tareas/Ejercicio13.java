import java.util.Scanner;

class Ejercicio13 {
    public static void main(String[] args) {
        //se crea el objeto scanner
        Scanner chi = new Scanner(System.in);
        //se crea la variable
        int n1;

        do{//se ingresa el primer dato
            System.out.println("Ingresa un numero: ");
            //se guarda
            n1 = chi.nextInt();
            //manda a llmar a la funcion
            validar(n1); 

        }while(n1<=20);
        //muestra el numero que ingresaste junto con un mensaje
        System.out.println("El numero es Mayor a 20, Este es el numero: " + n1);
        //se cierra el scanner
        chi.close();
    }//se crea la funcion
    public static void validar(int n1){
        //se lee si cumple la condicin
        if (n1<=20){
            //si no la cumple se da este msj al usuario
            System.out.println("El numeor no es Mayor a 20, vuelva a ingresar un nuevo Numero ");

        }
    
    }

}
