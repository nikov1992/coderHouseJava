package clase05;


public class Perro extends Animal {

    private Integer patas = 4;
    private Integer cola = 1;
    private Integer pesp = 50;
    private String bigotes = "cortos";


    //llama al constructor del padre
    public Perro(){
        super();
    }



    public Integer getCola() {
        return cola;
    }

    public Integer getPatas() {
        return patas;
    }

    public Integer getPesp() {
        return pesp;
    }

    public String getBigotes() {
        return bigotes;
    }


    public void ladrar(){
        System.out.println("wuuau");
    }
    public static void main(String[] args){

        Perro animal1 = new Perro();
        Animal animal2 = new Animal("sas" , "saww");

        System.out.println(animal2.getNombre());


    }


}
