package tema;

import java.util.Scanner;

public class Ejercicio35NumPar{

	public static void main(String[] args) {
		int iNum1;
		System.out.print("Escribe num:");
		iNum1 = new Scanner(System.in).nextInt();
		boolean bEsPar = (iNum1 % 2) == 0;
		System.out.print("es par:"+bEsPar);
		
		int iPrueba = (5%2);
		System.out.println("5%2"+iPrueba);
		
	} 

}
