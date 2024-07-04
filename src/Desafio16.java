import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {

    public static Map<Boolean, List<Integer>> separarParesImpares(List<Integer> numeros){
        return numeros.stream().collect(Collectors.partitioningBy(numero -> numero % 2 == 0));
    }
}
