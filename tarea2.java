class Tarea{
    public static void main(String args[]){
        Persona p = new Persona();
        p.setEdad(12);
        p.setNombre("Roberto");
        p.setTelefono("+12458930");
        System.out.println("Nombre: "+p.getNombre()+"\nEdad: "+p.getEdad()+"\nTelefono: "+p.getTelefono());
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
