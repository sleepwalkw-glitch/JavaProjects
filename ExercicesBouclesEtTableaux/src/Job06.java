import java.util.Random;
import java.util.Scanner;

public class Job06 {
    public static void deviner(){

        Scanner input = new Scanner(System.in);
        int x=(int)(Math.random()*101);// random number is defaulted between 0 and 1, 0 and 1 are not included.
        System.out.println(x);
        int N=0;// here to initialize the number to make the while run correctly

        System.out.println("Try to guess a random whole number between 1 and 100 given by the computer, until you are right!");
/* we can use boolean true for while and use break to skip out of the loop
        my version should be checked again*/
        while (N!=x){
            System.out.println("put in your whole number");
            N= input.nextInt();
            if (N<x){
                System.out.println("too small, try again!");
            } else if (N>x){
                System.out.println("too large, try again!");
            }
            else {
                System.out.println("You win!");
            }
        }

    }
    public static void main(String[] args){
        deviner();

    }

}
