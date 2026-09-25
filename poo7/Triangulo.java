import java.util.Arrays;

public class Triangulo extends Forma {

    public Triangulo(double a, double b, double c) {
        setArestas(Arrays.asList(a, b, c));
    }

    @Override
    public double calculaArea() {
        double a = getArestas().get(0);
        double b = getArestas().get(1);
        double c = getArestas().get(2);

        double p = (a + b + c) / 2.0; // semiperímetro
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}