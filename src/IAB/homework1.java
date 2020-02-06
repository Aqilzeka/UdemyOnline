package IAB;

import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        System.out.println("Let the game, begin!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess = random.nextInt(100);

        while (true){
            int num = scanner.nextInt();
            if (guess==num){
                System.out.println("Congratulations, " + num);
                break;
            } else if (num > guess){
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Your number is too small. Please, try again.");
            }
            scanner.nextLine();
        }

        scanner.close();
    }

}
