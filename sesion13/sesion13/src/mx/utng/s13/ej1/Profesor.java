package mx.utng.s13.ej1;
/* @name: Carlos Benito Ramirez Vazquez
 * @grupo: GDS0624
 * @date:08/02/2024
 */
public class Profesor extends Persona{
    
    private String idProfesor;

    //Este es el constructor de esta clase llamada Profesor
    public Profesor(String nombre, String apellidos, String idProfesor) {
        super(nombre, apellidos);
        //el this. es para llamar la variable de esta clase
        this.idProfesor = idProfesor;
    }

    //GET
    public String getIdProfesor() {
        return idProfesor;
    }

    //SET
    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    //sobreescribimos este metodo de la clase persona por que queremos saber los datos de esa clase y la de esta clase
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Profesor: Id del profesor:\n "+idProfesor);
    }


}
