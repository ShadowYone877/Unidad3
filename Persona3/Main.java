import java.util.ArrayList; // Importa la librería Scanner para la entrada de datos
import java.util.List; // Importa la librería ArrayList para manejar listas dinámicas
import java.util.Scanner; // Importa la interfaz List para trabajar con listas

public class Main { 
    // Clase principal

    public static void main(String[] args) { 
        // Método main, punto de entrada del programa
        
        Scanner sn = new Scanner(System.in); 
        // Crea un objeto Scanner para leer la entrada del usuario
        
        List<Persona3> personas = new ArrayList<>(); 
        // Crea una lista para almacenar objetos de tipo Persona3
        
        String setNombre, setApellido; 
        // Declara variables para almacenar el nombre y apellido de la persona
        
        int setEdad, id = 0; 
        // Declara variables para la edad de la persona y un identificador `id`
        
        do {
            System.out.println("Ingresa el nombre:"); 
            // Pide al usuario que ingrese el nombre
            setNombre = sn.next(); 
            // Lee y almacena el nombre ingresado
            
            System.out.println("Ingresa el apellido:"); 
            // Pide al usuario que ingrese el apellido
            setApellido = sn.next(); 
            // Lee y almacena el apellido ingresado
            
            System.out.println("Ingresa la edad:"); 
            // Pide al usuario que ingrese la edad
            setEdad = sn.nextInt(); 
            // Lee y almacena la edad ingresada
            
            personas.add(id, new Persona3(setNombre, setApellido, setEdad)); 
            // Crea un objeto Persona3 con los datos ingresados y lo agrega a la lista
            id++; 
            // Incrementa el valor de `id` para el siguiente objeto en la lista
            
        } while (personas.size() < 3); 
        // Repite el ciclo hasta que la lista tenga al menos 3 personas
        
        for (int i = 0; i < personas.size(); i++) { 
            // Itera sobre los elementos de la lista para verificar cada persona
            
            if (personas.get(i).getNombre().equals("Kilo")) { 
                // Comprueba si el nombre de la persona es "Kilo"
                personas.remove(i); 
                // Elimina el elemento si el nombre es "Kilo"
                break; 
                // Detiene el ciclo después de eliminar el elemento
            }
        }
        
        for (int j = 0; j < personas.size(); j++) { 
            // Itera sobre los elementos restantes en la lista
            System.out.println(personas.get(j).toString());
             // Imprime la representación en String de cada objeto Persona3
        }
        
        sn.close();
         // Cierra el objeto Scanner para liberar recursos
    }
}
