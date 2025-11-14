import java.util.Scanner;

public class Job21 {
    static int times(){
        int result=0;
        int[] num={0,1,1,2,3,5,8,13,21,0,1,1,2,3,5,8,13,21,34,55};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number that you want to count the times is appears in this array.");
        int choice= input.nextInt();
        input.nextLine();
        int counter=0;
//first way : for each with boolean and counter
        boolean equal=false;
        for(int n:num){
            if(n==choice){
                equal=true;
                counter++;
            }
        }
        if(true){
            System.out.println("the number you entered appeared "+counter+" times." );}


        /* second way :for regular
        for(int i=0;i< num.length;i++){
            if (num[i]==choice){
                counter++;
            }
        }
        System.out.println("the number you entered appears "+counter+" times.");
         */
        result=counter;
        return result;
    }
    static void main(String[] args) {
        System.out.println(times());}
}
