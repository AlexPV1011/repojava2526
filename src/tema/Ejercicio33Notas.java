package tema;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		int iNota1;
		System.out.print("primer nota:");
		Scanner scEntrada = new Scanner(System.in);
		iNota1 = scEntrada.nextInt();
		int iNota2;
		System.out.print("segunda nota:");
		Scanner scEntrade =new Scanner(System.in);
		iNota2 = scEntrade.nextInt();
		int iResultado = iNota1 + iNota2;
		int iMedia = iResultado /2;
		System.out.println("Tu media es: "+iMedia);
		scEntrada.close();
		

	}

}