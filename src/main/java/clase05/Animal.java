package clase05;

public class Animal {
    //constructor
    private String nombre;
    private  String raza;

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    //methods
    public Animal(String nombre , String raza){
        this.nombre = nombre;
        this.raza = raza;
    }

    //this is for extends other clases
    public Animal(){
        super();
    }


}
