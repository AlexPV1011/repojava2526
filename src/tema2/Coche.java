package tema2;

public class Coche {
	private String color;
	private int velocidad;
	private double tamaño;
	
	
	public Coche (String color, int velocidad, double tamaño) {
		this.color = color;
		this.velocidad = velocidad;
		this.tamaño = tamaño;
		}
	
	public void avanzar() {};


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	};


	public String toString() {
		return ("mi coche es color "+color+", una velocidad de "+velocidad+"km y un tamaño de "+tamaño+"m");
	}








}
