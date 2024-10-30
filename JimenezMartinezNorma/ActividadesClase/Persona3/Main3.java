import java.util.Scanner; // Librería Scanner
import java.util.ArrayList; // Librería ArrayList
import java.util.List; // Librería List

public class Main3 { // Clase

    public static void main(String[] args) { // Método main

        // Crear objeto Scanner
        Scanner sn = new Scanner(System.in);

        // Crear ArrayList
        List<Persona3> personas = new ArrayList<>();

        // Declarar variables String
        String setNombre, setApellido;

        // Declarar variables int
        int setEdad, id = 0;

        do {
            // Pedir al usuario
            System.out.println("Ingresa el nombre:");
            // Almacena el dato
            setNombre = sn.next();

            // Pedir al usuario
            System.out.println("Ingresa el apellido:");
            // Almacena el dato
            setApellido = sn.next();

            // Pedir al usuario
            System.out.println("Ingresa la edad:");
            // Almacena el dato
            setEdad = sn.nextInt();

            // Agregar los datos ingresados a la cola
            personas.add(id, new Persona3(setNombre, setApellido, setEdad));

            // Incremento
            id++;

            // Validación size(numero de elemntos en la cola) tiene que seer menor a 3
        } while (personas.size() < 3);

        // Iterar elementos de la cola para verificar cada elemento
        for (int i = 0; i < personas.size(); i++) {

            // Si se ingresa algun elemento igual "Kilo" lo elimina
            if (personas.get(i).getNombre().equals("Kilo")) {

                // Elimina el elemento
                personas.remove(i);

                // detiene el proceso
                break;
            }
        }

        // Iterar los elementos de la cola
        for (int j = 0; j < personas.size(); j++) {

            // Imprime los elemnetos de la cola
            System.out.println(personas.get(j).toString());

        }

    }

}