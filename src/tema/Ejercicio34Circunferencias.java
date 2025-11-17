package tema;

import java.util.Scanner;

public class Ejercicio34Circunferencias {

		public static void main(String[] args) {
			int iRadio;
			System.out.print("Radio:");
			Scanner scEntrada = new Scanner(System.in);
			iRadio = scEntrada.nextInt();
			double dLong = (iRadio * 2) * 3.1415;
			System.out.println("Tu longitud de circunferencia es: "+dLong);
			scEntrada.close();
			

	}

}
