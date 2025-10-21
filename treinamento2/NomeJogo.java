package treinamento2;


public class NomeJogo {
    private String nome;
    private String categoria;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void apresentar(){
        System.out.println("O jogo " + nome + " tem a categoria de estilo de jogo como " + categoria);
    }
}
