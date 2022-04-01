import java.util.Scanner;

public class Secao_3_Aula_27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1, s2, s3;
        int x;

        x = scanner.nextInt();
        //adicionar um scanner para processar a linha em branco
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();


        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}
