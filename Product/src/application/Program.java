package application;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.setName(scanner.nextLine());
        System.out.print("Price: ");
        product.setPrice(scanner.nextDouble());

        System.out.println("Product Data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(scanner.nextInt());
        System.out.println("Product Data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(scanner.nextInt());
        System.out.println("Product Data: " + product);


        scanner.close();

    }
}
