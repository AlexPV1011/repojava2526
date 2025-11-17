package tema2;

public class MedioStalyn{
	protected int asistencias;
	protected String nombre;
	protected int golesAnotados;
    protected int edad;

    public MedioStalyn(String nombre, int edad, int golesAnotados, int asistencias) {
    	this.nombre = nombre;
        this.edad = edad;
    	this.golesAnotados = golesAnotados;
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return "Centrocampista: " + super.toString() + ", asistencias=" + asistencias;
    }
}


