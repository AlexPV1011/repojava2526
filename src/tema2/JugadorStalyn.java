package tema2;


public class JugadorStalyn {
    protected String Nombre;
    protected int goles;
    protected int edad;
    

    public JugadorStalyn(String Nombre, int edad, int goles) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.goles = goles;
    }

    public String getNombre() { return Nombre; }
    public int getGoles() { return goles; }
    public int getEdad() { return edad; }
    

    @Override
    public String toString() {
        return Nombre + " (edad=" + edad + ", goles=" + goles + ")";
    }
}

