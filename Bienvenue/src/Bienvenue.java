import java.util.Scanner;

public class Bienvenue {
     static void main(String[] arg) {
        //demande le nom
        Scanner myscanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String nom = myscanner.nextLine();
        System.out.println("Your name is " + nom + ",");

        //demande l'age TIP .nextInt
        System.out.println("What is your age?");
        int age = myscanner.nextInt();
        myscanner.nextLine();
        System.out.println("Your age is " + age + " years old,");

        //demande le tail
        System.out.println("What is your height?");
        double height = myscanner.nextDouble();
        myscanner.nextLine();
        System.out.println("Your height is " + height + " cm,");

        //verifier l'age d'utilisateur
       // Scanner input = new Scanner(System.in);
        System.out.println("Are you 18 years old?Yes or No?");
        String verifier = myscanner.nextLine();
        if (verifier.equals("No")) {
            System.out.println("Your are not allowed until your are 18 years old.");
        }
        //or not, in the condition else
        else {
            System.out.println("Your name is " + nom + "," + "you are " + age + "years old,+ " + "your height is " + height + " cm," + "welcome!");
        }
       myscanner.close();// once this has been used, we can never ask this vary anymore
    }
}