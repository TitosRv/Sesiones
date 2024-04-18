package mx.utng.s13.ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        //el string es el tipo de dato que tendra la lista
        //Se utilizo una lista de cadenas
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Uno");
        listaCadenas.add("Dos");
        listaCadenas.add("Tres");
        listaCadenas.add("Cuatro");
        listaCadenas.add("Cinco");

        //muestra los numeros con salto de linea
        System.out.println("-----------For i---------------");
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.printf("%s%n",listaCadenas.get(i));
        }

        //muestra los numeros con salto de linea pero el codigo es mas corto
        System.out.println("----------------For Each--------------------");
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }

        System.out.println("========================SET DE CADENAS========================");
        //Utilizaremos un cojunto de cadenas
        //la interfaz es Set
        Set<String> setCadenas = new HashSet<>();
        setCadenas.add("Uno");
        setCadenas.add("Dos");
        //Este dos no se puede repetir por que el set no puede permitir datos repetidos
        setCadenas.add("Dos");
        setCadenas.add("Tres");
        setCadenas.add("Cuatro");
        setCadenas.add("Cinco");


        //Foreach para imprimir los valores
        for (String cadena : setCadenas) {
            System.out.println(cadena);
        }

        System.out.println("========================LISTA DE NUMEROS========================");
        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("Uno"));
        listaNumeros.add(new Numero("Dos"));
        listaNumeros.add(new Numero("Dos"));
        listaNumeros.add(new Numero("Tres"));
        listaNumeros.add(new Numero("Cuatro"));
        listaNumeros.add(new Numero("Cinco"));

        for (Numero numero : listaNumeros) {
            System.out.println(numero.getNombre());
        }


        System.out.println("========================SET(CONJUNTO) DE NUMEROS========================");
        Set<Numero> setNumeros = new HashSet<>();
        Numero n6 = new Numero("Seis");
        Numero n7 = n6;
        setNumeros.add(new Numero("Uno"));
        setNumeros.add(new Numero("Dos"));
        setNumeros.add(new Numero("Dos"));
        setNumeros.add(new Numero("Tres"));
        setNumeros.add(new Numero("Cuatro"));
        setNumeros.add(new Numero("Cinco"));
        setNumeros.add(n6);
        setNumeros.add(n7);

        for (Numero numero : setNumeros) {
            System.out.println(numero.getNombre());
        }
    }
}
