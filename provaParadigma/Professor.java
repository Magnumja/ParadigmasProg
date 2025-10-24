package provaParadigma;

public class Professor extends Pessoa{
     private String curso;

    public Professor(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Opa meu nome é " + getNome() + " tenho " + getIdade() + " anos e faço " + curso + ".");
    }
}