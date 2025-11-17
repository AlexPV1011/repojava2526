package tema2;

public class CuentaStatic extends Object{
	private String sTitular;
	private double sSaldo;
	
	private static int numeroCuentas=0;
	
	public CuentaStatic (String sTitular, double sSaldo) {
		this.sTitular=sTitular;
		this.sSaldo=sSaldo;
		numeroCuentas++;
	}
	public void ingresar(double cantidad) {
		if (cantidad >0) {
			if (cantidad >0) {
				sSaldo += cantidad;
				System.out.println("Has ingresado "+cantidad+". Saldo actual "+sSaldo+"$");
			}
		} else {
			System.out.println("saca algo, bro");
		}
	}
	
	public void retirar(double cantidad) {
		if (cantidad >0) {
			if (cantidad <=sSaldo) {
				sSaldo -= cantidad;
				System.out.println("has retirado"+cantidad+". Saldo actual"+sSaldo+"$");
			}else {
				System.out.println("fondos insuficientes");
			}
		}else {
			System.out.println("saca algo");
		}
	}
	public double consulado() {
		return sSaldo;
	}
	public String getTitular() {
		return sTitular;
	}
	public static int getnumeroCuentas() {
		return numeroCuentas;
	}
	
}
