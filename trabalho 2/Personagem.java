package trabalho 2;

public class Personagem {
    private String nome;     
    private int vida;        

   
    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    public void atacar() {
        System.out.println(nome + " atacou com um golpe básico!");
    }
}


public class Mago extends Personagem {

    private int mana; 


    public Mago(String nome, int vida, int mana) {
        super(nome, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void atacar() {
        System.out.println(getNome() + " lançou uma bola de fogo! (-10 de mana)");
        mana -= 10;
    }
}

