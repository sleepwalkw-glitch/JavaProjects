import java.util.Scanner;

public class Exercice02 {
    public static int fibo(int N){
        int result=0;
        int a=0;
        int b=1;
        int fibo=0;
        System.out.println("Fibonacci sequence up to " + N + " terms:");
        if (N >= 1) System.out.println(a);
        if (N >= 2) System.out.println(b);
//if we begin with 0, then we should add if for verify the condition fibo>N,then break
        for (int i=2;i<N;i++){
            fibo=a+b;
            a=b;
            b=fibo;
            System.out.println(fibo);
            result=fibo;

        }
        return result;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Put in a whole number for display all the numbers of Fibonacci");
        int N=input.nextInt();
        int x=fibo(N);
        System.out.println(x);

    }
}
