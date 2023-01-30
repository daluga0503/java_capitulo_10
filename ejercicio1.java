import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();

    a.add("Daniel");
    a.add("Carlos");
    a.add("Antonio");
    a.add("Pablo");
    a.add("Miguel");
    a.add("Alonso");

    System.out.println("Contenido de la lista: ");

    for(String nombre : a) {
        System.out.println(nombre);
        }
    } 
}