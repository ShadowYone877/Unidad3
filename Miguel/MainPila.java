import java.util.Stack;//

class MainPila{
    public static void main(String[] args) {
        //
        Persona p1 = new Persona("Miguel", "Amado", 19);
        Persona p2 = new Persona("Angel", "Garcia", 19);
        Persona p3 = new Persona("Jorge", "Hernandez", 23);
        Persona p4 = new Persona("Norma", "Jimenez", 19);
        Persona p5 = new Persona("Jona", "Cruz", 19);
        //
        Stack <Persona> op = new Stack<>();
        //
        op.push(p1);
        op.push(p2);
        op.push(p3);
        op.push(p4);
        op.push(p5);
        //
        for(Persona p: op){//
            System.out.println(p.nombre +" "+ p.apellido+" "+ p.edad + " ");
        }
    }

}