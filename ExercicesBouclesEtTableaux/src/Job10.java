import java.util.Scanner;

public class Job10 {
    public static void menu(){

        //version switch
        Scanner input = new Scanner(System.in);
        int o;
        do {
            System.out.println("Enter a number to chose the operations until you enter 3 to stop");
            o = input.nextInt();
            switch (o) {
                case 1:
                    System.out.println("Bonjour!");
                    break;
                case 2:
                    System.out.println("Au revoir!");
                    break;
                case 3:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("Tyr latter.");
            }
            System.out.println();
        } while (o != 3);

/*version else if to finish

        Scanner input = new Scanner(System.in);
        int o;
        do {
            System.out.println("Enter a number to chose the operations until you enter 3 to stop");
            o = input.nextInt();
            if (o == 1) {
                System.out.println("Bonjour!");
            }
            if (o == 2) {
                System.out.println("Au revoir!");}
            if (o == 3) {
                System.out.println("Quitter!");}
            else {
                    System.out.println("Try again!");
                }

            System.out.println();
            }
            while (o != 3) ;

         */
    }

    public static void main(String[] args) {
        menu();

    }

}