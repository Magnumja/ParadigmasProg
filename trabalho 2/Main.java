package trabalho 2;

public class Main {
    public static void main(String[] args) {
       
        Personagem guerreiro = new Personagem("Arthur", 100);
        
      
        Mago merlin = new Mago("Merlin", 80, 50);

        
        guerreiro.atacar(); 
        merlin.atacar();   
    }
}
