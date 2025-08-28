/* 
// CLASSE
// Toda aplicação Java começa com uma classe

por ex: nome de classe "pessoa"
class NomeDaClasse(pessoa) {
    pes = new pessoa(); -> esse parenteses eh o metodo contrutor, voce coloca metodos ou atributos, ele carrega tudo que tem na classe, 
                           desde que vc ainda n tenha inicializado ele, 
                           ou seja posso ter uma funcao ou nao na minha classe!
    // código aqui
}

// IMPORT
// Importa bibliotecas externas (ex: Scanner para entrada)
import java.util.Scanner;

// INSTÂNCIA
// Criar um objeto de uma classe
Scanner input = new Scanner(System.in);

// RUN / EXECUÇÃO
// Método principal que roda o programa
public static void main(String[] args) {
    // código a ser executado
}
*/


public class aula2808 {
  int x;
  public aula2808(int y){
  //this referencia ao escopo da classe
  this.x=y;
  }

}
