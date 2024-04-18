import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //Este es un arreglo
        String[] cadenas = new String[5];
        cadenas[0] = "Zanahoria";
        cadenas[1] = "Cilantro";
        cadenas[2] = "Lechuga";
        cadenas[3] = "Repollo";
        cadenas[4] = "Coliflor";

        //Ver el valor maximo de un entero
        System.out.println(Integer.MAX_VALUE);

        //Imprimir el arreglo cadenas
        System.out.println(cadenas);

        System.out.println("---------------For Each----------------");
        for (String c : cadenas) {
            System.out.println(c);
        }

        System.out.println("------------------For i--------------------------------");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }

        System.out.println("-----------LIST-------------------");
        List<String> verduras = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            verduras.add("Verdura "+(i+1));
        }

        for (String v : verduras) {
            System.out.println(v);
        }

        System.out.println("-------Cambiar valor de una celda del arraylist------------");
        verduras.set(0, "Zanahoria");
        verduras.set(1, "Cilantro");
        verduras.set(2, "Cebolla");
        verduras.set(3, "Ajo");
        for (String v : verduras) {
            System.out.println(v);
        }

        System.out.println("--------------REMOVER---------------");
       verduras.remove(4);
       for (String v : verduras) {
            System.out.println(v);
       }

       verduras.remove("Verdura 7");

       Collections.addAll(verduras, "Repollo", "Lechuga", "Coliflor");
       for (int i = 4; i < 8; i++) {
            verduras.remove(i);
       }

       for (String v : verduras) {
            System.out.println(v);
       }

       System.out.println("--------------------------");
       Collections.reverse(verduras);
       System.out.println(verduras);

       System.out.println("-------------SABER QUE ELEMENTO ES MAS CORTO Y MAS LARGO---------------");
       System.out.println("El mas pequeño es: "+Collections.min(verduras));
       System.out.println("El mas grande es: "+Collections.max(verduras));
       Collections.sort(verduras);
       System.out.println(verduras);

       System.out.println("--------------SABER POSICIONES---------------");
       System.out.println("El cilantro esta en la posicion: "+Collections.binarySearch(verduras, "Cilantro"));

       System.out.println("-------------AGREGAR ELEMENTOS---------------");
       Collections.addAll(verduras, "Lechuga","Lechuga","Lechuga");
       System.out.println(verduras);

       System.out.println("--------------DESORDENAR-----------");
       Collections.shuffle(verduras);
       System.out.println(verduras);
       
       System.out.println("------------SABER CUANTOS ELEMENTOS HAY------------");
       System.out.println("Hay "+Collections.frequency(verduras, "Lechuga")+ " Lechugas");
    }
}
