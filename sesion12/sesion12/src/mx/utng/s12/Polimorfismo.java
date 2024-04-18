package mx.utng.s12;

/* import java.util.Scanner; */

public class Polimorfismo {
    public static void main(String[] args) {
        //Crear un objeto de la clase Venado llamado v
        Venado v = new Venado();

        Animal a = v;

        Hervivoro h = v;

        Object o = v;



        System.out.println("Venado: "+ (v instanceof Venado));
        System.out.println("Animal: "+ (a instanceof Animal));
        System.out.println("Hervivoro: "+ (h instanceof Animal));
        System.out.println("Object: "+ (o instanceof Animal));
        //System.out.println("Scanner: "+(v instanceof Scanner));
    }
}
