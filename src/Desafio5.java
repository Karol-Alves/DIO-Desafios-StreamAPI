import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Desafio5 {
    public static OptionalDouble calcularMediaMaioresQueCinco(List<Integer> numeros) {
        List<Integer> numerosMaioresCinco = numeros.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());

        return numerosMaioresCinco.stream()
                .mapToInt(Integer::intValue)
                .average();
    }
}
