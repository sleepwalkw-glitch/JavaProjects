package JeuxCalculatrice2;

import java.util.Scanner;

public class JeuxCalculatrice2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Welcome to JeuxCalculatrice2," +
                "put in a number to know more!");
        System.out.println("Begin your first Game :" +
                "Check out the number is positive or negative ? ");
        System.out.println("Enter a number");
        double a = num.nextDouble();
        if (a>0){
            System.out.println("the number you entered is positive.");
        }
        else if  (a<0){
            System.out.println("the number you entered is negative.");
        }
        else {
            System.out.println("the number you entered is invalid.");
        }


        Scanner num2 = new Scanner(System.in);
        System.out.println("Begin your second Game :" + "Are you good enough?");
        System.out.println("Enter a number");
        double b = num2.nextDouble();
        if (b>=16){
            System.out.println("Very good.");
        }
        else if  (b>=12 && b<16){
            System.out.println("Good.");
        }
        else if  (b>=10 && b<12){
            System.out.println("Relatively Good.");
        }
        else {
            System.out.println("Not Good Enough.");
        }

        Scanner num3 = new Scanner(System.in);
        System.out.println("Welcome to the third Game :" + "which number is greater ?");
        System.out.println("Enter two number");
        System.out.println("Enter the first Number :");
        double c = num3.nextDouble();
        System.out.println("Enter the first Number :");
        double d = num3.nextDouble();
        if (c>d){
            System.out.println(c +" is greater than"+ d);
        }
        else if (c==d){
            System.out.println(c +" is equal to"+ d);
        }
        else {
            System.out.println(c +" is not greater than"+ d);
        }
        num.close();
        num2.close();
        num3.close();

    }
}
