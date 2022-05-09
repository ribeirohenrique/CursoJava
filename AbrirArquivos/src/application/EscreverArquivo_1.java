package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo_1 {
    public static void main(String[] args) {

        String[] lines = new String[]{"Bom dia", "Boa tarde", "Boa noite"};
        String path = "C:\\Users\\henrique.r.mendes\\Downloads\\out.txt";

        //mesmo procedimento de leitura de arquivos, o parametro true no FileWriter significa que vai definir como append
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
