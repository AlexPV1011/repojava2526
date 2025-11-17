package tema2;

public class Cuenta {
	private String titular;
	private double saldo;
	
	public Cuenta(String titular, double saldoInicial) {
		this.saldo=saldoInicial;
		this.titular=titular;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad >0) {
			saldo +=cantidad;
		} else {
			System.out.println("mete dinero, rata");
		}
	}
	public void retirar(double cantidad) {
		if (cantidad >0) {
			if (cantidad <=saldo) {
				saldo-=cantidad;
			}else {
				System.out.println("fondos insuficientes");
			}
		}else {
			System.out.println("saca algo, raton");
		}
	}
	public double consultaSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta ("Tomas Campos", 1000000.0);
		cuenta.ingresar(500000);
		cuenta.retirar(250000);
		System.out.println("El saldo actual de "+cuenta.getTitular()+" es: "+cuenta.consultaSaldo()+"$");
		
	}

}
