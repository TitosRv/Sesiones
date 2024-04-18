package mx.utng.s17;
/*
 * @author: Carlos Benito Ramirez Vazquez
 * @grade: GDS0624
 * @date: 16/02/2024
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Reto2 {
    public static void main(String[] args) throws IOException{
        
        //Crear una instancia de archivos
        File archivo = new File("src\\mx\\utng\\s17\\poema.txt");

        //Nombre del archivo
        System.out.println("Nombre del archivo: "+archivo.getName());

        //Ruta del archivo
        System.out.println("Ruta: "+archivo.getPath());

        //Crear un escritor de archivos
        FileWriter fw = new FileWriter("src\\mx\\utng\\s17\\poema.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Escrito por: Carlos Benito Ramirez Vazquez - CBRV \n");
        bw.newLine();
        bw.write("Poema Amoroso.\n\n");
        bw.write("A esa dama de ojos colorados \n");
        bw.write("Que tiene muchos encantos \n");
        bw.write("Su sonrisa opaca todos sus llantos \n");
        bw.write("Su forma de ser \n");
        bw.write("Es lo mejor que puedo ver \n");
        bw.newLine();
        bw.write("Su corazon tierno \n");
        bw.write("Yo protegere \n");
        bw.write("Su alma pura \n");
        bw.write("Yo admirare \n");
        bw.write("Su vida entera \n");
        bw.write("Yo la amare \n");
        
        //Creo un objeto que permita la lectura de archivo
        FileReader fr = new FileReader("src\\mx\\utng\\s17\\poema.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea = null;

        while ((linea = br.readLine())!=null) {
            System.out.println(linea);
        }
        bw.close();
        br.close();
    }
}
