package mx.utng.s09;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;

    public void usar(){
        litrosActuales--;
        System.out.printf("Quedan %d litros.%n", litrosActuales);
    }

    //setters y getters
    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public short getLitrosActuales() {
        return litrosActuales;
    }
}
