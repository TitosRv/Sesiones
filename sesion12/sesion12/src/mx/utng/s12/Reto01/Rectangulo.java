package mx.utng.s12.Reto01;
/*
 * @author: Carlos Benito Ramirez Vazquez
 * @date: 06/02/2024
 * @group: GDS0624
 */

public class Rectangulo implements Figura {
    double base;
    double altura;
    //Valores por defecto PERO lo ideal es usar getters y setters
    {
        base = 20;
        altura = 15;
    }


    @Override
    public void formulaCalcularArea() {
        System.out.println("La formula para calcular el area de un rectangulo es: base*altura");
    }
}
