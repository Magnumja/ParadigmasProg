package treinamento3;

public class NomeAluno {
    private String Aluno;
    private int semestre;

    public void setAluno(String Aluno){
        this.Aluno = Aluno;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public void apresentar(){
        System.out.println("O aluno " + Aluno + "do " + semestre + " esta reprovado");
    }
}
