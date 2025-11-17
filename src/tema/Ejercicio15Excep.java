package tema;

import java.util.Scanner;

public class Ejercicio15Excep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un numero:");
		int num1 = sc.nextInt();
		System.out.print("introduce un numero:");
		int num2 = sc.nextInt();
		int resultado= num1/num2;
		sc.close();
	}

}
