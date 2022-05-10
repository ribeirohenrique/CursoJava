package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\henrique.r.mendes\\Downloads\\MOCK_DATA.csv";
        System.out.println("Enter the full file path: " + path);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                //Se vier algum nome igual, ele já barra e nao insere
                set.add(new LogEntry(username, moment));

                line = bufferedReader.readLine();
            }
            System.out.println("Total users: " + set.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
