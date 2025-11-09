import java.util.Scanner;

public class Job05 {
    public static void dameir(int N){

        String a="#";
        String b="-";

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if((i+j)%2==0){
                    System.out.print(a);}
                else  {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Put in a whole number to check the form be displayed.");
        Scanner input=new Scanner(System.in);
        int N= input.nextInt();
        dameir(N);
    }

}

