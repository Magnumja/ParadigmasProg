package trabalho2;

public class Personagem {
    private String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public String getNome() { return nome; }
    public int getEnergia() { return energia; }
    public void setEnergia(int energia) { this.energia = energia; }

    public void atacar() {
        System.out.println(nome + " realizou um ataque básico!");
    }
}



