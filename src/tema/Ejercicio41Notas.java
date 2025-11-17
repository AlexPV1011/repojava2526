package tema;

import java.util.Scanner;

public class Ejercicio41Notas {

	public static void main(String[] args) {
			int iNota1;
			System.out.print("primer nota:");
			Scanner scEntrada = new Scanner(System.in);
			iNota1 = scEntrada.nextInt();
			int iNota2;
			System.out.print("segunda nota:");
			Scanner scEntrade =new Scanner(System.in);
			iNota2 = scEntrade.nextInt();
			int iNota3;
			System.out.print("tercer nota:");
			Scanner scEntradi = new Scanner(System.in);
			iNota3 = scEntradi.nextInt();
			double dExp = (iNota1 + iNota2 + iNota3) /3; 
			int iBol = (iNota1 + iNota2 + iNota3) /3;
			System.out.println("Tu media en expediente es: "+dExp);
			Scanner scEntrado = new Scanner(System.in);
			System.out.println("Tu media en boletin es: "+dExp);
			Scanner scEntradu = new Scanner(System.in);
			scEntrada.close();

		}

	}
