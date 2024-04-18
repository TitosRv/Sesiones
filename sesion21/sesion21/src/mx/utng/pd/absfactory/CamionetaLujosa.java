package mx.utng.pd.absfactory;

public class CamionetaLujosa implements Camioneta{
    
private String nombre;

public CamionetaLujosa(String nombre) {
    this.nombre = nombre;
}

@Override
public String getCaracteristicas() {
    return nombre;
}

@Override
public String getNombre() {
    return "Camioneta con muchas caracteristicas de lujo";
}
}



