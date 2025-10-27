package JeuxCalculatrice;

import java.util.Scanner;

public class JeuxCalculatrice {
    public static void main() {
        Scanner choice = new Scanner(System.in);
        System.out.println("Welcome to JeuxCalculatrice,enter the number for chose one of the following operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int input= choice.nextInt();
        if  (input == 1) {
            System.out.println("Enter two whole numbers to add");
            System.out.println("Enter the first number");
            int a = choice.nextInt();
            System.out.println("Enter the second number");
            int b = choice.nextInt();
            int result = a+b;
            System.out.println("The addition of two numbers is "+result);
            choice.close();
        }
        if  (input == 2) {
            System.out.println("Enter two whole numbers to multiply");
            System.out.println("Enter the first number");
            int a = choice.nextInt();
            System.out.println("Enter the second number");
            int b = choice.nextInt();
            int result = a-b;
            System.out.println("The substraction of two numbers is "+result);
            choice.close();
        }
        if  (input == 3) {
            System.out.println("Enter two whole numbers to multiply");
            System.out.println("Enter the first number");
            int a = choice.nextInt();
            System.out.println("Enter the second number");
            int b = choice.nextInt();
            int result = a * b;
            System.out.println("The multiplication of two numbers is " + result);
            choice.close();
        }
        if  (input == 4) {
            System.out.println("Enter two whole numbers to divide");
            System.out.println("Enter the first number");
            int a = choice.nextInt();
            System.out.println("Enter the second number");
            int b = choice.nextInt();
            int result = a/b;
            System.out.println("The division of two numbers is "+result);
            choice.close();
        }
    }
}
