import java.util.List;
import java.util.stream.Collectors;
public class Desafio4 {
    public static List<Integer> removerImpares(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
