package application;

import application.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeitorArquivos {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        String path = "C:\\Users\\henrique.r.mendes\\Downloads\\nomes.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String employeeCsv = bufferedReader.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                employeeList.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = bufferedReader.readLine();
            }

            //Ordernar a lista
            Collections.sort(employeeList);
            for (Employee employee : employeeList) {
                System.out.println(employee.getName() + ", " + employee.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
