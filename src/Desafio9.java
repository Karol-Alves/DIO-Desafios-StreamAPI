import java.util.List;

public class Desafio9 {

    public static boolean verificarDistintos(List<Integer> numeros) {
        return numeros.stream()
                .distinct() // Remove os elementos duplicados
                .count() == numeros.size(); // Verifica se o número de elementos distintos é igual ao tamanho original da lista
    }
}
