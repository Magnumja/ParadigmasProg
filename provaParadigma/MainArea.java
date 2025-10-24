package provaParadigma;

public class MainArea {
    public static void main(String[] args) {
       
        Forma retangulo = new Retangulo(10, 5);
        Forma circulo = new Circulo(7);

       
        double areaRetangulo = retangulo.area();
        double areaCirculo = circulo.area();

     
        System.out.println("area do retngulo: " + areaRetangulo);
        System.out.println("area do circulo: " + areaCirculo);
    }
}


