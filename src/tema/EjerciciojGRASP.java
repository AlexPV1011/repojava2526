package tema;

import java.util.Scanner;

public class EjerciciojGRASP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int KilosComida;
		System.out.print("Cantidad de comida en kilos:");
		KilosComida = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int numAnimales;
		System.out.print("Numero de animales por alimentar:");
		numAnimales = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int numKilosPorAnimal;
		System.out.print("Media de cuanto come en kilos:");
		numKilosPorAnimal = sc2.nextInt();
		
		if(numKilosPorAnimal * numAnimales < KilosComida) {
			System.out.print("Hay suficiente comida para los animales");
		}
		if(numKilosPorAnimal * numAnimales == KilosComida) {
			System.out.print("Hay suficiente comida para los animales");
		}
		if(numKilosPorAnimal * numAnimales > KilosComida) {
			System.out.print("No hay suficiente comida para los animales");
				}
			sc.close();
			sc1.close();
			sc2.close();


			}

		


	}


