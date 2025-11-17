package tema;

import java.util.Scanner;

public class Ejercicio8Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		System.out.print("Introduce la nota numerica del 0 al 10:");
		nota = sc.nextInt();
		switch(nota) {
		case 0, 1, 2, 3, 4: System.out.println("Insuficiente");
		case 5: System.out.println("Suficiente");
		case 6: System.out.println("Bien");
		case 7, 8: System.out.println("Notable");
		case 9, 10: System.out.println("Sobresaliente");
		default: System.out.println("error");}
				
				sc.close();
					
				}
			

	}


