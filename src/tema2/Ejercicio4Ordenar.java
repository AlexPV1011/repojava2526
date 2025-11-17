package tema2;

import java.util.Scanner;

public class Ejercicio4Ordenar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Introduce un numero:");
		a = sc.nextInt();
		System.out.print("Introduce un numero:");
		b = sc.nextInt();
		System.out.print("Introduce un numero:");
		c = sc.nextInt();
		System.out.println("\nOrden de mayor a menor:");

        if (a >= b && a >= c) {
            if (b >= c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a + " " + c + " " + b);
        } else if (b >= a && b >= c) {
            if (a >= c)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(b + " " + c + " " + a);
        } else {
            if (a >= b)
                System.out.println(c + " " + a + " " + b);
            else
                System.out.println(c + " " + b + " " + a);
        }

        sc.close();
    }
}
	



