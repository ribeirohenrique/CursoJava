package application;

import com.sun.security.jgss.GSSUtil;
import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        //Chave-valor
        Map<String, String> cookies = new TreeMap<>();

        System.out.println("ALL COOKIES: ");
        //ordena na ordem alfabética

        System.out.println("=================");
        cookies.put("username", "Maria");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "1234845691");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("=================");
        cookies.remove("email");

        //Aqui sobrescreveu o valor anterior
        cookies.put("phone", "123409124");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("=================");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Address: " + cookies.get("address"));
        System.out.println("Size: " + cookies.size());

        System.out.println("=================");

        Map<Product, Double> productMap = new HashMap<>();

        Product p1 = new Product("Tv", 900.00);
        Product p2 = new Product("Notebook", 1230.34);
        Product p3 = new Product("Celular", 5490.12);

        productMap.put(p1, 150.00);
        productMap.put(p2, 150.00);
        productMap.put(p3, 150.00);


        System.out.println(productMap.get(p1));


        //por conta do equals e hashcode este item é igual ao de cima, gerando true na saida abaixo.
        Product ps = new Product("Tv", 900.00);

        System.out.println("Contains 'ps' key: " + productMap.containsKey(ps));

    }
}
