package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        //Integer wrapper por aceitar null
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Juliana");
        list.add("Rita");
        list.add("Wanderson");
        list.add("Claudio");
        list.add("Rafael");
        list.add("Ronda");
        list.add(2, "Marcelo");

        System.out.println("Tamanho da lista: " + list.size());
        for (String x : list) {
            System.out.print(x + ", ");
        }
        System.out.println("\n -------------------------");

        //Remove passando uma referencia String
        list.remove("Rita");
        for (String x : list) {
            System.out.print(x + ", ");
        }
        System.out.println("\n -------------------------");

        //Remove passando uma referencia de posição
        list.remove(3);
        for (String x : list) {
            System.out.print(x + ", ");
        }
        System.out.println("\n -------------------------");

        //Remove da lista passando um predicado
        //Remover todos as String x tal que x no caractere na posicao 0 seja igual a 'M'
        //Retorna true ou false
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.print(x + ", ");
        }
        System.out.println("\n -------------------------");

        System.out.print("Index of Wanderson: " + list.indexOf("Wanderson"));
        System.out.println("\n -------------------------");

        System.out.print("Index of João: " + list.indexOf("João"));
        System.out.println("\n -------------------------");


        //Filtrar somente nomes que comecem com R
        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'R')
                .collect(Collectors.toList());

        for (String x : result) {
            System.out.print(x + ", ");
        }
        System.out.println("\n -------------------------");

        //Achar a primeira ocorrencia que comecem com J, senao imprime nulo
        String name = list.stream()
                .filter(x -> x.charAt(0) == 'K')
                .findFirst()
                .orElse(null);
        System.out.println(name);

    }
}
