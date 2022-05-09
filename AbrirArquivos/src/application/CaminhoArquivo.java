package application;

import java.io.File;
import java.util.Scanner;

public class CaminhoArquivo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path: ");

        String strPath = "C:\\Users\\henrique.r.mendes\\Downloads\\in.txt";

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

    }
}
