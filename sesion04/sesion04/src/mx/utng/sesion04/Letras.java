package mx.utng.sesion04;

public class Letras {
    public static void main(String[] args) {
        //Declarar objetos necesarios
        Lector lector = new Lector(); //Se crea y inicia el objeto
        ContadorCaracteres contador = new ContadorCaracteres(); //Nuevo objeto
        //Uso el lector para imprimir texto y leer valores
        lector.muestraMensaje("Teclea una palabra: ");
        String palabra = lector.leerEntrada();

        //Usar el contador para saber cuantos caracteres hay por cada tipo
        int vocales = contador.cuentaVocales(palabra);
        lector.muestraMensaje("El numero de vocales es: "+vocales);

        int consonantes = contador.cuentaConsonantes(palabra);
        lector.muestraMensaje("El numero de consonantes es: "+consonantes);

        int numero = contador.cuentaNumeros(palabra);
        lector.muestraMensaje("La cantidad de numeros es: "+numero);

        int simbolos = contador.cuentaSimbolos(palabra);
        lector.muestraMensaje("El numero de simbolos es: "+simbolos);
    }
}
