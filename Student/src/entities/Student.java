package entities;

public class Student {

    public String name;
    public int n1, n2, n3;

    public int totalPoints(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void testPassed(int totalPoints) {
        if (totalPoints > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("Missing: %d", (60 - totalPoints));
        }
    }
}
