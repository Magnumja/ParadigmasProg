package trabalho2;

public class Piloto extends Personagem {
   
    private int combustivel;

    public Piloto(String nome, int energia, int combustivel) {
        super(nome, energia);
        this.combustivel = combustivel;
    }

    @Override
    public void atacar() {
        if (combustivel >= 10) {
            System.out.println(getNome() + " lançou mísseis teleguiados! (-10 de combustível)");
            combustivel -= 10;
        } else {
            System.out.println(getNome() + " está sem combustível para atacar!");
        }
    }
}

