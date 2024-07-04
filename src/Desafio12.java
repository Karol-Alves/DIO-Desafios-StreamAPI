import java.util.List;

public class Desafio12 {
    public static long calcularProduto(List<Integer> numeros) {
        return numeros.stream()
                .reduce(1, (a, b) -> a * b);
    }
}
