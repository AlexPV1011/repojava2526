package tema2;

import java.util.Scanner;

public class Ejercicio2Iguales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("Introduce un numero:");
		n1 = sc.nextInt();
		System.out.print("Introduce un numero:");
		n2 = sc.nextInt();
		if (n1 == n2) {
			System.out.print("Son iguales");
		}
		else {
			System.out.print("No son iguales");
		}
		sc.close();
			
		}
	}


