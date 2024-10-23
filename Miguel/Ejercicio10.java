
class Ejercicio10 {
    public static void main(String[] args) {
        //se crea el arreglo
        int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //llama a la funcion a imprimir
        arreglos(num);
    }//se crea la funcion
    public static void arreglos(int [] arreglo) {
       //se crea la condicion
        for(int i=0; i<=10; i++){
            //se imprime el arreglo
            System.out.println(arreglo[i]);
        }
    }
}
