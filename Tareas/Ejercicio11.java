class  Ejercicio11 {
    public static void main(String[] args) {
        //se crea el arreglo
        String [] nom = {"Hola", "Mundo", "Ema", "Jona", "Jafet", "Mariana", "Stephanie", "Pepe", "Cochino", "Mexico"};
        //llama a la funcion a imprimir
        nombres(nom);
    }//se crea la funcion
    public static void nombres(String [] nombre){
        //se declara la condicion
        for(int i=0; i<=nombre.length; i++){
            //se imprime el arreglo
            System.out.println(nombre[i]);
        }
    }
}
