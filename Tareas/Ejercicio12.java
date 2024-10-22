class Ejercicio12 {
    public static void main(String[] args) {
        //se crea el arreglo
        String [] let = {"M", "i", "g", "u", "e", "l",};
        //se manda a llamar a la funcion para imprimir
        nombre(let);
    }//se crea la funcion
    public static void nombre(String [] nombre){
        //se crea la condicion
        for(int i=0; i<=nombre.length; i++){
            //se imprime el arreglo
            System.out.println(nombre[i]);
        }
    }
}
