public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //instanciando un objeto
        persona personita = new persona();
        personita.setEdad(25);
        personita.setNombre("maria");
        personita.setTelefono(78788787);

        System.out.println("\n El objeto es :"+ personita.getNombre()+" \n la edad es :"+personita.getEdad()+" \n el telefono es :"+ personita.getTelefono());
//
    }

}

class persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int  edad){ this.edad = edad; }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){return this.telefono;}
}
