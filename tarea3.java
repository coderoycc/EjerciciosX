class Tarea{
    public static void main(String args[]){
        Persona p = new Cliente(21, "Roberto", "+341223235", 234.5);
        Persona p2 = new Trabajador(34, "Rocio", "+2123124123", 1234.99);
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    Persona(){}
    Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public static int getEdad(){
        return this.edad;
    }
    public static String getNombre(){
        return this.nombre;
    }
    public static String getTelefono(){
        return this.telefono;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    private double credito;
    Cliente(int edad, String nombre, String telefono, double credito){
        super(edad,nombre,telefono);
        this.credito=credito;
    }
    public void setCredito(double credito){
        this.credito=credito;
    }
}
class Trabajador extends Persona{
    private double salario;
    Trabajador(int edad, String nombre, String telefono, double salario){
        super(edad,nombre,telefono);
        this.salario = salario;
    }
}
