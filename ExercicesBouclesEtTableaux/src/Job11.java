import java.util.Scanner;

public class Job11 {
    public static void temperature(){
        System.out.println("Three modes:1 for Celsius to Fahrenheit; 2 for Fahrenheit to Celsius; 3 for quit ");
        Scanner input= new Scanner(System.in);

        int o;
        double temp;
        double tempF;
        double tempC;
        do{
            System.out.println("make a choice by enter 1 or 2 or 3.");
            o= input.nextInt();

            switch (o){
                case 1:
                    System.out.println("Celsius to Fahrenheit.");
                    System.out.println("Enter the temperature you need to convert:");
                    temp= input.nextDouble();
                    tempF=(temp*9/5)+32;
                    System.out.println("The Fahrenheit converted is "+ tempF+" F°.");
                    break;
                case 2:
                    System.out.println("Fahrenheit to Celsius.");
                    System.out.println("Enter the temperature you need to convert:");
                    temp= input.nextDouble();
                    tempC=(temp-32)*5/9;
                    System.out.println("The Celsius converted is "+ tempC+" C°.");
                    break;
                case 3:
                    System.out.println("You have chose to quit the conversation.");
                    break;
                default:
                    System.out.println("only the number 1,2,3 are valid, try again!");
            }
            System.out.println();
        } while(o!=3);

    }
    public static void main(String[] args){
        temperature();

    }
}
