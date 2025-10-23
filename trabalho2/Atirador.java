package trabalho2;

public class Atirador extends Personagem{
    
    private int balas;

    public Atirador(String nome, int energia, int balas) {
        super(nome, energia);
        this.balas = balas;
    }

    @Override
    public void atacar() {
        if (balas > 0) {
            System.out.println(getNome() + " disparou com seu rifle laser! (-1 bala)");
            balas--;
        } else {
            System.out.println(getNome() + " ficou sem munição!");
        }
    }
}

