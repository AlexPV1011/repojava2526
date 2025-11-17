package tema2;

public class pruebaTest {

	public static void main(String[] args) {
		prueba alumnoDAW = new prueba("el quijote", "Cervantes", 542);
		System.out.println("datos del libro:"+alumnoDAW+"\n");
		alumnoDAW.leer();
		alumnoDAW.mostrarInfo();
	}

}
