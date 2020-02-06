package UdemyChallange;

import java.util.Scanner;

public class Challang1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0,sum=0;

        while (true){
            int order = count+1;
            System.out.println("Enter number #" + order + ": " );
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                count++;
                sum = sum + number;

                if (count==10)
                    break;
            }  else {
                System.out.println("Invalid number");
            }

                scanner.nextLine();
        }

        System.out.println("sum = " + sum );
        scanner.close();
    }
}
