package mx.utng.s12.Reto01;
/*
 * @author: Carlos Benito Ramirez Vazquez
 * @date: 06/02/2024
 * @group: GDS0624
 */

public class Triangulo implements Figura {
    private double base;
    private double altura;
    //Valores por defecto, PERO lo ideal es aplicar getters y setters
    {
        base = 10;
        altura = 20;
    }

    @Override
    public void formulaCalcularArea() {
        System.out.printf("El area de un triangulo con base: %.1f y con altura: %.1f es: %.1f.%n",base,altura,(base*altura/2));
    }
}


