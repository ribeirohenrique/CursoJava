package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("Mouse", 90.0));
        list.add(new Product("HD Case", 30.0));


        //Funcao map aplica uma funcao a cada elemento da stream
        //gerando uma nova stream

        //Aqui foi necessario converter para stream e depois voltar para list.
        //List<String> names = list.stream().map(new UpperCaseName()).toList();
        //List<String> names = list.stream().map(Product::staticUpperCaseName).toList();
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList();
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(func).toList();

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();


        names.forEach(System.out::println);

    }

}
