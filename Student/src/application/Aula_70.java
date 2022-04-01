package application;

import entities.Student;

import java.util.Scanner;

public class Aula_70 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Student Name: ");
        student.name = scanner.nextLine();
        System.out.print("1st test: ");
        student.n1 = scanner.nextInt();
        System.out.print("2nd test: ");
        student.n2 = scanner.nextInt();
        System.out.print("3rd test: ");
        student.n3 = scanner.nextInt();

        int points = student.totalPoints(student.n1, student.n2, student.n3);
        System.out.println("Final grade: " + points);
        student.testPassed(points);
    }
}
