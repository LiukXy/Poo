import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Triangulo(3, 4, 5));
        formas.add(new Quadrado(4));

        // Polimorfismo: mesma chamada -> comportamentos diferentes
        for (Forma f : formas) {
            System.out.printf("%s -> Área = %.2f%n",
                    f.getClass().getSimpleName(),
                    f.calculaArea());
        }
    }
}