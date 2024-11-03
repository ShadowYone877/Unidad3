// Importar la librería para colas
import java.util.LinkedList; 
import java.util.Queue;

class Main{// Clase Main

    public static void main(String[] args) { 
        //Metodo Main
        Persona2 sc1 = new Persona2("Angello", "Duran", 22); 
        Persona2 sc2 = new Persona2("Pedro", "Hernandez", 19); 
        Persona2 sc3 = new Persona2("Jose", "Dominguez", 22); 
        Persona2 sc4 = new Persona2("Angela", "MArtinez", 20); 
        Persona2 sc5= new Persona2("Jorge", "Santiago", 20); 
        Persona2 sc6 = new Persona2("Carlos", "Zarate", 21); 
        // Crear objetos de las personas 
        Queue<Persona2> colapersonas = new LinkedList<>();
        // Crear la cola
        colapersonas.add(sc1); 
        colapersonas.add(sc2); 
        colapersonas.add(sc3); 
        colapersonas.add(sc4); 
        colapersonas.add(sc5); 
        colapersonas.add(sc6); 
        // Agregar los objetos a la cola
        for (Persona2 p : colapersonas) {
        // Iterar elementos de la cola e imprimirlos
            System.out.println(p.Nombre + " " + p.Apellido + " " + p.Edad);
            // Imprimir los elementos de la pila
        }
    }
}