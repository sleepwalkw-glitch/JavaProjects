package JeuxCalculatrice;

import java.sql.SQLOutput;
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

        }
        if  (input == 2) {
            System.out.println("Enter two whole numbers to multiply");
            System.out.println("Enter the first number");
            int a = choice.nextInt();
            System.out.println("Enter the second number");
            int b = choice.nextInt();
            int result = a-b;
            System.out.println("The substraction of two numbers is "+result);

        }
        if  (input == 3) {
            System.out.println("Enter two whole numbers to multiply");
            System.out.println("Enter the first number");
            int a = choice.nextInt();
            System.out.println("Enter the second number");
            int b = choice.nextInt();
            int result = a * b;
            System.out.println("The multiplication of two numbers is " + result);

        }
        if  (input == 4) {
            System.out.println("Enter two whole numbers to divide");
            System.out.println("Enter the first number");
            int a = choice.nextInt();
            System.out.println("Enter the second number");
            int b = choice.nextInt();
             if (b!=0){
             int result = a/b;
             System.out.println("The division of two numbers is "+result);}
             else{
                 System.out.println("Error happened: the number divided can not be 0!");
             }

        }
        // try with Switch

        Scanner choice2 = new Scanner(System.in);
        System.out.println("Welcome to JeuxCalculatrice version2.0");
        System.out.println("Enter the first number");
        double num1=choice2.nextDouble();
        System.out.println("Enter the second number");
        double num2=choice2.nextDouble();
        System.out.println("Enter the one of the following operation you want to perform:"+" +, - , * , / , %");
        String operation = choice2.next();

        double result;

        switch (operation){
            case "+":
                result = num1+num2;
                System.out.println("The addition of two numbers is "+result);
                break;
            case  "-":
                result = num1-num2;
                System.out.println("The substraction of two numbers is "+result);
                break;
            case "*":
                result = num1*num2;
                System.out.println("The multiplication of two numbers is "+result);
                break;
            case  "/":
                if (num2!=0){
                    result = num1/num2;
                    System.out.println("The division of two numbers is "+result);
                    break;}
                else {
                    System.out.println("Error happened : the number divided can not be 0.");
                    break;
                }
            case "%":
                if(num2!=0){
                    result = num1%num2;
                    System.out.println("The modulo of two numbers is "+result);
                    break;}
                else {
                    System.out.println("Error happened : the number divided can not be 0.");
                    break;
                }

        }


    }
}
