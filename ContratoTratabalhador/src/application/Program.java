package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.println("Enter level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        //Passado os valores, nome, instancia do workerlevel, salario e nova instancia de Departamento
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));


        System.out.print("How many contracts to this worker: ");
        int numberContracts = scanner.nextInt();

        for (int i = 0; i < numberContracts; i++) {
            System.out.printf("Enter contract #%d data: ", 1 + i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (Hours): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year,month));
    }
}
