package application;

import entities.Client;

public class Program {

    public static void main(String[] args) {

        Client c1 = new Client("Henrique", "henrique@gmail.com");
        Client c2 = new Client("Henrique", "henrique@gmail.com");

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        //A referencia de memória é diferente, por isso dá falso
        System.out.println(c1 == c2);
        System.out.println("------");
        System.out.println(s1 == s2);

    }
}
