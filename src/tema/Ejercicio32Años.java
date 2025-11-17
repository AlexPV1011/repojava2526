package tema;

import java.util.Scanner;

public class Ejercicio32Años {

	public static void main(String[] args) {
		int iNac;
		System.out.print("escribe el año de tu nacimiento=");
		Scanner scEntrada = new Scanner(System.in);
		iNac = scEntrada.nextInt();
		int iSig;
		System.out.print("año que viene=");
		Scanner scEntrade =new Scanner(System.in);
		iSig = scEntrade.nextInt();
		int iEdadproxanyo = iSig - iNac;
		System.out.println("la edad que tendra es: "+iEdadproxanyo);
		scEntrada.close();
		

	}

}
