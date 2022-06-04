public class EJT3 {
    public static void main(String[] args) {
        //parte1
        int resultado = 0;
        resultado = sumas(5, 7, 14);
        System.out.println(resultado);

        //parte2
        coche miCoche = new coche();
        miCoche.sumarPuerta();
        System.out.println("El número de puertas es: " + miCoche.puertas);
    }

    //parte1
    static int sumas(int a, int b, int c) {

        return a + b + c;
    }

    //parte2
    static class coche {
        public int puertas = 4;

        public void sumarPuerta() {
            this.puertas++;
        }
    }
}
