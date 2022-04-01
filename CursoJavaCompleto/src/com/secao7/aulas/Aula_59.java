package com.secao7.aulas;

import java.util.Locale;

public class Aula_59 {
    public static void main(String[] args) {

        String original = "|abcde FGHIJ klm NOPQ rstu VWXYZ      |";

        //Lower case
        String s01 = original.toLowerCase();

        //Upper case
        String s02 = original.toUpperCase();

        //Trim
        String s03 = original.trim();

        //Substring 01
        String s04 = original.substring(2);

        //Substring 02
        String s05 = original.substring(2, 9);

        //Replace 01
        String s06 = original.replace("a", "x");

        //Replace 02
        String s07 = original.replace("abc", "-");

        //IndexOf
        int i = original.indexOf("bc");

        //LastIndexOf
        int j = original.lastIndexOf("bc");

        System.out.println("Original: " + original);
        System.out.println("toLowerCase: " + s01);
        System.out.println("toUpperCase: " + s02);
        System.out.println("Trimmed: " + s03);
        System.out.println("Substring(2): " + s04);
        System.out.println("Substring(2, 9): " + s05);
        System.out.println("Replace(a, x): " + s06);
        System.out.println("Replace(abc, -): " + s07);
        System.out.println("IndexOf(bc): " + i);
        System.out.println("LastIndexOf(bc): " + j);


        String s = "Batata Laranja Melancia";
        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
