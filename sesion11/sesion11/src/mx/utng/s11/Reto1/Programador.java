package mx.utng.s11.Reto1;

import java.time.LocalDate;

public class Programador extends Empleado{
    private String lenguajePrincipal;

    public Programador(String nombre, byte edad, LocalDate fechaDeNacimiento, float salario, String lenguajePrincipal) {
        super(nombre, edad, fechaDeNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    
    
}
