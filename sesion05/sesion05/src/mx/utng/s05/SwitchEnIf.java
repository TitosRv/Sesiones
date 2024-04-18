package mx.utng.s05;
//Carlos Benito Ramirez Vazquez GDS0624 TAREA RETO SWITCH EN IF
import java.util.Scanner;

public class SwitchEnIf {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Teclea tu calificacion en programacion: ");
        int cali = lector.nextInt();
        lector.close();
        String mensaje = "";

        if (cali<=10) {
            mensaje = "Excelente";
        }
        if (cali<=9 && cali<=8) {
            mensaje = "Muy bien";
        }
        if (cali<=7) {
            mensaje = "Bien hecho";
        }
        if (cali<=6) {
            mensaje = "Pasaste";
        }
        if (cali<=5) {
            mensaje = "Mejor vuelve a cursar";
        }
        System.out.println(mensaje);
    }
}
