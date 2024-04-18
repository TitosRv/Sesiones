package mx.utng.s12.Reto01;
/*
 * @author: Carlos Benito Ramirez Vazquez
 * @date: 06/02/2024
 * @group: GDS0624
 */
public class PruebaFigura {
    public static void main(String[] args) {
        Figura figura;

        System.out.println("Triangulo");
        figura = new Triangulo();
        figura.formulaCalcularArea();

        System.out.println("");

        System.out.println("Rectangulo");
        figura = new Triangulo();
        figura.formulaCalcularArea();

        System.out.println("");

        System.out.println("Cuadrado");
        figura = new Cuadrado();
        figura.formulaCalcularArea();
    }
}
