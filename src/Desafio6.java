import java.util.List;

public class Desafio6 {

    public static boolean verificaNumeroMaiorQueDez(List<Integer> numeros) {
        return numeros.stream().anyMatch(n -> n > 10);
    }
}
