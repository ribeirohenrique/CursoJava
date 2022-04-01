package com.secao5.aulas;

public class Aula_40 {

    public static void main(String[] args) {

        double preco = 19.50;

        //se preco for menor que 20, entao fazer preco * 0.1 senao fazer preco * 0.05
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
    }
}
