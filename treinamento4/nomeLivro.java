package treinamento4;

public class nomeLivro {
    private String livro;
    private int sessao;


    public void setlivro(String livro){
        this.livro = livro;
    }

    public void setsessao(int sessao){
        this.sessao = sessao;
    }

    public void apresentar(){
        System.out.println("O livro " + livro + " esta na sessao " + sessao );
    }
}
