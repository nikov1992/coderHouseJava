package clase05;

public class Gato {

    private Integer patas = 4;
    private Integer cola = 1;
    private Integer pesp = 50;
    private String bigotes = "largos";


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


    public void mauyar(){
        System.out.println("miauuu");
    }
    public static void main(String[] args){

        Gato gaturro = new Gato();
        gaturro.mauyar();

    }


}
