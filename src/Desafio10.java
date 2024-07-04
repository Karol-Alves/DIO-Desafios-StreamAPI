import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
    public static List<Integer> agruparImparesMultiplosDe3Ou5(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)) // Filtra números ímpares e múltiplos de 3 ou de 5
                .collect(Collectors.toList()); // Coleta os resultados em uma lista
    }
}
