import java.util.List;

public class Desafio8 {

    public static int somarDigitos(List<Integer> numeros) {
        return numeros.stream()
                .flatMap(n -> Integer.toString(n).chars().mapToObj(Character::getNumericValue)) // Transforma cada número em uma stream de seus dígitos
                .mapToInt(Integer::intValue) // Converte para int
                .sum(); // Soma os dígitos
    }
}
