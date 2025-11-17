package tema;

import java.util.Scanner;

public class Ejercicio14Primoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Primo;
		System.out.print("numero deseado:");
		Primo = sc.nextInt();
		boolean primo = true;
		if (Primo <= 1) {
		primo=false;
		} else if (Primo !=2) {
			primo=false;
		}else {
			int i =3;
			while (i <=Math.sqrt(Primo)) {
				if (Primo % i ==0) {
					primo=false;
				}
				i+=2;
			}
		}
		if (primo) {
			System.out.print(Primo+" es primo");
	} else {
		System.out.print(Primo+" no es primo");
	}
	sc.close();
		
	}
	
}