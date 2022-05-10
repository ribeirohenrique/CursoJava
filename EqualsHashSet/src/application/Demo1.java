package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("======= HashSet =======");

        Set<String> set1 = new HashSet<>();
        set1.add("Tv");
        set1.add("Tablet");
        set1.add("Notebook");

        set1.removeIf(x -> x.length() >= 3);

        for (String p : set1) {
            System.out.println(p);
        }

        System.out.println("======= TreeSet =======");

        Set<String> set2 = new TreeSet<>();
        set2.add("Tv");
        set2.add("Tablet");
        set2.add("Notebook");

        set2.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set2) {
            System.out.println(p);
        }

        System.out.println("==== LinkedHashSet ====");

        Set<String> set3 = new LinkedHashSet<>();
        set3.add("Tv");
        set3.add("Tablet");
        set3.add("Notebook");

        System.out.println(set3.contains("Notebook"));

        for (String p : set3) {
            System.out.println(p);
        }
    }
}
