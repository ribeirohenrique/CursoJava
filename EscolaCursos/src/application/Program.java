package application;

import entities.Alunos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] course = new String[]{"A", "B", "C"};
        String[] alunosCourse;
        Set<Alunos> alunosSet = new HashSet<>();
        for (String s : course) {
            System.out.printf("How many students for course %s: ", s);
            alunosCourse = new String[scanner.nextInt()];
            for (int i = 0; i < alunosCourse.length; i++) {
                System.out.printf("Write the number of the student %d: ", 1 + i);
                alunosSet.add(new Alunos(scanner.nextInt()));
            }
        }

        System.out.println("Total students: " + alunosSet.size());
    }
}
