package mx.utng.reto02febrero;

public class Valor {
    public class Bloques {
        private static final int valor = 42; 
    
        static{
            valor = 42;
        }
        public static void muestaValor() {
            System.out.println("El valor es: " + valor);
        }

        public static void main(String[] args) {
            Bloques bloques = new Bloques();
            Bloques.muestaValor();
        }
    }
}
