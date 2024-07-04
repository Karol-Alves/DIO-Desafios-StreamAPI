import java.util.List;
public class Desafio3 {

       /*Desafio 3 - Verifique se todos os números da lista são positivos:
        Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.*/

    public static boolean todosPositivos(List<Integer> numeros) {
        return numeros.stream().allMatch(n -> n > 0);
    }
}
