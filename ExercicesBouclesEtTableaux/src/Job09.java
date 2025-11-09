import java.util.Scanner;

public class Job09 {
    public static void premier(){
        Scanner input = new Scanner(System.in);
        System.out.println("Put in a whole number to check if it is a premier number:");
        int n = input.nextInt();

//best version
        if(n<=0){
            System.out.println("invalid number,try again!");
            n = input.nextInt();
        }
        if (n == 1){
            System.out.println("Particularly,1 is not a premier number, nether a non premier number.");}

        while(n>0&& n!=1) {
            if (n == 2 || n == 3 || n == 5 || n == 7) {
                System.out.println("The number " + n + " is a premier number.");
                break;
            } else {
                if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
                    System.out.println("the number " + n + " is not a premier number.");
                    break;
                } else {
                    System.out.println("the number is " + n + " probably a premier number.");
                    break;
                }
            }
        }
/* while can be replaced by else

        if(n<=0){
            System.out.println("invalid number,try again!");
            n = input.nextInt();
        }
        if (n == 1){
            System.out.println("Particularly,1 is not a premier number, nether a non premier number.");}
        if ( n == 2 || n == 3 ||n== 5 ||n== 7 ) {
            System.out.println("The number " + n + " is a premier number.");
        }

        while(n>0&&n!=1&&n != 2 && n != 3 && n!= 5 && n!= 7){

            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
                        System.out.println("the number " + n + " is not a premier number.");
                        break;
                    }
            else {
                        System.out.println("the number is " + n + " probably a premier number.");
                        break;
                    }

        }

 */



/* third version
        if(n<=0){
            System.out.println("invalid number,try again!");
            n = input.nextInt();
        }
        while(n>0)
        {
            if(n==1){
                System.out.println("1 not a premier not a non premier nether.");
                break; }
            else if ( n == 2 || n == 3 ||n== 5 ||n== 7)
                {System.out.println("The number " + n + " is a premier number.");
                    break;}

            else{
                if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0){
                    System.out.println("the number " + n + " is not a premier number.");
                    break;}

                else{
                    System.out.println("the number is " + n + " probably a premier number.");
                    break;}
            }
        }
        */
    }


    public static void main(String[] args) {
        premier();
    }
}