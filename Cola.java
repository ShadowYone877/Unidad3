import java.util.Queue;//se importa la libreria de  cola
import java.util.LinkedList;//se importa la libreria de listas

class Cola{
    public static void main(String[] args) {
        //se crea la cola
        Queue<String> colita = new LinkedList<>();
        //se crea la variable de tipo texto
        String name = "Miguel";
        //se crea el bucle for
        for(int i=0; i<=name.length(); i++){
            //se crea la funcion para pasar el tipo texto a caracter
            char a = name.charAt (i);
            colita.add(a);

        }//se imprime la cola
        System.out.println(colita);
    }
}