package tema2;


import java.util.ArrayList;

public class EquipoStalyn {
    private String nombre;
    private String ciudad;
    private String estadio;
    private String fechaFundacion;
    private EntrenadorStalyn entrenador;
    private ArrayList<JugadorStalyn> jugadores = new ArrayList<>();
    private int puntos = 0;

    public EquipoStalyn(String nombre, String ciudad, String estadio, String fechaFundacion, EntrenadorStalyn entrenador) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.fechaFundacion = fechaFundacion;
        this.entrenador = entrenador;
    }

    public void addJugador(JugadorStalyn jugador) {
        jugadores.add(jugador);
    }
    public ArrayList<JugadorStalyn> getJugadores() {
        return jugadores;
    }

    public void addPuntos(int p) { puntos += p; }
    public int getPuntos() { return puntos; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo: ").append(nombre)
          .append(" (").append(ciudad).append(")\n")
          .append("Estadio: ").append(estadio)
          .append(", Fundado: ").append(fechaFundacion)
          .append("\n").append(entrenador).append("\n")
          .append("Jugadores:\n");
        for (JugadorStalyn j : jugadores) {
            sb.append("  - ").append(j).append("\n");
        }
        return sb.toString();
    }
}
