package application;

public class Vetores_PartThree {
    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-------------------");

        //Para cada String obj faça
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
