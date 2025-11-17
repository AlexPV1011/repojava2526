package tema2;

	public class DefensaStalyn {
		protected int recuperaciones;
	    protected String nombre;
	    protected int golesAnotados;
	    protected int edad;

	    public DefensaStalyn(String nombre, int recuperaciones, int edad, int golesAnotados) {
	    	this.nombre = nombre;
	        this.edad = edad;
	    	this.golesAnotados = golesAnotados;
	        this.recuperaciones = recuperaciones;
	    }

	    @Override
	    public String toString() {
	        return "Defensa: " + super.toString() + ", balones recuperados=" + recuperaciones;
	    }
	}



