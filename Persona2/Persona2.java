class Persona2 {
    
    String Nombre;
     // Declarar variables
    String Apellido; 
    // Declarar variables
    int Edad; 
    // Declarar variables
    Persona2() { 
        // Constructor vacio
    }
    Persona2(String Nombre, String Apellido, int Edad) { 
        // Constructor con parametros
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        // Asignar el valor de las variables a los parametros
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public int getEdad() {
        return Edad;
    }
    @Override
    public String toString() {
        return "Persona2 [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + "]";
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
}