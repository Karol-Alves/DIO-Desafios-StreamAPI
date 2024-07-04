import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {

    public static Optional<Integer> encontrarSegundoMaiorNumero(List<Integer> numeros) {
        return numeros.stream()
                .distinct() // Remover duplicatas
                .sorted(Comparator.reverseOrder()) // Ordenar em ordem decrescente
                .skip(1) // Pular o primeiro elemento (maior número)
                .findFirst(); // Encontrar o segundo número maior
    }
}
