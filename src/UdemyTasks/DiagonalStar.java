package UdemyTasks;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(3);
    }


    public static void printSquareStar(int number){
        if (number < 5){
            System.out.printf("Invalid Value");
        } else {
            for (int i=1; i<=number; i++){
                for (int j=1; j <= number ; j++){
                    if (i==1 || i==number || j==1 || j==number || i==j || number-i+1==j){
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
