package tema2;

public class prueba {
	private String titulo;
	private String autor;
	private int paginasTotales;
	
	public prueba(String titulo, String autor, int paginasTotales) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginasTotales = paginasTotales;
		
	}
	
	public void leer () {};
	public void mostrarInfo () {};
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginasTotales() {
		return paginasTotales;
	}

	public void setPaginasTotales(int paginasTotales) {
		this.paginasTotales = paginasTotales;
	};
	
	
	public String toString() {
		return ("titulo:" +titulo+" autor:"+autor+" paginas:"+paginasTotales);
	}




}
