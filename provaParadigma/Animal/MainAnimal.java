package provaParadigma.Animal;

public class MainAnimal {
    
    public static void main(String[] args) {
       
        Animal[] animais = {new Animal(), new Cachorro(), new Gato()};

        for (Animal animal : animais) {
            animal.falar();
        }
    }
}


