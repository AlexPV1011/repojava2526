package tema2;

public class DelanteroStalyn{
	protected int disparos;
	protected String nombre;
	protected int golesAnotados;
    protected int edad;

    public DelanteroStalyn(String nombre, int edad, int golesAnotados, int disparos) {
    	this.nombre = nombre;
        this.edad = edad;
    	this.golesAnotados = golesAnotados;
        this.disparos = disparos;
    }

    @Override
    public String toString() {
        return "Delantero: " + super.toString() + ", disparos=" + disparos;
    }
}
