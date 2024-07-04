import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosOrdemCrescente = Desafio1.ordenarNumerosCrescentes(numeros);
        System.out.println("Desafio 1: " +numerosOrdemCrescente);

        System.out.println("*************************************************************");

        List<Integer> numerosPares = Desafio2.filtrarNumerosPares(numeros);
        int somaPares = Desafio2.calcularSomaNumerosPares(numeros);

        System.out.println("Desafio 2 Números pares: " + numerosPares);
        System.out.println("Desafio 2 Soma dos números pares: " + somaPares);

        System.out.println("*************************************************************");

        boolean todosPositivos = Desafio3.todosPositivos(numeros);

        System.out.println("Desafio 3 : Todos os números são positivos? " + todosPositivos);

        System.out.println("*************************************************************");

        List<Integer> listaSemImpares = Desafio4.removerImpares(numeros);

        System.out.println("Desafio 4: Lista sem números ímpares: " + listaSemImpares);

        System.out.println("*************************************************************");

        OptionalDouble media = Desafio5.calcularMediaMaioresQueCinco(numeros);

        if (media.isPresent()) {
            System.out.println("Desafio 5: Média dos números maiores que 5: " + media.getAsDouble());
        } else {
            System.out.println("Desafio 5: Não há números maiores que 5 para calcular a média.");
        }

        System.out.println("*************************************************************");

        boolean contemNumeroMaior10 = Desafio6.verificaNumeroMaiorQueDez(numeros);

        System.out.println(" Desafio 6: A lista contém algum número maior que 10? " + contemNumeroMaior10);

        System.out.println("*************************************************************");

        Optional<Integer> segundoNumeroMaior = Desafio7.encontrarSegundoMaiorNumero(numeros);

        if (segundoNumeroMaior.isPresent()) {
            System.out.println("Desafio 7: Segundo número maior da lista: " + segundoNumeroMaior.get());
        } else {
            System.out.println("Desafio 7: Não foi possível encontrar o segundo número maior.");
        }

        System.out.println("*************************************************************");

        int somaDigitos = Desafio8.somarDigitos(numeros);

        System.out.println("Desafio 8: Soma dos dígitos de todos os números da lista: " + somaDigitos);

        System.out.println("*************************************************************");


        boolean naoPossuiDuplicados = Desafio9.verificarDistintos(numeros);

        System.out.println("Desafio 9: Todos os números da lista são distintos? " + naoPossuiDuplicados);

        System.out.println("*************************************************************");


        List<Integer> numerosImparesMultiplos3Ou5 = Desafio10.agruparImparesMultiplosDe3Ou5(numeros);

        if (numerosImparesMultiplos3Ou5.isEmpty()) {
            System.out.println("Desafio 10: Não possui números ímpares múltiplos de 3 ou 5.");
        } else {
            System.out.println("Desafio 10: Números ímpares múltiplos de 3 ou 5: " + numerosImparesMultiplos3Ou5);
        }

        System.out.println("*************************************************************");

        List<Integer> numerosAoQuadrado = Desafio11.calcularQuadrados(numeros);
        int somaNumerosAoQuadrado = Desafio11.calcularSomaQuadrados(numeros);

        System.out.println("Desafio 11: Quadrados dos números: " + numerosAoQuadrado);
        System.out.println("Desafio 11: Soma dos quadrados dos números: " + somaNumerosAoQuadrado);

        System.out.println("*************************************************************");

        long produto = Desafio12.calcularProduto(numeros);

        System.out.println("Desafio 12: Produto de todos os números da lista: " + produto);

        System.out.println("*************************************************************");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int numero1Intervalo = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o segundo número do intervalo: ");
        int numero2Intervalo = sc.nextInt();
        sc.nextLine();

        List<Integer> numerosIntervalo = Desafio13.filtrarIntervalo(numeros, numero1Intervalo, numero2Intervalo);

        System.out.println("Desafio 13: Números no intervalo [" + numero1Intervalo + ", " + numero2Intervalo + "]: " + numerosIntervalo);

        System.out.println("*************************************************************");

        //Desafio 14 - Encontre o maior número primo da lista:
        //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

        Optional<Integer> maiorPrimo = Desafio14.maiorNumeroPrimo(numeros);

        //Tratando o Optional
        if (maiorPrimo.isPresent()) {
            System.out.println("Desafio 14: O maior número primo é: " + maiorPrimo.get());
        } else {
            System.out.println("Desafio 14: Não há números primos na lista.");
        }

        System.out.println("*************************************************************");

        //Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        //Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

        boolean temNegativo = Desafio15.verificaNumerosNegativosLista(numeros);

        System.out.println("Desafio 15: Existe número negativo na lista? " + temNegativo);

        System.out.println("*************************************************************");

        //Desafio 16 - Agrupe os números em pares e ímpares:
        //Utilize a Stream API para agrupar os números em duas listas separadas,
        // uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.


        Map<Boolean, List<Integer>> separaParImpar = Desafio16.separarParesImpares(numeros);

        List<Integer> pares = separaParImpar.get(true);
        List<Integer> impares = separaParImpar.get(false);

        System.out.println("Desafio 16: Números pares: " + pares);
        System.out.println("Desafio 16: Números ímpares: " + impares);

        System.out.println("*************************************************************");

        //Desafio 17 - Filtrar os números primos da lista:
        //Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

        List<Integer> primos = Desafio17.numerosPrimos(numeros);

        System.out.println("Desafio 17: Números primos na lista: " + primos);

        System.out.println("*************************************************************");

        //Desafio 18 - Verifique se todos os números da lista são iguais:
        //Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

        boolean saoIguais = Desafio18.verificaSeOsNumerosSaoIguais(numeros);
        System.out.println(saoIguais);

        System.out.println("*************************************************************");

        //Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
        //Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.


        int somaNumerosDiviseispor5e3 = Desafio19.somaNumerosDivisiveisPor3e5(numeros);

        if (somaNumerosDiviseispor5e3 == 0){
            System.out.println("Nao possui números nessa condição.");
        }
        else {
            System.out.println("Soma dos números divisíveis por 3 e 5: " + somaNumerosDiviseispor5e3);
        }
    }
}