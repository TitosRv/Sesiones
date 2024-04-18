package mx.utng.s13.ej1;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo{
    
    public static void main(String[] args) {
        Profesor profe1 = new Profesor("Daniel", "Sustaita", "UTNG-00541");
        profe1.mostrarDatos();

        System.out.println("");

        Profesor profe2 = new Profesorinterino("Victor", "Sapo", "NETACAD", LocalDate.of(2024, Month.FEBRUARY, 25));
        profe2.mostrarDatos();

        System.out.println("");

        Persona p = new Persona("Schoenstatt", "Madrid");
        p = new Profesor(p.getNombre(), p.getApellidos(), "UDHI-001");
        p.mostrarDatos();
    }
}
