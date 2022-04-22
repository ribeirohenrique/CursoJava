package application;

import entities.Product;

import java.util.Scanner;

public class Vetores_PartTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos que haverá no vetor: ");
        int quantidade = scanner.nextInt();
        Product[] products = new Product[quantidade];
        double valorMedio = 0;

        for (int i = 0; i < products.length; i++) {
            scanner.nextLine();
            System.out.printf("Digite o nome do produto %d: ", i+1);
            String name = scanner.nextLine();
            System.out.printf("Digite o valor do produto %d: ", i+1);
            double price = scanner.nextDouble();
            products[i] = new Product(name, price);

        }

        System.out.println("Os materiais no vetor são:");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i].getName() + ", ");
            valorMedio += products[i].getPrice();
        }
        System.out.println();
        System.out.printf("E o valor médio dos produtos é: %.2f", (valorMedio / products.length));


    }
}
