package application;

import entities.Triangle;

import java.util.Scanner;

public class Aula_64 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do primeiro triangulo: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Entre com as medidas do segundo triangulo: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangulo X area: %.4f \n", areaX);
        System.out.printf("Triangulo Y area: %.4f \n", areaY);

        if (areaX > areaY) {
            System.out.println("Area maior X");
        } else {
            System.out.println("Area maior Y");
        }
    }
}
