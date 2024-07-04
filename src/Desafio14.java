import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {

    public static Optional<Integer> maiorNumeroPrimo(List<Integer> numeros) {
        return numeros.stream()
                .filter(Desafio14::numeroPrimo) // Chama o metodo e filtra apenas os numeros primos
                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente para ficar fácil encontrar o primeiro elemento
                .findFirst(); // Pega o primeiro elemento, que será o maior
    }

    public static boolean numeroPrimo(int numero){
        if (numero <= 1) {
            return false; //Se for menor ou igual 1, não é primo
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; //se o numero for divisivel pelo i, ele não é primo
            }
        }
        return true;
    }
}
