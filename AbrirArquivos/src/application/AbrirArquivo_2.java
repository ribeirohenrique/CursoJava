package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AbrirArquivo_2 {
    public static void main(String[] args) {

        String path = "C:\\Users\\henrique.r.mendes\\Downloads\\in.txt";

        //Maneira simplificada de abrir arquivos
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
