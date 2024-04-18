package mx.utng.s11.Reto1;

import java.time.LocalDate;
import java.time.Month;

public class PruebaHerencia {
    public static void main(String[] args) {
        Programador programador = new Programador("carlitos", (byte)10, LocalDate.of(2005, Month.OCTOBER, 24), 60000.00f, "C++");

        System.out.println("Datos del Programador: ");
        System.out.println("Nombre: "+programador.getNombre());
        System.out.println("Edad: "+programador.getEdad());
        System.out.println("Fecha de Nacimiento: "+programador.getFechaDeNacimiento());
        System.out.println("Salario: "+programador.getSalario());
        System.out.println("Lenguaje Principal: "+programador.getLenguajePrincipal());
    

    DBA dba = new DBA("Ulises Chaidez", (byte)15, LocalDate.of(2001, Month.JUNE, 15), 100.0f, "MySQL");

    System.out.println("Datos del Admin: ");
        System.out.println("Nombre: "+dba.getNombre());
        System.out.println("Edad: "+dba.getEdad());
        System.out.println("Fecha de Nacimiento: "+dba.getFechaDeNacimiento());
        System.out.println("Salario: "+dba.getSalario());
        System.out.println("Herramienta de consulta: "+dba.getHerramientaConsultas());
    }
}

