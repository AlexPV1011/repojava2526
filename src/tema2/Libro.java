package tema2;

public class Libro {
	private String titulo;
	private String autor;
	private int paginasTotales;
	private int paginasLeidas;
	
	public Libro(String titulo, String autor, int paginasTotales) {
		this.titulo=titulo;
		this.autor=autor;
		this.paginasTotales=paginasTotales;
		this.paginasLeidas=0;
		
	}
	public void leerPaginas(int paginas) {
		paginasLeidas += paginas;
		if (paginasLeidas <= paginasTotales) {
			paginasLeidas = paginasTotales;
			System.out.println("has leido "+paginasLeidas+" de "+paginasTotales);
			System.out.println("has terminado el libro");
		} else {
			System.out.print("has leido "+paginasLeidas+" de "+paginasTotales);
		}
	}

}
