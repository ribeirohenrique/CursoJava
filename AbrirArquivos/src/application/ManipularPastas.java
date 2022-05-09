package application;

import java.awt.font.FontRenderContext;
import java.io.File;
import java.util.Scanner;

public class ManipularPastas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strPath = "C:\\Users\\henrique.r.mendes\\Downloads";

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subDir").mkdir();
        System.out.println("Directory created successfully: " + success);
    }
}
