import java.util.Scanner;

public class Job20 {
    static boolean found() {
        Scanner input = new Scanner(System.in);
        int[] num = {2, 4, 6, 8, 10, 11, 34, 67, 89};
        System.out.println("There is an Array consist of 9 whole numbers, enter a number you want to check out.");
        int choice = input.nextInt();
        input.nextLine();
        int i ;
        boolean found = false;
        for (i = 0; i < num.length; i++) {
            if (num[i] == choice) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("the number you enter does not exist.");
        } else {
            System.out.println("the number exists, it's position is " + (i + 1));
        }
        input.close();
        return found;
    }

    static void main(String[] args) {
        boolean result=found();
        System.out.println(result);


    }

}
