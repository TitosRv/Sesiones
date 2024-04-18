package mx.utng.s11.Reto1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private byte edad;
    private final LocalDate fechaDeNacimiento;


    
    public Persona(String nombre, byte edad, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public byte getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

}
