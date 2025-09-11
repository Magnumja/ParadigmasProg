package trabalho1;
public class Main {
    public static void main(String[] args) {
        trabalho1 pessoa = new trabalho1();

        
        pessoa.setNome("Magnum Johanson de Abreu");
        pessoa.setIdade(20);
        pessoa.setSalario(5000.00);

        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Salário: " + pessoa.getSalario());
    }
}
