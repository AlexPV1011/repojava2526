package tema2;

public class LigaTestStalyn {
    public static void main(String[] args) {


        
    	EquipoStalyn e1 = new EquipoStalyn("FC Barcelona", "Barcelona", "Spotify Camp Nou", "1899",
                new EntrenadorStalyn("Hansi Flick", "Principal"));
        new PorteroStalyn("Joan Garcia", 33, 0, 15);
        new DefensaStalyn("Cubarsi", 18, 2, 90);
        new MedioStalyn("Pedri", 23, 6, 22);
        new DelanteroStalyn("Raphinha", 28, 34, 42);
        
        
    	EquipoStalyn e2 = new EquipoStalyn("Real Madrid", "Madrid", "Santiago Bernabéu", "1902",
                new EntrenadorStalyn("Xabi Alonso", "Principal"));
        new PorteroStalyn("Courtois", 33, 0, 22);
        new DefensaStalyn("Antonio Rudiger", 32, 1, 50);
        new MedioStalyn("Fede Valverde", 27, 8, 18);
        new DelanteroStalyn("Kylian Mbappe", 26, 45, 60);

        

        EquipoStalyn e3 = new EquipoStalyn("Liverpool Football Club", "Liverpool", "Anfield", "1892",
                new EntrenadorStalyn("Arne Slot", "Principal"));
        new PorteroStalyn("Alisson", 33, 0, 22);
        new DefensaStalyn("Van Dijk", 34, 3, 70);
        new MedioStalyn("MacAllister", 26, 18, 15);
        new DelanteroStalyn("Salah", 33, 28, 40);

        EquipoStalyn e4 = new EquipoStalyn("FC Bayern Múnich ", "Múnich", "Allianz Arena", "1900",
                new EntrenadorStalyn("Vicent Kompany", "Principal"));
        new PorteroStalyn("Neuer", 39, 0, 23);
        new DefensaStalyn("Upamecano", 27, 1, 80);
        new MedioStalyn("Kimmich", 30, 9, 10);
        new DelanteroStalyn("Kane", 32, 46, 55);

        
        System.out.println("=== Equipos participantes ===\n");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        
        LigaStalyn liga = new LigaStalyn(e1, e2, e3, e4);
        System.out.println("\n=== Comienza la Liga  ===\n");

        liga.simularPartido(e1, e2);
        liga.simularPartido(e3, e4);
        liga.simularPartido(e1, e3);
        liga.simularPartido(e2, e4);
        liga.simularPartido(e1, e4);
        liga.simularPartido(e2, e3);

liga.listarPuntos();
        
        // === Pichichi y Zamora ===

   
    
    
    
    }
}
