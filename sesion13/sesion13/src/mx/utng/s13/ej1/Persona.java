package mx.utng.s13.ej1;

/**
 * Persona
 */
public class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    //Metodo o accion
    public void mostrarDatos(){
        System.out.println("Persona: Nombre-> "+nombre+" Apellidos-> "+apellidos);
    }
}