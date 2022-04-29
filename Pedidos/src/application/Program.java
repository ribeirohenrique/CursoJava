package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product p1 = new Product("TV", 1000.00);

        OrderItem orderItem_1 = new OrderItem(1, 1000.00, p1);

        //Consigo buscar o nome do produto dentro da classe Product
        //que está instaciada através da classe OrderItem
        System.out.println(orderItem_1.getProduct().getName());

        System.out.println(orderItem_1);

        Client client_1 = new Client("Henrique", "Henrique1258@gmail.com", sdf.parse("25/11/1998"));

        System.out.println(client_1);

        System.out.println("----------------------------------");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(scanner.next());

        Order order = new Order(new Date(), orderStatus, client);
        System.out.print("How many itens to this order: ");
        int quantityItems = scanner.nextInt();
        for (int i = 0; i < quantityItems; i++) {
            scanner.nextLine();

            System.out.printf("Enter #%d item data: \n", 1 + i);
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = scanner.nextInt();

            //Primeiro eu crio o produto
            Product product = new Product(productName, productPrice);

            //Depois crio a ordem do pedido
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            //E entao associo ao pedido
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

    }
}
