package treinamento;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() + ", tenho " + getIdade() + " anos e faço " + curso + ".");
    }
}
