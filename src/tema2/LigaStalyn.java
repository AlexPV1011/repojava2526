package tema2;

import java.util.Random;

public class LigaStalyn {
    private EquipoStalyn[] equipos;

    public LigaStalyn(EquipoStalyn... equipos) {
        this.equipos = equipos;
    }

    public void simularPartido(EquipoStalyn e1, EquipoStalyn e2) {
        Random rand = new Random();
        int resultado = rand.nextInt(3);

        if (resultado == 0) {
            System.out.println(e1.getNombre() + " gana a " + e2.getNombre());
            e1.addPuntos(3);
        } else if (resultado == 1) {
            System.out.println(e2.getNombre() + " gana a " + e1.getNombre());
            e2.addPuntos(3);
        } else {
            System.out.println(e1.getNombre() + " empata con " + e2.getNombre());
            e1.addPuntos(1);
            e2.addPuntos(1);
        }
    }

    public void listarPuntos() {
        for (EquipoStalyn e : equipos) {
            System.out.println(e.getNombre() + ": " + e.getPuntos() + " puntos");
        }
    }

}