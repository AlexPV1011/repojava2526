package tema2;

public class EntrenadorStalyn {
	protected String nombre;
	protected String funcion;

    public EntrenadorStalyn(String nombre, String funcion) {
        this.nombre = nombre;
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Entrenador: " + nombre + " (" + funcion + ")";
    }
}
