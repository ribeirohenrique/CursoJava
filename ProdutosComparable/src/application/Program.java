package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("Mouse", 90.0));
        list.add(new Product("HD Case", 30.0));

        //Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }

        System.out.println("-------------------");

        list.sort(Program::compareProducts);
        list.forEach(System.out::println);

        System.out.println("-------------------");

        //MANEIRAS DE SE FAZER A MESMA EXECUÇÃO DE DIVERSAS FORMAS:

        double min = 100.0;

        //Predicate<Product> pred = p -> p.getPrice() >= min;
        //list.removeIf(pred);

        //list.removeIf(p -> p.getPrice() >= 100);
        //list.removeIf(new ProductPredicate());
        //list.removeIf(Product::staticProductPredicate);
        //list.removeIf(Product::nonStaticProductPredicate);
        list.removeIf(p -> p.getPrice() >= min);

        list.forEach(System.out::println);

    }
}
