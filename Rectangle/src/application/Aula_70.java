package application;

import entities.Rectangle;

import java.util.Scanner;

public class Aula_70 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Digite Width: ");
        rectangle.width = scanner.nextInt();

        System.out.print("digite Height: ");
        rectangle.height = scanner.nextInt();

        System.out.println("Area:" + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());

    }
}
