package tema2;

import java.util.Scanner;

public class Ejercicio3Mayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("Introduce un numero:");
		n1 = sc.nextInt();
		System.out.print("Introduce un numero:");
		n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.print(n1+" es mayor que "+n2);
		}
		if(n1 < n2) {
			System.out.print(n1+" es menor que "+n2);
		}
		else {
			System.out.print("son iguales");
		}
			sc.close();
			
		}
	


	}


