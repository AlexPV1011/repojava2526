package tema2;

import java.util.Scanner;

public class Ejercicio5Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Introduce un numero:");
		a = sc.nextInt();
		System.out.print("");

		if (a < 5) {
			System.out.print("suspenso");
		}
		if (a == 5) {
			System.out.print("bien");
		}
		if (a == 6) {
			System.out.print("bien");
		}
		if (a == 7) {
			System.out.print("notable");
		}
		if (a == 8) {
			System.out.print("notable");
		}
		if (a == 9) {
			System.out.print("sobresaliente");
		}
		if (a == 10) {
			System.out.print("sobresaliente");
		}
		sc.close();
			
		}
	}