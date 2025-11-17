package tema;

public class Ejercicio13Cadenas {

	public static void main(String[] args) {
		String str1= "name";
		String str2= "name";
		String str3= new String ("name");
		String str4= "Name";
		System.out.println(""+str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println(""+str1.equals(str3));
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(""+str1.equals(str4));		
		System.out.println(""+str1.equalsIgnoreCase(str4));
		
		
	}

}
