package mx.utng.pd.absfactory;

public class AutoEconomico implements Auto{
    
    private String nombre;

    
    public AutoEconomico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCaracteristicas() {
        return nombre;
    }

    @Override
    public String getNombre() {
       return "Auto economico con pocas caracteristicas";
    }

}
