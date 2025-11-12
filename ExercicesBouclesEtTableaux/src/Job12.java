import java.util.Objects;
import java.util.Scanner;

public class Job12 {
    public static void code(){
        //code:ABC_123
        Scanner input= new Scanner(System.in);
        String str;
        String code="ABC_123";
        do{
            System.out.println("Enter your code:");
            str=input.nextLine();
            if(!str.equals(code)){
                System.out.println("Code entered is not correct,try again!");
            }
        }
        while(!str.equals(code));{
            System.out.println("Your code is accepted. Welcome! ");
        }
/*TODO : second version ; use do while with for loop to verify every character in the String of input ,
        until it is all right. or compare the string use method String.equals();

 */
    }

    public static void main(String[] args){
       code();
    }
}
