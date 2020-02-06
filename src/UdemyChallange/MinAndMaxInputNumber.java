package UdemyChallange;

import java.util.Scanner;

public class MinAndMaxInputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min= Integer.MIN_VALUE, max=Integer.MAX_VALUE;
      //  boolean first = true;
        while (true){
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();

//                if (first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number>max){
                    max=number;
                }

                if (number<min){
                    min=number;
                }

            } else {
                break;
            }

            scanner.nextLine();

        }

        System.out.println("min= " + min + ", max = " + max);
        scanner.close();
    }
}
