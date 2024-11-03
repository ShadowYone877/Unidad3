import java.util.Stack; // Importar la librería para pilas

class Main1 { // Clase Main

    public static void main(String[] args) { // Método main

        // Crear objetos de las personas

        Persona1 p1 = new Persona1("Norma", "Jimenez", 19); // Objeto p1
        Persona1 p2 = new Persona1("Diego", "Garcia", 21); // Objeto p2
        Persona1 p3 = new Persona1("Pablo", "Villamil", 30); // Objeto p3
        Persona1 p4 = new Persona1("Miguel", "Amado", 21); // Objeto p4
        Persona1 p5 = new Persona1("Jorge", "Garcia", 20); // Objeto p5

        // Crear la pila
        Stack<Persona1> personita = new Stack<>();

        // Agregar los objetos a la pila "personita"
        personita.push(p1); // Agregar p1 a la pila "personita"
        personita.push(p2); // Agregar p2 a la pila "personita"
        personita.push(p3); // Agregar p3 a la pila "personita"
        personita.push(p4); // Agregar p4 a la pila "personita"
        personita.push(p5); // Agregar p5 a la pila "personita"

        // Iterar elementos de la pila
        for (Persona1 p : personita) {

            // Imprimir los elementos de la pila
            System.out.println(p.nombre + " " + p.apellido + " " + p.edad);

        }

    }

}