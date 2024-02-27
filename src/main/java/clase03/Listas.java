package clase03;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {


    List<String>colores = new ArrayList<>();

        colores.add("Blanco");
        colores.add("Rojo");
        colores.add("Negrooo");

        Iterator<String> iterator = colores.iterator();

        for(String color: colores){
            System.out.println("los colores son: " + color);
        }

        System.out.println("El tanio de colores es: " + colores.size());

       /* while(iterator.hasNext()){
            String color = iterator.next();
            System.out.println("Color" + color);
        }*/

        do{
            System.out.println("ESTOY EN EL DO");
            String color = iterator.next();
            System.out.println("Color" + color);
        }while(iterator.hasNext());


    }



}
