package application;

import entities.Arquivo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sourceFileStr = "C:\\Users\\henrique.r.mendes\\Downloads\\entrada.txt";
        System.out.println("Digite o diretorio do arquivo: " + sourceFileStr);

        List<Arquivo> list = new ArrayList<>();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = bufferedReader.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(";");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Arquivo(name, price, quantity));
                itemCsv = bufferedReader.readLine();
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Arquivo arquivo : list) {
                    bufferedWriter.write(arquivo.getName() + ";" + String.format("%.2f", arquivo.valorTotal()));
                    bufferedWriter.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();

    }
}
