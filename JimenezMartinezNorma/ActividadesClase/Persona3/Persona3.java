public class Persona3 {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona3() {
    }

    public Persona3(String nombre, String apellido, int edad) {

        // Asignar el valor de las variables a los parametros
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona3 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
    }

}