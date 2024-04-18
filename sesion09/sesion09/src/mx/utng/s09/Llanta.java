package mx.utng.s09;

public class Llanta {
    private float ancho;
    private float diametro;
    private float presion;


    
    public Llanta(float ancho, float diametro, float presion) {
        this.ancho = ancho;
        this.diametro = diametro;
        this.presion = presion;
    }

    public void rodar(){
        System.out.println("Rodando");
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public float getAncho() {
        return ancho;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    public float getDiametro() {
        return diametro;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }
    public float getPresion() {
        return presion;
    }
}
