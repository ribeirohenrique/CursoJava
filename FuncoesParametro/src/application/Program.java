package application;

import entities.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService productService = new ProductService();
        //double sum = productService.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sum = productService.filteredSum(list, p -> p.getPrice() < 100.0);
        System.out.printf("Sum: %.2f \n", sum);


    }

}
