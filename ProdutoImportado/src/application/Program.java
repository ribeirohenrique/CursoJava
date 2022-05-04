package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numberProducts = scanner.nextInt();
        for (int i = 0; i < numberProducts; i++) {
            System.out.printf("Product #%d data: \n", 1 + i);
            System.out.print("Common, used or imported (c/u/i): ");
            char productProfile = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            if (productProfile == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            } else if (productProfile == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = scanner.next();
                productList.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
            } else {
                productList.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product products : productList) {
            System.out.println(products.priceTag());
        }
    }
}
