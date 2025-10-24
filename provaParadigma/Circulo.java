package provaParadigma;

public class Circulo extends Forma {
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double area() {
        return 3.14 * raio * raio;
    }
}
