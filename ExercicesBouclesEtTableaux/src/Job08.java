import java.util.Scanner;

public class Job08 {
    public static void number(){
       // int result=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Put in a whole number to know how many numbers it consist.");
        int n=input.nextInt();
        int counter=1;
        //get the abs of the number n divided by 10 until it equals to 1 ,and count the times of reach the result,then print
        int x=Math.abs(n);
        while(x>=10){
            x=x/10;
            counter++;
        }
        //result=counter;
        System.out.println("the number "+n+"consist of "+counter+" number.");
        //return result;

    }
    public static void main(String[] args) {
        number();
    }




}
