import java.util.Stack;

class pilasParImpar{
    public static void main(String[] args){
        //se crea la primera pila
        Stack <Integer> pilaPar = new Stack <Integer>();
        //se crea la segunda pila
        Stack <Integer> pilaImpar = new Stack <Integer>();
        //aqui es donde inicia y donde termina el bucle for
        for (int i=1; i <=30; i++){
            if(i % 2 ==0){
                //aqui guarda los datos par
                pilaPar.push(i);
            }else{//aqui guarda los datos impar
                pilaImpar.push(i);
            }//aqui imprime  los numeros par
            System.out.println("El numero par es: "+ pilaPar);
            //aqui imprime los numeros impar
            System.out.println("El numero impar es: "+ pilaImpar);
        }
    }
}