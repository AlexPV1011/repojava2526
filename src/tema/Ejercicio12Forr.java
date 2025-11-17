package tema;

public class Ejercicio12Forr {

	public static void main(String[] args) {	
	pintarTriangulo();
	}
	private static void pintarTriangulo() {
	}
	int filas = 5;{
	
	for (int i=1; i <= filas; i++) {
		for (int j = filas; j > i; j--) {
			System.out.print(" ");
		}
		for (int k=1; k <= i; k++) {
			System.out.print("*");
		}
		System.out.println();
	
	}
}
}
