package ExerciceDiceGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Niveaux03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum=0;
        int num3=1;


        do{
            try{
            System.out.println("Enter any whole number to roll the first dice");
            int num = sc.nextInt();
            sc.nextLine();
            int randomnum1 = (int)(Math.random()*7);
            // System.out.println(randomnum1);
            System.out.println("Enter any whole number to roll the second dice");
            int num2 = sc.nextInt();
            sc.nextLine();
            int randomnum2 = (int)(Math.random()*7);
            //System.out.println(randomnum2);
            System.out.println("Guess the sum of your two dices and enter the number");
            num3 = sc.nextInt();
            sc.nextLine();
            sum = randomnum1 + randomnum2 ;
            } catch (InputMismatchException e) {
                System.out.println("Error:please follow the instructions!");
                sc.nextLine();
                continue;
            }
            System.out.println(sum);

        }
        while (sum != num3);

        System.out.println("You have won!");


    }
}
