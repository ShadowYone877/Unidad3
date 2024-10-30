import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Array{
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        List <Persona> persona = new ArrayList<>();

        String setNombre, setApellido;

        int setEdad, id=0;

        do{
            System.out.println("Ingresa el Nombre: ");
            setNombre = op.next();

            System.out.println("Ingresa el Apellido: ");
            setApellido = op.next();

            System.out.println("Ingresa la edad: ");
            setEdad = op.nextInt();

            persona.add(id, new Persona(setNombre, setApellido, setEdad));

            id++;

        }while (persona.size()<3);

        for(int i=0; i<persona.size(); i++){
            if (persona.get(i).getClass().equals("Kilo")){

                persona.remove(i); break;
                
            }
        }

        for(int j = 0; j <persona.size(); j++){

            System.out.println(persona.get(j));
        }
    }
}