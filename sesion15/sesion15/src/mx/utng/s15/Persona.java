package mx.utng.s15;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private float estatura;

    public Persona(String nombre, String apellido, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getEstatura() {
        return estatura;
    }

    //metodo implements Override
    @Override
    public int compareTo(Persona o) {
        return Float.compare(this.estatura, o.estatura);
    }
}
