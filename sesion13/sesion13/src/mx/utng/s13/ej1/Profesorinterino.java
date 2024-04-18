package mx.utng.s13.ej1;

//Importacion de la funcion localdate, para obtener la fecha actual
import java.time.LocalDate;

public class Profesorinterino extends Profesor{
    private LocalDate fechaTerminacion;


    

    public Profesorinterino(String nombre, String apellidos, String idProfesor, LocalDate fechaTerminacion) {
        super(nombre, apellidos, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }

    public LocalDate getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(LocalDate fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Profesor Interino: fecha de Terminacion de contrato-> "+fechaTerminacion);
    }
    
}
