import java.util.Stack;

class PilaArreglo{
    public static void main(String[] args) {
        //se crea la pila
        Stack<String> pila = new Stack <>();
        //se crea la funcion
        String [] nombre ={"Hola", "Mundo", "Java", "Pila", "Cola"};
        //se implementa el bucle for
        for(int i=0; i<=nombre.length-1; i++){
            pila.push(nombre[i]);
        }//se agregan 2 palabras a la pila
        pila.push("Python");
        pila.push("Ewe");
        //se imprime el ultimo valor
        System.out.println(pila.peek());
        //se borrar un valor
        pila.pop();
        //se imprime la pila
        System.out.println(pila);
        //dice si esta vacia la pila
        System.out.println(pila.isEmpty());
      }
}