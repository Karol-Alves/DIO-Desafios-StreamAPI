import java.util.List;

public class Desafio18 {

    public static boolean verificaSeOsNumerosSaoIguais (List<Integer> numeros){
        return numeros.stream().distinct().count() == 1;
    }

}
