package mx.utng.s12.Reto01;
/*
 * @author: Carlos Benito Ramirez Vazquez
 * @date: 06/02/2024
 * @group: GDS0624
 */

public class Cuadrado implements Figura{
    private double lado;
    //Valores por defecto PERO lo ideal es tener getters y setters
    {
        lado = 50;
    }

    @Override
    public void formulaCalcularArea() {
        System.out.printf("El area de un cuadrado con lado: %.1f es: %.1f.%n",lado,(lado*lado));
    }
    
}
