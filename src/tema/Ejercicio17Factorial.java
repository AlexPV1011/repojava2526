package tema;

import java.util.Scanner;

public class Ejercicio17Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un numero:");
		int num1 = sc.nextInt();
		
		long factorial = 1;

        for (int i = 1; i <= num1; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num1 + " es: " + factorial);
        
        sc.close();
    }

	}


