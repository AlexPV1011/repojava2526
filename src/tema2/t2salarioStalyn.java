package tema2;

import java.util.Scanner;

public class t2salarioStalyn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double horas;
		System.out.print("Horas trabajadas esta semana:");
		horas = sc.nextInt();
		double precio;
		System.out.print("Precio hora tarifa normal:");
		precio = sc.nextInt();
		double salario500;
		salario500 = horas * precio;
		double salario900;
		salario900 = salario500 + (400*75)/100;
		if (precio < 500) {
			System.out.print("el salario bruto es: " +salario500);
		}
		if (precio > 500) {
			System.out.print("el salario bruto es: "+salario900);
		}
		if (precio < 900) {
			System.out.print("el salario bruto es: "+salario900);
		}
		
		sc.close();

	}

}
