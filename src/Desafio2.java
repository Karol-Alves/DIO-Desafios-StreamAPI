import java.util.List;
import java.util.stream.Collectors;

public class Desafio2 {

    public static List<Integer> filtrarNumerosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static int calcularSomaNumerosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
