import java.util.Scanner;

public class Job07 {
    public static void jeux(){
        Scanner input = new Scanner(System.in);
        int n=1;
        int sum=0;
        while(n!=0){
            System.out.println("Put in your numbers to know the sum up.");
            n= input.nextInt();
            sum=sum+n;
            System.out.println("the sum are "+sum);
        }

    }
    public static void main(String[] args){
        jeux();
    }
}
