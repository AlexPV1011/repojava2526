package tema2;

import java.util.ArrayList;

public class PorteroStalyn{
    protected int golesRecibidos;
    protected String nombre;
    protected int golesAnotados;
    protected int edad;
    private ArrayList<JugadorStalyn> jugadores = new ArrayList<>();

    public PorteroStalyn(String nombre, int golesAnotados, int edad, int golesRecibidos) {
    	this.nombre = nombre;
        this.edad = edad;
    	this.golesAnotados = golesAnotados;
        this.golesRecibidos = golesRecibidos;
    }
    public void addJugador(JugadorStalyn Jugador) {
        jugadores.add(Jugador);
    }
    public ArrayList<JugadorStalyn> getJugadores() {
        return jugadores;
    }

    @Override
    public String toString() {
        return "Portero: " + super.toString() + ", goles recibidos=" + golesRecibidos;
    }
}
