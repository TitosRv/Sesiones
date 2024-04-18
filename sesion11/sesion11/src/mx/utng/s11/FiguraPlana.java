package mx.utng.s11;

public class FiguraPlana {
    private final double BASE; //El final es para declarar que es una constante
    private final double ALTURA;

    public FiguraPlana(double base, double altura) {
        this.BASE = base;//el this. es para asegurarse que estamos usando las variables de esta clase
        this.ALTURA = altura;
    }


    public double getBASE() {
        return BASE;
    }

    public double getALTURA() {
        return ALTURA;
    }

    public void mostrarDimension(){
        System.out.printf("La base de la figura es: %.1f y la altura es: %.1f.%n", BASE, ALTURA);
    }
}
