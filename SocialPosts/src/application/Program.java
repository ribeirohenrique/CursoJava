package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Faca uma boa viagem!");
        Comment c2 = new Comment("Uau que legal!");

        Post p1 = new Post(sdf.parse("21/06/2022 13:05:44"),
                "Viajando para Nova Zelandia",
                "Vou visitar este pais maravilhoso",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Que amanha vc acorde com alegria");
        Comment c4 = new Comment("Boa noite meu amigo");

        Post p2 = new Post(sdf.parse("05/01/2022 19:23:10"),
                "Boa noite pessoal",
                "Vejo voces amanha",
                4);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);


    }
}
