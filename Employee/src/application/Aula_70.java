package application;

import entities.Employee;

import java.util.Scanner;

public class Aula_70 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.printf("Employee: %s, R$ %.2f \n", employee.name, employee.netSalary());

        System.out.print("Percentage to increase salary: ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.printf("Updated data: %s, R$ %.2f", employee.name, employee.netSalary());
    }
}
