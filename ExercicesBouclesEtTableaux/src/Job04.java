import java.util.Scanner;

public class Job04 {
    public static int factorielle(int N){
// for 0, should be return if(n==1) return 1
        int result=1;
        for(int i=N;i>0;i--){
            result=result*i;
            //System.out.println("The factorielle of the number "+N+" is "+result);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int x=factorielle(N);
        System.out.println(x);
    }
}
