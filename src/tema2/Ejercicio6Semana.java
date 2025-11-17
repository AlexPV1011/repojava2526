package tema2;

import java.util.Scanner;

public class Ejercicio6Semana {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a;
			System.out.print("Introduce un numero:");
			a = sc.nextInt();
			System.out.print("");

			if (a == 1) {
				System.out.print("lunes");
			}
			if (a == 2) {
				System.out.print("martes");
			}
			if (a == 3) {
				System.out.print("miercoles");
			}
			if (a == 4) {
				System.out.print("jueves");
			}
			if (a == 5) {
				System.out.print("viernes");
			}
			if (a == 6) {
				System.out.print("sabado");
			}
			if (a == 7) {
				System.out.print("domingo");
			}
			if (a > 7) {
				System.out.print("error");
			}
			sc.close();
				
			}
		}