import java.util.Queue;
import java.util.LinkedList;

class MainCola{
    public static void main(String[] args) {
        //
        Persona p1 = new Persona("Miguel", "Amado", 19);
        Persona p2 = new Persona("Angel", "Garcia", 19);
        Persona p3 = new Persona("Jorge", "Hernandez", 23);
        Persona p4 = new Persona("Norma", "Jimenez", 19);
        Persona p5 = new Persona("Jona", "Cruz", 19);
        Persona p6 = new Persona("Ema", "Castillo", 20);

        Queue<Persona> pc = new LinkedList<>();

        pc.add(p1);
        pc.add(p2);
        pc.add(p3);
        pc.add(p4);
        pc.add(p5);
        pc.add(p6);

        for(Persona p: pc){
            System.out.println(p.nombre+" "+ p.apellido + " " + p.edad + " ");
        }
    }
}