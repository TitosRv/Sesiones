package mx.utng.s09;

public class Vehiculo {
    private Combustible combustible = new Combustible();
    private Llanta[] llantas = new Llanta[4];
    private String marca;
    private String modelo;
    private int anioFabricacion;


    //Constructor
    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }


    //Metodos setters y getters
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void colocarLlantas(Llanta delanteraIzquierda, 
    Llanta delanteraDerecha, 
    Llanta traseraIzquierda, 
    Llanta traseraDerecha){
        llantas[0] = delanteraIzquierda;
        llantas[1] = delanteraDerecha;
        llantas[2] = traseraIzquierda;
        llantas[3] = traseraDerecha;
    }

    public void llenarTanque(){
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    public void avanzar(){
        if (combustible.getLitrosActuales()>0) {
            for (Llanta llanta : llantas) {
                llanta.rodar();
            }
            combustible.usar();
        }else{
            System.out.println("No hay combustible");
        }
    }
}
