package mx.utng.s15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonaTest {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", "Vazquez", 1.83f);
        Persona persona2 = new Persona("Ruben", "Ramirez", 1.75f);
        Persona persona3 = new Persona("Ghandi", "Madrid", 1.70f);
        Persona persona4 = new Persona("Yualetta", "Glushak", 1.69f);
        Persona persona5 = new Persona("Schoenstatt", "Madrid", 1.59f);

        //Crear la lista de personas 
        List<Persona> personas = new ArrayList<>();
        //agregar personas a la lista
        Collections.addAll(personas, persona1,persona2,persona3,persona4,persona5);

        //Imprimir personas en la pantalla
        for (Persona persona : personas) {
            System.out.println(persona.getNombre()+" "+persona.getApellido()+" :"+persona.getEstatura());
        }

        //Comparando personas
        for (Persona persona : personas) {
            System.out.println(persona1.compareTo(persona));
        }

        //Ordenar por nombre alfabeticamente 
        Collections.sort(personas, new ComparadorPersonas());
        for (Persona persona : personas) {
            System.out.println(persona.getNombre()+" "+persona.getApellido()+" :"+persona.getEstatura());
        }
    }
}
