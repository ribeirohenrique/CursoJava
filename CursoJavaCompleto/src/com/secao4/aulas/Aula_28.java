package com.secao4.aulas;

public class Aula_28 {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.printf("Raiz quadrada de %.2f = %.2f", x, A);
        System.out.println();
        System.out.printf("Raiz quadrada de %.2f = %.2f", y, B);
        System.out.println();
        System.out.printf("Raiz quadrada de 25 = %.2f", C);
        System.out.println();

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.printf("%.2f elevado a %.2f = %.2f", x, y, A);
        System.out.println();
        System.out.printf("%.2f elevado ao quadrado = %.2f", x, B);
        System.out.println();
        System.out.printf("5 elevado ao quadrado = %.2f", C);
        System.out.println();

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.printf("Valor abosuluto de %.2f = %.2f", y, A);
        System.out.println();
        System.out.printf("Valor absoluto de %.2f = %.2f", z, B);
        System.out.println();
    }

}
