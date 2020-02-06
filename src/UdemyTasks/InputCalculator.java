package UdemyTasks;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        int SUM=0;
        long AVG=0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean isInt = scanner.hasNextInt();
            if (isInt){

                int number = scanner.nextInt();
                SUM += number;
                count++;
                AVG = Math.round((float)SUM/(float)count);

            }else {
                System.out.println("SUM = " + SUM + " AVG = " +AVG);
                break;
            }
                scanner.nextLine();
        }
        scanner.close();
    }
}
