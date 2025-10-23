package treinamento5;

public class pessoa {
    private String nome;
    private int idade;

    public void setnome(String nome){
        this.nome = nome;
    }
    public void setidade(int idade){
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Ola, meu nome e " + nome + " e tenho " + idade + " anos.");
    }
}
