package UdemyChallange;

import java.util.Scanner;

public class Scannerr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name ");
            String name = scanner.nextLine();

            System.out.println("Your name is " + name);

            System.out.println("Your age is " + age);
        } else {
            System.out.println("Invalid age");
        }



        scanner.close();
    }
}
