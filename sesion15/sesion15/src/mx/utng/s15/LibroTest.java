package mx.utng.s15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibroTest {
    public static void main(String[] args) {
        Queue<Libro> libros = new PriorityQueue<>(); 

        libros.add(new Libro("Libro 1", 1));
        libros.add(new Libro("Libro 2", 4));
        libros.add(new Libro("Libro 3", 2));
        libros.add(new Libro("Libro 4", 4));
        libros.add(new Libro("Libro 5", 2));
        libros.add(new Libro("Libro 6", 7));
        libros.add(new Libro("Libro 7", 8));
        libros.add(new Libro("Libro 8", 6));
        libros.add(new Libro("Libro 9", 10));
        libros.add(new Libro("Libro 10", 9));

        Libro libro = null;

        while ((libro = libros.poll())!=null) {
            System.out.println(libro.getTitulo());
        }
    }
}
