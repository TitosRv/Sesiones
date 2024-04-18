package mx.utng.s13.reto1;
/*
 * @author: Carlos Benito Ramirez Vazquez (TitosRv)
 * @group: GDS0624
 * @date: 09/02/2024
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frutas {
    public static void main(String[] args) {
        
        //Creando la lista de frutas
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Platanos");
        listaFrutas.add("Sandia");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        //Mostrando la lista de manera vertical
        for (int i = 0; i < listaFrutas.size(); i++) {
            System.out.printf("%s%n",listaFrutas.get(i));
        }

        System.out.println("------------ORDEN INVERTIDO DE LOS ELEMENTOS----------------------");
        Collections.reverse(listaFrutas);
        for (int i = 0; i < listaFrutas.size(); i++) {
            System.out.printf("%s%n",listaFrutas.get(i));
        }

        System.out.println("");

        System.out.println("-----------------ELEMENTO MAS CORTO ALFABETICAMENTE-------------------------");
        System.out.println("El elemento mas corto es: "+Collections.min(listaFrutas));
        System.out.println("");

        System.out.println("-------------------ELEMENTO MAS LARGO ALFABETICAMENTE-----------------------");
        System.out.println("El elemento mas largo es: "+Collections.max(listaFrutas));
        System.out.println("");

        System.out.println("------------------ORDENAR LA LISTA ALFABETICAMENTE--------------");
        Collections.sort(listaFrutas);
        System.out.println(listaFrutas);
        System.out.println("");

        System.out.println("--------------EN QUE POSICION DE LA LISTA ESTAN PERA Y NARANJA--------------");
        System.out.println("Pera esta en la posicion: "+Collections.binarySearch(listaFrutas, "Pera"));
        System.out.println("Naranja esta en la posicion: "+Collections.binarySearch(listaFrutas, "Naranja"));
        System.out.println("");

        System.out.println("---------------------AGREGAR TRES MANZANAS NUEVAS A LA LISTA--------------");
        Collections.addAll(listaFrutas, "Manzana", "Manzana", "Manzana");
        System.out.println(listaFrutas);
        System.out.println("");

        System.out.println("-----------DESORDENAR LOS ELEMENTOS DE LA LISTA DE MANERA ALEATORIA------------");
        Collections.shuffle(listaFrutas);
        System.out.println(listaFrutas);
        System.out.println("");

        System.out.println("-----------------BUSCAR CUANTAS MANZANAS HAY EN LA LISTA---------------");
        System.out.println("Hay "+Collections.frequency(listaFrutas, "Manzana")+" Manzanas");
    }
}
