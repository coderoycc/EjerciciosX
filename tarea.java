class Tarea{
    public static void main(String args[]){
        System.out.println(suma(12,11,10));
        //Tarea 2
        Coche c = new Coche(0);
        c.incremento();
        
    }
    public static int suma(int v1, int v2, int v3){
        return (v1+v2+v3);
    }
}
class Coche{
    public int nroPuertas;
    Coche(int nroPuertas){
        this.nroPuertas = nroPuertas;
    }
    public void incremento(){
        this.nroPuertas++;
    }
}
