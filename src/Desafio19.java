import java.util.List;

public class Desafio19 {

    public static int somaNumerosDivisiveisPor3e5 (List<Integer> numeros){
        return numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(Integer::intValue).sum();
    }

}
