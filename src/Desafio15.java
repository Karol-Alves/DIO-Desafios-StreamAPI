import java.util.List;
import java.util.Optional;

public class Desafio15 {
    public static boolean verificaNumerosNegativosLista(List<Integer> numeros) {
        return numeros.stream()
                .anyMatch(Desafio15::verificaNegativo);
    }
    public static boolean verificaNegativo (int numero){
       return numero < 0;
    }

}
