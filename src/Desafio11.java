import java.util.List;
import java.util.stream.Collectors;

public class Desafio11 {

    public static List<Integer> calcularQuadrados(List<Integer> numeros) {
        return numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static int calcularSomaQuadrados(List<Integer> numeros) {
        return numeros.stream()
                .mapToInt(n -> n * n)
                .sum();
    }
}
