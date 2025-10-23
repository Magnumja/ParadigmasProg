package trabalho2;

public class Jogo {
    public static void main(String[] args) {
        Personagem[] equipe = {
            new Piloto("ARENATIONNSS", 100, 50),
            new Atirador("ELFUEGO", 120, 5)
        };

        System.out.println("=== BATALHA ESPACIAL ===\n");
        for (Personagem p : equipe) {
            p.atacar();
        }
    }
}
