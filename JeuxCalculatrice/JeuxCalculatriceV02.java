package JeuxCalculatrice;

import java.util.Scanner;

public class JeuxCalculatriceV02 {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        boolean run = true;

        System.out.println("Welcome to JeuxCalculatrice version2.0");


            while (run) {
                System.out.println("Enter the one of the following operation you want to perform:" + " +, - , * , / , %, by entering 5 the game will stop!");
                String operation = choice.next();
                double result;

                switch (operation) {
                    case "5":
                        System.out.println("You have entered 5 to stop the game!");
                        run = false;
                        break;

                    case "+":
                        System.out.println("Enter the first number");
                        double num1 = choice.nextDouble();
                        System.out.println("Enter the second number");
                        double num2 = choice.nextDouble();
                        result = num1 + num2;
                        System.out.println("The addition of two numbers is " + result);
                        break;
                    case "-":
                        System.out.println("Enter the first number");
                        double num3 = choice.nextDouble();
                        System.out.println("Enter the second number");
                        double num4 = choice.nextDouble();
                        result = num3 - num4;
                        System.out.println("The substraction of two numbers is " + result);
                        break;
                    case "*":
                        System.out.println("Enter the first number");
                        double num5 = choice.nextDouble();
                        System.out.println("Enter the second number");
                        double num6 = choice.nextDouble();
                        result = num5 * num6;
                        System.out.println("The multiplication of two numbers is " + result);
                        break;

                    case "/":// how to make the division be executed again when error happened? need to put it in a while loop?
                        double num8;
                        double num7;
                        do {
                            System.out.println("Enter the first number");
                            num7 = choice.nextDouble();
                            System.out.println("Enter the second number");
                            num8 = choice.nextDouble();
                        }
                        while (num8 == 0);

                        result = num7 / num8;
                        System.out.println("The division of two numbers is " + result);
                        break;


                    case "%":
                        double num9;
                        double num10;
                        do {
                            System.out.println("the number divided can not be 0.");
                            System.out.println("Enter the first number");
                            num9 = choice.nextDouble();
                            System.out.println("Enter the second number");
                            num10 = choice.nextDouble();
                        }
                        while (num10 == 0);
                        result = num9 % num10;
                        System.out.println("The modulo of two numbers is " + result);
                        break;

                    default:
                        System.out.println("Try again.");
                }
            }
            System.out.println("Process ended");
         choice.close();
        }
    }
