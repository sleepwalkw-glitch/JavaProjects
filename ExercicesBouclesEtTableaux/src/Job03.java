import java.util.Scanner;

public class Job03 {
   public static int multi(int M){
    int i;
    int result=0;
    int number;
       for(i=1;i<=10;i++){
        result=M*i;
        System.out.println("The table of multiplication of the number"+M+"is"+result);
    }
       return result;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int M= input.nextInt();
        int x=multi(M);
        System.out.println(x);
    }
}


