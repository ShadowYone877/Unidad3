import java.util.Queue;
import java.util.LinkedList;

class ColaArreglo{
    public static void main(String[] args) {
        //se crea la cola
        Queue<Integer> colita = new LinkedList<>();
        //se crea la funcion del codigo
        int [] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //se crea el for
        for(int i=0; i<=numero.length-1; i++){
            //se agregan los nuemros
            colita.add(numero[i]);
        }//se agregan 2 datos mas a la cola
        colita.add(6);
        colita.add(7);
        //se imprime el ultimo valor
        System.out.println(colita.peek());
        //quita un valor de la cola
        colita.poll();
        //imprime toda la cola
        System.out.println(colita);
        //imprime si esta vacia la cola
        System.out.println(colita.isEmpty());
    }
}