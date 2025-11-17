package tema;

public class Ejercicio1Var {
	/*en el codigo hay que poner comentarios*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);
		System.out.println(17);
		/*las variables sirven para almacenar informacion variable <- lado*lado
		 * int num1=3
		 * Pero ademas hay que indicar el tipo. En java hay diferentes tipos:
		 * string - almacena texto como "hola" con comillas dobles
		 * int - numeros enteros sin decimales como 123 o -123
		 * float - numeros como flotante con decimales, como 19,03 o -19,03
		 * char - almacena caracteres individuales como 'A', 'x', con comillas simples
		 * boolean - dos valores posibles: verdadero o falso 
		 * 
		 */
		String nombre = "Stalyn Peñafiel";
		System.out.println("Nombre"+nombre);
		int iNum = 15;
		System.out.println("numero="+iNum);
		int iOtroNum;
		iOtroNum = 22;
		System.out.println("Otro Numero="+iOtroNum);
		iOtroNum = 14;
		System.out.println("Otro Numero="+iOtroNum);
		int x = 5, y = 6, z = 7;
		System.out.println(x+y+z);
		x=y=z=50;
		System.out.println(x+y+z);
		
		final float GRAVEDAD = 9.8f;
		final byte MAYORIA_EDAD = 18;
		final double PI = 3.1415;
		
		
		
	}

}
