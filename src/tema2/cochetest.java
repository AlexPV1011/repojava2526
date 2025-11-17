package tema2;

public class cochetest {

	public static void main(String[] args) {
		Coche cochenuevo = new Coche("negro", 280, 3.4);
		System.out.println(cochenuevo.toString());
		
		Coche otrocoche = new Coche("azul", 230, 3.1);
		System.out.println(otrocoche.toString());
		
		cochenuevo.setColor("blanco");
		
		System.out.println("el nuevo color es "+cochenuevo);
		cochenuevo.getColor();

	}

}
