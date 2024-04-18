package mx.utng.sesion08;

public class Area {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5);
        System.out.println("Area: "+r.area());
    }
}

class Rectangulo{
    private int lado;

    public Rectangulo(){
        this.lado = 0;
    }


    

    public Rectangulo(int lado){
        this.lado = lado;
    }

    public int area(){
        return lado*lado;
        //return (int)Math.pow(lado, 2); 
    }
}
