package application;

import entities.Room;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rooms will be rented: ");
        int numberRooms = scanner.nextInt();
        scanner.nextLine();

        Room[] rooms = new Room[9];

        for (int i = 0; i < numberRooms; i++) {
            System.out.printf("Rent #%d: \n", i);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Room: ");
            int room = scanner.nextInt();

            rooms[room] = new Room(name, email,room);
            scanner.nextLine();
        }


        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(rooms[i].toString());
            }
        }







    }

}
