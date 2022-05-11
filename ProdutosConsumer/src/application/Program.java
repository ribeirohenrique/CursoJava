package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("Mouse", 90.0));
        list.add(new Product("HD Case", 30.0));

        //list.forEach(new PriceUpdate());
        //list.forEach(Product::staticPriceUpdade);
        //list.forEach(Product::nonStaticPriceUpdade);

        double factor = 1.1;

        /*
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };
        list.forEach(cons);
        */

        list.forEach(p -> p.setPrice(p.getPrice() * factor));




        list.forEach(System.out::println);

    }

}
