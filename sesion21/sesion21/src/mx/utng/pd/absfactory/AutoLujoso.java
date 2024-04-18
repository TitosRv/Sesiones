package mx.utng.pd.absfactory;

public class AutoLujoso implements Auto{
    
private String nombre;

public AutoLujoso(String nombre) {
    this.nombre = nombre;
}

@Override
public String getCaracteristicas() {
    return nombre;
}

@Override
public String getNombre() {
    return "Auto con muchas caracteristicas de lujo";
}
}


