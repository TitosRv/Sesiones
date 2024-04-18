package mx.utng.sesion04;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    /*public void leerMensaje(String mensaje){
        System.out.println(mensaje);
        String saludo = scanner.nextLine();
        System.out.println(saludo);
    }*/

    public Lector(){
        scanner = new Scanner(System.in);
    }

    //Metodo muestra una cadena dada como parametro
    public void muestraMensaje(String mensaje){
        System.out.println(mensaje);
    }

    //leer a partir del scanner
    public String leerEntrada(){
        return scanner.nextLine();
    }

    public void muestraMensaje(String mensaje, String dato){
        System.out.printf("\tEste es el texto: %s %s \n\n\n", mensaje, dato);
    }
}
