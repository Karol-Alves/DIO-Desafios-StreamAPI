import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {

    public static List<Integer> numerosPrimos(List<Integer> numeros) {
        return numeros.stream()
                .filter(Desafio14::numeroPrimo)
                .collect(Collectors.toList());
    }
}
