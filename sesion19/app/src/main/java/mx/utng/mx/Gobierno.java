package mx.utng.mx;

public class Gobierno {
    private static Gobierno gobierno;
    
    private Gobierno(){

    }


    public static Gobierno getGobierno(){
        if (gobierno==null) { //En las clases estaticas no se pueden utilizar estancias como .this
            gobierno = new Gobierno();
        }
        return gobierno;
    }

    public void darApoyo(){
        System.out.println("Dando Apoyo");
    }

}
