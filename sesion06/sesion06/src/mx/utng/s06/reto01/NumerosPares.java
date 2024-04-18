package mx.utng.s06.reto01;
//Carlos Benito Ramirez Vazquez GDS0624 
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        /*Utilizando el modulo(MOD) poner todos los numeros pares
        que hay en un rango dado*/
        //variables: inicio, fin, i
        //ciclo for y if

        //Cree un nuevo scanner para leer datos
        Scanner s = new Scanner(System.in);
        System.out.print("Teclee desde que numero quiere iniciar: ");
        //Variable start para leer el primer dato
        int start = s.nextInt();
        System.out.println("");
        System.out.print("Teclee hasta que numero quiere terminar: ");
        //Variable end para leer el utlimo dato
        int end = s.nextInt();
        s.close();

        for (int i = start; i<=end; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
