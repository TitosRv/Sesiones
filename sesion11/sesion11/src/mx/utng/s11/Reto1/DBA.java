package mx.utng.s11.Reto1;

import java.time.LocalDate;

public class DBA extends Empleado{
    private String herramientaConsultas;

    public DBA(String nombre, byte edad, LocalDate fechaDeNacimiento, float salario, String herramientaConsultas) {
        super(nombre, edad, fechaDeNacimiento, salario);
        this.herramientaConsultas = herramientaConsultas;
    }

    public String getHerramientaConsultas() {
        return herramientaConsultas;
    }

    public void setHerramientaConsultas(String herramientaConsultas) {
        this.herramientaConsultas = herramientaConsultas;
    }
    
    
}
