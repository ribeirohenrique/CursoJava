package application;


import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //A lista funciona normalmente pois ela pode ser instanciada para uma lista
        //Conceitos de polimorfismo
        List<Shape> shapeList = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data: \n", 1 + i);
            System.out.print("Rectangle or Circle (r/c): ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                shapeList.add(new Rectangle(color, width, height));

            } else {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape areas: ");
        for (Shape shape : shapeList) {
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}
