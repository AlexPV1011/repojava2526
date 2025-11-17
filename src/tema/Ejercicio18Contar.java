package tema;

public class Ejercicio18Contar {
    public static void main(String[] args) {
    	int[] numeros = new int[100];
        int pares = 0;
        int primos = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100) + 1;

            if (numeros[i] % 2 == 0) {
                pares++;
            }

            if (esPrimo(numeros[i])) {
                primos++;
            }
        }

        System.out.println("ya se generaron 100 numeros");
        System.out.println("números pares: " + pares);
        System.out.println("números primos: " + primos);
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}