package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employees will be registered: ");
        int quantity = scanner.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Employee #%d: \n", i);
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employees.add(new Employee(id, name, salary));
            scanner.nextLine();
        }

        System.out.print("Enter the employee ID that will have salary increase: ");
        int idEmployee = scanner.nextInt();
        Integer pos = position(employees, idEmployee);
        if (pos == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double bonusEmployee = scanner.nextDouble();
            employees.get(pos).salaryIncrease(bonusEmployee);

        }

        System.out.println("List of employees: ");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }

        }
        return null;

    }
}
