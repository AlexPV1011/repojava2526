package tema;

import java.util.Scanner;


public class Ejercicio2Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		System.out.print("Escribe un numero del 1 al 10: ");
	    Scanner scEntrada = new Scanner(System.in);
	    iNum = scEntrada.nextInt();
	    System.out.println("El numero leido es:"+iNum);
	    scEntrada.close();
	}

}
