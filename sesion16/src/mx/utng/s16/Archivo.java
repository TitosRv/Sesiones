package mx.utng.s16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    public static void main(String[] args) throws IOException {
        //Creacion de una instancia de archivos
        File archivo = new File("C:\\Users\\josue\\Documents\\Programas Tacho\\.java\\sesion16\\src\\mx\\utng\\s16\\cursos.txt");
       //Nombre del archivo
        System.out.println("Nombre del archivo: "+archivo.getName());
        //Ruta del archivo
        System.out.println("Ruta: "+archivo.getPath());
        //Directorio del archivo
        System.out.println("Directorio: "+archivo.getParent());
        //Existencia del archivo?
        System.out.printf("El archivo %s %s existe. %n",archivo.getName(),archivo.exists()?"SI":"NO");
        //El archivo es oculto?
        System.out.printf("El archivo %s %s es oculto. %n",archivo.getName(),archivo.isHidden()?"SI":"NO");

        //Si el archivo existe
        if (archivo.exists()) {
            System.out.printf("El archivo %s es %s%n",archivo.getName(),(archivo.canWrite()?"Escribele":"De solo lectura"));
            System.out.printf("%s %s%n",archivo.getName(),(archivo.isDirectory()?"es un directorio":"es un archivo"));
            System.out.printf("%s tiene un tamaño de %f kbytes %n",archivo.getName(),archivo.length()/1024.0);

            //Crear un escritor de archivos
            FileWriter fw = new FileWriter("C:\\Users\\josue\\Documents\\Programas Tacho\\.java\\sesion16\\src\\mx\\utng\\s16\\archivo.txt");

            //Coloco el objeto que sirve para escribir en el archivo creado
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Proyecto web de Java.\n\n");
            
            bw.write("Este proyecto tiene como objetivo hacer un catalogo de zapatos.");
            bw.newLine();
            bw.write("Integrantes: \n");
            bw.write("- Thalia");
            bw.newLine();
            bw.write("- Paulina Rubio");
            bw.close();

            //Creo un objeto que permita la lectura de archivo
            FileReader fr = new FileReader("C:\\Users\\josue\\Documents\\Programas Tacho\\.java\\sesion16\\src\\mx\\utng\\s16\\archivo.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = null;

            while ((linea = br.readLine())!=null) {
                System.out.println(linea);
            }
        }
    }
}