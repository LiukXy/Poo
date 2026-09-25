import java.util.Arrays;

public class Circulo extends Forma {

    public Circulo(double raio) {
        setArestas(Arrays.asList(raio)); // aresta[0] = raio
    }

    @Override
    public double calculaArea() {
        double raio = getArestas().get(0);
        return Math.PI * raio * raio;
    }
}