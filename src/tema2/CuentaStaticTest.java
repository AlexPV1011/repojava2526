package tema2;

public class CuentaStaticTest {

	public static void main(String[] args) {
		CuentaStatic cuenta1 = new CuentaStatic("Alex", 1000000.0);
		CuentaStatic cuenta2 = new CuentaStatic("camilo", 1000000.0);
		CuentaStatic cuenta3 = new CuentaStatic("juan", 1000000.0);
		
		System.out.println("El total de cuentas creadas es: "+CuentaStatic.getnumeroCuentas());
		System.out.println();
		
		cuenta1.ingresar(250000.0);
		cuenta2.retirar(500000);
		cuenta3.retirar(250000);
		
		System.out.println();
		System.out.println("El total de cuentas creadas es: "+CuentaStatic.getnumeroCuentas());
	
	}
	

}
