package application;

import entities.Product;

import java.util.Scanner;

public class ProgramImproved {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        //System.out.print("Quantity: ");
        //int quantity = scanner.nextInt();

        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200);
        System.out.println("Updated price: " + product.getPrice());

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
