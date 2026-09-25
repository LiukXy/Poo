import java.util.Arrays;

public class Quadrado extends Forma {

    public Quadrado(double lado) {
        setArestas(Arrays.asList(lado));
    }

    @Override
    public double calculaArea() {
        double lado = getArestas().get(0);
        return lado * lado;
    }
}