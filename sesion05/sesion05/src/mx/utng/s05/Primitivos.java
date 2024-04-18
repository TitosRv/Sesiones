package mx.utng.s05;

public class Primitivos {
    public static void main(String[] args) {
        //Entero muy pequeño (-128 a 127)
        byte valorByte = -128;
        System.out.println(valorByte);

       //Entero corto rango es (-32768 al 32767)
       short valorShort = 30000;
       System.out.println(valorShort);

       //Entero base rango (-2147483648 al 2147483647)
       int valorInt = 2000000000;
       System.out.println(valorInt);

       //Entero mas largo (-9223372036854775808	al 9223372036854775807)
       long valorLong = 1000000000000000000L;
       System.out.println(valorLong);

       //Numero real tienen punto decimal
       float valorFloat = 1.2f;
       System.out.println(valorFloat);

       //Numero real con precision doble
       double valorDouble = 2.5;
       System.out.println(valorDouble);


        //HASTA AQUI LLEGAN LOS PRIMITIVOS


       //Valor booleano con solo dos valores posibles true/false
       boolean valorBoolean = true;
       System.out.println(valorBoolean);

       //Primitivo para texto
       char valorChar = 'h';
       System.out.println(valorChar);

       System.out.printf("Valor booleano: %b %nValor caracter: %c%n",valorBoolean, valorChar);

       float numFloat = 1;
       int numInt1 = (int)numFloat;
       System.out.printf("Flotante: %f, Entero: %d%n",numFloat, numInt1);

       char numChar = 'M';
       numChar++;
       int numInt2 = numChar;
       System.out.printf("Char: %1.1f, Entero: %d%n",numChar, numInt2);
    }
}
