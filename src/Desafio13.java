import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    public static List<Integer> filtrarIntervalo(List<Integer> numeros, int numero1, int numero2) {
        return numeros.stream()
                .filter(n -> n >= numero1 && n <= numero2)
                .collect(Collectors.toList());
    }
}
