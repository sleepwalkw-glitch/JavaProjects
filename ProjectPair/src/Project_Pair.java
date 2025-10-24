import java.util.Scanner;

public class Project_Pair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre a number.");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is " +num +",it is a pair.");
        }else{
            System.out.println("The number is " +num +",it is not a pair.");
        }

    }
}

