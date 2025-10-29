package ExerciceDiceGame;

import java.util.Scanner;

public class Niveaux02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any whole number to roll the first dice.");
        int x=sc.nextInt();
        int randomNumb1=(int)(Math.random()*7);
        System.out.println("enter any whole number to roll the second dice.");
        int y=sc.nextInt();
        int randomNumb2=(int)(Math.random()*7);
        int sum=randomNumb1+randomNumb2;
        System.out.println("Guess the sum of your two dices and enter the number");
        int  a=sc.nextInt();
        while(a!=sum){
            System.out.println("You have lost! Try again !");
            a=sc.nextInt();
        }
            System.out.println("You have wined!");
    }
}
