import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {
    //Desafio 1 - Mostre a lista na ordem numérica:
    //Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console

    public static List<Integer> ordenarNumerosCrescentes(List<Integer> numeros) {
        return numeros.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
