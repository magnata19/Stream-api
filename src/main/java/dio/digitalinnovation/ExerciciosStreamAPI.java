package dio.digitalinnovation;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;


public class ExerciciosStreamAPI {
  public static void main(String[] args) {
    List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

//    System.out.println("Imprima todos os elementos dessa lista de String: ");
//    numerosAleatorios.forEach(System.out::println);
//
//    System.out.println("Pegue os 5 primeiros números e coloque dentro de um set: ");
//    numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
//
//    System.out.println("Transforme esta lista de String em uma lista de inteiros: ");
    List<Integer> listInteger = numerosAleatorios.stream()
            .map(s -> Integer.parseInt(s)).collect(Collectors.toList());
//            .forEach(System.out::println);

//    System.out.println("Pegue os número pares e maiores que 2 e coloque em uma lista: ");
//    List<Integer> numerosParesMaioresQueDois = numerosAleatorios.stream()
//            .map(Integer::parseInt)
//            .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
//    System.out.println(numerosParesMaioresQueDois);

//    System.out.println("Mostre a média dos números: ");
//    numerosAleatorios.stream()
//            .mapToInt(Integer::parseInt)
//            .average()
//            .ifPresent(System.out::println);

    System.out.println("Remova os valores ímpares: ");
    listInteger.removeIf(integer -> (integer % 2 != 0));
    System.out.println(listInteger);
    }
  }
