package tema;

import java.util.Scanner;

public class Ejercicio44MayorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca el primer numero: ");
		int iNum1 = sc.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int iNum2 = sc.nextInt();
		sc.close();
		
		int iMayor = iNum1 > iNum2 ? iNum2 : iNum2;
		int iMenor  ;
		
	}

}
