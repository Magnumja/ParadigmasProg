public class Javarobject {

  public static void main(String[] args){
    Bebe bebe = new Bebe();

    bebe.idade = 15;

    system.out.println("Idade primeira vez: " + bebe.idade);
    Scanner sc = new Scanner(System.in);
    int y;
    y = sc.nextInt();

    bebe.valorIdade(y);
    bebe.getIdade();

  }

}
