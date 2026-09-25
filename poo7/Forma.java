import java.util.ArrayList;
import java.util.List;

public abstract class Forma {

    // Lista de arestas (usamos Double porque generics não aceita primitivo)
    private List<Double> arestas = new ArrayList<>();

    public List<Double> getArestas() {
        return this.arestas;
    }

    public void setArestas(List<Double> a) {
        this.arestas = a;
    }

    // Método abstrato -> obriga as filhas a sobrescreverem (polimorfismo)
    public abstract double calculaArea();
}