package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de contribuintes: ");
        int contribuintes = scanner.nextInt();
        List<Contribuinte> contribuinteList = new ArrayList<>();

        for (int i = 0; i < contribuintes; i++) {
            System.out.printf("Contribuinte número #%d \n", 1 + i);
            System.out.print("Individual ou Empresa (i/e): ");
            char tipo = scanner.next().charAt(0);
            scanner.nextLine();
            if (tipo == 'i') {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Renda anual: ");
                double rendaAnual = scanner.nextDouble();
                System.out.print("Despesas com saúde: ");
                double despesasSaude = scanner.nextDouble();
                contribuinteList.add(new PessoaFisica(nome, rendaAnual, despesasSaude));
            } else if (tipo == 'e') {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Renda anual: ");
                double rendaAnual = scanner.nextDouble();
                System.out.print("Quantidade de empregados: ");
                int quantidadeEmpregados = scanner.nextInt();
                contribuinteList.add(new PessoaJuridica(nome, rendaAnual, quantidadeEmpregados));
            }
        }

        System.out.println();
        System.out.println("DETALHAMENTO DE CONTAS:");
        for (Contribuinte contribuinte : contribuinteList) {
            System.out.println(contribuinte.toString());
        }

        System.out.println();
        double impostoTotal = 0;
        for (Contribuinte contribuinte : contribuinteList) {
            impostoTotal += contribuinte.impostoTotal();
        }
        System.out.printf("TOTAL TAXES: %.2f \n", impostoTotal);

    }
}
